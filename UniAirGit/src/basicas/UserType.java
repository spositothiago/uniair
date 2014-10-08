package basicas;

public enum UserType {
	CUSTOMER(1),
	EMPLOYEE(2);
	
	private int type;
	UserType(int type){
		this.type = type;
	}
	
	public int getType(){
		return this.type;
	}
}
