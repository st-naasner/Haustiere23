import java.time.LocalDate;

public class Tier {

	private String name;
	private LocalDate geburtsdatum;
	
	
	public Tier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tier(String name, LocalDate geburtsdatum) {
		super();
		this.name = name;
		this.geburtsdatum = geburtsdatum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getGeburtsdatum() {
		return geburtsdatum;
	}
	public void setGeburtsdatum(LocalDate geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}
	
}
