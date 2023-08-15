package src.test.java.com.example.basicconfiguration;

import com.example.basicconfiguration.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class BasicConfigurationTests {

    @Autowired
    private UserService userService;


    @Autowired
    private PasswordEncoder passwordEncoder;
    @Test
    void contextLoads() {
        System.out.println( userService.getById(1));
        System.out.println(passwordEncoder.encode("123"));
    }

}
