package space.whm.websocket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import space.whm.websocket.service.PushMsgService;

@RestController
@RequiredArgsConstructor
public class SendMsgController {

    final PushMsgService pushMsgService;

    @GetMapping("/sendToUid")
    public String sendToUid(@RequestParam String uid) {
        pushMsgService.pushMsgToOne(uid, "Hello,"+uid);
        return "OK";
    }

    @GetMapping("/sendAll")
    public String sendAll() {
        pushMsgService.pushMsgToAll("Hello Everyone");
        return "OK";
    }
}
