public class Main {

    public static void main(String[] args) {
        Feeder a = new Feeder(2400);
        System.out.println(a.simulateManyDays(10, 4) + ", " + a.getCurrentFood());

        Feeder b = new Feeder(250);
        System.out.println(b.simulateManyDays(10, 5) + ", " + b.getCurrentFood());

        Feeder c = new Feeder(0);
        System.out.println(c.simulateManyDays(5, 10) + ", " + c.getCurrentFood());

        Feeder d = new Feeder(1200);
        System.out.println(d.simulateManyDays(12, 3) + ", " + d.getCurrentFood());

        Feeder e = new Feeder(700);
        System.out.println(e.simulateManyDays(5, 6) + ", " + e.getCurrentFood());

        Feeder f = new Feeder(500);
        System.out.println(f.simulateManyDays(8, 4) + ", " + f.getCurrentFood());
    }
}
