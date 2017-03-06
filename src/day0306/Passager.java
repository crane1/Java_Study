package day0306;

public class Passager {
	private String name;
	private Teckit teckit;
	
	public Passager(){}
	public Passager(String name){
		this.name = name;
		teckit = null;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Teckit getTeckit() {
		return teckit;
	}
	public void setTeckit(Teckit teckit) {
		this.teckit = teckit;
	}
	@Override
	public String toString() {
		return "³Ë¿Í£º" + name + ", ³µÆ±£º" + teckit;
	}
	
	
	
}
