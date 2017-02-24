package day0222;

public class MP3 {
	String brand;
	double price;
	
	public MP3(){};
	public MP3(double price, String brand){
		this.brand = brand;
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void playSong(Song song){
		System.out.println(brand + "MP3ÕýÔÚ²¥·Å¡¶" + song.getName() + "¡·");
	}
	
	
	
}
