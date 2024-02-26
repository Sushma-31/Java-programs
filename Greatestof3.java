import java.util.*;
class Greatestof3{
public static void main (String args[]){
Scanner scan = new Scanner (System.in);
System.out.println("Enter N1:");
System.out.println("EnterN2:");
System.out.println("EnterN3:");
int N1 = scan.nextInt();
int  N2 = scan.nextInt();
int  N3 = scan.nextInt();
if (N1 > N2 && N1>N3)
System.out.println(N1 +" is greater.");
else if (N1>N3)
System.out.println(N2 +" is greater.");
else
System.out.println(N3 +"  is greater.");
}
}
