package tw.denny.k8s.hello_net.rest;

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

    @RequestMapping("/net/hello")
    public String helloNet(String name) {
        return ".NET love " + name;
    }
}
