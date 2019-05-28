package com.websocket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @Description
 * @auther 冉长冬
 * @create 2019-05-28 10:38
 */
@Configuration
public class WebSocketConfig {

    /**
     * springboot内置tomcat的话，需要配一下这个。。如果没有这个对象，无法连接到websocket
     * 别问为什么。。很坑。。。
     * @return
     */
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        //这个对象说一下，貌似只有服务器是tomcat的时候才需要配置,具体我没有研究
        return new ServerEndpointExporter();
    }

}
