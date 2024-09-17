public class Main
{
    
    public static void main(String[] args)
    {
    Feeder f = new Feeder();
     //System.out.println(f.currentFood);
     System.out.println(f.getCurrentFood());
     Feeder g= new Feeder(500);
     System.out.println(g.getCurrentFood());
    }
}