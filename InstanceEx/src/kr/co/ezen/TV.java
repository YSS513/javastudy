package kr.co.ezen;

public class TV {
	private int ch;
	private int vol;
	private String model;
	private String company;
	private boolean power;
	
	
	public TV() {
	}
	
	public TV(int ch, int vol, String model, String company, boolean power) {
		super();
		this.ch = ch;
		this.vol = vol;
		this.model = model;
		this.company = company;
		this.power = power;
	}
	
	public void chUp() {
		if(!power) {
			return;
		}
		++ch;
		if(ch>999) {
			ch = 0;
		}
	}
	
	public void chDown() {
		if(!power) {
			return;
		}
		--ch;
	}
	
	public void volUp() {
		if(!power) {
			return;
		}
		++vol;
	}
	
	public void volDown() {
		if(!power) {
			return;
		}
		--vol;
	}
	
	public void powerOn() {
		power = true;
	}
	
	public void powerOff() {
		power = false;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}
	
	
	
	

}
