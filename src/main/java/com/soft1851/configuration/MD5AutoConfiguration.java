package com.soft1851.configuration;

import com.soft1851.service.MD5Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ke
 * @ClassName MD5AutoConfiguration
 * @Description TOOD
 * @Date 2020/10/6
 * @Version 1.0
 **/
@Configuration
public class MD5AutoConfiguration {
    @Bean
    MD5Service md5Service() {
        return new MD5Service();
    }
}