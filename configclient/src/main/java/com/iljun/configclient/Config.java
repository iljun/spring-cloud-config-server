package com.iljun.configclient;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * Created By iljun
 * User : iljun
 * Date : 18. 6. 19
 * Time: 오후 3:34
 */
@ConfigurationProperties(prefix="test")
@RefreshScope
public class Config {

    private String messages;

    public void setMessages(String messages){
        this.messages = messages;
    }

    public String getMessages(){
        return this.messages;
    }
}
