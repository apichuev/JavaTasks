package Task5;

public class List {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivanov Pavel", "QA Engineer", "ip@gmail.com", "8-10-1-212-123 45 67", 8400, 21);
        employeeArray[1] = new Employee("Sidorov Viktor", "DevOps", "sv@gmail.com", "8-10-1-212-123 45 68", 18000, 48);
        employeeArray[2] = new Employee("Petrova Aleksandra", "Web Developer", "pa@gmail.com", "8-10-1-212-123 45 69", 14400, 23);
        employeeArray[3] = new Employee("Smirnov Dmitriy", "Lead", "sd@gmail.com", "8-10-1-212-123 45 70", 24000, 40);
        employeeArray[4] = new Employee("Sokolov Andrey", "Java Developer", "sa@gmail.com", "8-10-1-212-123 45 71", 22400, 33);

        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getAge() > 40) {
                employeeArray[i].print();
            }
        }
    }
}

