package myPackage;

import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Scanner;

/* This class contains a number of methods that 
* works on a wide range of data types to retrieve data from given files
* This class will implement all the methods by
* displaying all files
* creating files
* deleting files
* searching files
* 
*/

public class LockedMe 
{
	
	static final String folderpath = "/Users/adan/Adamkey/LockedMeFiles";
	static final String errorMessage = "Some error occured. please contact : admin@lockedme.com";


/* This is the main method where
* all the methods are executed.
* 
*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
		
		Scanner obj= new Scanner (System.in);
		int ch;
		
		do
		{
			displayMenu();
			System.out.println("Enter your choice:");
			ch=Integer.parseInt(obj.nextLine());
			
			switch(ch)
			{
			case 1:getAllFiles();
			break;
			case 2:createFiles();
			break;
			case 3:deleteFiles();
			break;
			case 4: searchFiles();
			break;
			case 5: System.exit(0);
			break;
			default: System.out.println("Invalid option");
			break;
			}
		}
		while(ch>0);
		obj.close();
	}
		catch(Exception Ex)
		{
			System.out.println("Please try again:");
		}
		
		}
		
	/**
	 * This method displays menu of all files
	 * 
	 */
	public static void displayMenu()
	{
		System.out.println("********************************************");
		System.out.println("Welcome to LockdedMe.com:");
		System.out.println("This project is designed by Adan:");
		System.out.println("********************************************");
		System.out.println("\t\t1. Display all the files");
		System.out.println("\t\t2. Add a new file");
		System.out.println("\t\t3. Delete a file");
		System.out.println("\t\t4. Search a file");
		System.out.println("\t\t5. Exit");
	
		
	}
	
	/**
	 * This method will return all the files from the folder directory
	 * 
	 * 
	 */
	
	public static void getAllFiles()
	{
		
		try
		{

		File folder = new File  ( "/Users/adan/Adamkey/LockedMeFiles");
		File[] listOffiles = folder.listFiles();

		
		
		if (listOffiles.length==0)
			System.out.println("oops No file exist in the directory");
		else {
		
		for ( var l:listOffiles)
		{
			System.out.println(l.getName());
	
		}
		}
		}
		
		catch(Exception Ex)
		{
			System.out.println("Some error occured. please contact : admin@lockedme.com");
		}
		
		}
	/**
	 * This method creates files in the directory
	 */
	
	public static void createFiles()
	
	{
		
		try 
		{
		Scanner obj= new Scanner (System.in);
		
		String fileName;
		
		
		System.out.println("Enter file name:");
		fileName = obj.nextLine();
		
		int linesCount;
		System.out.println("Enter how many lines in the file:");
		linesCount = Integer.parseInt(obj.nextLine());
		
		
		FileWriter myWriter = new FileWriter (folderpath+ "//"+ fileName);
		for ( int i=1; i <= linesCount; i++ );
		
		{
			System.out.println("Enter the file line");
		
		myWriter.write(obj.nextLine()+"/n");
		
	}
		System.out.println("File created Successfully");

		myWriter.close();
		obj.close();
		}
		
		catch(Exception Ex)
		{
			System.out.println("errorMessage");
		}	
	}
	
	/**
	 * This method will delete file based on provided file name
	 * 
	 */
	public static void deleteFiles()
	
	{
		Scanner obj= new Scanner (System.in);
		
		try
		{
			
		
		String fileName;
		System.out.println("Enter the final name to be deleted");
		
		fileName = obj.nextLine();

		File file = new File(folderpath+ "//"+ fileName);

    if (file.exists())
    {
    	file.delete();
    
        System.out.println("File deleted successfully : "+fileName);
    }
    else {
        System.out.println("File do not exist");
    }
		}
		catch(Exception Ex)
		{
			System.out.println("errorMessage");
		}
		finally {
			obj.close();
		}
		
		}
	
	
	/**
	 * This method searches files from the directory
	 * 
	 */
	public static void searchFiles()
	{
Scanner obj= new Scanner (System.in);
		
		try
		{
			
		
		String fileName;
		
		System.out.println("Enter the final name to be searched");
		
		fileName = obj.nextLine();
		
		File folder = new File  ( "/Users/adan/Adamkey/LockedMeFiles");
		File[] listOffiles = folder.listFiles();
		
		LinkedList<String> filenames = new LinkedList <String>();
		
		for(var l:listOffiles)
		filenames.add(l.getName());
		
		if(filenames.contains(fileName))
		  System.out.println("File is available");
		else
			System.out.println("File is not available");

		
		}
		catch(Exception Ex)
		{
			System.out.println("errorMessage");
		}
		finally {
			obj.close();
		}
		
		}
		
		}
		
	


