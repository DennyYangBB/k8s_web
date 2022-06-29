package tw.denny.k8s.hello_java.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: Denny Yang
 * @since: 2022/6/29
 */
@RestController
public class HelloNetRest {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/java/hello-net")
    public String helloNet(String name) {
        return restTemplate.getForObject("http://localhost:8082/net/hello?name=" + name, String.class);
    }
}
