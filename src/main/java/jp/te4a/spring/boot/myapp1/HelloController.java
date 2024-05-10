package jp.te4a.spring.boot.myapp1;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController
{
    @GetMapping("/")
    public String index()
    {
        return "Hello, Spring Boot!";
    }
}
