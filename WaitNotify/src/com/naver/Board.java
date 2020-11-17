package com.naver;

public class Board {

	private String todayPost;
	private boolean isOK;

	public Board() {
		// TODO Auto-generated constructor stub
	}

	public String getTodaypost() {
		if (!isOK) {
			synchronized (this) { // synchronized �ݵ�� �ʼ�!
				try {
					wait(); // ����!
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
		
		synchronized (this) { // synchronized �ݵ�� �ʼ�!
			notify(); // wait ������!!
		}
	}

}
