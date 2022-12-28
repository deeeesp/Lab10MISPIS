import java.util.*;

public class Course {

	private ArrayList<Lecturer> teaches;
	private String name;
	private int id;
	private float hours;

	public Course(ArrayList<Lecturer> teaches, String name, int id, float hours) {
		this.teaches = teaches;
		this.name = name;
		this.id = id;
		this.hours = hours;
	}

	public ArrayList<Lecturer> getTeaches() {
		return teaches;
	}

	public void setTeaches(ArrayList<Lecturer> teaches) {
		this.teaches = teaches;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getHours() {
		return hours;
	}

	public void setHours(float hours) {
		this.hours = hours;
	}

	public void assignStudentToCourse() {

	}

	public void unsubscribeStudentFromCourse() {

	}
	
	public void giveStudentGradeForCourse() {

	}
}