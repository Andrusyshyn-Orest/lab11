package builder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User user;

    @BeforeEach
    void setUp() {
        user = User.builder()
                .age(18)
                .firstname("Orest")
                .lastName("Andrusyshyn")
                .gender("Male")
                .weight(80)
                .job("UCU")
                .job("FIZMAT").build();
    }

    @Test
    void testToString() {
        String expected = "User{firstname='Orest', lastName='Andrusyshyn', occupations=[UCU, FIZMAT], gender='Male', age=18, weight=80}";
        assertEquals(expected, user.toString());
    }
}