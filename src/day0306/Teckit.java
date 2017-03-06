package day0306;

public class Teckit {
	private String trainNum;
	private String seatNum;
	private String date;
	
	public Teckit(){}
	public Teckit(String trainNum, String seatNum, String date){
		this.trainNum = trainNum;
		this.seatNum = seatNum;
		this.date = date;
	}
	public String getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(String trainNum) {
		this.trainNum = trainNum;
	}
	public String getSeatNum() {
		return seatNum;
	}
	public void setSeatNum(String seatNum) {
		this.seatNum = seatNum;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "车次：" + trainNum + ", 座位号：" + seatNum
				+ ", 日期：" + date;
	}
	
	
}
