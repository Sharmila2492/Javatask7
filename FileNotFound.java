package Task7;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound {

	public static void main(String[] args) {
	try
	{
		FileReader fis=new FileReader("Collections.col");
	}catch(FileNotFoundException e)
	{
		System.out.println(e);
		System.out.println("File does not exist");
	}
	}

}

/*
Output:
	java.io.FileNotFoundException: Collections.col (The system cannot find the file specified)
	File does not exist
	*/