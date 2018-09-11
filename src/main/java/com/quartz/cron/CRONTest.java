package com.quartz.cron;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

public class CRONTest {
    public static void main(String[] args) throws SchedulerException {

        //创建触发器
        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("tri1","group1").withSchedule(SimpleScheduleBuilder.repeatSecondlyForever(3)).build();
        //创建作业
        JobDetail jobDetail = JobBuilder.newJob(MyJob.class).build();
        //创建执行器
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        //设置定时任务
        scheduler.scheduleJob(jobDetail,trigger);
        //启动执行器
        scheduler.start();
    }
}
