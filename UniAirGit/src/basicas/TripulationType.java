package basicas;

public enum TripulationType {
	PILOT(1),
	STEWARDESS(2);
	
	private int type;
	TripulationType(int type) {
		this.type = type;
	}
	
	public int getType(){
		return this.type;
	}
}
