package demo1_lamda;

/**
 * Created by ACER on 2017/2/21.
 * 简单的apple Bean
 * 拥有仅拥有getter setter方法
 */
public class Apple {
    private  String color;
    private  int Weight;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public Apple(String color, int weight) {
        this.color = color;
        Weight = weight;
    }
}
