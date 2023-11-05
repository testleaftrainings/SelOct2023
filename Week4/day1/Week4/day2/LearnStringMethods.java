package week4.day2; 

public class LearnStringMethods {
	public static void main(String[] args) {
		//difference between == and .equals
		/*
		 * == -> references of two objects -> refers to the exact same memory location
		 * equals() -> compare the content of the objects, not their memory references
		 */
		
		//String literal -> String pool memory
		String name	="TestLeaf";
		String name1 = "Testleaf";
		
		//to convert all characters into lowercase
		name=name.toLowerCase();
		
		//to convert all characters into uppercase
		name.toUpperCase();
		
		//String instantiation - Heap memory
		String str = new String("TestLeaf");
		String str2 = new String("TestLeaf");
		
		//to find the length of the String
		int len = name.length();
		System.out.println("Total length is :"+len);
		
		System.out.println(name.equals(name1));
		
		//to ignore casesensitivity
		System.out.println(name.equalsIgnoreCase(name1));
		
		//to compare both String
		if (name.equals(name1)) {
			System.out.println("Both are equal");
		}else {
			System.out.println("Not equal");
		}
		
		
		//to check whether a part of the value is present or not
		boolean contains = name.contains("Leaf");
		System.out.println(contains);
		
		if (name.contains("leaf") || name.contains("Leaf"))  {
			System.out.println("Present");
		}
		else {
			System.out.println("Not Present");
		}
		
		//returns the character from particular index
		System.out.println(name.charAt(3));
		
		//to convert the given String into character array
		char[] ch = name.toCharArray();
		System.out.println(ch[4]);
		
		//to print all characters
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}//feaLtset
		
		
	}

}
