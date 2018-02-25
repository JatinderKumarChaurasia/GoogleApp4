package com.example.jatinderkumar.googleapp4;

/**
 * Created by Jatinder Kumar on 24-02-2018.
 */

public class Grades {

    private String name;
    private char chemistryGrade;
    private char englishGrade;
    private char mathGrade;
    private char historyGrade;
    private char biologyGrade;

    public Grades(String name, char chemistryGrade, char englishGrade, char mathGrade, char historyGrade, char biologyGrade) {
        this.name = name;
        this.chemistryGrade = chemistryGrade;
        this.englishGrade = englishGrade;
        this.mathGrade = mathGrade;
        this.historyGrade = historyGrade;
        this.biologyGrade = biologyGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getChemistryGrade() {
        return chemistryGrade;
    }

    public void setChemistryGrade(char chemistryGrade) {
        this.chemistryGrade = chemistryGrade;
    }

    public char getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(char englishGrade) {
        this.englishGrade = englishGrade;
    }

    public char getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(char mathGrade) {
        this.mathGrade = mathGrade;
    }

    public char getHistoryGrade() {
        return historyGrade;
    }

    public void setHistoryGrade(char historyGrade) {
        this.historyGrade = historyGrade;
    }

    public char getBiologyGrade() {
        return biologyGrade;
    }

    public void setBiologyGrade(char biologyGrade) {
        this.biologyGrade = biologyGrade;
    }
}
