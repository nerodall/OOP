package Model;

import java.util.HashMap;
import java.util.List;

import Controller.iGetModel;

public class ModelList implements iGetModel<HashMap<Long,Student>> {
    private HashMap<Long,Student> students;

    public ModelList(HashMap<Long,Student> students) {
        this.students = students;
    }

    public HashMap<Long,Student> getAllStudents()
    {
        return students;
    }

    @Override
    public HashMap<Long, Student> getStudentIdToDelete() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStudentIdToDelete'");
    }
}

