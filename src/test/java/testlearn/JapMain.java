package testlearn;

import learn.partOne.javaconfig.JpaConfigPrimary;
import learn.partOne.javaconfig.JpaConfigSecond;
import learn.partOne.jpaRepository.PersonRepository;
import learn.partOne.jpaRepositorySecond.PersonSecondRepository;
import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by clz on 2017/2/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {JpaConfigPrimary.class, JpaConfigSecond.class})
public class JapMain {
    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PersonSecondRepository personSecondRepository;

    @Test
    public void testJpa() {
        personRepository.findByName("clz");
        personSecondRepository.findByName("clz");
    }

    @Test
    public void testJodaTime() {
        DateTime dateTime = new DateTime();
        System.out.println(dateTime.plusDays(100).toString("E MM/dd/yyyy HH:mm:ss.SSS"));

    }
}
