package com.naver;

public class TV {
	private int vol;
	private int ch;
	private boolean power;

	public TV(int vol, int ch, boolean power) {
		this.vol = vol;
		this.ch = ch;
		this.power = power;

	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public void powerOn() {
		power = true;
	}

	public void powerOff() {
		power = false;
	}

	public void volUp() {
		// 만약 파워가 false라면 이 메서드의 return; 밑은 실행하지 않는다.
		if (!power) {
			return;
		}

		++vol;
		if (vol > 100) {
			vol = 100;
		}
	}

	public void volDown() {
		// 만약 파워가 true라면 이 볼륨을 낮춘다. 0보다 낮아질 수는 없다.
		if (power) {
			--vol;
			if (vol < 0) {
				vol = 0;
			}
		}
	}

	public void chUp() {
		if (!power) {
			return;
		}

		++ch;
		if (ch > 999) {
			ch = 0;
		}
	}

	public void chDown() {
		if (!power) {
			return;
		}

		--ch;
		if (ch < 0) {
			ch = 0;
		}
	}

}
