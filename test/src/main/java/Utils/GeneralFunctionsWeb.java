package Utils;

import java.util.HashSet;
import java.util.Set;

public class GeneralFunctionsWeb {

	
	public void verifyTest(String expected,String actual) {
		Set<String> set = new HashSet<String>();
		set.add("adfgdg");set.add("dsfsdg");
		System.out.println(set);
		if(expected.equals(actual)){
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
	}
	public static void main(String args[]) {
		Set<String> set = new HashSet<String>();
		set.add("adfgdg");set.add("dsfsdg");
		System.out.println(set);
	}
	
}
