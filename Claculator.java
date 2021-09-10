// This function is creater for test knowledge in Polymorphism in java

public class Claculator {
    private int a;
    private int b;
    private int c;
    private int d;
    public Claculator(int a, int b) {
        this.a = a;
        this.b = b;
        this.c=0;
        this.d=0;
    }
    public Claculator(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public void sum(){
        int addi=a+b+c+d;
        System.out.println("Sum : "+addi);
    }

    



}
