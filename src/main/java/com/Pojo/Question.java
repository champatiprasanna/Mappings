package com.Pojo;

import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "Question")
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "QId")
	private int id;
	@Column(name = "Question")
	private String question;
	
	@OneToMany(targetEntity=Answer.class,cascade = CascadeType.ALL)  
	@JoinColumn(name="questionid")  
	private List<Answer> answers;  

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	
	

}
