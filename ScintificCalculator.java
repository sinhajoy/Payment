class ScintificCalculator extends Claculator{
    private int a;
    private int b;
    private int c;
    private int d;
    
    public ScintificCalculator(int a, int b, int c, int d, int a2, int b2, int c2, int d2) {
        super(a, b, c, d);
        a = a2;
        b = b2;
        c = c2;
        d = d2;
    }

    public ScintificCalculator(int a, int b, int a2, int b2) {
        super(a, b);
        a = a2;
        b = b2;
    }

    public ScintificCalculator(int a, int b, int c, int d, int a2, int b2) {
        super(a, b, c, d);
        a = a2;
        b = b2;
    }

    void multi()
    {
        int mul=a*b*c*d;
        System.out.println("Multiplication value is : "+mul);
    }
}
