package javaapplication23;

import java.util.Scanner;

public class JavaApplication23 {

   public static void main(String[] args) {
       
        double Score1,Score2,Score3;
        
        Scanner S = new Scanner(System.in);
        
        System.out.println("Test Scores Program ");
        System.out.println("");
        
        System.out.println("Enter The First Score ");
        Score1=S.nextDouble();
        System.out.println("");
        
        System.out.println("Enter The Second Score ");
        Score2=S.nextDouble();
        System.out.println("");
        
        System.out.println("Enter The Third Score ");
        Score3=S.nextDouble();
        System.out.println("");
        
        TestScores T = new TestScores();
        
        T.setScore1(Score1);
        T.setScore2(Score2);
        T.setScore3(Score3);
        
        T.printInfo();
    }
    
}
