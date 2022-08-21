public class Employee {
    private String name;
    private int department;
    private double salary;
    private int id;
    private static int countid;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        id = ++countid;

    }

    public String getName() {
            return name;
    }

    public int getDepartment() {
            return department;
    }

    public double getSalary() {
            return salary;
    }

    public void setDepartment(int department) {
            this.department = department;
    }

    public double setSalary(double salary) {
            this.salary = salary;
        return salary;
    }

    @Override
    public String toString() {
        return "ФИО='" + name + '\'' + ", отдел=" + department + ", зарплата=" + salary + ", id - " + id;
    }

}
