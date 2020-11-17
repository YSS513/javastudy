package com.naver;

public class Board {

	private String todayPost;
	private boolean isOK;

	public Board() {
		// TODO Auto-generated constructor stub
	}

	public String getTodaypost() {
		if (!isOK) {
			synchronized (this) { // synchronized 반드시 필수!
				try {
					wait(); // 얼음!
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return todayPost;
	}

	public void setTodaypost(String todaypost) {
		this.todayPost = todaypost;
		
		isOK = true;
		
		synchronized (this) { // synchronized 반드시 필수!
			notify(); // wait 얼음땡!!
		}
	}

}
