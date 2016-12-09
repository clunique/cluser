package com.cluser.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@MapperScan(basePackages="com.cluser.dao.mapper")
public class DaoConfig {
    
}
