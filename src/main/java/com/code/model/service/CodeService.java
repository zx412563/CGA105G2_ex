package com.code.model.service;


import com.code.model.Code.dao.CodeDAO_interface;
import com.code.model.Code.dao.impl.CodeHibernateDAO;
import com.code.model.Code.pojo.Code;

public class CodeService {

    private CodeDAO_interface dao;

    public CodeService() {
        dao =new CodeHibernateDAO();
//        dao=new CodeJDBCDAO();
    }

    public Code todao(String codeNum,Integer codeOff,java.sql.Date codeNtime,String codeText){
        Code code =new Code();
        code.setCodeNum(codeNum);
        code.setCodeOff(codeOff);
        code.setCodeNtime(codeNtime);
        code.setCodeText(codeText);
        return code;
    };

    public void addEmp(Integer storeid, String codeNum,Integer codeOff,java.sql.Date codeNtime,
                       String codeText) {

        Code code=todao(codeNum,codeOff,codeNtime,codeText);
        code.setStoreId(storeid);
        dao.insert(code);

    }





}
