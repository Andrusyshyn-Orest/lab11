package builder;

import lombok.Builder;
import lombok.Singular;

import java.util.List;

@Builder
public class User {
    private String firstname;
    private String lastName;
    @Singular(value = "job")
    private List<String> occupations;
    private String gender;
    private int age;
    private int weight;

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", occupations=" + occupations +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
