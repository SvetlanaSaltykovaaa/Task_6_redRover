public class Manager extends Worker {
    int numberOfSubordinates;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getSalary(int numberOfSubordinates) {
        if (numberOfSubordinates == 0) {
            return super.getSalary();
        }
        return super.getSalary() * (getNumberOfSubordinates() / 100 * 3);
    }
}
