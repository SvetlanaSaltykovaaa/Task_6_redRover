public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setBaseSalary(1000);

        Worker worker = new Worker();
        double salary = worker.getSalary(employee);
        System.out.println(salary);


        Manager manager = new Manager();
        manager.setNumberOfSubordinates(10);
        double one = manager.getSalary(employee);
         System.out.println(one);

        Director director = new Director();
        director.setNumberOfSubordinates(7);
        double dirSalary = director.getSalary(employee);
        System.out.println(dirSalary);

    }

}


