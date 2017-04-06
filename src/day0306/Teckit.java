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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((seatNum == null) ? 0 : seatNum.hashCode());
		result = prime * result
				+ ((trainNum == null) ? 0 : trainNum.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teckit other = (Teckit) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (seatNum == null) {
			if (other.seatNum != null)
				return false;
		} else if (!seatNum.equals(other.seatNum))
			return false;
		if (trainNum == null) {
			if (other.trainNum != null)
				return false;
		} else if (!trainNum.equals(other.trainNum))
			return false;
		return true;
	}
	
	
	
	
}
