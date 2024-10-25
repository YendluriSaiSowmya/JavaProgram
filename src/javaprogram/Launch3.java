package com.dest.basics.javaprogram;

class Os{
	double Version;
	String Name;
	public Os(double version, String name) {
		super();
		this.Version = version;
		this.Name = name;
	}
	public double getVersion() {
		return Version;
	}
	public String getName() {
		return Name;
	}
}
class Charger{
	String Company;
	double Volts;
	public Charger(String company, double volts) {
		super();
		this.Company = company;
		this.Volts = volts;
	}
	public String getCompany() {
		return Company;
	}
	public double getVolts() {
		return Volts;
	}
}

class Mobile{
	Os os = new Os(5.7,"Version-5");
	void hasCharger(Charger c) {
		System.out.println(c.getCompany());
		System.out.println(c.getVolts());
	}
}
public class Launch3 {

	public static void main(String[] args) {
		Mobile m = new Mobile();
		Charger c = new Charger("samsung",15.5);
		System.out.println(m.os.getName());
		System.out.println(m.os.getVersion());
		System.out.println("================");
		m.hasCharger(c);;
		System.out.println("==================");
		System.out.println("without enclosing object");
		m = null;
		System.out.println(c.getCompany());
		System.out.println(c.getVolts());
		System.out.println(m.os.getName());
		System.out.println(m.os.getVersion()
				);

	}

}
