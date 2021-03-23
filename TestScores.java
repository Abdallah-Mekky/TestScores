package javaapplication23;

public class TestScores {
  
    private double Score1;
    private double Score2;
    private double Score3;
    
    public TestScores(){
    };
    
    public void setScore1(double S){
   
        Score1=S; 
    }

    public void setScore2(double S) {
        Score2 = S;
    }

    public void setScore3(double S) {
        Score3 = S;
    }
    
    public double getScore1(){
    
        return Score1;
    }

    public double getScore2() {
        return Score2;
    }

    public double getScore3() {
        return Score3;
    }
    
    
    public double getAverage(){
    
    return (Score1+Score2+Score3)/3;
    }
    
    public void printInfo(){
    
         System.out.println("Test Scores[ First Score = " + Score1 + ", Second Score = " + Score2 + 
                ", Third Score = " + Score3 +
                ", The Average Is " + getAverage() + "]");
    }
    
    
    
    
    
}
