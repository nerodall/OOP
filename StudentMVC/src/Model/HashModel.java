package Model;

import java.util.HashMap;

import Controller.iGetModel;

public class HashModel implements iGetModel<HashMap<Long, Student>> {
    private HashMap<Long,Student> students;

    public HashModel(HashMap<Long, Student> students) {
        this.students = students;
    }

    @Override
    public HashMap<Long, Student> getAllStudents() {
       return students;
    }

    @Override
    public HashMap<Long, Student> getStudentIdToDelete() {
        return students;
    }


    
}
