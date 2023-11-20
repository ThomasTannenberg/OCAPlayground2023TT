package basics;

import lombok.Data;

public class LombokTest {

    @Data
    public static class User {
        private String name;
        private int age;
    }
}
