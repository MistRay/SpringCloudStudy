package com.example.multithreading.async;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author MistLight
 * @create 2018-04-27 19:55
 * @desc
 * ThreadPoolTaskExecutor与ThreadPoolExecutor的使用方式基本相同
 * 但ThreadPoolTaskExecutor是spring提供的
 */
@Component
public class AsyncExecutor {
    @Bean("taskExecutor")
    public Executor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        // 设置核心线程数
        executor.setCorePoolSize(10);
        // 最大线程数
        executor.setMaxPoolSize(20);
        // 队列大小
        executor.setQueueCapacity(200);
        // 控线线程存活超过这个时间就会被回收
        executor.setKeepAliveSeconds(60);
        // 设置线程名称头
        executor.setThreadNamePrefix("taskExecutor-");
        // 任务执行失败的执行策略
        // ThreadPoolExecutor.AbortPolicy：表示拒绝任务并抛出异常
        // ThreadPoolExecutor.DiscardPolicy：表示拒绝任务但不做任何动作
        // ThreadPoolExecutor.CallerRunsPolicy：表示拒绝任务，并在调用者的线程中直接执行该任务
        // ThreadPoolExecutor.DiscardOldestPolicy：表示先丢弃任务队列中的第一个任务，然后把这个任务加进队列。
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        return  executor;
    }

}
