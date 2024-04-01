package inheritance;
//은행계좌클래스(국민은행)
public class Account {
	//멤버변수(필드)
	String accountNo; //계좌번호
	String ownerName; //예금주이름
	int balance; //잔액
	
	//생성자
	public Account() {//ctrl+space-빈생성자 만들어
	}
	
	//매개변수 3개 생성자
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;	
	}
	//예금한다 메서드
	void deposit(int amount) {//메서드 이름(매개변수(있을수도 없을수도))
		balance+=amount;	
	}
	
	//인출한다 메서드
	int withdraw(int amount) throws Exception {//
		if(balance<amount) {//예외를 만들어 호출한쪽에 결과 출력
			throw new Exception("잔액이 부족합니다.");	
		}
		balance-=amount;
		return amount;
	}

}
