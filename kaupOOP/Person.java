package kaupOOP;

import java.util.Scanner;

public class Person {
    Scanner sc = new Scanner(System.in);
    private String name;
    private double height;
    private double weight;
    double bmi;
    String bodyMass;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setHeight() {
        this.height = Math.floor((Math.random() * 50) + 150);
    }

    public double getHeight() {
        return this.height;
    }

    public void setWeight() {
        this.weight = Math.floor((Math.random() * 100 + 30));
    }

    public double getWeight() {
        return this.weight;
    }


    public void createbmi() {
        double bmi = Math.floor(this.weight / (this.height * this.height) * 10000);
        this.bmi = bmi;
    }

    public double getbmi() {
        return this.bmi;
    }

    public void createbodyMass() {
        String bodyMass = "";
        if (this.bmi >= 39) {
            bodyMass = "고도비만";
        } else if (this.bmi >= 32) {
            bodyMass = "중도비만";
        } else if (this.bmi >= 30) {
            bodyMass = "경도비만";
        } else if (this.bmi >= 24) {
            bodyMass = "과체중";
        } else if (this.bmi >= 10) {
            bodyMass = "정상";
        } else if (this.bmi < 10) {
            bodyMass = "저체중";
        }
        this.bodyMass = bodyMass;
    }

    public String getBodyMass() {
        return this.bodyMass;
    }

}
