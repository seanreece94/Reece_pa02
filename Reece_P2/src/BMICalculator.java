
import java.util.Scanner;
public class BMICalculator {
private Integer choice ;
private double weightImp;
private double heightImp;
private double weightMet;
private double heightMet;
private double bmi;
//private double bmiImp;
private String category="";
Scanner input=new Scanner(System.in);
       
        private Integer readUnitType() {
		System.out.printf("Please enter 1 for your imperial BMI or 2 for your metric BMI: ");
		choice=input.nextInt();
		if(choice<1 || choice>2) {
			System.out.printf("%nIncorrect entry.Please enter a 1 or a 2 only:  ");
			choice=input.nextInt();
			
		}
		
		  
		
		return choice;
		
	}
	
	private void readMeasurementData() {
		
		if(choice==1) {
			readImperialData();
			
		}else if(choice==2) {
			readMetricData();
		}else {
			System.out.printf("%nError");
			readUnitType();
		}
		
		
	}
	public void readUserData() {
		
		  readUnitType();
		  readMeasurementData();
		
	}
	private void readMetricData() {
		System.out.printf("Enter weight(in kg):" );
		weightMet=input.nextDouble();
		System.out.printf("Enter height(in meters):");
		heightMet=input.nextDouble();
		if(weightMet<0 && heightMet<0) {
			System.out.print("Error,please enter a positive weight(in lbs): " );
			weightMet= input.nextDouble();
			System.out.print("Error,please enter a positive height(in inches): " );
			heightMet= input.nextDouble();
		}else if(heightImp<0) {
			System.out.print("Error,please enter a positive height(in inches): " );
			heightMet= input.nextDouble();
		}else if(weightImp<0) {
			System.out.print("Error,please enter a positive weight(in lbs): ");
			weightMet=input.nextDouble();
		}
		
	}
	private void readImperialData() {
		System.out.printf("Enter weight(in lbs):" );
		weightImp=input.nextDouble();
		System.out.printf("Enter height(in inches):");
		heightImp=input.nextDouble();
		if(weightImp<0 && heightImp<0) {
			System.out.print("Error,please enter a positive weight(in lbs): " );
			weightImp= input.nextDouble();
			System.out.print("\nError,please enter a positive height(in inches): " );
			heightImp= input.nextDouble();
		}else if(heightImp<0) {
			System.out.print("Error,please enter a positive height(in inches): " );
			heightImp= input.nextDouble();
		}else if(weightImp<0) {
			System.out.print("Error,please enter a positive weight(in lbs): ");
			weightImp=input.nextDouble();
		}
		
	}
	public Double calculateBmi() {
		
		if(choice==1) {
			bmi=((703)*(weightImp))/((heightImp)*(heightImp));
		}else if(choice==2) {
			bmi=(weightMet)/((heightMet)*(heightMet));
			
		}
		return bmi;
	}
	private String  calculateBMICategory() {
		     if(bmi<18.5 ) {
		    	 category="Underweight";
		    	 
		     }else if(bmi>=18.5 && bmi<=24.9) {
		    	 category="Normal";
		     }else if(bmi>=25 && bmi<=29.9) {
		    	 category="Overweight";
		     }else if(bmi>=30) {
		    	 category="Obese";
		     }
		return category;
	}
	public void displayBmi() {
		System.out.printf("Your BMI is: %.02f", bmi);
		calculateBMICategory();
		System.out.printf("%nYou are %s", category);
	}
	public void getWeight(Double wgt) {
		
		
	}
	private void setWeight() {
		
	}
	public Double getHeight(Double hgt) {
		
		return hgt;
	}
	private void setHeight() {
		
	}
	public Double getBmi(Double bmiFinal) {
		
		return bmiFinal;
	}
	public String getBmiCategory(String bmiCategory) {
		
		return bmiCategory;
	}
}
