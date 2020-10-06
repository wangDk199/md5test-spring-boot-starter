package com.soft1851.service;

import com.soft1851.util.MD5Util;

/**
 * @author ke
 * @ClassName MD5Service
 * @Description TOOD
 * @Date 2020/10/6
 * @Version 1.0
 **/
public class MD5Service {
    public String getMD5( String input ) {
        return MD5Util.getMD5( input.getBytes() );
    }
}