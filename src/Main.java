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

        System.out.println();

        //задание 2
        Flower roza = new Flower(null, "Голландия", 35.59);
        Flower hrizantema = new Flower(null, null, 15);
        hrizantema.liseSpan = 5;
        Flower pion = new Flower(null, "Англия", 69.9);
        pion.liseSpan = 1;
        Flower hypsofila = new Flower(null, "Турция", 19.5);
        hypsofila.liseSpan = 10;

        printInfo1(roza);
        printInfo1(hrizantema);
        printInfo1(pion);
        printInfo1(hypsofila);

        System.out.println();

        printCostOfFlowers(
                roza, roza, roza,
                hrizantema, hrizantema, hrizantema, hrizantema, hrizantema,
                hypsofila
        );

    }


    public static void printInfo1(Flower flower) {
        System.out.println(
                "Цвет: " + flower.getFlowerColor() +
                        ", страна: " + flower.getCountry() +
                        ", стоимость за штуку: " + flower.getCost() +
                        ", срок стояния цветка: " + flower.liseSpan
        );
    }

    private static void printCostOfFlowers(Flower... flowers) {
        double totalCost = 0;
        int minimumLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.liseSpan < minimumLifeSpan) {
                minimumLifeSpan = flower.liseSpan;
            }
            totalCost += flower.getCost();
            printInfo1(flower);
        }
        totalCost = totalCost * 1.1;
        System.out.println("Стоимость букета: " + totalCost);
        System.out.println("Срок стояния букета: " + minimumLifeSpan);
    }


    private static void printInfo(Human human) {
        System.out.println("Привет, меня зовут " + human.name +
                ". Я из города " + human.getTown() +
                ". Я родился в " + human.getYearOfBirth() +
                " году. Будем знакомы!");
    }

}