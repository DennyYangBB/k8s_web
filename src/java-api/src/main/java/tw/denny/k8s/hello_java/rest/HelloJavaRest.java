package tw.denny.k8s.hello_java.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Denny Yang
 * @since: 2022/6/29
 */
@RestController
public class HelloJavaRest {

    @RequestMapping("/java/hello")
    public String hello(String name) {
        return "Java love " + name;
    }
}
