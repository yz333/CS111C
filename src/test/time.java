package test;

public class time {
    private float hour;
    private float minute;
    private float second;
    private float tree;


    public time(float hr, float min, float sec)
    {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public gethour()
    {
        return hour;
    }
    public sethour(float hr)
    {
        if ( 0 <= hour < 24)
            hour = hr;
    }

    public getminute()
    {
        return minute;
    }
    public setmin(float min)
    {
        if ( 0 <= minute < 60)
            minute = min;
    }

    public getsecond()
    {
        return second;
    }
    public setsecond(float sec)
    {
        if ( 0 <= second < 60)
            second = sec;
    }


    public static void addHour(float hr)
    {

        hour += hr;
        int temp = hour;
        int overtime = 0;

        if (temp>24)
        {
            hour = temp - 24;
            overtime ++;
        }


    }
    public static void addMinute(float min)
    {
        minute += min;
        int temp = minute;


        if (temp>60)
        {
            minute = temp - 60;
            hour ++;
        }




    }
    public static void addSecond(float sec)
    {
        second += sec;
        int temp = second;


        if (temp>60)
        {
            second = temp - 60;
            minute ++;
        }

    }
