/*
* [CSCI1301L/ParseTheTweet].java
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
public class ParseTheTweet{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the tweet here");
		String tweet = keyboard.nextLine();
		
		//declared all the variables I needed here
		
		final String TypeTag = "#typ";
		final String DetTag = "#det";
		final String LocationTag = "#loc";
		final String LatiTag = "#lat";
		final String LongTag = "#lng";
		
		int startTag;
		int FinishTag;
		
		//each of these 5 blocks individually parses each section, because that was easier for me. The startTag and FinishTag integers are reused
		//just to make things a little smoother
		
		startTag = tweet.indexOf(TypeTag)+4;
		FinishTag = tweet.indexOf("; #det");
		String type = tweet.substring(startTag, FinishTag);
		type.trim();
		
		startTag = tweet.indexOf(DetTag)+4;
		FinishTag = tweet.indexOf("; #loc");
		String details = tweet.substring(startTag, FinishTag);
		details.trim();
		
		startTag = tweet.indexOf(LocationTag)+4;
		FinishTag = tweet.indexOf("; #lat");
		String location = tweet.substring(startTag, FinishTag);
		location.trim();
		
		startTag = tweet.indexOf(LatiTag)+4;
		FinishTag = tweet.indexOf("; #lng");
		String latitude = tweet.substring(startTag, FinishTag);
		latitude.trim();
		
		startTag = tweet.indexOf(LongTag)+4;
		FinishTag = tweet.indexOf(";\"");
		String longitude = tweet.substring(startTag, FinishTag);
		longitude.trim();
	
		//print statements woo hoo, with replacements and uppercase as needed
		
		System.out.printf("%-20s %s\n", "Type:", type.toUpperCase());
		System.out.printf("%-20s %s\n", "Details:", details.replace(',','-'));
		System.out.printf("%-20s %s\n", "Location:", location.replace(',', '-'));
		System.out.printf("%-20s %s\n", "Latitude:", latitude);
		System.out.printf("%-20s %s\n", "Longitude:", longitude);
		
		keyboard.close();
	}
}
