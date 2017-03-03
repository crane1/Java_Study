package day0228;

/**
 * 3. 编写学生类，重写equals方法，通过学生的属性值来判断学生对象是否相同。
 * 4. 编写学生类，重写学生类的toString方法返回学生的基本信息和  equals方法通过学生的信息比较学生是否相同。
 * 	     创建学生对象数组，将创建的学生对象存放在学生数组中。
 * 	     存放学生对象的判断学生数组是否已存在，如果存在不进行存储，  如果不存在可以存储。最后将数组中所有学生对象打印。
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
		if (this == obj)   // 1. 判断是不是同一个引用对象
			return true;
		if (obj == null)	// 2. 判断传入的对象是否为空
			return false;
		if (getClass() != obj.getClass())  // 3. 判断是不是同一个类
			return false;
		Student other = (Student) obj;	// 4. 如果是同一个类进行强制转换
		if (mClass == null) {			// 5. 比较实例域是否相等
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
