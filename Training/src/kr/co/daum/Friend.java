package kr.co.daum;

public class Friend {
	private String id;
	private String job;
	
	public Friend(String id, String job) {
		super();
		this.id = id;
		this.job = job;
		System.out.println(id+job);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	

}
