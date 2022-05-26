package SongPlylist;

public class Song {
	String title;
	Double duration;
	
	public Song(String title, Double duration) {
		super();
		this.title = title;
		this.duration = duration;
	}
	
	public Song() {
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + 
				", duration=" + duration + "]";
	}
	
	
	
	
	
}
