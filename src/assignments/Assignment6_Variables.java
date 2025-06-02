package assignments;

public class Assignment6_Variables {

public static void main(String[] args) {

//1. Create two arrays to store student names ["Suresh","Mahesh","Naresh"] and marks [75, 80, 82]		
String[] Names={"Suresh","Mahesh","Naresh"};
int[] Marks= {75, 80, 82};

//2.Add 10 marks to each students using assignment operators and store it into another array
int[] Marks2= new int[3];
Marks2[0]=Marks[0]+10;
Marks2[1]=Marks[1]+10;
Marks2[2]=Marks[2]+10;

//3.identify the average marks of all students
float avg=(Marks2[0]+Marks2[1]+Marks2[2])/3;

//Expected Output:
//Updated Marks:
//Suresh: 85
//Mahesh: 90
//Naresh: 92
//Average Marks: 89.0
System.out.println("Updated Marks:");
System.out.println(Names[0]+": "+Marks2[0]);
System.out.println(Names[1]+": "+Marks2[1]);
System.out.println(Names[2]+": "+Marks2[2]);
System.out.println("Average Marks:"+avg);
	}

}
