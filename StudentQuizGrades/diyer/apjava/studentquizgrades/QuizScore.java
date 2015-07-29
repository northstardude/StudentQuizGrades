package diyer.apjava.studentquizgrades;

public class QuizScore{
	private String name;
	private float percentScore;
	private int id;
	
	public QuizScore(String aName, float aScore){
		name = aName;
		percentScore = aScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPercentScore() {
		return percentScore;
	}

	public void setPercentScore(float percentScore) {
		this.percentScore = percentScore;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
