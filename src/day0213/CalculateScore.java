package day0213;

public class CalculateScore {
	
	float javaScore;
	float cShapScore;
	float dbScore;
	
	public CalculateScore(){}
	
	public CalculateScore(float javaScore, float cShapScore, float dbScore){
		this.javaScore = javaScore;
		this.cShapScore = cShapScore;
		this.dbScore = dbScore;
	}
	
	public float getJavaScore(){
		return javaScore;
	}
	
	public void setJavaScore(float score){
		javaScore = score;
	}
	
	public float getCShapScore(){
		return cShapScore;
	}
	
	public void setCshapScore(float score){
		cShapScore = score;
	}
	
	public float getDbScore(){
		return dbScore;
	}
	
	public void setDbScore(float score){
		dbScore = score;
	}
	
	// 计算总分
	public float calSumScore(){
		return javaScore + cShapScore + dbScore;
	}
	
	// 计算平均分
	public float calAvrageScore(){
		return calSumScore() / 3;
	}
	
	// 打印成绩信息
	public void printScoreInfo(){
		System.out.println("Java: " + getJavaScore() + "\nC#: " + getCShapScore()
				+ "\n数据库：" + getDbScore());
		System.out.println("\n总成绩为：" + calSumScore());
		System.out.println("总平为：" + calAvrageScore());
	}
	
	public static void main(String[] args) {
		CalculateScore c = new CalculateScore(95, 96, 78);
		c.printScoreInfo();
	}

}
