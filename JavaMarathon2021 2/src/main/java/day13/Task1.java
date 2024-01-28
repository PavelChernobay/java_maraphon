package day13;

public class Task1 {
    public static void main(String[] args) {
        User u1 = new User("Pasha");
        User u2 = new User("Katya");
        User u3 = new User("Petya");

        u1.sendMessage(u2, "Привет!");
        u1.sendMessage(u2, "Как дела?");

        u2.sendMessage(u1, "Привет!");
        u2.sendMessage(u1, "Хорошо!");
        u2.sendMessage(u1, "Как твои?");

        u3.sendMessage(u1, "Привет");
        u3.sendMessage(u1, "Как твои дела?");
        u3.sendMessage(u1, "Пойдем прогуляемся?");

        u1.sendMessage(u3, "Привет");
        u1.sendMessage(u3, "Все хорошо, а ты как?");
        u1.sendMessage(u3, "Я не против");

        u3.sendMessage(u1, "Отлично! Пошли в парк");

        System.out.println();

        MessageDatabase.showDialog(u1, u3);
    }
}
