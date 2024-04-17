package edu.ucaldas.poo.gradeBook;
import java.util.Scanner;
public class GradeBookTest {
    public static void main(String[] args) {
        GradeBook courseName1 = new GradeBook("numero2");
        System.out.println(courseName1.displayMessage() + courseName1.getCourseName());
        Scanner input = new Scanner(System.in);

        double total;
        int gradeCounter;
        double average;
        double grade;
        int pass;
        int notPass;

        total = 0;
        gradeCounter = 1;

        pass = 0;
        notPass= 0;

        while(gradeCounter <=10){
            System.out.println("Escriba la nota estudiante " + gradeCounter);
            grade = input.nextDouble();
            if(grade >=3){
                pass = pass + 1;
            }else{
                notPass = notPass + 1;
            }

            total = total + grade;
            gradeCounter = gradeCounter + 1;

        }
        average = total / 10 ;

        System.out.println("El promedio de las notas es: " + average);
        if(pass >= 8){
            System.out.println("El profesor merece el bono");
        }else if(notPass <8){
            System.out.println("El profesor No merece el bono");
        }
    }
}
