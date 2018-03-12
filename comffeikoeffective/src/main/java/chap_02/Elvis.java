package chap_02;

/**
 * @author wangjingffei
 * @DESCRIPTION
 * @create 2018/3/12
 */
public class Elvis {
    private static final Elvis INSTANCE = new Elvis();
    private Elvis(){}
    public static Elvis getInstance() { return INSTANCE;}
    public  void leaveTheBuilding(){}
}
