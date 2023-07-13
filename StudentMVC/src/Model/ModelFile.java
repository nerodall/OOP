package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import Controller.iGetModel;

public class ModelFile implements iGetModel<HashMap<Long,Student>> {
    private String fileName;

    public ModelFile(String fileName) {
        this.fileName = fileName;

        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public HashMap<Long,Student> getAllStudents() {
        HashMap<Long,Student> students = new HashMap<Long,Student>();
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            Long i = (long) 1;
            while (line != null) {
                String[] param = line.split(" ");
                Student pers = new Student(param[1], Integer.parseInt(param[2]), Integer.parseInt(param[3]));
                students.put(i, pers);
                line = reader.readLine();
                i++;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return students;
    }

    public void saveAllStudentToFile(HashMap<Long,Student> students) {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            for (Entry<Long, Student> pers : students.entrySet()) {
                fw.write(pers.getKey() + " " + pers.getValue().getName() + " " + pers.getValue().getAge() + " " + pers.getValue().getId());
                fw.append('\n');
            }
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public HashMap<Long, Student> getStudentIdToDelete() {
       HashMap<Long, Student> students = getAllStudents();
        

       return students;
    }





}