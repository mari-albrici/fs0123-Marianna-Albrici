package multimediaEntities;

public class Audio extends MultimediaEntity implements Volume, Playable{

	private int duration;
	
	public Audio(String title, int duration) {
		super(title);
		this.duration = duration;
	
	}
	
	int volume = 3;

	
	public void play() {
		for (int i=0; i < duration; i++) {
			System.out.print(title);
			for(int j=0; j < volume; j++) {
				System.out.print("!");
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
}
