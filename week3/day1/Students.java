package week3.day1;

public class Students {

		
		public static void getStudentInfo(int studentId) {
			System.out.println(studentId);
		}
		public void getStudentInfo(int studentId, String studentName) {
			System.out.println(studentId + studentName);
		}
		public void getStudentInfo(String email, int phoneNumber) {
			System.out.println(email + phoneNumber);
		}
		public static void main(String[] args){
			Students sd=new Students();
			Students.getStudentInfo(98);
			sd.getStudentInfo(98987, " Akshu");
			sd.getStudentInfo("ak@gmail.com ", 85645);
		}

	}


