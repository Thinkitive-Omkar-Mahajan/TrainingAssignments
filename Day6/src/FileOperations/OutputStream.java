package FileOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class OutputStream {
	public static void main(String[] args) {
		writeFile();
		try {
			readFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static String readFile() throws FileNotFoundException, IOException {
		String s="";
		try(FileInputStream fr = new FileInputStream("pqr.txt");){
			int i=0;
			while((i=fr.read())!=-1) {
				s = s+ (char)i;
			}
		}catch(IOException e) {
			System.out.println("Exception:"+ e);
		}
		return s;
	}
	
	private static void writeFile() {
		try(FileOutputStream fw = new FileOutputStream("pqr.txt");){
			String s3 = "This is sample data";
			fw.write(s3.getBytes());
		}catch(IOException e) {
			System.out.println("Exception:"+ e);
		}
	}
}
