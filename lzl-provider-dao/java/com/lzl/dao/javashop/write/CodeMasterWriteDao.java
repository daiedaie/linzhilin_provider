package com.lzl.dao.javashop.write;

import com.lzl.bean.javashop.CodeMaster;
/**
 * 字典表
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:16
 */
public interface CodeMasterWriteDao {
	
    Integer post(CodeMaster codeMaster);

    Integer put(CodeMaster codeMaster);

}