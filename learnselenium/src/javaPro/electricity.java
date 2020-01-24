package javaPro;

import java.util.Scanner;

public class electricity {

	public static void main(String[] args) {
          int units;
          double totalAmount;
          Scanner sc=new Scanner(System.in);
          System.out.println("enter units that are consumed");
          units=sc.nextInt();
          totalAmount=Electricity(units);
          System.out.println("electricity bill="+totalAmount);
	}
	public static double Electricity(int units)
	{
		double Amount,totalAmount;
		if(units<50)
		{
			Amount=units*2;
			
		}
		else if(units<=100)
		{
			Amount=130+((units-50))*3;
		}
		else if(units<=200)
		{
			Amount=130+162.5+((units-100)*5);
		}
		else
		{
			Amount=130+162.5+526+((units-200)*7);
		}
          totalAmount=Amount;
          return totalAmount;
          
	}

}
