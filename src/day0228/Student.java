package day0228;

/**
 * 3. ��дѧ���࣬��дequals������ͨ��ѧ��������ֵ���ж�ѧ�������Ƿ���ͬ��
 * 4. ��дѧ���࣬��дѧ�����toString��������ѧ���Ļ�����Ϣ��  equals����ͨ��ѧ������Ϣ�Ƚ�ѧ���Ƿ���ͬ��
 * 	     ����ѧ���������飬��������ѧ����������ѧ�������С�
 * 	     ���ѧ��������ж�ѧ�������Ƿ��Ѵ��ڣ�������ڲ����д洢��  ��������ڿ��Դ洢���������������ѧ�������ӡ��
 *
 */
public class Student {
	private String name;
	private String mClass;
	
	public Student(){}
	public Student(String name, String mClass){
		this.name = name;
		this.mClass = mClass;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getmClass() {
		return mClass;
	}
	public void setmClass(String mClass) {
		this.mClass = mClass;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mClass == null) ? 0 : mClass.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)   // 1. �ж��ǲ���ͬһ�����ö���
			return true;
		if (obj == null)	// 2. �жϴ���Ķ����Ƿ�Ϊ��
			return false;
		if (getClass() != obj.getClass())  // 3. �ж��ǲ���ͬһ����
			return false;
		Student other = (Student) obj;	// 4. �����ͬһ�������ǿ��ת��
		if (mClass == null) {			// 5. �Ƚ�ʵ�����Ƿ����
			if (other.mClass != null)
				return false;
		} else if (!mClass.equals(other.mClass))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getName() + ", " + getmClass();
	}
}
