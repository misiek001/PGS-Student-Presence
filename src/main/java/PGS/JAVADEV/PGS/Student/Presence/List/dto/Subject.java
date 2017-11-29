package PGS.JAVADEV.PGS.Student.Presence.List.dto;

import java.util.HashSet;
import java.util.Set;

public class Subject {

    private Long id;
    private String name;
    private String lecturer;

    private Set<Student> students = new HashSet<>();

    public Subject() {
    }

    public Subject(String name, String lecturer) {
        this.name = name;
        this.lecturer = lecturer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}