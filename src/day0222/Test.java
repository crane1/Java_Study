package day0222;

public class Test {

	public static void main(String[] args) {
		MP3 mp3 = new MP3(100,"����");
		Person p = new Person("������", mp3);
		Song song = new Song("�������ɷ�");
		p.playSong(song);
	}

}
