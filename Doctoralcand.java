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
		System.out.println("Ŀǰ�ʲ�:"+a.property);
	}
	public void payTuition(Doctoralcand a) {
		a.property-=a.tuition*2;
		a.ntuition=0;
		System.out.println("��ѧ��ѧ�����Ͻ�");
	}
	public void inquireTuition(Doctoralcand a) {
		System.out.println("��ѧ��Ӧ����ѧ��:"+a.tuition);
		System.out.println("ĿǰӦ����ѧ��:"+a.ntuition);
	}
	public void inquireSalary(Doctoralcand a) {
		System.out.println("��нˮ:"+a.salary);
		if (nsalary==0) {
			System.out.println("�����ѷ�");
		}
		else {
			System.out.println("����δ��");
		}
	}
	public void sendSalary(Doctoralcand a) {
		a.property+=a.salary*a.month;
		a.nsalary=0;
		System.out.println("�����ѷ���");
	}
	
}