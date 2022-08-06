package iostreams;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Fileadd {
	public void add() throws IOException
	{
		String path="D:\\temp\\";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the filename");
		String filename=sc.next();
		String finalpath=path+filename;
		File f=new File(finalpath);
		boolean b=f.createNewFile();
		if(b!=true) {
			System.out.println("file not created");
		}
		else {
			System.out.println("file created");
		}
				
	}
	
}
