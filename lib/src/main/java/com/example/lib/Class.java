package com.example.lib;

public class Class {
    public String Number;
    public Teacher ClassTeacher;
    public Learner[] Learners;

    public Class(String Num, Teacher T, Learner[] L)
    {
        Number = Num;
        ClassTeacher = T;
        Learners = L;
    }

    public void getList()
    {
        for (Learner lrn:Learners
             ) {
            System.out.println(lrn.FullName);
        }
    }

    public void getListParents()
    {
        for (Learner lrn:Learners
        ) {
            for (Parent prn:lrn.parents
            ) {
                System.out.println(prn.FullName);
            }
        }
    }
}
