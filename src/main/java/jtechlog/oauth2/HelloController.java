package jtechlog.oauth2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@Slf4j
public class HelloController {

    @GetMapping("/api/hello")
    public HelloResponse sayHello(Principal principal) {
        log.info("The name of the user: {}", principal.getName());

        return new HelloResponse("Hello JWT!");
    }
}
