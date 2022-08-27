import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
        task5();
    }

    private static void task5() {
        var employees = new HashMap<String, Integer>();
        employees.put("Маша", 67_760);
        employees.put("Денис", 83_690);
        employees.put("Кристина", 76_230);
        employees.put("Ренат", 100_500_000);

        var monthInOneYear = 12;

        var percent = 0.5;
        for (var current : employees.entrySet()) {
            printNewSalary(current.getKey(), current.getValue(), percent, monthInOneYear);
        }
    }

    private static void printNewSalary(String name, int oldSalary, double percent, int month) {
        var newSalary = oldSalary * percent;
        var salaryDifference = Math.abs(newSalary - oldSalary);

        System.out.println();
        System.out.println(name);
        System.out.printf("новая зарплата %.2f\n", newSalary);
        System.out.printf("разница между новой %.2f и старой %d зарплатой будет %.2f\n", newSalary, oldSalary, salaryDifference);
        System.out.printf("за %d месяцев в новой зарплате получит %.2f рублей и в старой %.2f рублей\n", month, newSalary * month, newSalary * month);
        System.out.println();
    }

    private static void task4() {
        int requiredWeightOnGram = 7000;
        double minimumWeightLostInDay = 250;
        double maximumWeightLostInDay = 500;

        var daysWithMinimumEfforts = requiredWeightOnGram / minimumWeightLostInDay;
        var daysWithMaximumEfforts = requiredWeightOnGram / maximumWeightLostInDay;
        System.out.println();
        System.out.printf("При минимальной диета спортсмен похудеет на %d кг за %.0f дней", requiredWeightOnGram / 1000, daysWithMinimumEfforts);
        System.out.println();
        System.out.printf("При максимальной диета спортсмен похудеет на %d кг за %.0f дней", requiredWeightOnGram / 1000, daysWithMaximumEfforts);
        System.out.println();
    }

    private static void task3() {
        int bananaWeightOnGram = 80;
        int milkWeightOn100ml = 105;
        int iceCreamWeight = 100;
        int eggWeight = 70;

        int totalWeightOnGram = 5 * bananaWeightOnGram
                + 2 * milkWeightOn100ml
                + 2 * iceCreamWeight
                + 4 * eggWeight;

        //%s - строки
        //%d - целочисленные
        //%f - вещественные
        System.out.printf("Вес всех продуктов равен %.3f кг", totalWeightOnGram / 1000.0);
    }

    private static void task2() {
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        System.out.println("вес первого бойцы " + boxer1Weight);
        System.out.println("вес второго бойцы " + boxer2Weight);

        var sum = boxer1Weight + boxer2Weight;
        var difference = Math.abs(boxer1Weight - boxer2Weight);

        System.out.printf("общий вес бойцов %.2f кг\nразница в весе боксеров %.2f кг", sum, difference);
        System.out.print("\n");
        System.out.println();
    }

    public static void task1() {
        //тут ваш код
//       byte, short, int, long, double, float, char, boolean;
    }

    //public - не задумываемся
    //static - не задумываемся
    //void - возращаемое значение(может быть лююбого типа)
}
