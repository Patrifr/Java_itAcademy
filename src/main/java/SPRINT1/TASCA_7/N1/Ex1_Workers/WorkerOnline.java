package SPRINT1.TASCA_7.N1.Ex1_Workers;

public class WorkerOnline extends Worker{
    private final int internet = 55;
    public WorkerOnline(String name, String lastname, double hourPrice) {
        super(name, lastname, hourPrice);
    }
    public int getInternet() {
        return internet;
    }
    @Override
    public double calculateSalary(double hours){
        double salary = 0d;
        salary = super.calculateSalary(hours) + this.getInternet();
        return salary;
    }
}
