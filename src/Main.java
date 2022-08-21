public class Main {
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Иванов Иван Иванович", 1, 45000);
        employees[1] = new Employee("Петров Петр Иванович", 4, 40000);
        employees[2] = new Employee("Сидоров Юрий Иванович", 2, 47000);
        employees[3] = new Employee("Нестреров Сергей Иванович", 5, 41000);
        employees[4] = new Employee("Собололев Никита Иванович", 3, 48000);
        employees[5] = new Employee("Васильев Семен Иванович", 1, 35000);
        employees[6] = new Employee("Сергеев Николай Иванович", 5, 32000);
        employees[7] = new Employee("Семенов Алексей Иванович", 2, 38000);
        employees[8] = new Employee("Самсонов Иван Иванович", 3, 40000);
        employees[9] = new Employee("Алешин Николай Иванович", 4, 39000);
        printEmployee();
        System.out.println("Сумма зарплат: " + sumSalary());
        minSalary();
        maxSalary();
        meanSalary();
        printName();
        setIndexSalary(0.05);

    }

    public static void printEmployee() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    public static double sumSalary() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = employees[i].getSalary() + sum;
        }
        return sum;
    }

    public static double minSalary() {
        double min = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (min > employees[i].getSalary() & employees[i] != null) {
                min = employees[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата: " + min);
        return min;
    }

    public static double maxSalary() {
        double max = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (max < employees[i].getSalary() & employees[i] != null) {
                max = employees[i].getSalary();
            }
        }
        System.out.println("Максимальная зарплата: " + max);
        return max;
    }

    public static double meanSalary() {
        double mean = 0;
        if (employees.length != 0) {
            mean = sumSalary() / employees.length;
            System.out.println("Среденяя зарплата: " + mean);
        }
        return mean;
    }

    public static void printName() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName() != null) {
                System.out.println(employees[i].getName());
            }
        }
    }

    public static double setIndexSalary(double index) {
        double sal = 0;
        for (int i = 0; i < employees.length; i++) {
            sal = employees[i].setSalary(employees[i].getSalary() * index + employees[i].getSalary());
            System.out.println(employees[i]);
        }
        return sal;
    }
}