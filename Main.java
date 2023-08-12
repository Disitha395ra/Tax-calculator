import java.lang.Math.*;
import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		    System.out.println("+---------------------------------------------------+");
			System.out.println("|              Tax Calculator                       |");
			System.out.println("+---------------------------------------------------+");
			System.out.println('\n');
		System.out.println("[1] withholding tax ");
		System.out.println("[2] payable tax ");
		System.out.println("[3] income tax ");
		System.out.println("[4] social security contribution leavy tax ");
		System.out.println("[5] Leasing Payment ");
		System.out.println("[6] Exit ");
		System.out.println('\n');
		System.out.print("Enter an option to continue :");
		int num1=input.nextInt();
		
		if(num1==1){
			System.out.println("+---------------------------------------------------+");
			System.out.println("|             Withholding tax                       |");
			System.out.println("+---------------------------------------------------+");
			System.out.println("[1] Rent tax ");
			System.out.println("[2] Bank interest  tax ");
			System.out.println("[3] Dividend tax ");
			System.out.println("[4] Exit");
			System.out.println('\n');
			System.out.print("Enter an option to continue :");
			int num2=input.nextInt();
			if(num2==1){
				System.out.println("+---------------------------------------------------+");
			    System.out.println("|               Rent tax                            |");
			    System.out.println("+---------------------------------------------------+");
				System.out.print("Enter your rent ");
				int num3=input.nextInt();
				if(num3>=100000){
					System.out.print("You have to pay rent tax :"+(num3*0.1));
				}else{
					System.out.print("You dont have to pay rent tax...");
				}
			}
			else if(num2==2){
				System.out.println("+---------------------------------------------------+");
			    System.out.println("|               Bank Interest tax                   |");
			    System.out.println("+---------------------------------------------------+");
				System.out.print("Enter your bank interest per year  :");
				int num4=input.nextInt();
				System.out.print("You have to pay bank Interest tax per year :"+(num4*0.05));	
			}
			else if(num2==3){
				System.out.println("+---------------------------------------------------+");
			    System.out.println("|               Divident tax                        |");
			    System.out.println("+---------------------------------------------------+");
				System.out.print("Enter your total divident per year :");
				int num5=input.nextInt();
				if(num5>100000){
				System.out.print("You have to pay divident tax per year :"+(num5*0.14));	
				}else{
				System.out.print("You dont have to pay divident tax..");
				}
			}
			else if(num2==4){
				System.out.print("Exit....");
			}
		}
		else if(num1==2){
			    System.out.println("+---------------------------------------------------+");
			    System.out.println("|               Payable tax                         |");
			    System.out.println("+---------------------------------------------------+");
			System.out.print("Enter your employee payment  per month :");
			int num6=input.nextInt();
			if(num6<100000){
				System.out.print("You dont have to pay payable tax");
			}
			else if(num6>=100000 && num6<=141667){
				System.out.print("You have to pay payable tax per month :"+(num6*0.06));
			}
			else if(num6>141667 && num6<=183333){
				System.out.print("You have to pay payable tax per month :"+(num6*0.12));
			}
			else if(num6>183333 && num6<=225000){
				System.out.print("You have to pay payable tax per month :"+(num6*0.18));
			}
			else if(num6>225000 && num6<=266667){
				System.out.print("You have to pay payable tax per month :"+(num6*0.24));
			}
			else if(num6>266667 && num6<=308333){
				System.out.print("You have to pay payable tax per month :"+(num6*0.30));
			}
			else if(num6>308333){
				System.out.print("You have to pay payable tax per month :"+(num6*0.36));
			}
		}
		else if(num1==3){
			    System.out.println("+---------------------------------------------------+");
			    System.out.println("|               Income tax                          |");
			    System.out.println("+---------------------------------------------------+");
			System.out.print("Enter your total income per year :");
			int num7=input.nextInt();
			if(num7<1200000){
				System.out.print("You dont have to pay income tax");
			}
			else if(num7>=1200000 && num7<=1700000){
				System.out.print("You have to pay income tax per year :"+(num7*0.06));
			}
			else if(num7>1700000 && num7<=2200000){
				System.out.print("You have to pay income tax per year :"+(num7*0.12));
			}
			else if(num7>2200000 && num7<=2700000){
				System.out.print("You have to pay income tax per year :"+(num7*0.18));
			}
			else if(num7>2700000 && num7<=3200000){
				System.out.print("You have to pay income tax per year :"+(num7*0.24));
			}
			else if(num7>3200000 && num7<=3700000){
				System.out.print("You have to pay income tax per year :"+(num7*0.30));
			}
			else if(num7>3700000){
				System.out.print("You have to pay income tax per year :"+(num7*0.36));
			}
		}
		else if(num1==4){
			    System.out.println("+---------------------------------------------------+");
			    System.out.println("|     social security contribution leavy tax        |");
			    System.out.println("+---------------------------------------------------+");
			    System.out.print("Enter value of Good or Service :");
			double num8=input.nextInt();
			double saletax=num8*0.025;
			double vat=(num8+saletax)*0.15;
			System.out.print("You have to pay SSCL Tax :"+(vat+saletax));
		}
		else if(num1==5){
				System.out.println("+---------------------------------------------------+");
			    System.out.println("|                 leasing payment                   |");
			    System.out.println("+---------------------------------------------------+");
			System.out.println("[1] Calculate monthly installment ");
			System.out.println("[2] Search Leasing Catagory ");
			System.out.println("[3] Find leasing Amount ");
			System.out.println("[4] Exit");
			System.out.print("Enter an option to continue :");
			int num9=input.nextInt();
			if(num9==1){
				System.out.println("+---------------------------------------------------+");
			    System.out.println("|         Calculate leasing payment                 |");
			    System.out.println("+---------------------------------------------------+");
				System.out.println("Enter Lease amount         :");
				double num10=input.nextDouble();
				System.out.println("Enter Annual interese rate :");
				double num11=input.nextDouble();
				System.out.println("Enter number of year       :");
				double num12=input.nextDouble();
				double monthlyinstallment = num10 * (num11 / 12) / (1 - Math.pow(1 + (num11 / 12), -num12 / 12));
				System.out.println("Your monthly instalment    :"+monthlyinstallment);
			}
			else if(num9==2){
				System.out.println("+---------------------------------------------------+");
			    System.out.println("|              Search Leasing Category              |");
			    System.out.println("+---------------------------------------------------+");
				System.out.print("Enter Lease amount :");
				double num16=input.nextDouble();
				System.out.print("Enter Annual interest rate :");
				double num17=input.nextDouble();
				System.out.println("Your monthly instalment for 3 year leasing plan :"+(num16*(num17/12)*3));
				System.out.println("Your monthly instalment for 4 year leasing plan :"+(num16*(num17/12)*4));
				System.out.println("Your monthly instalment for 5 year leasing plan :"+(num16*(num17/12)*5));
				
			}
			else if(num9==3){
				System.out.println("+---------------------------------------------------+");
			    System.out.println("|               Find Leasing Amount                 |");
			    System.out.println("+---------------------------------------------------+");
				System.out.print("Enter the monthly lease payment amount you can afford :");
				double num13=input.nextDouble();
				System.out.print("Enter number of year :");
				double num14=input.nextDouble();
				System.out.print("Enter Annual Interest Rate :");
				double num15=input.nextDouble();
				double leaseAmount=num13*num14*(num15/12);
				System.out.print("You can get lease amount :"+leaseAmount);
			}
			else if(num9==4){
				System.out.print("Exit ..");
			}
		}
		else{
			System.out.print("Exit ..");
		}
	}
}
