

public class Films {
	

	private final Long id;
	
	private final String name;
	
	private final String directorName;
	
	private final String filmActors;
	
	private final String date;
	
	private final String description;
	
	private final String type;

	public Films(Long id, String name, String directorName, String filmActors, String date, String description,
			String type) {
		this.id = id;
		this.name = name;
		this.directorName = directorName;
		this.filmActors = filmActors;
		this.date = date;
		this.description = description;
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDirectorName() {
		return directorName;
	}

	public String getFilmActors() {
		return filmActors;
	}

	public String getDate() {
		return date;
	}

	public String getDescription() {
		return description;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Film [id =" + id + ", name =" + name + ", director name =" + directorName + ", cast =" + filmActors
				+ ", date =" + date + ", description =" + description + ", type =" + type + "]";
	}
	
	
}
