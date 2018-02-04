package com.lzl.common;

public class ConstantsEJS {

    public final static String NAMESPACE_MOBILEMALL_WEB_MEMBER         = "ejavashop:b2b2c:web:member";
    public final static String NAMESPACE_MOBILEMALL_WEB_MEMBER_SESSION = NAMESPACE_MOBILEMALL_WEB_MEMBER
                                                                         + ":sessionid:";

    /**
     * 渠道：1、通用，2、PC，3、mobile
     */
    public static final int CHANNEL_1 = 1;
    /**
     * 渠道：1、通用，2、PC，3、mobile
     */
    public static final int CHANNEL_2 = 2;
    /**
     * 渠道：1、通用，2、PC，3、mobile
     */
    public static final int CHANNEL_3 = 3;

    /**
     * 数据操作类型：C、新建
     */
    public static final String DATA_OPT_TYPE_C = "C";

    /**
     * 数据操作类型：U、修改
     */
    public static final String DATA_OPT_TYPE_U = "U";

    /**
     * 数据操作类型：D、删除
     */
    public static final String DATA_OPT_TYPE_D = "D";

    /**
     * PC首页缓存KEY
     */
    public static final String PC_INDEX_HTML_CACHE = "pcIndexCache";

    /**
     * 移动端首页缓存KEY
     */
    public static final String M_INDEX_HTML_CACHE = "mIndexCache";

    /**
     * 微信支付access-token
     */
    public static final String WX_ACCESS_TOKEN = "wx_access_token";

    /**
     * 默认显示10
     */
    public static final int DEFAULT_PAGE_SIZE_10 = 10;

    /**
     * 默认显示页数20
     */
    public static final int    DEFAULT_PAGE_SIZE                 = 20;
    public static final String SERVICE_RESULT_CODE_SYSERROR      = "syserror";
    public static final String SERVICE_RESULT_EXCEPTION_SYSERROR = "恭喜你！发现一个BUG，一大波程序猿正在赶来!";

    /**系统资源管理-商家管理根结点，与数据库初始化数据（system_resources）相关，如果修改数据库请修改此值 */
    public static final int SYSTEM_RESOURCE_ROOT = 28;
    /**系统资源管理-系统管理根结点，与数据库初始化数据（system_resources）相关，如果修改数据库请修改此值 */
    public static final int SELLER_RESOURCE_ROOT = 27;
    /**系统资源管理-供应商管理根结点，与数据库初始化数据（supplier_resources）相关，如果修改数据库请修改此值 */
    public static final int SUPPLIER_RESOURCE_ROOT = 616;

    /** 来源：1、pc；2、H5；3、Android；4、IOS */
    public final static int SOURCE_1_PC      = 1;
    /** 来源：1、pc；2、H5；3、Android；4、IOS */
    public final static int SOURCE_2_H5      = 2;
    /** 来源：1、pc；2、H5；3、Android；4、IOS */
    public final static int SOURCE_3_ANDROID = 3;
    /** 来源：1、pc；2、H5；3、Android；4、IOS */
    public final static int SOURCE_4_IOS     = 4;

    /**
     * 搜索配置ID，系统初始化数据，ID不变
     */
    public final static int SEARCHSETTINGID = 1;

    /**
     * 系统配置ID，系统初始化数据，ID不变
     */
    public static final int CONFIG_ID = 1;

    /** 验证码key */
    public static final String VERIFY_NUMBER_NAME = "verify_number";

    /**
     * 前台用户订单列表显示每页条数
     */
    public static final int DEFAULT_ORDER_PAGE_SIZE = 5;

    /**
     * 前台店铺首页显示 推荐商品个数
     */
    public static final int DEFAULT_STORES_PRODUCT_SIZE = 4;

    /**
     *  是否使用 1 使用
     */
    public final static int    USE_YN_Y                                = 1;

    /**
     *  是否使用 0 未使用
     */
    public final static int    USE_YN_N                                = 0;
}
