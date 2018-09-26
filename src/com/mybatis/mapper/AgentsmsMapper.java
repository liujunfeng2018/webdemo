package com.mybatis.mapper;

import com.mybatis.pojo.Agentsms;
import com.mybatis.pojo.AgentsmsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AgentsmsMapper {
    int countByExample(AgentsmsExample example);

    int deleteByExample(AgentsmsExample example);

    int insert(Agentsms record);

    int insertSelective(Agentsms record);

    List<Agentsms> selectByExample(AgentsmsExample example);

    int updateByExampleSelective(@Param("record") Agentsms record, @Param("example") AgentsmsExample example);

    int updateByExample(@Param("record") Agentsms record, @Param("example") AgentsmsExample example);
}