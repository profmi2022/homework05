public class Main {
    public static void main(String[] args) {

        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println(fullName);

        System.out.println("Задача 2");

        System.out.println(fullName.toUpperCase());
    }

    public static void task2() {
        System.out.println("Задача 3");

        String fullName = "Иванов Семён Семёнович";

        String newFullName = fullName.replaceAll ("ё","е");

        System.out.println(newFullName);
    }
}