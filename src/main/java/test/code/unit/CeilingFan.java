package test.code.unit;

public class CeilingFan {
	
	private boolean increasedSpeed1;
	private boolean increasedSpeed2;
	private boolean increasedSpeed3;
	private boolean speedOff;
	private boolean reversedSpeed;
	
	public CeilingFan(boolean increasedSpeed1, boolean increasedSpeed2, boolean increasedSpeed3, boolean speedOff,
			boolean reversedSpeed) {
		super();
		this.increasedSpeed1 = increasedSpeed1;
		this.increasedSpeed2 = increasedSpeed2;
		this.increasedSpeed3 = increasedSpeed3;
		this.speedOff = speedOff;
		this.reversedSpeed = reversedSpeed;
	}

	public boolean isIncreasedSpeed1() {
		return increasedSpeed1;
	}

	public void setIncreasedSpeed1(boolean increasedSpeed1) {
		this.increasedSpeed1 = increasedSpeed1;
	}

	public boolean isIncreasedSpeed2() {
		return increasedSpeed2;
	}

	public void setIncreasedSpeed2(boolean increasedSpeed2) {
		this.increasedSpeed2 = increasedSpeed2;
	}

	public boolean isIncreasedSpeed3() {
		return increasedSpeed3;
	}

	public void setIncreasedSpeed3(boolean increasedSpeed3) {
		this.increasedSpeed3 = increasedSpeed3;
	}

	public boolean isSpeedOff() {
		return speedOff;
	}

	public void setSpeedOff(boolean speedOff) {
		this.speedOff = speedOff;
	}

	public boolean isReversedSpeed() {
		return reversedSpeed;
	}

	public void setReversedSpeed(boolean reversedSpeed) {
		this.reversedSpeed = reversedSpeed;
	}

}
