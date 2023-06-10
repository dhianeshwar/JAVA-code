import java.util.Scanner;
public class Demo {
    void talk()
    {
        System.out.println("Hello user");
        System.out.println("kindly Enter your Name");   
    }
    void talk(String name)
    {
    
        System.out.println("Hello "+name);
    
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Demo obj=new Demo();
        obj.talk();
        String name=sc.next();
        obj.talk(name);
    }
}
