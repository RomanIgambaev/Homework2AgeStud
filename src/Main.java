import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Я помогу тебе вычислить возраст учеников двух классов,если в каждом классе 20 человек. Введи возврат учеников первого класса");
            double ageStud;
            double sumAgeStud = 0;
            int cointStud = 1;
            double averAge;
            while (cointStud <= 20) {
                ageStud = scanner.nextDouble();
                sumAgeStud += ageStud;
                cointStud++;
            }
            averAge = sumAgeStud / 20;
            System.out.println("Средний возвраст учеников первого класса составляет: " + averAge + " введи возвраст учеников второго класса");
            double ageStud2;
            double sumAgeStud2 = 0;
            int cointStud2 = 1;
            double averAge2;
            while (cointStud2 <= 20) {
                ageStud2 = scanner.nextDouble();
                sumAgeStud2 += ageStud2;
                cointStud2++;
            }
            averAge2 = sumAgeStud2 / 20;
            System.out.println("Средний возвраст учеников второго класса составляет: " + averAge2);
        }catch (Exception ex) {
            System.out.println("Ты ввёл что-то не так");
        }

    }
}