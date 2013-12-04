package com.example.teachevalon;

public class Table {

	//Values for table
	private int id;
	private String answer1;
	private String answer2;
	private String answer3;
	private String answer4;
	private String answer5;
	private String email;
	private String name;
	
	//empty Constructor
	public Table(){}

	//Constructor with ID
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
	//constructor without ID
	public Table(String name, String ans1, String ans2,
			String ans3, String ans4, String ans5, String email){
	super();
	this.name = name;
	this.answer1 = ans1;
	this.answer2 = ans2;
	this.answer3 = ans3;
	this.answer4 = ans4;
	this.answer5 = ans5;
	this.email = email;
	}

	//prints for command table
	@Override
	public String toString() {
		String s = "Table [id=" + id + ", Teacher=" + name + ", Answer1=" + answer1
				+ ", Answer2=" + answer2 + ", Answer3=" + answer3 + ", Answer4=" + answer4 
				+ ", Answer5=" + answer5 + ", Email=" + email + "]";
		return s;
		}
	
	//Get and Set methods for ID,Name, the answers,cand email
	public int getId(){
		return this.id;
	}

	public void setId(int id){
		this.id = id;
	}
	public String getAnswer1(){
		return this.answer1;
	}
	
	public void setAnswer1(String ans1){
		this.answer1 = ans1;
	}
	
	public String getAnswer2(){
		return this.answer2;
	}
	
	public void setAnswer2(String ans2){
		this.answer2 = ans2;
	}
	
	public String getAnswer3(){
		return this.answer3;
	}
	
	public void setAnswer3(String ans3){
		this.answer3 = ans3;
	}
	
	public String getAnswer4(){
		return this.answer4;
	}
	
	public void setAnswer4(String ans4){
		this.answer4 = ans4;
	}
	
	public String getAnswer5(){
		return this.answer5;
	}
	
	public void setAnswer5(String ans5){
		this.answer5 = ans5;
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