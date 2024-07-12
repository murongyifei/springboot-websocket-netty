package space.whm.websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 参考网站 :
 * https://mp.weixin.qq.com/s/IyPakVYCeiFo8G4Kg5t2Jg
 *
 * 测试:
 *  启动Apifox
 *      ws://localhost:8888/webSocket
 *      {"uid":"123"}
 *  不要在Apifox中启动多个客户端, 可以在IDEA安装WebSocket客户端插件 https://blog.csdn.net/wzwsq/article/details/106944471
 *      ws://localhost:8888/webSocket
 *      {"uid":"456"}
 *  ...
 *
 *  在浏览器上访问地址发送消息
 *      http://localhost:9494/sendToUid?uid=123
 *      http://localhost:9494/sendToUid?uid=456
 *      ...
 *      http://localhost:9494/sendAll
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
