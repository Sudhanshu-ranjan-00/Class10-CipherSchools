class Students{
    int rollNo;
    String name;
    static  int count=0;
    Students(int rollNo,String name)
    {
        this.rollNo=rollNo;
        this.name=name;
        count++;
    }
    static void showCount()
    {
        // System.out.println("Roll no : "+rollNo); Cannot be accessed because static methods can't access not static members.
        System.out.println("Count : "+count);
    }
}
public class Main{
    public static void main(String args[])
    {
        Students s1=new Students(1,"Ram");
        System.out.println("Count : "+s1.count);
        Students s2=new Students(2, "Shyam");
        System.out.println("Count : "+s2.count);
        Students s3=new Students(3, "Alex");
        System.out.println("Count : "+s3.count);


        System.out.println("Calling using className(Count) : "+Students.count);
    }
}