/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class ComparatorTest {
	public static void main(String[] args) throws ParseException {
		Student[] students = { new Student("cs011", "Lennon  ", 3.1),
				new Student("cs021", "McCartney", 3.4),
				new Student("cs012", "Harrison ", 2.7),
				new Student("cs022", "Starr ", 3.7) };

		System.out.println("Before sorting by student ID");
		System.out.println("Student-ID \t  Name \t  CGPA (for 4.0) ");
		System.out.println(Arrays.toString(students));

		Arrays.sort(students);
		Arrays.sort(students,new CGPAComparator());

		System.out.println("After sorting by student ID");
		System.out.println("Student-ID \t  Name \t  CGPA (for 4.0) ");
		System.out.println(Arrays.toString(students));
		
		//////////////////////////////////////////////
		SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");
		Date startingDate = format1.parse("03/01/2015");
		
		
		Date result = new Date(startingDate.getTime()- 24 * 3600 * 1000);
		System.out.println(result.toString());
	}
}