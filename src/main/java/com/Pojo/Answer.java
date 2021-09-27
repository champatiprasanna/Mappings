package com.Pojo;
import javax.persistence.*;


@Entity
@Table(name = "Answer")
public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AnswerId")
	private int id;
	@Column(name = "Answers")
	private String answr;
	@Column(name = "PostedBy")
	private String PostedBy;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswer() {
		return getAnswer();
	}
	public void setAnswer(String answer) {
		this.answr = answer;
	}
	public String getPostedBy() {
		return PostedBy;
	}
	public void setPostedBy(String postedBy) {
		PostedBy = postedBy;
	}
	
	
	
}
