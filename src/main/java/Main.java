public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = String.valueOf(true);

        post.birthday = new Formdate();
        post.birthday.day = 13;
        post.birthday.mounth = 6;
        post.birthday.year = 1999;

    }

}