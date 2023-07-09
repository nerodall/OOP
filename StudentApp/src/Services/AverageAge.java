package Services;

import java.util.ArrayList;

import Domen.Person;

public class AverageAge<T extends Person> {
    private ArrayList<T> list;
  //  private String listName;

    public AverageAge(/*ArrayList<T> list , String listName*/) {
    //    this.list = list;
     //   this.listName = listName;
    }

    public double getAvgAge(ArrayList<T> list) {
        double result = 0.0;
        for (T item : list) {
            result += item.getAge();
        }
        result = result / list.size();
        return result;
    }
}
