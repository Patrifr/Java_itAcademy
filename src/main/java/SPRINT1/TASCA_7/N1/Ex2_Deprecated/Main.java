package SPRINT1.TASCA_7.N1.Ex2_Deprecated;

public class Main {
    @SuppressWarnings ("deprecation")
    public static void main(String[] args) {
        double hours = 0d;
        WorkerOnSite worker1 = new WorkerOnSite("Josep","Alvarez",10.44,35);
        WorkerOnline worker2 = new WorkerOnline("Maria","Bergua",10.44);

        System.out.println("This month's salary for worker " + worker1.getName() + " " + worker1.getLastname() +
                        ", is a total of " + worker1.calculateSalary(144) + "€");
        System.out.println("This month's salary for worker " + worker2.getName() + " " + worker2.getLastname() +
                        ", is a total of " + worker2.calculateSalary(125) + "€");

        System.out.println(worker1.costFood(20));
        System.out.println(worker2.calculateExtraHours(10));


    }
}
