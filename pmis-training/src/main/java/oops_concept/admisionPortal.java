package oops_concept;

import java.util.Scanner;

class Admission{
       String fullName;
       int studentId;
       double finalScore;


    Admission(String fullName,int studentId,double finalScore ) {
            this.fullName = fullName;
            this.studentId = studentId;
            this.finalScore = finalScore;
       }

    Admission(String fullName,int studentId){
        this.fullName = fullName;
        this.studentId = studentId;
        this.finalScore = 0.0;

    }

    char grade(){
        if(finalScore >=90){
            return 'A';
        }else if(finalScore >= 75 && finalScore <= 89){
            return 'B';
        }else if(finalScore >=50 && finalScore <= 74){
                  return  'C';
        }else{
            return 'F';
        }

    }

    void reportCard(){
        System.out.println("Student name :"+ " "+ fullName);
        System.out.println("Student Id :"+" "+ studentId);
        System.out.println("The Score is :"+" "+ finalScore);
        System.out.println("The grade is :"+" "+ grade());
    }



}

public class admisionPortal {
    public static void main(String[] args) {


        Admission a1 = new Admission("Durvesh",100,82.5);
        Admission a2 = new Admission("Rohit",101);

        a1.reportCard();
        a2.reportCard();

    }
}