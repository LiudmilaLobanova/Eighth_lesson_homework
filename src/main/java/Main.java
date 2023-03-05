public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.name = "Василий";
        post.passport = "7777 № 777777";
        post.patronymic = "Васильевич";
        post.phone = "7(111)-111-11-11";
        post.surname = "Васильев";
        post.subscription = true;
        post.birthday.day = 13;
        post.birthday.month = 01;
        post.birthday.year = 2023;
    }
}
