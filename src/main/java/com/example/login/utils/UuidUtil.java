package com.example.login.utils;

import java.util.UUID;

public class UuidUtil {
    public String getUuid(){
        return UUID.randomUUID().toString().replaceAll("-", "") ;
    }
}
