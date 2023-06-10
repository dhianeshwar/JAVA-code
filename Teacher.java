class person
{
    String name;
    int age;
    person(String name,int age)
    {
        this.age=age;
        this.name=name;
        System.out.println("In person class");
        System.out.println("here the name will be "+name);
        System.out.println("here the age will be "+age);
        System.out.println("_____________________________________");
    }
}
class Teacher extends person
{
    String name,degree;
    int age;
    Teacher(String name,int age,String degree)
    {
        super("Teacher's name",0);
        this.age=age;
        this.name=name;
        this.degree=degree;
        System.out.println("In Teacher class");
        System.out.println("here the name will be "+name);
        System.out.println("here the age will be "+age);
        System.out.println("here the degree will be "+degree);

    }
    public static void main(String[] args)
     {
      Teacher object=new Teacher("dhianesh",22,"MCA"); 
    }
}