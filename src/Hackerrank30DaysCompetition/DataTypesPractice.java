package Hackerrank30DaysCompetition;
import java.util.HashMap;
import java.util.Map;

public class DataTypesPractice {

    public static void main(String[] args) {
	Object[] input = { 5.35, 'a', false, 100, "I am a code monkey", true, 17.3, 'c', "derp" };
	Map<String, String> map = new HashMap<String, String>();
	map.put("Double", "double");
	map.put("Character", "char");
	map.put("Boolean", "boolean");
	map.put("Integer", "int");
	map.put("String", "String");

	for (Object object : input) {
	    String type = (object.getClass()).toString().replace("class java.lang.", "");
	    if (isPrimitive(type)) {
		System.out.print("Primitive : ");
	    } else {
		System.out.print("Referenced : ");
	    }
	    System.out.println(map.get(type));
	}
    }

    private static boolean isPrimitive(String type) {
	if (type.equals("Integer") || type.equals("Double") || type.equals("Character") || type.equals("Boolean"))
	    return true;
	return false;
    }
}