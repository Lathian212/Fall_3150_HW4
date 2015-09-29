public class DriverMyString {
	public static void main (String [] args) {
		System.out.println("This is a driver for the MyString object class. All code is first printed to" + 
				" standard out first before the code is executed.\n All methods of MyString are tested.");
		System.out.println("char [] startChar10 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'g' };");
		char [] startChar10 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'g' };
		System.out.println("MyString myStObj0 = new MyString(startChar10);");
		MyString myStObj0 = new MyString(startChar10);
		System.out.println("myStObj0.charAt(i) in a for loop to print out MyString");
		for (int i = 0; i < 10; i++){
			System.out.print(myStObj0.charAt(i) + " ");
		}
		System.out.println();
		System.out.print("myStObj0.length() = ");
		System.out.println(myStObj0.length());
		System.out.println("MyString mySubobj0 = myStObj0.substring(0, 5)");
		MyString mySubObj0 = myStObj0.substring(0, 5); 
		System.out.printf("System.out.printf(mySubObj0) = %s%n", mySubObj0);
		System.out.println("System.out.println(myStObj0.toUpperCase()) = "+ myStObj0.toUpperCase());
		System.out.println("char [] startChar5 = {'A', 'B', 'C', 'D', 'E'};");
		char [] startChar5 = {'A', 'B', 'C', 'D', 'E'};
		System.out.println("MyString myStObj2 = new MyString(startChar5);");
		MyString myStObj2 = new MyString(startChar5);
		System.out.printf("System.out.printf(myStObj2) = %s%n", myStObj2);
		System.out.printf("System.out.printf(myStObj2).toLowerCase() = %s%n", myStObj2.toLowerCase());
		System.out.println("char [] startChar10b = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'g' };");
		char [] startChar10b = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'g' };
		System.out.println("MyString myStObj1 = new MyString(startChar10b);");
		MyString myStObj1 = new MyString(startChar10b);
		System.out.printf("myStObj0.equals(myStObj2) = %s%n", myStObj0.equals(myStObj2));
		System.out.printf("myStObj0.equals(myStObj1) = %s%n", myStObj0.equals(myStObj1)); 
		System.out.printf("myStObj0.equals(myStObj1.toUpperCase()) = %s%n", myStObj0.equals(myStObj1.toUpperCase())); 
		System.out.println("MyString myStObj3 = null;");
		MyString myStObj3 = null;
		System.out.printf("myStObj3 = myStObj0.getMyString()%n");
		myStObj3 = myStObj0.getMyString();
		System.out.printf("System.out.printf(myStObj3) = %s%n", myStObj3);
		System.out.printf("String realString = myStObj0.toString(); %n");
		String realString = myStObj0.toString();
		System.out.printf("System.out.println(realString) = %s%n", realString);
		System.out.printf("MyString intMyString = MyString.valueOf(5378); System.out.println(intMyString) = ");
		MyString intMyString = MyString.valueOf(5378);
		System.out.println(intMyString);
		
	}
}