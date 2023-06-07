package home_work_7.task5;

import java.util.ArrayList;
import java.util.List;

public class Teachers {
    private final List<String> teachers = new ArrayList<>();

    public void add(String teacher){
        teachers.add(teacher);
    }
    public int getIndex(String teacher){
        return teachers.indexOf(teacher);
    }

    public List<String> getTeachers() {
        return teachers;
    }
}
