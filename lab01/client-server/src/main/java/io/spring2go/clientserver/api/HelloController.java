package io.spring2go.clientserver.api;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author MX.Y
 * @DATE 2022-03-10 17:19
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    // 404 返回类型不能被接收，要用下面那个
    @GetMapping("/aa")
    public String getHello() {
        return "hello";
    }

    @RequestMapping("/aa1")
    public ResponseEntity<String> getHello1() {
        return ResponseEntity.ok("hello");
    }
}
