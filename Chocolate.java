public class candy
{
    public String taste()
    {
        System.out.println("Tasty candy");
        return "taste sweety";
    }
}
public class Chocolate extends candy
{
    public String taste()
    {
        System.out.println("Tasty Chocalate");
        return "Tastes Chocalateyyy.....";
    }
    public static void main(String[] args)
    {
        Chocolate objChocolate=new Chocolate();
        objChocolate.taste();     
    }
}