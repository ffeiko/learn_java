package chap_02.Pattern;

/**
 * @author wangjingffei
 * @DESCRIPTION builder模式
 * @create 2018/3/12
 */
public class NutritionFacts {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public NutritionFacts(Builder builder) {

        servingSize = builder.servings;
        servings = builder.servings;
        calories = builder.servings;
        fat = builder.servings;
        sodium = builder.servings;
        carbohydrate = builder.servings;


    }

    //静态内部类
    public static class Builder {
        //Required paramerters
        private final int servingSize;
        private final int servings;

        //Optional paramerters - initialized to default values
        private int calories = 0;
        private int fat = 0;
        private int carbohydrate = 0;
        private int sodium = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }

    }


}
