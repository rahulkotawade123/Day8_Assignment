package Day_8_Assignment;

public class UC_1EmpWage_AabPrs {

	//check employee present or absent 
	//_use((RANDOM))for attendance check
    static int IS_FULL_TIME = 1;                    //.......Instance Variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		  System.out.println("Employee Is Present Or Absent");
		     double empcheck = Math.floor(Math.random()*10)%2;
		     
		     if (empcheck == IS_FULL_TIME)
		        System.out.println("Employe Is Present");
		     else
	            System.out.println("Employe Is Absent"); 		 

		}
	}


