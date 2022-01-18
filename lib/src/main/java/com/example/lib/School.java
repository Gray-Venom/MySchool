package com.example.lib;

public class School {
    public static School SCHOOL;

    Employee[] Employes;
    Teacher[] Teachers;
    Learner[] Learners;
    int l_i;
    int e_i;
    int t_i;
    String Adress;
    String Name;
    Class[] Classes;
    Elective[] Electivese;
    Section[] Sections;

    public School(String name, String address)
    {
        if (School.SCHOOL == null) School.SCHOOL = this;
        Name = name;
        Adress = address;
        Learners = new Learner[200];
        Employes = new Employee[200];
        Teachers = new Teacher[200];
        l_i = 0;
        e_i = 0;
        t_i = 0;
    }

    public void getListTeachers()
    {

    }

    public void getListEmployeers()
    {

    }

    public String getListLearners()
    {
        int i = 1;
        String ret = "";
        for (Learner l:
             this.Learners) {
            if(l != null)
            {
                ret+=i+". "+l.FullName +"\n";
                i++;
            }
        }
        return ret;
    }

    public void getElectronicJournal()
    {

    }

    public Participant getParticipant()
    {
        Participant p = null;
        return p;
    }

    public String getName() {
        return Name;
    }

    public void addTeacher(Teacher t)
    {

    }
    public void  addEmployeer(Employee e)
    {
        if (e_i == Employes.length || e==null) return;
        Employes[e_i] = e;
        e_i++;
    }
    public void addLearner(Learner l)
    {
        if (l_i == Learners.length || l==null) return;
        //Learners[l_i] = new Learner("ААА", 1 , 213);
        Learners[l_i] = l;
        l_i++;
    }
    public void addClass(Class с)
    {

    }
    public void addElective(Elective e) {

    }
    public void addSection(Section s)
    {

    }
}
