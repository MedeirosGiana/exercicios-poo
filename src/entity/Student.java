package entity;

public class Student {
    public String name;
    public double note1;
    public double note2;
    public double note3;

    public double finalNote(){
        return note1+note2+note3;
    }
    public double missingPoints(){
        if (finalNote() < 60){
            return 60 - finalNote();
        }else {
            return 0.0;
        }
    }

}
