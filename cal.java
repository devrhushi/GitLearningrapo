import javax.swing.*;
class cal
{
	
	public static void main(String [] a)
	{
		
		
		String num1=JOptionPane.showInputDialog("Enter First number");
		float n2=Float.parseFloat(num1);
		String num2=JOptionPane.showInputDialog("Enter Second number");
		float n3=Float.parseFloat(num2);
		String ch=JOptionPane.showInputDialog("Enter 1. for addition\n Enter 2 for Substraction\nEnter 3 for Multiplication\nEnter 4 for DIvision");
		int n1=Integer.parseInt(ch);
		switch(n1)
		{	
		
			
			case 1:
					System.out.println("\nAddition of"+n2+"+"+n3+"="+(n2+n3));
					break;
			case 2:
					
					System.out.println("\nSubstration of"+n2+"-"+n3+"="+(n2-n3));
					break;
			case 3:
					System.out.println("\n<Multiplication of"+n2+"*"+n3+"="+(n2*n3));
					break;
			case 4:
					
					System.out.println("\nDivision of"+n2+"/"+n3+"="+(n2/n3));
					break;
			default:
			System.out.println("Invalid choice");
		}
	}
}