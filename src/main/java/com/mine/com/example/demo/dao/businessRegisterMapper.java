package com.example.demo.dao;

import com.example.demo.model.businessRegister;

public interface businessRegisterMapper {
    int deleteByPrimaryKey(Long id);

    int insert(businessRegister record);

    int insertSelective(businessRegister record);

    businessRegister selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(businessRegister record);

    int updateByPrimaryKey(businessRegister record);
}