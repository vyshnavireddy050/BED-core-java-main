package com.collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class App
{
	static LinkedHashMap<CompositeKey1, Integer> test = new LinkedHashMap<>();
	static LinkedHashMap<CompositeKey1, Integer> quiz = new LinkedHashMap<>();
	static LinkedHashMap<CompositeKey1, Integer> lab = new LinkedHashMap<>();
	static LinkedHashMap<CompositeKey1, Integer> project = new LinkedHashMap<>();
	static LinkedHashMap<CompositeKey2, CompositeValue1> testScore = new LinkedHashMap<>();
	static LinkedHashMap<CompositeKey2, CompositeValue1> quizScore = new LinkedHashMap<>();
	static LinkedHashMap<CompositeKey2, CompositeValue1> labScore = new LinkedHashMap<>();
	static LinkedHashMap<CompositeKey2, CompositeValue1> projectScore = new LinkedHashMap<>();
	static LinkedHashMap<CompositeKey2, CompositeValue2> overallRating = new LinkedHashMap<>();
	static LinkedHashSet<Assignments> set = new LinkedHashSet<>();

	public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		//Uncomment to insert data.
		Assignments assignments1 = new Assignments("Ananth", "Electro Fields", "test", "21-Jul-16", 100);
		validateAssignmentCategory(assignments1);
		Assignments assignments2 = new Assignments("Bhagath","Electro Fields", "test", "21-Jul-16", 78);
		validateAssignmentCategory(assignments2);
		Assignments assignment3 = new Assignments("Chaya", "Electro Fields","test","21-Jul-16",68);
		validateAssignmentCategory(assignment3);
		Assignments assignment4 = new Assignments("Esharath","Electro Fields", "test", "21-Jul-16", 87);
		validateAssignmentCategory(assignment4);
		Assignments assignment5 = new Assignments("Bhagath","Electro Fields", "quiz", "22-Jul-16", 20);
		validateAssignmentCategory(assignment5);
		Assignments assignment6 = new Assignments("Chaya","Electro Fields", "lab", "23-Jul-16", 10);
		validateAssignmentCategory(assignment6);
		Assignments assignment7 = new Assignments("Ananth","Electro Fields", "project", "24-Jul-16", 100);
		validateAssignmentCategory(assignment7);
		Assignments assignment8 = new Assignments("Esharath","Electro Fields", "project", "24-Jul-16", 100);
		validateAssignmentCategory(assignment8);
		Assignments assignment9 = new Assignments("Bhagath","Electro Fields", "quiz", "25-Jul-16", 50);
		validateAssignmentCategory(assignment9);
		Assignments assignment10 = new Assignments("Ananth","Electro Fields", "quiz", "26-Jul-16", 100);
		validateAssignmentCategory(assignment10);
		Assignments assignment11 = new Assignments("Bhagath","Electro Fields", "lab", "27-Jul-16", 10);
		validateAssignmentCategory(assignment11);
		Assignments assignment12 = new Assignments("Chaya","Electro Fields", "project", "28-Jul-16", 100);
		validateAssignmentCategory(assignment12);
		Assignments assignment13 = new Assignments("Bhagath","Electro Fields", "project", "28-Jul-16", 100);
		validateAssignmentCategory(assignment13);
		Assignments assignment14 = new Assignments("Ananth","Computing Techniques", "test", "29-Jul-16", 86);
		validateAssignmentCategory(assignment14);
		Assignments assignment15 = new Assignments("Ananth","Electro Fields", "quiz", "29-Jul-16", 100);
		validateAssignmentCategory(assignment15);
		Assignments assignment16 = new Assignments("Bhagath","Computing Techniques", "project", "30-Jul-16", 100);
		validateAssignmentCategory(assignment16);
		Assignments assignment17 = new Assignments("Ananth","Electro Fields", "lab", "30-Jul-16", 100);
		validateAssignmentCategory(assignment17);
		Assignments assignment18 = new Assignments("Chaya","Computing Techniques", "quiz", "31-Jul-16", 20);
		validateAssignmentCategory(assignment18);
		Assignments assignment19 = new Assignments("Ananth","Electro Fields", "test", "1-Aug-16", 100);
		validateAssignmentCategory(assignment19);
		Assignments assignment20 = new Assignments("Chaya","Electro Fields", "test", "1-Aug-16", 92);
		validateAssignmentCategory(assignment20);
		calculateScore(set);

		int choice = 0;
		while(choice != 6) {

			System.out.println("====MENU====");
			System.out.println("1. Student Information");
			System.out.println("2. Student Wise Data");
			System.out.println("3. Subject Wise Data");
			System.out.println("4. Update assignments category");
			System.out.println("5. Display assignment categories");
			System.out.println("6. Exit");
			System.out.println("Enter a choice: ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				int c = 0;
				while(c != 4) {

					System.out.println("1. Add new student data");
					System.out.println("2. Remove student data");
					System.out.println("3. View student data");
					System.out.println("4. Exit");
					System.out.println("Enter a choice: ");
					c = sc.nextInt();
					switch(c) {
					case 1:
						System.out.println("Enter name of the student: ");
						String n = sc.next();
						System.out.println("Enter name of the subject: ");
						sc.nextLine();
						String sub = sc.nextLine();
						System.out.println("Enter assignment category: ");
						String category = sc.next();
						System.out.println("Enter date of submission (DD-Month-YY): ");
						String date = sc.next();
						System.out.println("Enter assignment category marks: ");
						int marks = sc.nextInt();
						addStudentData(n, sub, category, date, marks);
						break;
					case 2:
						System.out.println("Enter name of the subject ");
						String na = sc.next();
						deleteData(na);
						break;
					case 3:
						System.out.println("Enter name of the student: ");
						String sname = sc.next();
						viewData(sname);
						break;
					case 4:
						System.out.println("Exiting...");
						break;
					default:
						System.out.println("Please enter a valid choice.");
						break;
					}
				}
				break;
			case 2:
				System.out.println("Enter name of the student: ");
				String studentName = sc.next();
				displayStudentWise(studentName);
				break;
			case 3:
				System.out.println("Enter name of the subject: ");
				sc.nextLine();
				String subjectName = sc.nextLine();

				displaySubjectWise(subjectName);
				break;
			case 4:
				int ch = 0;
				while(ch != 3) {
					System.out.println("1. Add Category");
					System.out.println("2. Remove Category");
					System.out.println("3. Exit");
					System.out.println("Enter a choice: ");
					ch = sc.nextInt();
					switch(ch) {
					case 1:
						System.out.println("Enter name of the student to add category: ");
						String name = sc.next();
						System.out.println("Enter subject for which assignment category is going to be added: ");
						sc.nextLine();
						String subject = sc.nextLine();
						System.out.println("Enter assignment category to add: ");
						String assigncategory = sc.next();
						System.out.println("Enter date of submission (DD-Month-YY): ");
						String date = sc.next();
						System.out.println("Enter assignment category marks: ");
						int marks = sc.nextInt();
						addAssignmentCategory(name, subject, assigncategory, date, marks);
						break;

					case 2:
						System.out.println("Enter name of the student to remove category: ");
						String name1 = sc.next();
						System.out.println("Enter subject for which assignment category is going to be deleted: ");
						sc.nextLine();
						String subject1 = sc.nextLine();
						System.out.println("Enter assignment category to remove (include number of category with underscore (for eg. test_1)): ");
						String assigncategory1 = sc.next();
						
						removeAssignmentCategory(name1, subject1, assigncategory1);
						break;
					case 3:
						System.out.println("Exiting...");
						break;
					default:
						System.out.println("Please enter a valid choice.");
						break;
					}	
				}
				break;
			case 5:
				displayAssignmentCategory();
				break;
			case 6:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Please enter a valid choice.");
				break;
			}
		}
		sc.close();
	}
	private static void viewData(String sname) {
		try {
			System.out.println("Student Name: " + sname);
			System.out.printf("%-20s %-20s %-20s %-10s", "Subject", "Assignment Category", 
					"Date of Submission", "Marks");
			System.out.println();
			for(Assignments a : set) {
				if(a.studentName.equals(sname)) {
					System.out.printf("%-20s %-20s %-20s %-10s", a.subject, a.assignmentCategory, a.date, a.points);
					System.out.println();
				}
			}
		}
		catch(Exception e) {
			System.out.println("Error. Data cannot be viewed.");
		}

	}
	private static void deleteData(String na) {
		try {
			for(Assignments a : set) {
				if(a.studentName.equals(na)) {
					set.remove(a);
				}
			}
			System.out.println("Data removed successfully.");
		}
		catch(Exception e) {
			System.out.println("Ërror. Data cannot be deleted.");
		}
	}
	private static void addStudentData(String n, String sub, String category, String date, int marks) {

		try {
			Assignments a = new Assignments(n, sub, category, date, marks);
			validateAssignmentCategory(a);
			calculateScore(set);
			System.out.println("Data inserted successfully.");
		}
		catch(Exception e){
			System.out.println("Data cannot be inserted");
		}
	}
	private static void removeAssignmentCategory(String name, String subject, String assigncategory) {

		try {
			boolean flag = false;
			for(Assignments a : set) {
				if(a.studentName.equals(name) && a.subject.equals(subject) && a.assignmentCategory.equals(assigncategory)) {
					CompositeKey2 key = new CompositeKey2(a.studentName, a.subject);
					if(assigncategory.substring(0, 4).equalsIgnoreCase("test")) {
						testScore.put(key, new CompositeValue1(testScore.get(key).marks - a.points, testScore.get(key).size - 1));
					}
					else if(assigncategory.substring(0, 4).equalsIgnoreCase("quiz")) {
						quizScore.put(key, new CompositeValue1(quizScore.get(key).marks - a.points, quizScore.get(key).size - 1));
					}
					else if(assigncategory.substring(0, 3).equalsIgnoreCase("lab")) {
						labScore.put(key, new CompositeValue1(labScore.get(key).marks - a.points, labScore.get(key).size - 1));
					}
					else if(assigncategory.substring(0, 4).equalsIgnoreCase("proj")) {
						projectScore.put(key, new CompositeValue1(projectScore.get(key).marks - a.points, projectScore.get(key).size - 1));
					}
					else {
						System.out.println("Please enter valid assignment category.");
					}
					set.remove(a);
					calculateScore(set);
					System.out.println("Assignment Category removed succesfully.");
					flag = true;
				}
			}
			if(flag == false) {
				System.out.println("Student data does not exist");
			}
		}
		catch(Exception e) {
			System.out.println("Error. Assignment Category cannot be removed.");
		}
	}
	private static void addAssignmentCategory(String name, String subject, String assigncategory, String assigncategory2, int marks) {

		try {
			Assignments a = new Assignments(name, subject, assigncategory, assigncategory2, marks);
			if(assigncategory.equalsIgnoreCase("test")) {
				testScore.put(new CompositeKey2(a.studentName, a.subject), new CompositeValue1(0, 1));
			}
			else if(assigncategory.equalsIgnoreCase("quiz")) {
				quizScore.put(new CompositeKey2(a.studentName, a.subject), new CompositeValue1(0, 1));
			}
			else if(assigncategory.equalsIgnoreCase("lab")) {
				labScore.put(new CompositeKey2(a.studentName, a.subject), new CompositeValue1(0, 1));
			}
			else if(assigncategory.equalsIgnoreCase("project")) {
				projectScore.put(new CompositeKey2(a.studentName, a.subject), new CompositeValue1(0, 1));
			}
			else {
				System.out.println("Please enter valid assignment category.");
			}
			validateAssignmentCategory(a);
			calculateScore(set);
			System.out.println("Assignment Category added succesfully.");
		}
		catch(Exception e) {
			System.out.println("Error. Assignment Category cannot be added.");
		}

	}

	private static void displayAssignmentCategory() {

		System.out.printf("%-15s %-20s %-20s %-20s %-10s", "Student Name", "Subject", "Assignment Category", "Date of Submission", "Marks");
		System.out.println();
		for(Assignments assignment : set) {
			System.out.printf("%-15s %-20s %-20s %-20s %-10s", assignment.studentName, assignment.subject, assignment.assignmentCategory, assignment.date, assignment.points);
			System.out.println();
		}

	}
	private static void displaySubjectWise(String subjectName) {

		LinkedHashMap<CompositeKey2, CompositeValue2> temp = new LinkedHashMap<>(overallRating);
		boolean flag = false;
		System.out.println("Subject: " + subjectName);

		//To sort data according to overall rating (high to low)
		//		temp = temp.entrySet().stream().sorted((i1, i2) ->
		//		Float.valueOf(i2.getValue().overallScore).compareTo(Float.valueOf(i1.getValue().overallScore))
		//				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		System.out.printf("%-25s%-15s %-15s %-15s %-15s %-15s", "Student Name", "Test Score", "Quiz Score", "Lab Score", "Project Score", "Overall Rating(%)");
		System.out.println();
		for(CompositeKey2 key : temp.keySet()) {
			if(key.subject.equals(subjectName)) {
				System.out.printf("%-25s %-15s %-15s %-15s %-15s %-15s",key.studentName, temp.get(key).testscore !=0 ? temp.get(key).testscore : "NA", 
						temp.get(key).quizscore !=0 ? temp.get(key).quizscore : "NA",
								temp.get(key).labscore != 0 ? temp.get(key).labscore : "NA", 
										temp.get(key).projectscore != 0 ? temp.get(key).projectscore : "NA", 
												temp.get(key).overallScore != 0 ? temp.get(key).overallScore : "NA");
				System.out.println();
				flag = true;
			}
		}
		if(flag == false) {
			System.out.println("Subject does not exist.");
		}
	}
	private static void displayStudentWise(String studentName) {

		System.out.println("Student: " + studentName);
		System.out.printf("%-25s%-15s %-15s %-15s %-15s %-15s", "Subject", "Test Score", "Quiz Score", "Lab Score", "Project Score", "Overall Rating(%)");
		System.out.println();
		boolean flag = false;
		for(CompositeKey2 key : overallRating.keySet()) {
			if(key.studentName.equals(studentName)) {
				System.out.printf("%-25s %-15s %-15s %-15s %-15s %-15s",key.subject, overallRating.get(key).testscore !=0 ? overallRating.get(key).testscore : "NA", 
						overallRating.get(key).quizscore !=0 ? overallRating.get(key).quizscore : "NA",
								overallRating.get(key).labscore != 0 ? overallRating.get(key).labscore : "NA", 
										overallRating.get(key).projectscore != 0 ? overallRating.get(key).projectscore : "NA", 
												overallRating.get(key).overallScore != 0 ? overallRating.get(key).overallScore : "NA");
				System.out.println();
				flag = true;
			}
		}
		if(flag == false) {
			System.out.println("Student does not exist.");
		}
	}
	private static void calculateScore(LinkedHashSet<Assignments> set) {

		for(Assignments key : set) {
			int score = key.points;
			if(key.assignmentCategory.substring(0, 4).equalsIgnoreCase("test")) {
				CompositeKey2 key1 = new CompositeKey2(key.studentName, key.subject);
				if(testScore.containsKey(key1)) {
					testScore.put(key1, new CompositeValue1(testScore.get(key1).marks + score, testScore.get(key1).size + 1));
				}
				else {
					testScore.put(key1, new CompositeValue1(score, 1));
				}

			}
			else if(key.assignmentCategory.substring(0, 4).equalsIgnoreCase("quiz")) {
				CompositeKey2 key1 = new CompositeKey2(key.studentName, key.subject);
				if(quizScore.containsKey(key1)) {
					quizScore.put(key1, new CompositeValue1(quizScore.get(key1).marks + score, quizScore.get(key1).size + 1));
				}
				else {
					quizScore.put(key1, new CompositeValue1(score, 1));
				}

			}
			else if(key.assignmentCategory.substring(0, 3).equalsIgnoreCase("lab")) {
				CompositeKey2 key1 = new CompositeKey2(key.studentName, key.subject);
				if(labScore.containsKey(key1)) {
					labScore.put(key1, new CompositeValue1(labScore.get(key1).marks + score, labScore.get(key1).size + 1));
				}
				else {
					labScore.put(key1, new CompositeValue1(score, 1));
				}
			}
			else if(key.assignmentCategory.substring(0, 4).equalsIgnoreCase("proj")) {
				CompositeKey2 key1 = new CompositeKey2(key.studentName, key.subject);
				if(projectScore.containsKey(key1)) {
					projectScore.put(key1, new CompositeValue1(projectScore.get(key1).marks + score, projectScore.get(key1).size + 1));
				}
				else {
					projectScore.put(key1, new CompositeValue1(score, 1));
				}
			}
		}

		for(Assignments key : set) {
			CompositeKey2 key1 = new CompositeKey2(key.studentName, key.subject);
			float testscore = 0;
			float labscore = 0;
			float quizscore = 0;
			float projectscore = 0;
			if(testScore.containsKey(key1)) {
				testscore = (float) ((40 * testScore.get(key1).marks) /testScore.get(key1).size) / 100; 
			}
			else {
				testscore = 0;
			}
			if(labScore.containsKey(key1)) {
				labscore = (float) ((10 * labScore.get(key1).marks) / labScore.get(key1).size) / 100; 
			}
			else {
				labscore = 0;
			}
			if(quizScore.containsKey(key1)) {
				quizscore = (float) ((20 * quizScore.get(key1).marks) / quizScore.get(key1).size) / 100; 
			}
			else {
				quizscore = 0;
			}
			if(projectScore.containsKey(key1)) {
				projectscore = (float) ((30 * projectScore.get(key1).marks) / projectScore.get(key1).size) / 100; 
			}
			else {
				projectscore = 0;
			}
			float overallScore = quizscore + labscore + projectscore + testscore;
			CompositeValue2 value2 = new CompositeValue2(testscore, labscore, quizscore, projectscore, overallScore);
			overallRating.put(key1, value2);
		}
	}

	private static void validateAssignmentCategory(Assignments assignments) {

		CompositeKey1 key = new CompositeKey1(assignments.getStudentName(), assignments.getSubject(), assignments.getAssignmentCategory());

		if(assignments.assignmentCategory.equalsIgnoreCase("test")){
			if(test.containsKey(key)) {
				test.put(key, test.get(key) + 1);
				assignments.setAssignmentCategory("test_" + test.get(key));
			}
			else {
				test.put(key, 1);
				assignments.setAssignmentCategory("test_" + test.get(key));
			}
		}
		else if(assignments.assignmentCategory.equalsIgnoreCase("quiz")){
			if(quiz.containsKey(key)) {
				quiz.put(key,quiz.get(key) + 1);
				assignments.setAssignmentCategory("quiz_" + quiz.get(key));
			}
			else {
				quiz.put(key, 1);
				assignments.setAssignmentCategory("quiz_" + quiz.get(key));
			}
		}
		else if(assignments.assignmentCategory.equalsIgnoreCase("lab")){
			if(lab.containsKey(key)) {
				lab.put(key,lab.get(key) + 1);
				assignments.setAssignmentCategory("lab_" + lab.get(key));
			}
			else {	
				lab.put(key, 1);
				assignments.setAssignmentCategory("lab_" + lab.get(key));
			}
		}
		else if(assignments.assignmentCategory.equalsIgnoreCase("project")){
			if(project.containsKey(key)) {
				project.put(key,project.get(key) + 1);
				assignments.setAssignmentCategory("project_" + project.get(key));
			}
			else {
				project.put(key, 1);
				assignments.setAssignmentCategory("project_" + project.get(key));
			}
		}
		else {
			System.out.println("Please enter valid assignment category.");
		}

		set.add(new Assignments(assignments.getStudentName(), assignments.getSubject(), assignments.getAssignmentCategory(),
				assignments.getDate(), assignments.getPoints()));
	}
}


