package testlearn;

import learn.partOne.controller.FunctionController;
import learn.partOne.javaconfig.LearnConfig;
import learn.partOne.jpaRepository.PersonRepository;
import learn.partOne.jpaRepositorySecond.PersonSecondRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by clz on 2017/1/14.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = LearnConfig.class)
public class Main {

    @Autowired
    private FunctionController functionController;
    @Autowired
    private Environment environment;
    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PersonSecondRepository secondRepository;

    @Test
    public void testFunctionConfig() {
        String str = functionController.sayString("yannuo,");
        System.out.println(str);
    }

    @Test
    public void testJpaRepo() {
        System.out.println("environment-------" + environment);
        personRepository.findByCodeAndName("clz", "clz");
        secondRepository.findByName("clz");
    }
}
