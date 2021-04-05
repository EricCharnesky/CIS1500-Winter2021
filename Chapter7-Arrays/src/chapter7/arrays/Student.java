
package chapter7.arrays;


public class Student {
    private String name;
    private double score;
    
    public Student(String name, double score){
        this.name = name;
        this.score = score;
    }
    
    public String getName(){
        return name;
    }
    
    public double getScore(){
        return score;
    }
}