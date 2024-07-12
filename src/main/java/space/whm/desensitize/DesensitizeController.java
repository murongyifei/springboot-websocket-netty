package space.whm.desensitize;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 脱敏测试
 *     https://www.jb51.net/program/324016svp.htm
 *     注意!!!测试发现只能在SpringBoot的 @RestController 中返回才能生效!!!
 *
 *  http://localhost:9494/desensitize/getUser
        {
            "name": "孙**",
            "phoneNumber": "123****8901",
            "email": "s*********@163.com",
            "password": "******",
            "idCard": "4***************05",
            "bankCard": "6217 **** **** **** 000",
            "address": "黑龙江省七台河********",
            "gameName": "超级****锤"
        }
 */
@RestController
@RequestMapping("/desensitize")
public class DesensitizeController {
    @GetMapping("/getUser")
    public UserVO getUser() {
        UserVO userVO = new UserVO();
        userVO.setName("孙大圣");
        userVO.setEmail("sundasheng@163.com");
        userVO.setPhoneNumber("12345678901");
        userVO.setPassword("123456");
        userVO.setAddress("黑龙江省七台河市六里村444号");
        userVO.setIdCard("447465200912089605");
        userVO.setBankCard("6217000000000000000");
        userVO.setGameName("超级无敌大铁锤");
        return userVO;
    }
}