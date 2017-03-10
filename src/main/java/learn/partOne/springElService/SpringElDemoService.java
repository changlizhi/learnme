package learn.partOne.springElService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by clz on 2017/1/15.
 */
@Service
public class SpringElDemoService {
    @Value("SpringElDemoService自己注入的名称")
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
