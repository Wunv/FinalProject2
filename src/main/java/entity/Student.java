package entity;

import java.io.Serializable;

/**
 * @author wunu
 * @create 2020-06-04 22:18
 * 描述:
 */
public class Student implements Serializable {

    private static final long serialVersionUID = -4392658638228508589L;

    private String  id;     // 学号
    private String name;    // 姓名
    private String major;   // 专业
    private String isbn;    // 书条码

    public Student() {
    }

    public Student(String id, String name, String major, String isbn) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.isbn = isbn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
