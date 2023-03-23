package studants;

public class Studant {
	
	private String name;
	private double note1, note2, avg;
	
	public Studant(String name, double note1, double note2) {
		this.name = name;
		this.note1 = note1;
		this.note2 = note2;
	}

	public String getName() {
		return name;
	}

	public double getAvg() {
		return avg;
	}
	
	public void calcAvg() {
		avg = (note1+note2)/2;
	}
	
	
}
