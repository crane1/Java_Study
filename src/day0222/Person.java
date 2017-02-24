package day0222;

public class Person {
	private String name;
	private MP3 mp3;
	
	public Person(){}
	public Person(String name, MP3 mp3){
		this.name = name;
		this.mp3 = mp3;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MP3 getMp3() {
		return mp3;
	}
	public void setMp3(MP3 mp3) {
		this.mp3 = mp3;
	}
	
	public void playSong(Song song){
		System.out.println(name + "正在使用" + mp3.getBrand() + "MP3");
		mp3.playSong(song);
	}
	
	
	
}
