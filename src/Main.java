public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 12;
        if (age >= 18) {
            System.out.println("If age of a person is equal to " + age + " ,he is an adult.");
        } else {
            System.out.println("If age of a person is equal to " + age + " ,he is a minor, he has to wait for a while.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 3;
        if (temperature >= 5) {
            System.out.println("It`s " + temperature + " degrees outside, you don`t need to put on a cap.");
        } else {
            System.out.println("It`s " + temperature + " degrees outside, you need to put on a cap.");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 63;
        if (speed >= 60) {
            System.out.println("If your speed is equal to " + speed + " ,you have to pay a fine. ");
        } else {
            System.out.println("If your speed is equal to " + speed + " ,you can drive without worry.");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 22;
        if (age >= 2 || age < 6) {
            System.out.println("If age of a person is equal to " + age + ", he needs to go to a kindergarten.");
        } else if (age >= 7 || age < 18) {
            System.out.println("If age of a person is equal to " + age + ", he needs to go to school.");
        } else if (age >= 18 || age < 24) {
            System.out.println("If age of a person is equal to " + age + ", he needs to go to an university.");
        } else if (age > 24) {
            System.out.println("If age of a person equals to " + age + ", it`s time for him to get a job.");
        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 7;
        if (age <= 5) {
            System.out.println("If age of a child equals to " + age + ", it`s forbidden for him to ride on an attraction.");
        } else if (age > 5 || age <= 14) {
            System.out.println("If age of a child equals to " + age + ", he is allowed to ride on an attraction with adults only.");
        } else if (age > 14) {
            System.out.println("If age of a child equals to " + age + ", he is allowed to ride on an attraction without adults.");
        }

    }

    public static void task6() {
        System.out.println("Задача 6");
        int totalNumberOfPlaces = 102;
        int seats = 58;
        int standingRooms = 48;
        boolean theCarIsFull = seats > 60 && standingRooms > 42;
        if (theCarIsFull) {
            System.out.println("В вагоне нет мест.");
        } else if (seats < 60) {
            System.out.println("В вагоне есть сидячие места.");
        } else if (standingRooms < 42) {
            System.out.println("В вагоне есть стоячие места.");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int a = 1;
        int b = 1;
        int c = 1;
        boolean A = a >= b && a >= c;
        boolean B = b >= a && b >= c;
        boolean C = c >= a && c >= b;
        if (A) {
            System.out.println("Максимальное число " + a);
        } else if (B) {
            System.out.println("Максимальное число " + b);
        } else if (C) {
            System.out.println("Максимальное число " + c);
        } else {
            System.out.println("Числа равны.");
        }

        }

    }

