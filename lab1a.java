package lab1A;

import java.util.Scanner;

public class first {
	String name, address, phoneno,emailid,branch;
	double tfees, ad_fee,tution_fees,fee1;
	
	private void Student_details(String name2, String add, String phoneno2, String emailid2, String branch2)
	{
		this.name =	name2;
		this.address = add;
		this.phoneno = phoneno2;
		this.emailid = emailid2;
		this.branch = branch2;		
	}
	
	public double fee(String branch, double ad_fees, double tution_fees2, double bran_fees, double fee12) {
		this.ad_fee = ad_fees;
		this.tution_fees = tution_fees2;
		this.fee1 = fee12;
		tfees = ad_fee+tution_fees+fee1;
		if(branch.equalsIgnoreCase("BE")) {
			tfees+= bran_fees;
		}
		return tfees;
	}
	
	public static void main(String args[]) {
		first si = new first();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student details");
		System.out.println("enter the name");
		String name = sc.next();
		System.out.println("enter the address");
		String add = sc.next();
		System.out.println("enter the phoneno");
		String phoneno = sc.next();
		System.out.println("enter the emailid");
		String emailid = sc.next();
		System.out.println("enter the branch");
		String branch = sc.next();
		
		si.Student_details(name,add,phoneno,emailid,branch);
		
		System.out.println("enter the admission fees");
		double ad_fees = sc.nextDouble();
		System.out.println("enter the tution fees");
		double tution_fees= sc.nextDouble();
		System.out.println("enter the branch fees");
		double bran_fees = sc.nextDouble();
		System.out.println("enter the Internet fee");
		double fee1 = sc.nextDouble();
		
		double tfee = si.fee(branch,ad_fees,tution_fees,bran_fees,fee1);
		
		System.out.println("\n Name:"+name+ "\n Address:"+add+"\n Phone_number:"+phoneno+"\n Email_ID:"+emailid+"\n Branch:"+branch);
		
		System.out.println("total fees for the student is "+tfee);
		
		
		
		
	}

	

}
