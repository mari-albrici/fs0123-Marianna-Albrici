package exerciseThree;

import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import exerciseOne.Main;

public class RegistroPresenze {

	private static File file = new File("presenze.txt");
	
	Presenza user1 = new Presenza("Mario", 10);
	Presenza user2 = new Presenza("Luigi", 20);
	Presenza user3 = new Presenza("Andrea", 15);
	Presenza user4 = new Presenza("Matteo", 18);
	
	
	public static void main(String[] args) {
		
		List<String> registro = new ArrayList<String>();
	
		registro.add(user001);
		registro.add(user002);
		registro.add(user003);
		registro.add(user004);
		
		
		try {
			save(registro);
			System.out.print(read());
		} catch(IOException e) {
			e.printStackTrace();
		}
//		
//		try {
//			clear();
//			System.out.print("Cleared file");
//		} catch(IOException e) {
//			e.printStackTrace();
//		}
	}
	
	public static void save(List<String> registro) throws IOException{
		FileUtils.writeStringToFile(file, registro + System.lineSeparator(), "UTF-8", true);
	}
	
	public static String read() throws IOException{
		if(file.exists()) {
			String presenze = FileUtils.readFileToString(file, "UTF-8");
			return presenze;
		} else {
			Main.logger.error("FILE NOT FOUND");
			return "";
		}
	}
	
	public static void clear() throws IOException{
		FileUtils.writeStringToFile(file, "", "UTF-8", false);
	}
}
