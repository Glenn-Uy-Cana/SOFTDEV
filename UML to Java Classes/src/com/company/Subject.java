package com.company;

public class Subject {
    private int subjCode;
    private String subjectName;
    private int teacherId;

    public int getSubjCode() {
        return this.subjCode;
    }

    public void setSubjCode(int subjCode){
        this.subjCode=subjCode;
    }

    public String getSubjectName(){
        return this.subjectName;
    }

    public void setSubjectName(String subjectName){
        this.subjectName=subjectName;
    }

    public int getTeacherId(){
        return this.teacherId;
    }

    public void setTeacherId(int teacherId){
        this.teacherId = teacherId;
    }
}


