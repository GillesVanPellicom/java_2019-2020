public class Auto {
	private String merk;
	private String model;
	private int snelheid;
	private int schakel;

	public Auto() {
		this.merk = "WMB";
		this.model = "Koekendoos-12";
		this.snelheid = 240;
		this.schakel = 6;
	}

	public String getMerk() {
		return this.merk;
	}

	public void setMerk(String merk) {
		this.merk = merk;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSnelheid() {
		return this.snelheid;
	}

	public void setSnelheid(int snelheid) {
		this.snelheid = snelheid;
	}

	public int getSchakel() {
		return this.schakel;
	}

	public void setSchakel(int schakel) {
		this.schakel = schakel;
	}

}
