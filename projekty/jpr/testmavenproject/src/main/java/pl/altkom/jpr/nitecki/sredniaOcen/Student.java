package pl.altkom.jpr.nitecki.sredniaOcen;

public class Student {

	String studentName;
	float studentNotes[] = { 2, 2, 4, 3, 2 };

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public float[] getStudentNotes() {
		return studentNotes;
	}

	public void setStudentNotes(float[] studentNotes) {
		this.studentNotes = studentNotes;
	}

}
