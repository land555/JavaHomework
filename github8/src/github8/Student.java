package github8;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;
 
public class Student {
	int id;
	String name;
	int age;
	String sex;
 
	public Student(int id, String name, int age, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
 
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age
				+ ", sex=" + sex + "]";
	}
 
	public static void listToMap() {
		Student s1 = new Student(101, "lucy",18, "Å®");
		Student s2 = new Student(102, "mark", 21, "ÄÐ");
		Student s3 = new Student(103, "dika", 22, "Å®");
		List<Student> ar = new ArrayList<Student>();
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		HashMap<Integer, Student> hm = new HashMap<Integer, Student>();
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
			hm.put(ar.get(i).id, ar.get(i));
		}
		Set<Entry<Integer, Student>> en = hm.entrySet();
		for (Entry<Integer, Student> k : en) {
			System.out.println("key:" + k.getKey() + ",value" + k.getValue());
		}
 
	}
 
	public static void main(String[] args) {
		listToMap();
		}
}
