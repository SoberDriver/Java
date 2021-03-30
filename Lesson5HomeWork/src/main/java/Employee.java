public class Employee {

    private String name;
    private String position;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String name, String position, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void getInfo(){
        System.out.println("ФИО: " + name + ". Должность: " + position + ". Телефон: " + phoneNumber + ". Зарплата: " + salary + ". Возраст: " + age);
    }

    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Петр Степанов", "Менеджер", "89261540330", 34000, 25);
        employeeArray[1] = new Employee("Иван Драгунов", "Специалис техподдержки", "89171140330", 26000, 35);
        employeeArray[2] = new Employee("Алексей Семенов", "Токарь", "89261598758", 41000, 49);
        employeeArray[3] = new Employee("Александр Кожедуб", "Директор дистрибьюции", "89771629931", 66000, 52);
        employeeArray[4] = new Employee("Петр Волк", "Менеджер", "89625627830", 34000, 41);

        for (Employee employee : employeeArray) {
            if (employee.age > 40)
                employee.getInfo();
        }
    }
}
