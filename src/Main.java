public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        double currentSavings = 0;
        int targetSavings = 2_459_000;
        int monthlyContribution = 15_000;
        double monthlyRate = 0.12 / 12 + 1;
        short cntMonths = 1;

        currentSavings += monthlyContribution; //first month
        do {
            cntMonths++;
            currentSavings = currentSavings * monthlyRate + monthlyContribution;
        } while (currentSavings <= targetSavings);

        System.out.println("Месяц " + cntMonths + ", сумма накоплений равна " + (int)currentSavings + " рублей.");

        System.out.println("Задача 2");
        int num = 0;
        while (num < 10){
            System.out.print(++num + " ");
        }
        System.out.println();
        for (; num>0; num--){
            System.out.print(num + " ");
        }

        System.out.println("\nЗадача 3");
        double population = 12000000.0;
        double birthRate = 17.0 / 1000;
        double deathRate = 8.0 / 1000;

        double populationGrowth = birthRate - deathRate;

        for (int year = 1; year <= 10; year++) {
            population *= (populationGrowth + 1);
            System.out.printf("Год %d, численность населения составляет %.0f\n", year, population);
        }

        System.out.println("Задача 4");
        double interestRate = 1.07;
        int targetSum = 12_000_000;
        double currBalance = 15000.0;
        short month = 1;

        System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей.\n", month, currBalance);
        do {
            month++;
            currBalance *= interestRate;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей.\n", month, currBalance);
        } while (currBalance <= targetSum);

        System.out.println("Задача 5");
        currBalance = 15000.0;
        month = 1;

        do {
            month++;
            currBalance *= interestRate;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей.\n", month, currBalance);
            }
        } while (currBalance <= targetSum);
        //System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей.\n", month, currBalance);

        System.out.println("Задача 6");
        currBalance = 15000.0;
        for (int i = 1; i <= 9*12; i++)
        {
            currBalance *= interestRate;
            if (i % 6 == 0) {
                System.out.printf("Полгода №%d, сумма накоплений равна %.2f рублей.\n", i / 6, currBalance);
            }
        }

        System.out.println("Задача 7");
        int firstFriday = 1;
//        for (int friday = firstFriday; friday <=31; friday += 7){
//            System.out.println("Сегодня " + friday + " декабря, пятница. Нужно подготовить еженедельный отчет.");
//        }
        for (int i = 1; i <=31; i ++){
            if ((firstFriday - i) % 7 == 0) {System.out.println("Сегодня " + i + " декабря, пятница. Нужно подготовить еженедельный отчет.");}
        }

        System.out.println("Задача 8");
        int currentYear = 2023;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        int appearanceFrequency = 79;

        for (int i = startYear; i < endYear; i++)
        {
            if (i % appearanceFrequency == 0)
            {
                System.out.println(i);
            }
        }

    }
}