package ExutorTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

class ReadFile
{
	private String path;

	public static void readFile(String path) throws IOException
	{
		FileInputStream fin=new FileInputStream("E:\\abc.txt");
		
		String line;
		int c;
		char ch;
        while((c = fin.read()) != -1) // st is declared as string avobe
        {
        	ch=(char)c;
        	System.out.println(ch);
        }
            
		
		fin.close();
	}
	
}

public class ReadFileCount {

	public static void main(String[] args) throws IOException {
	System.out.println("run");
		ReadFile.readFile("E:/abc.txt");
		

		System.out.println("run");
		
	}
}
