class Parent{
    void print()
    {
        System.out.println("This is Parent class");
    }
}
class subclass1 extends Parent{
    void print()
    {
        System.out.println("This is subclass1");
    }
}
class subclass2 extends subclass1
{
    void print()
    {
        System.out.println("This is subclass2");
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        Parent obj=new Parent();
        subclass1 obj1=new subclass1();
        subclass2 obj2=new subclass2();

        obj.print();
        obj1.print();
        obj2.print();
    }
    
}


// This Function is use for Test Ploymorphism in java