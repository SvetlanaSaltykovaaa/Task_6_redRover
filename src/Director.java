public class Director {
    int numberOfSubordinates;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public double getSalary(Employee employee) {
        double salary = 0;
        if (numberOfSubordinates == 0) {
            salary = employee.getBaseSalary();
        } else {
            salary = employee.baseSalary * 9;
        }
        return salary;
    }
}
