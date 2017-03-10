package learn.partTwo.springMVC.model;

/**
 * Created by clz on 2017/1/12.
 */
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {

        return id;
    }

    public String getContent() {
        return content;
    }
}
