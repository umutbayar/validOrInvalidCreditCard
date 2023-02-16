
/*In this example, we questioned whether the credit card number we received from the user was valid.
 *  While doing this, we first asked the user to enter the credit card number. Then we moved by two from
 *   the 2nd number of the credit card number from the right and multiplied by two. If the value we multiplied 
 *   by two exceeds 9, we subtract 9 from our value. We have summed up all their values. If our total is
 *    a multiple of 10, the credit card number is valid.
 *  Student name and Surname= Umut Bayar    Student ID=150120043
 *  
 */
import java.util.Scanner;

public class HW_4_Q2_150120043 {
				public static void main(String[] args) {
					Scanner scan=new Scanner(System.in);
					String	crediNumber=scan.nextLine() ;
					boolean isItValid =false;
					String crediNumberWithoutSpace="";
					for(int i=0;i<crediNumber.length();i++) {
						if((int)crediNumber.charAt(i)!=32)
			crediNumberWithoutSpace=crediNumberWithoutSpace+crediNumber.charAt(i);	
					}
						
				for(int i=0;i<crediNumberWithoutSpace.length();i++) {
	if((int)crediNumberWithoutSpace.charAt(i)<=57&&(int)crediNumberWithoutSpace.charAt(i)>=48)
						isItValid=true;
						else {
							isItValid=false;
							System.out.println("Invalid Input !");break;
						}	
						}
					if(isItValid==true) {
							System.out.print("DNumber:");
						for(int i=0;i<crediNumberWithoutSpace.length();i++) {
						if(crediNumberWithoutSpace.length()%2==0) {
							if(i%2==0)
							System.out.print(crediNumberWithoutSpace.charAt(i));
						else if(i%2==1)
							System.out.print("_");
						}
						else if(crediNumberWithoutSpace.length()%2==1) {
							if(i%2==1)
								System.out.print(crediNumberWithoutSpace.charAt(i));
							else if(i%2==0)
								System.out.print("_");
							}
						}
						
						System.out.println("");
						System.out.print("LNumber:");
						for(int i=0;i<crediNumberWithoutSpace.length();i++) {
							if(crediNumberWithoutSpace.length()%2==0) {
							if(i%2==0&&(int)crediNumberWithoutSpace.charAt(i)<53)
						System.out.print((crediNumberWithoutSpace.charAt(i)-48)*2);
							else if(i%2==0&&(int)crediNumberWithoutSpace.charAt(i)>=53)
								System.out.print((((int)crediNumberWithoutSpace.charAt(i)-48)*2)-9);
							else if(i%2!=0)
								System.out.print((int)crediNumberWithoutSpace.charAt(i)-48);
						}
							else if(crediNumberWithoutSpace.length()%2==1) {
								if(i%2==1&&(int)crediNumberWithoutSpace.charAt(i)<53)
									System.out.print((crediNumberWithoutSpace.charAt(i)-48)*2);
										else if(i%2==1&&(int)crediNumberWithoutSpace.charAt(i)>=53)
											System.out.print((((int)crediNumberWithoutSpace.charAt(i)-48)*2)-9);
										else if(i%2!=1)
									System.out.print((int)crediNumberWithoutSpace.charAt(i)-48);		
							}
						}
						System.out.println("");
						if(validateNumber(crediNumber)==true)
							System.out.println("Number is Valid");		
					else if(validateNumber(crediNumber)==false)
						System.out.println("Number is Invalid");
					}
				scan.close();
				}
				
				public static boolean validateNumber (String number) {
					String newStr="";
					for(int i=0;i<number.length();i++) {
						if((int)number.charAt(i)!=32)
			newStr=newStr+number.charAt(i);	
					}
						int	total=0;
								for(int i=newStr.length()-2;i>=0;i-=2){
								if((int)newStr.charAt(i)<53)
									total+=((int)newStr.charAt(i)-48)*2;
								else if((int)newStr.charAt(i)>=53)
									total+=(((int)(newStr.charAt(i))-48)*2)-9;
					}
								for(int i=newStr.length()-1;i>=0;i-=2) {
									total+=((int)newStr.charAt(i))-48;
								}
					if(total%10==0)
						return true;
					else 
						return false;
				}
}
