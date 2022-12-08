import java.util.Scanner;
class salary_range{
      public static void main(String[] args)
	  {
	     int Emp_salary;
		 Scanner in=new Scanner(System.in);
		 System.out.println("Enter employee salary");
		 Emp_salary=in.nextInt();
		 if(Emp_salary>=75000)
		 {
		    System.out.println("High salary");
		 }
		 else if((Emp_salary>=50000)&&(Emp_salary<75000))
		 {
		    System.out.println("Midhigh salary");
		 }
		 else if((Emp_salary>=25000)&&(Emp_salary<50000))
		 {
		    System.out.println("Midlow salary");
		 }
		 else if((Emp_salary>=10000)&&(Emp_salary<25000))
		 {
		    System.out.println("Low salary");
		 }
		 else
		 {
		    System.out.println("Too low salary");
		 }
	  }
}