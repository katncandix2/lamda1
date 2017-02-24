package demo1_lamda;

/**
 * Created by ACER on 2017/2/21.
 */
public class AppleRedAndHeavyPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return "red".equals(apple.getColor())&&apple.getWeight()>150;
    }
}
