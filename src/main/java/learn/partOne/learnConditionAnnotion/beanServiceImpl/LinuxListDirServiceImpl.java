package learn.partOne.learnConditionAnnotion.beanServiceImpl;

import learn.partOne.learnConditionAnnotion.beanService.ListDirService;

/**
 * Created by clz on 2017/1/16.
 */
public class LinuxListDirServiceImpl implements ListDirService {
    @Override
    public String getDirCmd() {
        return "ls";
    }
}
