//main class
public class Main{
	public static void main (String arg[]){
		System.out.println("Welcome to Student Grade Management System");
		ArrayList<Student> studentList=new ArrayList<>();
		Scanner sc1= new Scanner(System.in);
		Scanner sc2= new Scanner(System.in);
		
		int choice;
		
		do{
			System.out.println("\n---------Menu------------");
			System.out.println("1.Add New Student Record");
			System.out.println("2.View All Student REcords");
			System.out.println("3.Search Student using ID");
			System.out.println("4.Calculate Average marks");
			System.out.println("5.ExitTHE Menu");
			
			
			System.out.println("\nEnter Your Choice 1-5 :");
			choice =sc1.nextInt();
			
			
			switch(choice){
				case 1:
					System.out.println("********");
					System.out.println("1.Add New Student Record");
					System.out.println("Enter Student ID  :");
					int id=sc2.nextInt();
					
					 sc2.nextLine();
					
					System.out.println("Enter Student Name  :");
					String name=sc2.nextLine();
					
					System.out.println("Enter Student Marks  :");
					double marks=sc2.nextDouble();
					
					
					Student s1=new Student(id,name,marks);
					studentList.add(s1);
					
					System.out.println("Student record added successfully!");
					break;