package space.whm.websocket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import space.whm.websocket.service.PushMsg2Service;
import space.whm.websocket.service.PushMsgService;

/**
 * 用@RequiredArgsConstructor代替@Autowired
 * 注意遇到过问题!!! @RequiredArgsConstructor !!!会形成循环依赖 !!!慎用!!!
 */
@RestController
@RequiredArgsConstructor
public class SendMsgController {

    final PushMsgService pushMsgService;

    final PushMsg2Service pushMsg2Service;

    @GetMapping("/sendToUid")
    public String sendToUid(@RequestParam String uid) {
        pushMsgService.pushMsgToOne(uid, "Hello,"+uid);
        return "OK";
    }

    @GetMapping("/sendAll")
    public String sendAll() {
        pushMsg2Service.pushMsgToAll("Hello Everyone");
        return "OK";
    }
}
