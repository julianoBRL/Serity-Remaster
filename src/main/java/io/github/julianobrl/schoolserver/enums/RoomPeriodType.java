package io.github.julianobrl.schoolserver.enums;

public enum RoomPeriodType {
	
	AFTERNOON("afternoon"),
	MORNING("morning"),
	NIGHT("night");
	
	String definition;
	
	RoomPeriodType(String definition){
		this.definition = definition;
	}
	
	@Override
	public String toString() {
		return definition;
	}

}