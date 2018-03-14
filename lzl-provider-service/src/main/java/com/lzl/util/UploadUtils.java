package com.lzl.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.lzl.exception.BusinessException;

/**
 * 上传图片工具类，上传到服务器
 */
public class UploadUtils {
    private static UploadUtils   uploadUtil;
    /**
     * 获得上传成功后的路径
     */
    private static String       result       = null;

    private UploadUtils() {

    }

    /**
     * 单例模式获取上传工具类
     * @return
     */
    public static UploadUtils getInstance() {
        //result是static类型的，每次上传时需要清零
    	result = null;
        if (null == uploadUtil) {
            uploadUtil = new UploadUtils();
        }
        return uploadUtil;
    }

    //读取时间限制
    private int                 readTimeOut           = 30 * 1000;                       // 读取超时 30s
    //服务器链接时间限制
    private int                 connectTimeout        = 60 * 1000;                       // 超时时间 1分钟

    /***
     * 请求使用多长时间
     */
    private static int          requestTime           = 0;
    
    /** 图片路径 */
    public static final String BASEPATH = "/usr/javashop/file/images/";
    /** EXL路径 */
    private static final String EXLPATH = "/usr/javashop/file/exl/";
//    private static final String BASEPATH = "D:/";
    
    /**是否使用文件本身拓展名*/
    private static final String EXTENSION = "EXTENSION";

    /** 个人资料 */
    private static final String PERSION = "1";
    /** 商家申请 */
    public static final String SELLERAPPLY = "2";
    /** 配送员申请 */
    private static final String DELIVERYAPPLY = "3";
    /** 供应商申请 */
    private static final String SUPPLIERAPPLY = "4";
    /** 评论（订单id） */
    private static final String COMMENTS = "5";
    
    /** 轮播图  */
    private static final String BANNER = "6";
    /** 分类 */
    private static final String CATE = "7";
    /** 商品 */
    private static final String PRODUCT = "8";
    /** 平台商品exl */
    private static final String PRODUCTEXL = "9";
    /** 商家申请 */
    private static final String SELLERAPPLYAPI = "10";
    /** 商品未分类 */
    public static final String PRODUCTNOCATE = "11";
    /** 商家商品未分类 */
    private static final String SELLERPRONOCATE = "12";
    /** 意见反馈 */
    private static final String FEEDBACK = "13";
    
    /**
     * file + map 类型的图片上传
     * @param myfile
     * @param picMap
     * @throws IOException
     */
    public void picUpload(MultipartFile myfile,Map<String,Object> picMap) throws IOException {
        if (myfile.isEmpty()) {
            throw new BusinessException("文件不能为空");
        } else {
            //设置文件保存的路径(如果没有则创建)
        	File f = new File((String) picMap.get("dic"));
            if (!f.exists() && !f.isDirectory()) {
                f.mkdirs();
            }
            //获取上传文件的后缀名并判断其是不是图片(将图片名以 . 为分隔分成两部分)
            String[] originalFileName = myfile.getOriginalFilename().split("\\.");
            if(!isImg(originalFileName[originalFileName.length-1])){
                throw new BusinessException("图片格式错误");
            }
            //设置保存到服务器的图片名称
            String fileName = "";
            if(picMap.get("fileName")==null){
                fileName = UUID.randomUUID().toString() + "." + originalFileName[1];
            }else{
                fileName = (String)picMap.get("fileName");
            }
            															//第一个参数是文件的目录，第二个参数是文件的名称
            FileUtils.copyInputStreamToFile(myfile.getInputStream(), new File((String)picMap.get("dic"), fileName));
        }
    }

    public String picUpload(MultipartFile myfile) throws IOException {
        if (myfile.isEmpty()) {
            throw new BusinessException("文件不能为空");
        } else {
            SimpleDateFormat formater = new SimpleDateFormat("yyyyMMdd");
            String formaterStr = formater.format(new Date());
            //1.当该项目运行在远程服务器上时，该项目运行在远程服务器的Linux操作系统上的tomcat上，
            //Linux操作系统不存在c、d、e等磁盘符，Linux下只有根目录 /,
            //所以图片的保存目录设置为realPath，且保存目录不重复，formaterStr
            //2.当项目运行在本地时，tomcat运行在本机上，它会在本地磁盘目录中存放图片
            String realPath = "/usr/javashop/file/images/"+formaterStr;
            //String realPath = "D:/"+formaterStr;
            String[] originalFileName = myfile.getOriginalFilename().split("\\.");
            String fileName = UUID.randomUUID().toString() + "." + originalFileName[1];
            FileUtils.copyInputStreamToFile(myfile.getInputStream(), new File(realPath, fileName));
            return formaterStr+"/"+fileName;
        }
    }

	// 本地测试,使用InputStream
	public String localUpload(InputStream swapStream) throws IOException {
		SimpleDateFormat formater = new SimpleDateFormat("yyyyMMdd");
		String formaterStr = formater.format(new Date());
		//当该realPath不存在时，该spring框架会自动为其创建 
		String realPath = "/usr/javashop/file/platexcel/"+formaterStr;
		//String realPath = "D:/" + formaterStr;
		String fileName = UUID.randomUUID().toString() + ".xls";
		// FileUtils.copyInputStreamToFile(swapStream, new File(realPath,
		// fileName));
		FileOutputStream fos = new FileOutputStream(realPath + fileName);
		byte[] b = new byte[1024];
		while ((swapStream.read(b)) != -1) {
			fos.write(b);
		}
		swapStream.close();
		fos.close();
		//返回该图片的保存地址
		return formaterStr + "/" + fileName;
	}
    /**
     * 该方法用于传递多张图片或文件
     * (上传多张图片时，将每个图片单独保存到服务器中，并将所有图片的地址组成字符串保存到数据库中)
     * 
     * 前台将参数都传到request中，后台从request中获取参数并根据参数保存文件到服务器
     * 该方法是service层方法，该request参数是Controller层传来的，request中的数据也都是在
     * Controller层就封装好的
     * @param request
     * @return
     * @throws Exception
     */
    public String picUpload(HttpServletRequest request) throws Exception {
        
        String path = request.getParameter("path");//空：系统默认；非空：文件存放路径取用户自定义路径；
        String type = request.getParameter("type");//1:系统默认 2：用户自定义
        String fileNames = request.getParameter("fileNames");
        
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        //获取前台传递的多个文件
        Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();
        //将文件保存后并返回文件保存的地址
        String picUrl = "";
        
        if(StringUtils.isEmpty(fileNames)){
            if("2".equals(type)){
                throw new BusinessException("类型为自定义，文件名为空");
            }
        }else{
            int size = fileNames.split(",").length;
            if(size != fileMap.entrySet().size()){
                throw new BusinessException("文件名数量和文件数量不相等");
            }
        }
        //通过遍历将文件一个个保存
        int i=0;
        for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
            MultipartFile file = entity.getValue();
            
            if (file.isEmpty()) {
                throw new BusinessException("文件不能为空");
            } else {
                //文件存放路径
                String customPath = "";
                if(StringUtils.isEmpty(path)){
                    SimpleDateFormat formater = new SimpleDateFormat("yyyyMMdd");
                    String formaterStr = formater.format(new Date());
                    customPath = formaterStr;
                }else{
                    customPath = path;
                }
                String realPath = BASEPATH + customPath;
                
                //文件名称
                String fileName = "";
                if("2".equals(type)){
                    fileName = fileNames.split(",")[i];
                    i++;
                }else{
                    String[] originalFileName = file.getOriginalFilename().split("\\.");
                    fileName = UUID.randomUUID().toString() + "." + originalFileName[1];
                }

                //文件上传
                FileUtils.copyInputStreamToFile(file.getInputStream(), new File(realPath, fileName));
                
                //将所有地址封装到一块，以 , 分隔，统一保存到数据库中。但服务器中还是一个文件一个地址
                picUrl = picUrl + customPath + fileName + ",";
            }
            
        }
        return picUrl.substring(0,picUrl.length()-1);

    }
    
    /**
     * memberId : 用户id
     * type : 1个人资料 2商家申请 3配送员申请 4供应商申请 5评论（订单id） 
     * more ： 对type的补充字段 可为空
     * @param request
     * @return
     * @throws Exception
     */
    public String pics(HttpServletRequest request) throws Exception {
        
        Map<String,String> picMap = dealPathAndName(request);
        
        picMap.put("basePath", BASEPATH);
        
        String picUrl = batchUpload(request,picMap);
        
        return picUrl;
    }
    
    /**
     * 文件上传
     * @param request
     * @param picMap
     * @return
     * @throws IOException
     */
    private String batchUpload(HttpServletRequest request,Map<String,String> picMap) throws IOException{
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();
        String picUrl = "";
        
        int i = 1;
        for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
            MultipartFile file = entity.getValue();
            
            if (file.isEmpty()) {
                throw new BusinessException("文件不能为空");
            } else {
                //文件存放路径
                String customPath = picMap.get("path");
                String realPath = picMap.get("basePath") + customPath;
                String fileName=null;
                //文件名称
                if(null==picMap.get("fileIndex")||"".equals(picMap.get("fileIndex"))){
                	fileName = picMap.get("fileName")  + "-" + i;
                }else{
                	fileName = picMap.get("fileName")  + "-" + picMap.get("fileIndex");
                }
                String[] originalFileName = file.getOriginalFilename().split("\\.");
                if(!isImg(originalFileName[originalFileName.length-1])){
                    throw new BusinessException("图片格式错误");
                }
                if(EXTENSION.equals(picMap.get("EXTENSION"))){
                    fileName = fileName + originalFileName[1];
                }else{
                    fileName = fileName + ".jpg";
                }
                i++;

                //文件上传
                FileUtils.copyInputStreamToFile(file.getInputStream(), new File(realPath, fileName));
                picUrl = picUrl + customPath + "/" + fileName + ",";
            }
            
        }
        return picUrl.substring(0,picUrl.length()-1);
    }
    
    /**
     * 后台图片上传
     * @param request
     * @return
     * @throws Exception
     */
    public String picBack(HttpServletRequest request,Map<String, String> param) throws Exception {
        
        Map<String,String> picMap = dealPathAndNameBack(request,param);
        
        picMap.put("basePath", BASEPATH);
        
        String picUrl = batchUpload(request,picMap);
        
        return picUrl;
    }
    /** 后台exl上传 */
    public String exl(HttpServletRequest request) throws Exception {
        
        Map<String,String> picMap = dealPathAndNameExl(request);
        
        picMap.put("basePath", EXLPATH);
        picMap.put("EXTENSION",EXTENSION);
        
        String picUrl = batchUpload(request,picMap);
        
        return picUrl.substring(0,picUrl.length()-1);
    }
    
    /**
     * APP端设置图片上传的路径和文件名；
     * @param request
     * @return
     */
    private Map<String,String> dealPathAndName(HttpServletRequest request){
        Map<String,String> picMap = new HashMap<>();
        String memberId = null;
        if(request.getAttribute("MEMBERID")!=null){
            int memberIdInt = (Integer) request.getAttribute("MEMBERID");
            memberId = String.valueOf(memberIdInt);
        }
        String type = request.getParameter("type");
        String more = request.getParameter("more");
        if( (StringUtils.isEmpty(memberId) && !SELLERAPPLYAPI.equals(type) && !SELLERPRONOCATE.equals(type)) || StringUtils.isEmpty(type)){
            throw new BusinessException("基础参数为空");
        }
        switch(type){
//            case PRODUCT:
//                picMap.put("path", request.getParameter("path"));
//                picMap.put("fileName", request.getParameter("fileNames"));
//                break;
            case PERSION:
                picMap.put("path", "member/" + memberId);
                picMap.put("fileName", "avatar");
                break;
            case SELLERAPPLY:
                picMap.put("path", "seller/" + memberId);
                picMap.put("fileName", String.valueOf(System.currentTimeMillis()));
            break;
            case DELIVERYAPPLY:
                picMap.put("path", "delivery/" + memberId);
                picMap.put("fileName", String.valueOf(System.currentTimeMillis()));
            break;
            case SUPPLIERAPPLY:
                picMap.put("path", "supplier/" + memberId);
                picMap.put("fileName", String.valueOf(System.currentTimeMillis()));
            break;
            case COMMENTS:
                if(StringUtils.isEmpty(more)){
                    throw new BusinessException("附加参数为空");
                }
                picMap.put("path", "comments/" + memberId);
                picMap.put("fileName", more);
            break;
            case SELLERAPPLYAPI:
                picMap.put("path", "sellerapply");
                picMap.put("fileName", String.valueOf(System.currentTimeMillis()));
            break;
            case SELLERPRONOCATE:
                int sellerId = (Integer) request.getAttribute("SELLERID");
                picMap.put("path", "sellerproduct/" + sellerId);
                picMap.put("fileName", String.valueOf(System.currentTimeMillis()));
            break;
            case FEEDBACK:
                picMap.put("path", "feedback");
                picMap.put("fileName", String.valueOf(System.currentTimeMillis()));
            break;
            default:
                throw new BusinessException("图片上传类型错误");
        }
        return picMap;
    }

    /**
     * 后台设置图片上传的路径和文件名；
     * @param request
     * @return
     */
    private Map<String,String> dealPathAndNameBack(HttpServletRequest request,Map<String,String> param){
        Map<String,String> picMap = new HashMap<>();
        String type = request.getParameter("type");
        String more =param.get("more");
        if(StringUtils.isEmpty(type)){
            throw new BusinessException("基础参数为空");
        }
        if(StringUtils.isEmpty(more)){
            throw new BusinessException("附加参数为空");
        }
        System.out.println("more:"+more);
        SimpleDateFormat formater = new SimpleDateFormat("yyyyMMdd");
        switch(type){
            case BANNER:
                picMap.put("path", "banner");
                picMap.put("fileName", String.valueOf(System.currentTimeMillis()));//more 为 时间戳
                break;
            case CATE:
                String cate = dealCatePath(more);   // more : 110601
                String path = "cate/"+cate.substring(0, 2)+"/"+cate.substring(0,4);
                picMap.put("path", path);
                picMap.put("fileName", cate);
            break;
            case PRODUCT:
                String[] moreArray = more.split(",");   // more :　110601,6901209200229
                if(moreArray.length != 2){
                    throw new BusinessException("商品参数错误");
                }
                String productCate = moreArray[0];
                String productPath = "lzl/"+productCate.substring(0, 2)+"/"+productCate;
                picMap.put("path", productPath);
                picMap.put("fileName", moreArray[1]);
                picMap.put("fileIndex", param.get("fileIndex"));
            break;
            case PRODUCTNOCATE:
                String noCatePath = "lzl/time/"+formater.format(new Date());
                picMap.put("path", noCatePath);
                picMap.put("fileName", String.valueOf(System.currentTimeMillis()));
            break;
            case SELLERAPPLY:
                picMap.put("path", "seller/time/"+formater.format(new Date()));
                picMap.put("fileName", String.valueOf(System.currentTimeMillis()));
            break;
            default:
                throw new BusinessException("图片上传类型错误");
        }
        
        return picMap;
    }
    
    /**
     * 后台设置exl上传的路径和文件名；
     * @param request
     * @return
     */
    private Map<String,String> dealPathAndNameExl(HttpServletRequest request){
        Map<String,String> picMap = new HashMap<>();
        String type = request.getParameter("type");
        String more = request.getParameter("more");
        if(StringUtils.isEmpty(type)){
            throw new BusinessException("基础参数为空");
        }
        if(StringUtils.isEmpty(more)){
            throw new BusinessException("附加参数为空");
        }
        switch(type){
            case BANNER:
                picMap.put("path", "platProduct");
                picMap.put("fileName", String.valueOf(System.currentTimeMillis()));//more 为 时间戳
                break;
            default:
                throw new BusinessException("图片上传类型错误");
        }
        
        return picMap;
    }
    
    /**
     * 处理分类路径
     * @return
     */
    private String dealCatePath(String more){
        int cateNum = Integer.valueOf(more);
        if(cateNum < 10101 || cateNum > 999999){
            throw new BusinessException("分类id错误");
        }
        String cate = cateNum>=100000?String.valueOf(cateNum):"0"+cateNum;
        return cate;
    }
    
    /**
     * 是否是图片
     * @param extend
     * @return
     */
    public static boolean isImg(String extend) {
        boolean ret = false;
        List<String> list = new ArrayList<String>();
        list.add("jpg");
        list.add("jpeg");
//        list.add("bmp");
//        list.add("gif");
        list.add("png");
//        list.add("tif");
        for (String s : list) {
            if (s.equals(extend)) {
                ret = true;
            }
        }
        return ret;
    }

    /**
     * 构建图片上传路径
     * @param request
     * @return
     */
    @SuppressWarnings("deprecation")
    private String buildImgPath(HttpServletRequest request) {
        String path = "upload";
        SimpleDateFormat formater = new SimpleDateFormat("yyyyMMdd");
        path += "/" + formater.format(new Date());
        path = request.getRealPath(path);
        File dir = new File(path);
        if (!dir.exists()) {
            try {
                dir.mkdirs();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return path;
    }
    
    /**
     * 按日期构建图片上传路径，按时间戳构建文件名称
     */
    public static String buildImgPath() {
        String path = "lzl/time";
        SimpleDateFormat formater = new SimpleDateFormat("yyyyMMdd");
        path += "/" + formater.format(new Date());
        return path+"/"+System.currentTimeMillis()+".jpg";
    }

    public int getReadTimeOut() {
        return readTimeOut;
    }

    public void setReadTimeOut(int readTimeOut) {
        this.readTimeOut = readTimeOut;
    }

    public int getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    /**
     * 获取上传使用的时间
     * @return
     */
    public static int getRequestTime() {
        return requestTime;
    }

    public String getResult() {
        return result;
    }
}
