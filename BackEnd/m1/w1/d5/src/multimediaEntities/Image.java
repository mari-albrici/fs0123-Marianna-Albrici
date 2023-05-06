package multimediaEntities;

public class Image extends MultimediaEntity implements Brightness, Showable{
	
	protected int brightness;

	public Image(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void show() {
		System.out.print(title);
		for (int i=0; i < brightness; i++) {
			System.out.print(" * ");
		}
		System.out.println();
	}
	
	@Override
	public int brightnessUp() {
		return brightness++;
	}

	@Override
	public int brightnessDown() {
		return brightness--;
	}

	
}
