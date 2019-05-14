public class FifthTask{

	public static void main(String[] args) {

		Marksheet marksheet1 = new Marksheet(55, 80, 100);

		int totalMarks =  marksheet1.calcTotalMarks();
		double percentage = marksheet1.calcPercentage();
		// char grade = marksheet1.assignGrade(percentage);

		System.out.println("Total Marks: " + totalMarks);
		System.out.println("Percentage: " + percentage);
		// System.out.println("Grade: " + grade);

	}
}


class Marksheet{

	int mathematics;
	int physics;
	int chemistry;

	Marksheet()
	{
		mathematics = 0;
		physics = 0;
		chemistry = 0;
	}

	Marksheet( int mathematics, int physics, int chemistry)
	{
		this.mathematics = mathematics;
		this.physics = physics;
		this.chemistry = chemistry;
	}

	int calcTotalMarks()
	{
		return mathematics + physics + chemistry;
	}

	double calcPercentage()
	{
		return ((mathematics + physics + chemistry) * 100 )/ 300;
	}
}