package zhujiao;

import java.util.Scanner;

public class Test1{
	public static double calculateTaxes(Doctoralcand a,int b) {
		double x;
		double taxes;
		x=b*a.salary-2*a.tuition-60000;
		if(x<=0) {
			taxes=0;
		}
		else if(x<=36000) {
			taxes=x*0.03;
		}
		else if(x>36000&&x<144000) {
			taxes=x*0.1-2520;
		}
        else if(x>144000&&x<300000) {
        	taxes=x*0.2-16920;
		}
        else if(x>300000&&x<420000) {
        	taxes=x*0.25-31920;
		}
        else if(x>420000&&x<660000) {
        	taxes=x*0.3-52920;
		}
        else if(x>660000&&x<960000) {
        	taxes=x*0.35-85920;
		}
        else  {
        	taxes=x*0.45-181920;
		}
		return taxes;
	}
	public static void main(String args[]) {
		Doctoralcand cand1 =new Doctoralcand("Zhang",true,25,40000);
		Doctoralcand cand2 =new Doctoralcand("Wang",false,26,60000);
		System.out.println("�趨������ʿ�о�����нˮ��ѧ��");
		try {
		while (true) {
		System.out.println("�����о���������");
		Scanner sacn1 = new Scanner(System.in); 
		String a = sacn1.nextLine(); 
		System.out.println("�������ѧ��ѧ��");
		Scanner sacn2 = new Scanner(System.in); 
		int b = sacn2.nextInt(); 
		System.out.println("���������н");
		Scanner sacn3 = new Scanner(System.in); 
		int c = sacn3.nextInt(); 
		System.out.println("����һ���ڽ�ѧ������");
		Scanner sacn6 = new Scanner(System.in); 
		int d = sacn6.nextInt(); 
		switch(a) {
		case "Zhang":cand1.tuition=b;
					 cand1.salary=c;
					 cand1.month=d;
					 break;
		case "Wang":cand2.tuition=b;
		 			cand2.salary=c;
		 			cand2.month=d;
		 			break;	
		default :System.out.println("����������");
		}
		System.out.println("�Ƿ�����趨��");
		Scanner sacn4 = new Scanner(System.in); 
		int panduan1 = sacn4.nextInt(); 
		if(panduan1==0) {
			break;
		}
	}
		while (true) {
			System.out.println("��������о���������");
			Scanner sacn5 = new Scanner(System.in); 
			String e = sacn5.nextLine(); 
			System.out.println("�Ƿ���ɽ����ѧ��");
			Scanner sacn6 = new Scanner(System.in); 
			int panduan2 = sacn6.nextInt(); 
			System.out.println("�Ƿ���ȡ����Ĺ���");
			int panduan3 = sacn6.nextInt(); 
			System.out.println("�Ƿ���ɽ���ĸ�������˰");
			int panduan4 = sacn6.nextInt(); 
				switch(e) {
				case "Zhang":if(panduan2==1) {
					cand1.payTuition(cand1);
				}
							 if(panduan3==1) {
					cand1.sendSalary(cand1);
				}
							 if(panduan4==1) {
					cand1.property-=calculateTaxes(cand1,cand1.month);				
				}
							 break;
				case "Wang":if(panduan2==1) {
					cand2.payTuition(cand2);
				}
							 if(panduan3==1) {
					cand2.sendSalary(cand2);
				}
							 if(panduan4==1) {
					cand2.property-=calculateTaxes(cand2,cand2.month);				
				}
				 			break;			
				default :System.out.println("����������");
				}
			System.out.println("�鿴�����룬��ѧ�ѣ����������˰��Ŀǰ�ʲ�");
			System.out.println("�����о���������");
			e = sacn5.nextLine(); 
			switch(e) {
			case "Zhang":System.out.println("������Ϊ"+cand1.salary*cand1.month);
						 System.out.println("��ѧ��Ϊ"+cand1.tuition*2);
						 System.out.println("���������˰Ϊ"+calculateTaxes(cand1,cand1.month));
						 cand1.inquireProperty(cand1);
						 break;
			case "Wang":System.out.println("������Ϊ"+cand2.salary*cand2.month);
			 			System.out.println("��ѧ��Ϊ"+cand2.tuition*2);
			 			System.out.println("���������˰Ϊ"+calculateTaxes(cand2,cand2.month));
			 			cand2.inquireProperty(cand2);
			 			break;			
			default :System.out.println("����������");
			}
			Scanner sacn = new Scanner(System.in); 
			System.out.println("�Ƿ����������");
			int panduan = sacn.nextInt(); 
			if(panduan==0) {
				break;
			}
		}
		}
		catch(Exception e) {
			System.out.println("��������������ƥ��");
		}
	}
}