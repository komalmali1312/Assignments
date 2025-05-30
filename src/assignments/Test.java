package assignments;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Map<String,Map<String,String>>Projectdetails=new HashMap<>();
Map<String,String>Student=new HashMap<>();
Student.put("Name","Komal");
Student.put("Salary","80K");
Projectdetails.put("Komal", Student);
System.out.println(Projectdetails.get("Komal").get("Salary"));*/
/*String input="Komal is Good Engineer";
String[] sepword=input.split(" ");
String reverse="";
for(int j=sepword.length-1;j>=0;j--)
{
for(int i=sepword[j].length()-1;i>=0;i--)
{
	reverse=reverse+sepword[j].charAt(i);
}
reverse=reverse+" ";
}
System.out.println(reverse);*/

/*String s="I Love Java Mongo Ruby Java Python";
HashMap<Character,Integer>maptest=new HashMap<>();
for(int i=0;i<s.length()-1;i++)	
{ 
	char c=s.charAt(i);
	if(maptest.containsKey(c))
	
		maptest.put(c,maptest.get(c)+1);	
	
	else
		maptest.put(c,1);	
}
	
System.out.println(maptest);*/
String test="I Love Java Mongo Ruby Java Python";
String[] sepword=test.split(" ");
Set<String>myset=new HashSet<>();
for(int i=0;i<sepword.length-1;i++)
{
	String demo=sepword[i];
	if(myset.contains(demo))
	{
		System.out.println("Duplivcate:"+demo);	
	}
	else
		myset.add(demo);
}
System.out.println(myset);
	}

}
