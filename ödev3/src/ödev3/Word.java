package ödev3;

import java.util.Scanner;

public class Word {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a word:");
		String girilen_kelime ;
		String yeni_kelime = "";
		
		girilen_kelime=scanner.next().toUpperCase(); 
	     
        for(int i=girilen_kelime.length()-1;i>=0;i--) 
        {
        	yeni_kelime = yeni_kelime + girilen_kelime.charAt(i);
            System.out.print(girilen_kelime.charAt(i));
            
            	
        }
        if (girilen_kelime.equals(yeni_kelime)) {
            	
            	System.out.println("\t This word is a palindrome.");
            }
            	else {
					System.out.println("\t This word is not a palindrome.");
				}
	}

}
