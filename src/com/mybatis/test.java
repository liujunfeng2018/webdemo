package com.mybatis;

import com.mybatis.util.MyBatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test {
    public static void main(String[] args) throws IOException {
        SqlSession session = MyBatisUtil.getSqlSession();
        try {
            PrpLregistDto prpLregistDto = session.selectOne("com.mybatis.mapping.registMapping.getRegistByRegistNo","RDDH201622010000000040");
            System.out.println("RegistNo:" + prpLregistDto.getRegistNo() + ",ReportDate:" + prpLregistDto.getReportDate());

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
}
