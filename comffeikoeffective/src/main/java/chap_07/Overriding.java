package chap_07;

/**
 * @author wangjingffei
 * @DESCRIPTION
 * @create 2018/3/13
 */
public class Overriding {
    public static void main(String[] args) {
        Wine[] wines = {
                new Wine(), new SparklingWine(), new Champagne()
        };
        for (Wine wine : wines) {
            System.out.println(wine.name());
        }
    }
}
