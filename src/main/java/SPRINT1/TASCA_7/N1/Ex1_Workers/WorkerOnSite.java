package SPRINT1.TASCA_7.N1.Ex1_Workers;

public class WorkerOnSite extends Worker{
    private static int gasoline;
    public WorkerOnSite(String name, String lastname, double hourPrice, int gasoline) {
        super(name, lastname, hourPrice);
        WorkerOnSite.gasoline = 20;
    }
    public static int getGasoline() {
        return gasoline;
    }
    public static void setGasoline(int gasoline) {
        WorkerOnSite.gasoline = gasoline;
    }

    @Override
    public double calculateSalary(double hours){
        double salary = 0d;
        salary = super.calculateSalary(hours) + getGasoline();
        return salary;
    }
}
