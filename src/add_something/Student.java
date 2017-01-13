package add_something;

/**
 * Created by hzq on 17-1-11.
 */
public class Student {
    /**
     * 年龄
     */
    private int age;
    /**
     * 学员ID
     */
    private int id;

    /**
     * 男性 静态常量
     */
    public final static int MALE = 0;
    /**
     * 女性
     */
    public final static int FEMALE = 1;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            //处理代码
        }
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        //校验id是否合法的代码
        this.id = id;
    }

    //构造方法，初始化age，id
    public Student(int age, int id) {
        this.age = age;
        this.id = id;
    }
}
