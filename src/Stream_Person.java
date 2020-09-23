import java.util.ArrayList;
import java.util.List;

public class Stream_Person 
{
    private String name;
    private int age;
    
    public Stream_Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }
    
    public String getName() 
    {
        return name;
    }
    
    public int getAge() 
    {
        return age;
    }
    
    public static List<Stream_Person> getList() {
        List<Stream_Person> list = new ArrayList<>();
        list.add(new Stream_Person("Ram", 23));
        list.add(new Stream_Person("Shyam", 20));
        list.add(new Stream_Person("Shiv", 25));
        list.add(new Stream_Person("Mahesh", 30));
        return list;
    }
}
