package com.mybatis;

import com.mybatis.mapper.AgentsmsMapper;
import com.mybatis.pojo.Agentsms;
import com.mybatis.pojo.AgentsmsExample;
import com.mybatis.pojo.PrpLregistDto;
import com.mybatis.util.MyBatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class test {
    public void test1() throws Exception{
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
    public void test2() throws Exception{
        SqlSession session = MyBatisUtil.getSqlSession();
        AgentsmsMapper agentsmsMapper = session.getMapper(AgentsmsMapper.class);
        AgentsmsExample agentsmsExample = new AgentsmsExample();
        AgentsmsExample.Criteria  agentCriteria = agentsmsExample.createCriteria();

        agentCriteria.andClaimtypeLike("%wo%");

        List<Agentsms> agentsmsList = agentsmsMapper.selectByExample(agentsmsExample);
        session.close();

        System.out.println("数量 "+agentsmsList.size());
    }
    public static void main(String[] args) throws Exception {
        test test = new test();
        test.test2();
    }
}
