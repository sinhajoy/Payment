public class Person {
    private int roll;
    private String fname;
    private String lname;
    
    public Person(int roll, String fname, String lname) {
        this.roll = roll;
        this.fname = fname;
        this.lname = lname;
    }

    public void show()
    {
        System.out.println(roll +" : "+fname+" : "+lname);
    }

    public int getRoll() {
        return roll;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }

    
}
