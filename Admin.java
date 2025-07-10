package hospitalmanageSystem;

public class Admin extends User
{ public Admin(String name)
	{
	super(name);
	}
@Override
public void ShowMenu()
{ 
	System.out.println("Welcome Adimin, "+name );
	System.out.println("1. Register new patients ");
	System.out.println("2. View patient records");
	System.out.println("3. Update patient treatment details");
	System.out.println("4. Display Patient Bill");
	System.out.println("5.exit");
}  

}

