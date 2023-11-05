package week4.day2;

public class StringReplace {
	public static void main(String[] args) {
		String str = "Chennai,600073";
		String str1 = "6,017";//6017
		String name="TestLeaf";
		
		//split the given sentence
		String[] split = str.split(",");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		//output=600073
		
		String replaceAll = str1.replaceAll(",", "");
		System.out.println(replaceAll);
		
		//to print only numbers
		String numbers = str.replaceAll("[^0-9]", "");
		System.out.println(numbers);//600073
		
		//to convert the String to int data type
		int converted = Integer.parseInt(numbers);
		System.out.println(converted);
		
		double parseDouble = Double.parseDouble(replaceAll);
		System.out.println(parseDouble);
		
		//to print only ASCII characters
		String replacedString = str.replaceAll("[^a-zA-Z]", "");
		System.out.println(replacedString);
		
		//to retrieve sequence of character from the string based on index
         String substring = name.substring(3);
         System.out.println(substring);
	
         String substring2 = name.substring(3, 8);
         System.out.println(substring2);
	}

}
