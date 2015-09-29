/*
 * For Fall 3150
 * Author: Lathian (Jonathan) Kwiat
 */
import java.util.Vector;

public class MyString {
	private char [] chars; 
	
	public MyString(char[] chars) {
		this.chars = new char[chars.length];
		for (int i = 0; i < chars.length; i++) {
			this.chars[i] = chars[i]; 
		}
	}
	public char charAt(int index) {
		char cloneChar = new Character(chars[index]);
		return cloneChar;
	}
	public int length() {
		int intLength = chars.length;
		return intLength;
	}
	public MyString substring(int begin, int end) {
		int sublength = (end-begin);
		char [] subchars = new char[sublength];
		for (int i = 0; i < sublength; i++) {
			subchars[i] = chars[begin+i];
		}
		return new MyString(subchars);
	}
	public MyString toLowerCase() {
		char [] charCopy = new char[chars.length];
		for (int i = 0; i < chars.length ; i++) {
			charCopy [i] = Character.toLowerCase(chars[i]);
		}
		return new MyString(charCopy);
	}
	public MyString toUpperCase() {
		char [] charCopy = new char[chars.length];
		for (int i = 0; i < chars.length ; i++) {
			charCopy [i] = Character.toUpperCase(chars[i]);
		}
		return new MyString(charCopy);
	}
	public boolean equals(MyString s) {
		if (this.chars.length != s.chars.length) {
			return false;
		}
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] != s.chars[i]) {
				return false;
			}
		}
		return true;
	}
	public MyString getMyString() {
		return new MyString(chars);
	}
	public String toString() {
		return new String(chars);
	}
	public static MyString valueOf(int i) {
		Vector<Integer> digitHolder = new Vector<Integer>();

		do {
			digitHolder.add(i%10);
			// System.out.println(i);
			i/=10;
		} while (i != 0);
		char [] intCharArr = new char[digitHolder.size()];
		for (int g = 0 ; g < digitHolder.size(); g++) {
			// System.out.printf("g = %d%n", g); 
			// So this Character static method translate on int value of the 
			// specified radix (10) to the equivalent char. 
			intCharArr[g] = Character.forDigit(digitHolder.get(digitHolder.size()-1-g) , 10);			
		}
		return new MyString(intCharArr);
	}
	
}