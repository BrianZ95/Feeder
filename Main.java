public class Main {

    public static void main(String[] args) {
        Feeder a = new Feeder(2400);
        System.out.println(a.simulateManyDays(10, 4) + ", " + a.getCurrentFood());

        Feeder b = new Feeder(250);
        System.out.println(b.simulateManyDays(10, 5) + ", " + b.getCurrentFood());

        Feeder c = new Feeder(0);
        System.out.println(c.simulateManyDays(5, 10) + ", " + c.getCurrentFood());

        Feeder d = new Feeder(500);
        d.simulateOneDay(12);
        System.out.println(d.getCurrentFood());

        Feeder e = new Feeder(1000);
        e.simulateOneDay(22);
        System.out.println(e.getCurrentFood());

        Feeder f = new Feeder(100);
        f.simulateOneDay(5);
        System.out.println(f.getCurrentFood());
    }
}
