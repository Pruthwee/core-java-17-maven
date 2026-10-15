package data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Person {
    private String name;
    private Integer age;
    private String address;
    private String phone;
    private String email;
    private String birthday;
    private String city;
}
