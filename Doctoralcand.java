package zhujiao;
public class Doctoralcand implements Studentrunner, Facultyrunner {
	String name;
	boolean male;
	int age;
	int month;
	int ntuition;
	int tuition;
	int salary;
	int nsalary;
	int property;
	Doctoralcand(String a,boolean b,int c,int d){
		name=a;
		male=b;
		age=c;
		property=d;
	}
	public void inquireProperty(Doctoralcand a) {
		System.out.println("目前资产:"+a.property);
	}
	public void payTuition(Doctoralcand a) {
		a.property-=a.tuition*2;
		a.ntuition=0;
		System.out.println("本学期学费已上缴");
	}
	public void inquireTuition(Doctoralcand a) {
		System.out.println("本学期应缴纳学费:"+a.tuition);
		System.out.println("目前应缴纳学费:"+a.ntuition);
	}
	public void inquireSalary(Doctoralcand a) {
		System.out.println("月薪水:"+a.salary);
		if (nsalary==0) {
			System.out.println("工资已发");
		}
		else {
			System.out.println("工资未发");
		}
	}
	public void sendSalary(Doctoralcand a) {
		a.property+=a.salary*a.month;
		a.nsalary=0;
		System.out.println("工资已发放");
	}
	
}