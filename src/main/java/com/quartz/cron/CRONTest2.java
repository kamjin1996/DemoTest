package com.quartz.cron;

import org.junit.Test;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;


public class CRONTest2 {
    @Test
    public void test1() throws SchedulerException, InterruptedException {
        //创建触发器
        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("tri2","gro2").withSchedule(SimpleScheduleBuilder.repeatSecondlyForTotalCount(7,2)).build();
        //创建执行器
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        //创建作业
        JobDetail jobDetail = JobBuilder.newJob(MyJob.class).build();
        //设置启动器
        scheduler.scheduleJob(jobDetail,trigger);
        //启动执行器
        scheduler.start();

        //test和main函数不同，需要使用sleep来实现任务调度的测试
        Thread.sleep(10000);
    }
    @Test
    public void test2() throws SchedulerException, InterruptedException {
        //创建触发器
        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("tri3","gro3").withSchedule(CalendarIntervalScheduleBuilder.calendarIntervalSchedule().withIntervalInSeconds(3)).startNow().build();
        //创建作业
        JobDetail jobDetail = JobBuilder.newJob(MyJob.class).build();
        //创建执行器
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        //设置执行器
        scheduler.scheduleJob(jobDetail,trigger);
        //启动执行器
        scheduler.start();

        Thread.sleep(10000);
    }

    @Test
    public void test3() throws Exception {
        //创建触发器
        //秒 分 时 天 月 周 年
        //0/3 * * * * ?
        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("tri4","gro4").withSchedule(CronScheduleBuilder.cronSchedule("0/3 * * * * ?")).build();
        //创建作业
        JobDetail jobDetail = JobBuilder.newJob(MyJob.class).build();
        //创建执行器
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        //设置执行器
        scheduler.scheduleJob(jobDetail,trigger);
        //启动执行器
        scheduler.start();

        Thread.sleep(10000);
    }
}
