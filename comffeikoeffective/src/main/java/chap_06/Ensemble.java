package chap_06;

/**
 * @author wangjingffei
 * @DESCRIPTION
 * @create 2018/3/13
 */
public enum Ensemble {
    SOLE, DUET, TRIO, QUARTET, QUINTET,
    SEXTET, SEPTET, OCTET, NONET, DECTET;

    public int numberOfMusicians() {
        return ordinal() + 1;
    }
}
