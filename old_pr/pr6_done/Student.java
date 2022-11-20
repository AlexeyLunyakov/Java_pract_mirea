package git.old_pr.pr6_done;

public class Student implements Comparable {

    private int iDNumber;
    private int GPA;

    public Student(int iDNumber, int GPA) {
        this.iDNumber = iDNumber;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student: " +
                "iDNumber = " + iDNumber +
                ", GPA = " + GPA;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    @Override
    public int compareTo(Object obj) {
        if(!(obj instanceof Student)) // проверка на принадлежность к классу
            throw new IllegalArgumentException("Объект не является студентом!");

        return this.iDNumber - ((Student) obj).iDNumber;
    }
}
