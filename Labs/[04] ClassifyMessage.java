/*
* [CSCI1301/ClassifyMessage].java
* Author: [Aly Pabani]
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from anywhere other than the authorized
* sources. I recognize that any unauthorized sharing, assistance,
* or plagiarism will be handled in accordance with both the
* University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based on
* an assignment created by the School of Computing
* at the University of Georgia. Any publishing or posting
* of source code at any time for this project is prohibited.
*/

import java.util.Scanner;
public class ClassifyMessage{
	
	enum MessageCategory{NEED, OFFER, ALERT, INFO, UNKNOWN}
	
	public static void main(String[] args) {
		
		//Variable declarations
		
			String catString;
			String payload;
			Double latitude;
			Double longitude;
			Boolean isInRange;
			MessageCategory category;
			
		//Boundary variables
			
			final double south = 39.882343; 
			final double north = 40.231315; 
			final double west = -105.743511; 
			final double east = -104.907864; 
		
		//trimming of the user input into useful categories
			
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Please enter a formatted message:");
			catString = keyboard.next();
			catString.trim();
			latitude = keyboard.nextDouble();
			longitude = keyboard.nextDouble();
			payload = keyboard.nextLine();
			payload.trim();
			keyboard.close();
			
			if (catString.equalsIgnoreCase("fire") ||  catString.equalsIgnoreCase("smoke")) {
				category = MessageCategory.ALERT;
			} else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
				category = MessageCategory.INFO;
			} else if (catString.equalsIgnoreCase("need")) {
				category = MessageCategory.NEED;
			} else if (catString.equalsIgnoreCase("offer")) {
				category = MessageCategory.OFFER;
			} else {
				category = MessageCategory.UNKNOWN;
			}
			
			//checks range of the coordinates to make sure its in our range
				if (((latitude >= south) && (latitude <= north)) && ((longitude >= west) && (longitude <= east))) {
					isInRange = true;
				} else {
					isInRange = false;
				}
			
			//outputs formatted values
			System.out.println("Category:\t " + category);
			System.out.println("Raw Cat:\t " + catString);
			System.out.println("Message:\t" + payload);
			System.out.println("Latitude:\t " + latitude);
			System.out.println("Longitude:\t " + longitude);
			System.out.println("In Range:\t " + isInRange);
	}
}
