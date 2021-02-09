
package entity;

import javax.persistence.ManyToMany;
import java.util.List;

public class Course {

   private String courseCode;
   private String courseName;
   private String courseType;
   private String duration;
   @ManyToMany(mappedBy = "Student")
   private List<Student> students;

    public Course() {
    }

    public Course(String courseCode, String courseName, String courseType, String duration, List<Student> students) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseType = courseType;
        this.duration = duration;
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseCode='" + courseCode + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseType='" + courseType + '\'' +
                ", duration='" + duration + '\'' +
                ", students=" + students +
                '}';
    }
}
