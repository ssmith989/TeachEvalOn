package com.example.teachevalon;

public class Table {

	int id;
	String answer1;
	String answer2;
	String answer3;
	String answer4;
	String answer5;
	String email;
	//int score;
	String name;
	
	public Table(){

		
	}

	public Table(int id, String name, String ans1, String ans2,
			String ans3, String ans4, String ans5, String email){
	this.id = id;
	this.name = name;
	this.answer1 = ans1;
	this.answer2 = ans2;
	this.answer3 = ans3;
	this.answer4 = ans4;
	this.answer5 = ans5;
	this.email = email;
	}
	
	public Table(String name, String ans1, String ans2,
			String ans3, String ans4, String ans5, String email){
	this.name = name;
	this.answer1 = ans1;
	this.answer2 = ans2;
	this.answer3 = ans3;
	this.answer4 = ans4;
	this.answer5 = ans5;
	this.email = email;
	}

	public int getId(){
		return this.id;
	}

	public void setId(int id){
		this.id = id;
	}
	public String getAnswer1(){
		return this.answer1;
	}
	
	public void setAnswer1(String ans){
		this.answer1 = ans;
	}
	
	public String getAnswer2(){
		return this.answer2;
	}
	
	public void setAnswer2(String ans){
		this.answer2 = ans;
	}
	
	public String getAnswer3(){
		return this.answer3;
	}
	
	public void setAnswer3(String ans){
		this.answer3 = ans;
	}
	
	public String getAnswer4(){
		return this.answer4;
	}
	
	public void setAnswer4(String ans){
		this.answer4 = ans;
	}
	
	public String getAnswer5(){
		return this.answer5;
	}
	
	public void setAnswer5(String ans){
		this.answer5 = ans;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public void setEmail(String em){
		this.email = em;
	}

	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
}