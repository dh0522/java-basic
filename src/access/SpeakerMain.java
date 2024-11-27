package access;
public class SpeakerMain {
	public static void main(String[] args) {
		Speaker speaker = new Speaker(90);
		speaker.showVolume();

		speaker.volumeUp();
		speaker.showVolume();

		speaker.volumeUp();
		speaker.showVolume();


		/**
		 * 필드에 직접 접근
			System.out.println("volume 필드 직접 접근 수정");
			speaker.volume = 200;
			speaker.showVolume();
		 	=> 따라서 이렇게 volume 필드에 외부에서 접근하는 것을 막아야 한다.
		**/
	}
}
