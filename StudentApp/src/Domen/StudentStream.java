package Domen;
import java.util.Iterator;
import java.util.List;
/**
 * Класс описыващий поведение для Потока студентов
 */
public class StudentStream implements Iterable<StudentGroup> {
    public List<StudentGroup> streamGroups;
    private Integer streamId;
/**
 * Конструктор для потока студентов
 * @param streamGroups Поток студентов. Принимает List состоящий из StudentGroup
 * @param streamId id Потока
 */
    public StudentStream(List<StudentGroup> streamGroups,Integer streamId) {
        this.streamGroups = streamGroups;
        this.streamId=streamId;
    }

    public List<StudentGroup> getStreamGroups() {
        return streamGroups;
    }

    public void setStreamGroups(List<StudentGroup> streamGroups) {
        this.streamGroups = streamGroups;
    }

    public Integer getStreamId() {
        return streamId;
    }

    public void setStreamId(Integer streamId) {
        this.streamId = streamId;
    }

    @Override
    public String toString() {
        return "Номер потока - " + getStreamId() + "\nКоличество групп - " + streamGroups.size() + "\nСписок студентов" + streamGroups.toString();
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int counter;

            @Override
            public boolean hasNext() {

                if (counter < streamGroups.size()) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public StudentGroup next() {
                return streamGroups.get(counter++);
            }
        };
    }


}
