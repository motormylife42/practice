package model;

import java.io.Serializable;

	public class User implements Serializable{
		private String id;
		private String pass;

	public User() {}
	public User(String id,String pass) {
		this.id = id;
		this.pass = pass;

	}
	public String getid() {return id;}
	public String getPass() {return pass;}

	}

	//ver0.01ではid,passを構築。
	//ver0.02ではname,age,passなどの情報を構築。

