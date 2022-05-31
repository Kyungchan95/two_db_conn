package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.example.dao1.DB1Mapper;
import com.example.dao2.DB2Mapper;
 
@Service
public class DBService {
 
    @Autowired
	static
    DB1Mapper DB1Mapper;
    @Autowired
	static
    DB2Mapper DB2Mapper;
 
    /* select dual */
    public static String getDB1Dual() throws Exception{
        return DB1Mapper.getDB1Dual();
    }
 
    /* select dual */
    public static String getDB2Dual()throws Exception{
        return DB2Mapper.getDB2Dual();
    }
 
}
