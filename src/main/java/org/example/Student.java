package org.example;

public class Student {
    private int Sid;
    private String sname;

    public Student() {
    }

    public Student(int sid, String sname) {
        this.Sid = sid;
        this.sname = sname;
    }


    public int getSid() {
        return Sid;
    }

    public void setSid(int sid) {
        Sid = sid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Sid=" + Sid +
                ", sname='" + sname + '\'' +
                '}';
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}
