# java 课程
java课程作业项目仓库


# 学生选课模拟系统


## 实验目的 


1.掌握Java中抽象类和抽象方法的定义

2.掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法

3.了解异常的使用方法，并在程序中根据输入情况做异常处理



## 实验要求


### 实验实现内容：


某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。<br>
此时，该博士研究生有双重身份：学生和助教教师。

1.设计两个管理接口：学生管理接口和教师管理接口
  
  (1)学生接口必须包括缴纳学费、查学费的方法
  
  (2)教师接口包括发放薪水和查询薪水的方法

2.设计博士研究生类:

  (1)实现上述的两个接口
  
  (2)该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性

3.编写测试类:

  (1)实例化至少两名博士研究生
  
  (2)统计他们的年收入和学费，根据两者之差，算出每名博士研究生的年应纳税金额

  
### 功能要求要求

 1.在博士研究生类中实现各个接口定义的抽象方法

 2.对年学费和年收入进行统计，用收入减去学费，求得纳税额

 3.国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义

 4.实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入

 5.根据输入情况，要在程序中做异常处理
  
### 拓展内容：
  
 1.在博士研究生类中增加了一年中的教学月数，
  
  
## 实验过程

### 具体步骤：


  1.Personnel类编写：
  
    （1）设定 编号、姓名、性别 三个属性
    
    （2）编写构造方法，使实例化对象时即可完成属性赋值
  
  2.Faculty类编写：
  
    （1）继承父类Personnel
    
    （2）设定 所授课程 属性
    
    （3）编写构造方法，通过super();调用父类构造方法，使实例化对象时即可完成全部属性赋值
  
  3.course类编写：
  
    （1）设定 编号、课程名称、上课地点、时间、授课教师 五个属性
    
    （2）编写构造方法，使实例化对象时即可完成属性赋值
    
    （3）重写方法toString()，用于输出课程详细信息
  
  4.Student类编写：
  
    （1）继承父类Personnel
    
    （2）设定 所选课程、选课数量 两个属性
    
    （3）编写构造方法，通过super();调用父类构造方法，使实例化对象时完成编号、姓名、性别的属性赋值
    
    （4）编写chooseCourse()方法用于学生选课，实现根据字符串判断按顺序给多个选课属性赋值，并让该函数每被调用一次就让调用对象的选课数量属性值加一
    
    （5）编写quitCourse()方法用于学生退课，实现根据字符串及选课数量的判断，按顺序将被退课的课程属性置零，并让该函数每被调用一次就让调用对象的选课数量属性值减一
    
    （6）编写transition()方法用于将主方法中被操作的“形式学生对象”的各课程值赋给登录的实际学生
    
    （7）重写方法toString()，用于输出该生选上了哪些课程
    
  5.Test主方法编写：
     
     （1）设定属性值tuike，用于接受用户输入值判断学生是否退课
     
     （2）实例化若干个Faculty、Student、course对象(课程对象数要等于教师对象数)
     
     （3）调用第三方库实例化Scanner对象用于接受用户输入值，根据学号登录学生
     
     （4）设置永真循环，通过Scanner让学生可以多次调用选课方法，选上多门课程，并通过判断——跳出让学生决定选课数量
     
     （5）通过Scanner让学生退课与否
     
     （6）编写永真(或永假循环)，通过Scanner让学生可以多次调用退课方法，退掉多门课程，并通过判断——跳出让学生决定退课数量
     
     （7）“形式学生”调用transition()方法将所有所选课程属性赋给登录的学生
     
     （8）调用Student类的toString方法，输出所有选上的课程名称
     
     （8）通过Scanner让学生决定查看所选课程的详细信息与否
     
     （9）编写永真(或永假循环)，通过Scanner让学生可以多次调用Course类的toString方法，输出多门课程详细信息，并通过判断——跳出让学生决定查看数量
     
### 流程图
    
![%E6%9C%AA%E5%91%BD%E5%90%8D%E6%96%87%E4%BB%B6.png](https://github.com/sans3174/java-/blob/sans3174.GitHub.io/image/%E6%9C%AA%E5%91%BD%E5%90%8D%E6%96%87%E4%BB%B6.png)


## 核心方法


### Student.java:

```java
   void chooseCourse(String a) {
		if(course1=="null") {   //课程都初始化为"null"
			course1=a;
		}
		else if(course2=="null") {
			course2=a;
		
		}
		else if(course3=="null") {
			course3=a;
		
		}
		else if(course4=="null") {
			course4=a;
			
		}
		else {
			System.out.println("选课数已达上限");
		}
		coursecount++;    //让该函数每被调用一次就让调用对象的选课数量属性值加一
	}
    //实现根据字符串判断按顺序给多个选课属性赋值
```
```java
    void quitCourse(String a) {
		if(course4.equals(a)) {  //判断所退课程是否在course4
			course4=null;
			System.out.println("1");
		}
		else if(course3.equals(a)) {  //判断所退课程是否在course3
			switch(coursecount) {  //根据选课数量决定将哪个course属性置零
			case 4: course3=course4;
					course4=null;
					break;
			case 3: course3=null;
					break;
			}
		}
		else if(course2.equals(a)) {    //同上
			switch(coursecount) {
			case 4: course2=course4;
					course4=null;
					break;
			case 3: course2=course3;
					course3=null;
					break;
			case 2: course2=null;
					break;
			}
		}
		else if(course1.equals(a)) {
			switch(coursecount) {
			case 4: course1=course4;
					course4=null;
					break;
			case 3: course1=course3;
					course3=null;
					break;
			case 2: course1=course2;
					course2=null;
					break;
			case 1: course1=null;
			 	    break;
			}
		}
		else {
			System.out.println("未选该门课程");
		}
		coursecount--;    //并让该函数每被调用一次就让调用对象的选课数量属性值减一
	} 
    //实现根据字符串及选课数量的判断，按顺序将被退课的课程属性置零
```

### Test.java：

```java
System.out.println("是否退课：");
Scanner sacn4 = new Scanner(System.in); 
tuike = sacn4.nextInt(); //接受用户输入
while(tuike==1) {        //根据输入决定是否退课，并决定退课后成为永真循环实现多次退课的目的
	System.out.println("输入退课名称：");
	Scanner sacn5 = new Scanner(System.in);
	String name2 = sacn5.nextLine(); 
	transtudent.quitCourse(name2);  //通过输入课程调用退课方法并退课
	System.out.println("是否继续退课：");
	Scanner sacn6 = new Scanner(System.in); 
	int panduan2 = sacn6.nextInt(); //接受用户输入
	if(panduan2==0) {    //决定是否继续退课
		break;  
	}
}
    //编写永真(或永假循环)，通过Scanner让学生可以多次调用退课方法，退掉多门课程，并通过判断——跳出让学生决定退课数量
```
    
## 实验结果


程序运行截图：<br><br><br>

![%E5%AE%9E%E9%AA%8C%E4%B8%89.png](https://github.com/sans3174/java-/blob/sans3174.GitHub.io/image/%E5%AE%9E%E9%AA%8C%E4%B8%89.png)



## 实验感想

通过本次实验，我学习了简单的系统需求分析<br>
熟悉并练习了类及属性与方法的编写，不同构造方法的编写<br>
练习了类的继承，重写方法，父类构造方法调用的编写<br>
练习了不同循环，判断的嵌套编写<br>
练习了程序的查错调试<br>
加深了对java面向对象编程的理解<br>
