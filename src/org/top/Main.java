package org.top;

public class Main {

    public static void testStorage() {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        UserStorage.addUser(user1);
        UserStorage.addUser(user2);
        UserStorage.addUser(user3);

        System.out.println(UserStorage.toStringStorage());
    }

    public static void main(String[] args) {
        testStorage();

        // git status - сведения о репозитории
        // git add - добавить файлы в гит
        // git commit
    }
}
