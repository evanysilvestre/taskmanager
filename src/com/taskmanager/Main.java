package com.taskmanager;

import java.util.Scanner;
import com.taskmanager.Entity.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int id = 1;
        Task.deleteTask(id);
		/*System.out.println("Task: ");
		String task = scn.nextLine();
		
		Task.createTask(task);
		
		Main.menu();


		try {
		      File myObj = new File("data.json"); // Create File object
		      if (myObj.createNewFile()) {           // Try to create the file
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace(); // Print error details
		    }

        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();  // must close manually
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }*/

		scn.close();		

		
	}
}
