
public class Student {
    String name;
    int age;
    String address;
    
    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String getName(String name)
    { 
        return name;
    }

    public void setAge(int age)
    {
        this.age=age;
    }

    public int getAge(int age)
    {
        return age;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public String getAddress(String address){
        return address;
    }

    @Override
    public String toString()
    {
        return ("Student name is "+this.name+". Student age is "+this.age+" and address is "+this.address);
    }
}
