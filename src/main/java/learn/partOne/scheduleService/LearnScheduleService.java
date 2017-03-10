package learn.partOne.scheduleService;

import org.joda.time.DateTime;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by clz on 2017/1/16.
 */
@Service
public class LearnScheduleService {
    @Scheduled(fixedRate = 5000L)
    public void reportCurrentTime() {
        DateTime time = new DateTime(new Date());
        System.out.println("每5秒执行一次" + time.getMillis());
    }

    @Scheduled(cron = "0/10 * * * * ?")
    public void fixTimeExecution() {
        DateTime time = new DateTime(new Date());
        System.out.println("指定cron表达式0/10 * * * * ?执行--" + time.getMillis());
    }
}
