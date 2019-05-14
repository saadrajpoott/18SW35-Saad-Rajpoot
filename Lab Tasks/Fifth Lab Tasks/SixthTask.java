public class SixthTask{

	public static void main(String[] args) {
		
		Student std1 = new Student("Muhammad Saad", 35, 18);
		Marksheet markSheet = new Marksheet(89, 58, 90);

		Result result1 = new Result(std1, markSheet);

		result1.createStudentResult();

	}
}


class Result{

	Student student = new Student();
	Marksheet marksheet = new Marksheet();

	Result( Student student, Marksheet marksheet )
	{
		this.student = student;
		this.marksheet = marksheet; 
	}

	void createStudentResult()
	{	
		student.displayData();
		System.out.println("\nTotal marks 300\nObtained Marks: " + marksheet.calcTotalMarks());
		System.out.println("Percentage: " + marksheet.calcPercentage());
	}

}