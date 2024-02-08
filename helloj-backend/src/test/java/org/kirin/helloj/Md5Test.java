package org.kirin.helloj;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

@SpringBootTest
public class Md5Test {

    public static final String SALT_TEST = "yupi";

    @Test
    public void md5Test() {
        String res = DigestUtils.md5DigestAsHex((SALT_TEST + "123").getBytes());
        System.out.println(res);
    }
}
