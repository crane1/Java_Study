package day0222;

public class Test {

	public static void main(String[] args) {
		MP3 mp3 = new MP3(100,"魅族");
		Person p = new Person("颜晓晨", mp3);
		Song song = new Song("你若化成风");
		p.playSong(song);
	}

}
