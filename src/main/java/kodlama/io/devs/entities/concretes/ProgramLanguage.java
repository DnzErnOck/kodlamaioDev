package kodlama.io.devs.entities.concretes;

public class ProgramLanguage {
	private int id;
	private String name;

	public ProgramLanguage() {

	}

	public ProgramLanguage(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
