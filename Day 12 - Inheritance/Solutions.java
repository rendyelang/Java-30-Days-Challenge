// Problem: https://www.hackerrank.com/challenges/30-inheritance/problem
import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    public Student(String firstName, String lastName, int idNumber, int[] scores) {
        super(firstName, lastName, idNumber);
        this.testScores = scores;
    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    
    public char calculate() {
        char grade = ' ';
        int sum = 0;
        
        for (int score : testScores) {
            sum+=score;
        }
        
        int average = sum / testScores.length;
        
        if (average >= 90 && average <= 100) {
            grade = 'O';
        } else if (average >= 80 && average < 90) {
            grade = 'E';
        } else if (average >= 70 && average < 80) {
            grade = 'A';
        } else if (average >= 55 && average < 70) {
            grade = 'P';
        } else if (average >= 40 && average < 55) {
            grade = 'D';
        } else {
            grade = 'T';
        }
        
        return grade;
    }
}

class Solutions {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name: ");
		String firstName = scan.next();

        System.out.println("Enter your last name: ");
		String lastName = scan.next();

        System.out.println("Enter your ID: ");
		int id = scan.nextInt();

        System.out.println("Enter the number of test scores: ");
		int numScores = scan.nextInt();

		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
            System.out.println("Enter test score " + (i+1) + ": ");
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}