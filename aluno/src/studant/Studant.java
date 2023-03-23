package studant;

public class Studant {

	public double note1, note2, note3;
	public String name;
	
	public double finalNote() {
		return note1+note2+note3;
	}
	
	public String result() {
		if(finalNote() < 60) {
			return "FAILD \nMISSING " + String.format("%.2f", (60-finalNote())) + " POINTS";
		}
		else return "PASSED";
	}
}
