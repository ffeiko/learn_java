package chap_08;

import java.util.Set;

/**
 * @author wangjingffei
 * @DESCRIPTION
 * @create 2018/3/13
 */
public class Test {
    public static void main(String[] args) {
        Class<?> cl = null;
        try {
            cl = Class.forName(args[1]);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //Instantiate teh class
        try {
            Set<String> s = null;
            s = (Set <String>) cl.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
