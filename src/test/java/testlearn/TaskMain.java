package testlearn;

import learn.partOne.javaconfig.LearnTaskConfig;
import learn.partOne.learnTasks.taskService.LearnAsyncTaskService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by clz on 2017/1/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {LearnTaskConfig.class})
public class TaskMain {

    @Autowired
    private LearnAsyncTaskService service;

    @Test
    public void testTask() {
        for (int i = 0; i < 30; i++) {
            service.executeAsyncTask(i);
            service.executeAsyncTaskPlus(i);
        }
    }
}
