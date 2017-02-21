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
	
	// �����ܷ�
	public float calSumScore(){
		return javaScore + cShapScore + dbScore;
	}
	
	// ����ƽ����
	public float calAvrageScore(){
		return calSumScore() / 3;
	}
	
	// ��ӡ�ɼ���Ϣ
	public void printScoreInfo(){
		System.out.println("Java: " + getJavaScore() + "\nC#: " + getCShapScore()
				+ "\n���ݿ⣺" + getDbScore());
		System.out.println("\n�ܳɼ�Ϊ��" + calSumScore());
		System.out.println("��ƽΪ��" + calAvrageScore());
	}
	
	public static void main(String[] args) {
		CalculateScore c = new CalculateScore(95, 96, 78);
		c.printScoreInfo();
	}

}
