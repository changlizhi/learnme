package learn.partOne.learnTasks.taskService;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by clz on 2017/1/16.
 */
@Service
public class LearnAsyncTaskService {

    @Async
    public void executeAsyncTask(Integer i) {
        System.out.println("执行executeAsyncTask():--------------" + i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i) {
        System.out.println("执行executeAsyncTaskPlus():--------------" + (i + 1));
    }
}
