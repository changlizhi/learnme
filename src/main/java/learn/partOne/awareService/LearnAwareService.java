package learn.partOne.awareService;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by clz on 2017/1/16.
 */
@Service
public class LearnAwareService implements BeanNameAware, ResourceLoaderAware {
    private String beanName;
    private ResourceLoader loader;

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void outPutResult() {
        System.out.println("beanName=========" + beanName);
        Resource resource = loader.getResource("classpath:resource.txt");
        try {
            String txtStr = IOUtils.toString(resource.getInputStream(), "UTF-8");
            System.out.println("txtStr------------------" + txtStr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
