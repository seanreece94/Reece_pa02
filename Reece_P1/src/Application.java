
import java.util.Scanner;
public class Application {
	
	  
      
       
	public static void main(String[] args) {
		//Creating scanner variable to take 4 digit String
		Scanner input= new Scanner(System.in);
		//Creating Encrypter object
		Encrypter encrypter = new Encrypter();
		//Declaring variable num for the numbers in the string
		Decrypter decrypter = new Decrypter();
		Integer entry;
		
		//Prompting user for number
		System.out.print("Please enter four digit number for encryption:");
		
		entry=input.nextInt();
		
		
		int thousandPlace = entry/1000;
		
		int hundredPlace = (entry/100)%10;
		
		int tenPlace = (entry/10)%10;
		
		int onePlace = (entry/1)%10;
		
		if(tenPlace !=3) {
		encrypter.encrypt( thousandPlace,hundredPlace,tenPlace,onePlace);
		decrypter.decrypt( thousandPlace,hundredPlace,tenPlace,onePlace);
		System.out.printf("Encrypted number is: %d",encrypter.encrypt(thousandPlace,hundredPlace,tenPlace,onePlace));
		
		System.out.printf("\nDecrypted number is: %d", decrypter.decrypt( thousandPlace,hundredPlace,tenPlace,onePlace));
		}else if(entry==3333) {
			System.out.print("Encrypted number is: 0000");
			System.out.printf("\nDecrypted number is: %d", decrypter.decrypt( thousandPlace,hundredPlace,tenPlace,onePlace));
			}
		else if(tenPlace==3 ) {
			System.out.printf("Encrypted number is: 0%d",encrypter.encrypt(thousandPlace, hundredPlace, tenPlace, onePlace));
			System.out.printf("\nDecrypted number is: %d", decrypter.decrypt( thousandPlace,hundredPlace,tenPlace,onePlace));
		}else if(entry==3333) {
			System.out.print("0000");
			System.out.printf("\nDecrypted number is: %d", decrypter.decrypt( thousandPlace,hundredPlace,tenPlace,onePlace));
		}
		
		}
	

}