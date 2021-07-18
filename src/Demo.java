import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Demo {
public static void main(String[] args) {
	String s="Stay up to date with Google company news and products. Discover stories about our culture, philosophy, and how Google technology is impacting others";
	String[] arr=s.split(" ");
	List<String> list=Arrays.asList(arr);
	Collections.sort(list);
	for (String string : list) {
		System.err.println("String:: "+string);
	}
	Map<String,Integer> mp = new HashMap<>();
	int max=0;
	String maxString="";
	for (String str : list) {
		mp.put(str, str.length());
	}
	
	for (Map.Entry<String, Integer> entry : mp.entrySet()) {
		if(entry.getValue() > max)
		{
			max=entry.getValue();
			maxString=entry.getKey();
		}

	}
	System.err.println("Key:: "+maxString+", Value: "+max);
}
}


class Demo1
{
	
}
