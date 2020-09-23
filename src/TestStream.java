import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestStream 
{
	public static void main(String[] args) 
	{
		//使用IntStream後forEach 變數名 -> 使用語法
		//IntStream.range(0,10).forEach(i->System.out.println(i));
		IntStream.range(0, 10).forEach(System.out::println);
		
		//使用Stream.of指定集合的資料，然後用 collect 方法來收集，必須指定收集的型式，這裡指定為 toList。
		List<String> list = Stream.of("Tony", "Tom", "Jonn").collect(Collectors.toList());
		System.out.println("List="+list);
		//Set = 不重複資料
		Set<String> set = Stream.of("Andy","Andy","TIM","RICK","ROCK").collect(Collectors.toSet());
		System.out.println("Set="+set);
		
		//如果不用Collectors.joining 要達到此效果會比較麻煩
		//StringBuilder sb = new StringBuilder("[");
		//int i = 0;
		//List<String> list2 = Stream.of("one", "two", "three").collect(Collectors.toList());
		//for (String p : list2) {
		//String name = p;
		//sb.append(name);
		//if (++i < list2.size()){
		//	sb.append(",");
		//}
		//}
		//sb.append("]");
		//System.out.println(sb.toString());
		List<String> list1 = Stream.of("one", "two", "three").collect(Collectors.toList());
	    String result1 = list1.stream().collect(Collectors.joining(",", "{", "}"));
	    System.out.println(result1);
	    
	    List<String> list2 = Stream.of("aaa","bbb","ccc","ddd").map(str->str.toUpperCase()).collect(Collectors.toList());
	    String result2 = list2.stream().collect(Collectors.joining(",", "{", "}"));
	    System.out.println(result2);
	    
	    //當List包裝 對象使用方法 將個別東西列出
	    List<Stream_Person> list3 = Stream_Person.getList();
	    String result3 = list3.stream().map(p->p.getName()+"-"+p.getAge()).collect(Collectors.joining("|","[","]"));
	    System.out.println(result3);
	    
	    //當在迴圈時候 用filter判斷是否符合條件
	    List<String> list4 = Stream.of("Andy","Ami","Rock","Rick","Tim","Stan").filter(name->name.startsWith("R")).collect(Collectors.toList());
	    System.out.println(list4);
	    
	    
	}
}
