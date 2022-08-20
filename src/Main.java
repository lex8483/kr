import java.util.Arrays;

public class Main {
    static Employee[] name = new Employee[10];

    public static void main(String[] args) {

        name[0] = new Employee("Иванов Иван Иванович", 1, 45000);
        name[1] = new Employee("Петров Петр Иванович", 4, 40000);
        name[2] = new Employee("Сидоров Юрий Иванович", 2, 47000);
        name[3] = new Employee("Нестреров Сергей Иванович", 5, 41000);
        name[4] = new Employee("Собололев Никита Иванович", 3, 48000);
        name[5] = new Employee("Васильев Семен Иванович", 1, 35000);
        name[6] = new Employee("Сергеев Николай Иванович", 5, 32000);
        name[7] = new Employee("Семенов Алексей Иванович", 2, 38000);
        name[8] = new Employee("Самсонов Иван Иванович", 3, 40000);
        name[9] = new Employee("Алешин Николай Иванович", 4, 39000);
        printEmployee();
        System.out.println("Сумма зарплат: " + sumSalary());
        minSalary();
        maxSalary();
        meanSalary();
        printName();
        setIndexSalary();

    }

    public static void printEmployee() {
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }

    }

    public static double sumSalary() {
        double sum = 0;
        for (int i = 0; i < name.length; i++) {
            sum = name[i].getSalary() + sum;
        }
        return sum;
    }

    public static double minSalary() {
        double min = sumSalary();
        for (int i = 0; i < name.length; i++) {
            if (min > name[i].getSalary()) {
                min = name[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата: " + min);
        return min;
    }

    public static double maxSalary() {
        double max = name[0].getSalary();
        for (int i = 0; i < name.length; i++) {
            if (max < name[i].getSalary()) {
                max = name[i].getSalary();
            }
        }
        System.out.println("Максимальная зарплата: " + max);
        return max;
    }

    public static double meanSalary() {
        double mean;
        mean = sumSalary() / name.length;
        System.out.println("Среденяя зарплата: " + mean);
        return mean;
    }

    public static void printName() {
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i].getName());
        }
    }

    public static double setIndexSalary() {
        double sal = 0;
        for (int i = 0; i < name.length; i++) {
            sal = name[i].setSalary(name[i].getSalary() * 0.05 + name[i].getSalary());
            System.out.println(name[i]);
        }
        return sal;
    }
}