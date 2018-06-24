package com.iljun.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By iljun
 * User : iljun
 * Date : 18. 6. 19
 * Time: 오후 2:33
 */
@RestController
@EnableConfigurationProperties(Config.class)
public class ConfigController {

    @Autowired
    private Config config;

//    @Value("${config.messages}")
//    private String messages;

    @RequestMapping(value = "/messages", method = RequestMethod.GET)
    public String message(){
        return config.getMessages();
    }
}
