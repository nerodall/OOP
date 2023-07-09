package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.Emploee;
import Domen.Person;

public class EmploeeService implements iPersonService<Emploee<Person>> {
        private int count;
    private List<Emploee<Person>> emploees;
    public EmploeeService() {
        this.emploees = new ArrayList<Emploee<Person>>();
    }
    @Override
    public List<Emploee<Person>> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }
    @Override
    public void create(String firstName, int age) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }    
}