package git.old_pr.pr6_done;

import java.util.Comparator;

public class StudentComp implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2) {

        if(!(obj1 instanceof Student && obj2 instanceof Student)) // проверка на принадлежность к классу
            throw new IllegalArgumentException("Объекты не являются студентами!");

        return ((Student) obj1).getGPA() - ((Student) obj2).getGPA();
    }
}
