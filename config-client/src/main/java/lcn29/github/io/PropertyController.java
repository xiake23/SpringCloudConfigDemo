package lcn29.github.io;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CZB
 */
@RestController
public class PropertyController {

    @Value("${word:local}")
    private String name = "local";

    @GetMapping("/property")
    public String getProperty() {
        String resp = "从远程获取到的配置" + name;
        return resp;
    }
}
