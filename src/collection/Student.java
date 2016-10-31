package collection;

import java.util.Date;

/**
 * Created by hzq on 16-10-31.
 */
public class Student extends Object {
    private Integer id;
    private String name;
    private Date date;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        return name.equals(student.name);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        return result;
    }
}
