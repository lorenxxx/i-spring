package com.us.improve.spring.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by Loren on 2018/10/29.
 */
@Service
public class AsyncTaskService {

    @Async
    public void executeAsyncTask(Integer i) {
        System.out.println("[" + Thread.currentThread() + "]执行异步任务：" + i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i) {
        System.out.println("[" + Thread.currentThread() + "]执行异步任务Plus：" + (i + 1));
    }

}
