package com.ffeiko.enums;

import java.util.EnumSet;

/**
 * Created by Administrator on 2017/7/6.
 */
public class test3 {
    public static void main(String[] args) {
        System.out.println("EnumTest.FRI 的 value = " + EnumTest.FRI.getValue());

        for(enum1 day : EnumSet.range(enum1.MON, enum1.FRI)) {
            System.out.println(day);
        }
        System.out.println("===================================");
        EnumSet<enum1> subset = EnumSet.of(enum1.MON ,enum1.FRI);
        for (enum1 day : subset) {
            System.out.println(day);
        }

        // 定义一个 EnumMap 对象，映射表主键是日期枚举类型，值是颜色枚举类型
//        private static Map<WeekDayEnum, RainbowColor> schema = new EnumMap<WeekDayEnum, RainbowColor>(WeekDayEnum.class);
//    
//        static{
//       // 将一周的每一天与彩虹的某一种色彩映射起来
//       for (int i = 0; i < WeekDayEnum.values().length; i++) {
//           schema.put(WeekDayEnum.values()[i], RainbowColor.values()[i]);
//       }
//        }
//        System.out.println("What is the lucky color today?");
//        System.out.println("It's " + schema.get(WeekDayEnum.Sat));

    }
}