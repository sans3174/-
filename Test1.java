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
		System.out.println("设定两名博士研究生的薪水，学费");
		try {
		while (true) {
		System.out.println("输入研究生姓名：");
		Scanner sacn1 = new Scanner(System.in); 
		String a = sacn1.nextLine(); 
		System.out.println("输入该生学期学费");
		Scanner sacn2 = new Scanner(System.in); 
		int b = sacn2.nextInt(); 
		System.out.println("输入该生月薪");
		Scanner sacn3 = new Scanner(System.in); 
		int c = sacn3.nextInt(); 
		System.out.println("输入一年内教学月总数");
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
		default :System.out.println("该生不存在");
		}
		System.out.println("是否继续设定：");
		Scanner sacn4 = new Scanner(System.in); 
		int panduan1 = sacn4.nextInt(); 
		if(panduan1==0) {
			break;
		}
	}
		while (true) {
			System.out.println("输入操作研究生姓名：");
			Scanner sacn5 = new Scanner(System.in); 
			String e = sacn5.nextLine(); 
			System.out.println("是否缴纳今年的学费");
			Scanner sacn6 = new Scanner(System.in); 
			int panduan2 = sacn6.nextInt(); 
			System.out.println("是否领取今年的工资");
			int panduan3 = sacn6.nextInt(); 
			System.out.println("是否缴纳今年的个人所得税");
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
				default :System.out.println("该生不存在");
				}
			System.out.println("查看年收入，年学费，年个人所得税，目前资产");
			System.out.println("输入研究生姓名：");
			e = sacn5.nextLine(); 
			switch(e) {
			case "Zhang":System.out.println("年收入为"+cand1.salary*cand1.month);
						 System.out.println("年学费为"+cand1.tuition*2);
						 System.out.println("年个人所得税为"+calculateTaxes(cand1,cand1.month));
						 cand1.inquireProperty(cand1);
						 break;
			case "Wang":System.out.println("年收入为"+cand2.salary*cand2.month);
			 			System.out.println("年学费为"+cand2.tuition*2);
			 			System.out.println("年个人所得税为"+calculateTaxes(cand2,cand2.month));
			 			cand2.inquireProperty(cand2);
			 			break;			
			default :System.out.println("该生不存在");
			}
			Scanner sacn = new Scanner(System.in); 
			System.out.println("是否继续操作：");
			int panduan = sacn.nextInt(); 
			if(panduan==0) {
				break;
			}
		}
		}
		catch(Exception e) {
			System.out.println("输入类型与需求不匹配");
		}
	}
}