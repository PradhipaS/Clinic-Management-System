package hospitalmanageSystem;

public class Patients {
	private int id;
	private String name;
	private int age;
	private String treatment;
	private double charge;
	
	public Patients(int id, String name, int age, String treatment, double charge) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.treatment = treatment;
		this.charge = charge;
	}
		public int getId()
		{
			return id;
		}
		public String getName() {
			return name;
		}
		public int getAge()
		{
			return age;
		}
		public String getTreatment()
		{
			return treatment;
		}
		public double getcharge() {
			return charge;
		}
		public void setcharge(double charge)
		{
			this.charge=charge;
		}
	public void display()
	{
		System.out.println("ID: "+id+" Name : "+ name +" age : "+age+" treatment : "+treatment+" charge : "+charge);
	}
		
	}


