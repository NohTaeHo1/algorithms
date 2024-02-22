package gradeOOP;

public class Student {

    private String name;
    private int korean;
    private int english;
    private int math;
    int average;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setKorean(int korean){
        this.korean = korean;
    }
    public int getKorean(){
        return this.korean;
    }

    public void setEnglish(int english){
        this.english = english;
    }
    public int getEnglish(){
        return this.english;
    }
    public void setMath(int math){
        this.math = math;
    }
    public int getMath(){
        return this.math;
    }
    public void createAverage(){
        this.average = (this.korean+this.english+this.math)/3;
    }
    public int getAverage(){
        return this.average;
    }

}
