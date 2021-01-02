package model;

public class LoginLogic {
	public boolean execute (User user) {

		if(user.getPass().equals("1234")) {return true;}

		//passが1234ならtrueを返す。
		return false;
	}
}

//0.02ではDBのSELECT文でとって来た情報と一致したら返すのように。
//mailaddressとパスワード値をDBと照らし合わせるlogicの作成
