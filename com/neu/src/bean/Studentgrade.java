package bean;

public class Studentgrade {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getPapername() {
		return papername;
	}
	public void setPapername(int papername) {
		this.papername = papername;
	}
	private String username;
	private int score;
	private int papername;

}
