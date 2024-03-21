package edu.ucaldas.poo.gradebook;

public class GradeBook {

    private String courseName;

    /**
     * @return the courseName
     */
    public GradeBook(String courseName) {
        this.courseName = courseName;
        // TODO Auto-generated constructor stub
    }
    public String getCourseName() {

        return courseName;
    }

    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {

        this.courseName = courseName;
    }


    public String displayMessage() {
        return "Bienvenido al sistema de planillas del curso: ";
    }



}


