public class Faculty {

	public Faculty(Employee dean, String name) {
		this.dean = dean;
		this.name = name;
	}

	private Employee dean;
	private String name;

	public Employee getDean() {
		return this.dean;
	}

	public String getName() {
		return this.name;
	}

	public void setDean(Employee dean) {
		this.dean = dean;
	}

	public void setDean(String name) {
		this.name = name;
	}

	public void holdEvent() {

	}

	public void hireTeachers() {

	}

	public void dismissTeacher() {

	}
	
	public void makeInquiry() {

	}

}