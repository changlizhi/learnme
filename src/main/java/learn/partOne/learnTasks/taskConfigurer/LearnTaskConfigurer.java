package learn.partOne.learnTasks.taskConfigurer;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executor;

/**
 * Created by clz on 2017/1/16.
 */
@EnableAsync
@Component
public class LearnTaskConfigurer implements AsyncConfigurer {
    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor ret = new ThreadPoolTaskExecutor();
        ret.setCorePoolSize(5);
        ret.setMaxPoolSize(20);
        ret.setQueueCapacity(25);
        ret.initialize();
        return ret;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}
