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
						
				case 2:
					System.out.println("********");
					System.out.println("2.View All Student REcords");
					 
					for(Student s : studentList){
						System.out.println("Student ID :"+ s.getStudentID() +" Student Name : "+ s.getStudentName() +" Student Marks : "+s.getMarks());	
					}
					System.out.println("Total Students : "+ studentList.size());
					break;
				
				case 3:
					System.out.println("3.Search Student using ID");
					
					System.out.println("Enter StudentID To Search  :");
					int stID=sc2.nextInt();
					
					for(Student s: studentList){
						if(s.getStudentID()==stID){
							System.out.println("\nStudent Found");
							System.out.println("ID  :"+s.getStudentID());
							System.out.println("Name  :"+s.getStudentName());
							System.out.println("Marks  :"+s.getMarks());
							break;
						}else{
							System.out.println("Student With ID :"+ stID + "NOt Found");
						}
						
					}
					break;
				case 4:
					 System.out.println("4.Calculate Average Marks");
					 
					 double totalMarks=0;
					 
					 for(Student s: studentList){
						 totalMarks=totalMarks+ s.getMarks(); 
					 }
					 double average=totalMarks/studentList.size();
					 
					 System.out.println("Total Students : " + studentList.size());
                    System.out.println("Total Marks    : " + totalMarks);
                    System.out.println("Average Marks  : " + average);
					break;
					case 5:
				
					 System.out.println("\nExiting the system. Thank you!");
                    break;
					
				default :
					System.out.println("\nInvalid Input. Plrase Enter  a valid choice between 1and 5. ");
					
			}	
			
		}while(choice!=5);

	}
}