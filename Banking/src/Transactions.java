import java.util.Scanner;

public class Transactions {

	public static void main(String[] args) {
		BankAcct obj = new BankAcct ( "Dere ", "12345");
		obj.showMenu();
}
}

	
class  BankAcct  {
int balance;
int previousTransaction;
String customerName;
String customerId;

BankAcct (String cusname,  String cid) {
customerName = cusname;
customerId = cid;
}

void depositAmt (int Amount) {

if (Amount != 0) {
	
	balance = balance + Amount;
	previousTransaction = Amount;
	
}

}

void withdrawAmt (int Amount) {

if (Amount != 0) {
	balance = balance - Amount;
	previousTransaction = - Amount;
}
}

void getPrevTransctn () {
if (previousTransaction > 0) {
	System.out.println ("Deposited amount : "+ previousTransaction);
	
	} 
else if (previousTransaction < 0) {
	System.out.println ("Withdrawn amount: " + Math.abs(previousTransaction) );

         }
else {
	System.out.println ("No transaction took place");
	
	}
}
void showMenu () {
char Option = '\0' ;
Scanner scanner = new Scanner(System.in);
System.out.println ("Welcome "+customerName);
System.out.println ("Your ID  "+customerId);
System.out.println ("\n");
System.out.println ("A = Check your balance");
System.out.println ("B = Deposite");
System.out.println ("C = Withdraw");
System.out.println ("D = Previous transaction");
System.out.println ("E = Exit system");



do {

System.out.println ("=================================================");
System.out.println ("Enter your option");
System.out.println("=================================================");
Option = scanner.next().charAt(0);
System.out.println("\n");

switch (Option) {

case 'A':
	System.out.println ("=====================");
    System.out.print("Balnce =" +balance);
    System.out.println ("\n=====================");
    System.out.println("\n");
    break;
case 'B':
	System.out.println ("=====================");
    System.out.print("Enter amount to deposite :" ) ;
    System.out.println ("\n=====================");
    int amount1 = scanner.nextInt();
    depositAmt(amount1);
    System.out.println("\n");
    break;
    
case 'C':
	System.out.println ("=====================");
    System.out.print("Enter amount to withdraw" );
    System.out.println ("\n=====================");
    int amount2 = scanner.nextInt();
    withdrawAmt(amount2);
    System.out.println("\n");
    break;
    
case 'D':
	System.out.println ("=====================");
    getPrevTransctn();
    System.out.println ("=====================");
    System.out.println("\n");
    break;

case 'E':
	System.out.println ("=====================");
break;

default:
	System.out.println("Invalid option! please entere one");
break;

}
}

	while (Option != 'E');

System.out.println ("Thanks for using the system!");

}




	}


