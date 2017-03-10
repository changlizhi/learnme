package learn.partOne.model;

import javax.persistence.*;

/**
 * Created by clz on 2017/1/14.
 */
@Entity
@Table(name = "person")
public class PersonSecond {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String code;
    private int flag;
    private String source;

    public PersonSecond(String name, String code, int flag, String source) {
        this.name = name;
        this.code = code;
        this.flag = flag;
        this.source = source;
    }

    public PersonSecond() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
