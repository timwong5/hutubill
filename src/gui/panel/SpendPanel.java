package gui.panel;

import javax.swing.*;

public class SpendPanel {
    //私有化构造方法使得该类无法在外部通过new 进行实例化
    private SpendPanel(){
    }
    public static SpendPanel instance;

    //the labels of spend panel
    JLabel lMonthSpend = new JLabel("本月消费");
    JLabel lTodaySpend = new JLabel("今日消费");
    JLabel lAvgSpendPerDay = new JLabel("日均消费");
    JLabel lMonthLeft = new JLabel("本月剩余");
    JLabel lDayAvgAvailable = new JLabel("日均可用");
    JLabel lMonthLeftDay = new JLabel("距离月末");

    JLabel vMonthSpend = new JLabel("￥2300");
    JLabel vTodaySpend = new JLabel("￥25");
    JLabel vAvgSpendPerDay = new JLabel("￥120");
    JLabel vMonthAvailable = new JLabel("￥2084");
    JLabel vDayAvgAvailable = new JLabel("￥389");
    JLabel vMonthLeftDay = new JLabel("15天");

    //public static 方法，返回实例对象
    public static SpendPanel getInstance(){
        //第一次访问的时候，发现instance没有指向任何对象，这时实例化一个对象
        if(null==instance){
            instance = new SpendPanel();
        }
        //返回 instance指向的对象
        return instance;
    }
}
