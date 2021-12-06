package builder;


public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .age(18)
                .firstname("Orest")
                .lastName("Andrusyshyn")
                .gender("Male")
                .weight(80)
                .job("UCU")
                .job("FIZMAT").build();
        System.out.println(user);
    }
}
