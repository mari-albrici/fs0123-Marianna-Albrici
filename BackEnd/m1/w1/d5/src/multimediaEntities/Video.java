package multimediaEntities;

public class Video extends MultimediaEntity implements Volume, Brightness, Playable{

	private int duration;
	private int brightness = 5;

	public Video(String title, int duration) {
		super(title);
		this.duration = duration;
	}
	
	int volume = 0;
	
	public void play() {
		for (int i=0; i < duration; i++) {
			System.out.print(title);
			for(int j=0; j < volume; j++) {
				System.out.print("!");
			}
			for(int j=0; j < brightness; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}
	
	@Override
	public int volumeUp() {
		return this.volume++;
	}

	@Override
	public int volumeDown() {
		return this.volume--;
	}
	
	@Override
	public int brightnessUp() {
		return this.brightness++;
	}

	@Override
	public int brightnessDown() {
		return this.brightness--;
	}


}
