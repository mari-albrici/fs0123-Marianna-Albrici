package exerciseOne;

public class Main {

	public static void main(String[] args) {
	
		String pariDispari = "epicode";
		System.out.println(pariDispari + " " + CheckPari(pariDispari));
		
		int anno = 1700;
		System.out.println(anno + " " + CheckBisestile(anno));
		
	}
	
	public static boolean CheckPari(String pariDispari) {
			
			if(pariDispari.length() % 2 == 0) {
				return true;
			} else {
				return false;
			}
	}
	
	public static boolean CheckBisestile(int anno) {
		
		 if (anno % 4 == 0) {
		      if (anno % 100 == 0) {
		        if (anno % 400 == 0) {
		          return true;
		        } else {
		          return false;
		        }
		      } else {
		        return true;
		      }
		    } else {
		      return false;
		    }
	}
}
