package hospitalmanageSystem;
import java.util.Scanner;
import java.util.ArrayList;


public class Clinic {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	Admin admin=new Admin("Global");
	ArrayList<Patients> List= new ArrayList<>();
	while(true)
	{
		admin.ShowMenu();
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		sc.nextLine();
		switch(choice)
		{
		case 1:
		{
			System.out.println("Enter the Id");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Name");
			String  name=sc.nextLine();
			System.out.println("Enter the age");
			int age=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the treament type ");
			String treatment =sc.nextLine();
			System.out.print("Enter charge: ");
			double charge = sc.nextDouble();
			sc.nextLine(); // ← consume the leftover newline

			List.add(new Patients(id, name, age, treatment, charge));
			break;
		}
		case 2:
		{
			if(List.isEmpty())
			{
				System.out.println("the record not found");
			}
			else
			{
				for(Patients p:List)
					p.display();
			}
		}
			break;
		case 3:
			System.out.println("enter the id to search");
			int  searchid=sc.nextInt();
			boolean found = false;
			for(Patients p:List)
			{
				if(p.getId()==searchid)
				{
					System.out.println("Eneter new charges");
					double newcharge=sc.nextDouble();
					p.setcharge(newcharge);
					System.out.println("Marks updated sucessfully");
					found =true;
					break;
				}
			}
			if(!found) {
				System.out.println("Patients not found");	
			}
			break;
		case 4:
		    System.out.print("Enter Patient ID to view bill: ");
		    int billId = sc.nextInt();

		    boolean found1= false;

		    for (Patients p : List) {
		        if (p.getId() == billId) {
		            System.out.println("==== BILL ====");
		            System.out.println("Patient ID: " + p.getId());
		            System.out.println("Name: " + p.getName());
		            System.out.println("Treatment: " + p.getTreatment());
		            System.out.println("Total Charge: ₹" + p.getcharge());
		            found1 = true;
		            break;
		        }
		    }

		    if (!found1) {
		        System.out.println("Patient not found.");
		    }
		    break;

		case 5:
			System.out.println("u exit");
			System.exit(0);
			break;
	default:
		System.out.println("enter your valid choice");
			break;
			
		}
	}}

}
