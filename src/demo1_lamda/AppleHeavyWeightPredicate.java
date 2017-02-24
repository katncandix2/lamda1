package demo1_lamda;

/**
 * Created by ACER on 2017/2/21.
 * 实现我们的接口(筛选苹果重量)
 */
public class AppleHeavyWeightPredicate implements  ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return  apple.getWeight()>150;
    }
}
