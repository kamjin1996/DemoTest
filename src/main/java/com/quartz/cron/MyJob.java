package com.quartz.cron;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class MyJob implements Job {
    private static int i = 0;
    //将要执行的job要写在这里
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        i++;
        System.out.println("(" + i + ")" + "hello Q------------>  " + System.currentTimeMillis() / 1000);

    }
}
