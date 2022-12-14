public class Main {
    // задание 1
    public static void main(String[] args) {
        int currentYear = 2022;
        Human maxim = new Human(currentYear - 35, "Максим", "Минск", "бренд-менеджер");
        Human anya = new Human(currentYear - 29, "Аня", "Москва", "методист образовательных программ");
        Human katya = new Human(currentYear - 28, "Катя", "Калининград", "продакт менеджер");
        Human artem = new Human(currentYear - 27, "Артем", "Москва", "директор по рпзвитию бинеса");
        Human vladimir = new Human(currentYear - 21, "Владимир", "Казань", null);

        printInfo(maxim);
        printInfo(anya);
        printInfo(katya);
        printInfo(artem);
        printInfo(vladimir);
    }

    private static void printInfo(Human human) {
        System.out.println("Привет, меня зовут " + human.name + ". Я из города " + human.getTown() + ". Я родился в " + human.getYearOfBirth() + " году. Будем знакомы!");
    }

}