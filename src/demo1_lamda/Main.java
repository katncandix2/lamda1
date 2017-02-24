package demo1_lamda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ACER on 2017/2/21.
 * 在使用lamda表达式之前我们若使用Thread开启一个新的线程
 * Thread thread1 = new Thread(new Runnable() {
 *    //@Override
        public void run() {
            System.out.print("hello");
        }
    });
   使用lamda表达式来开启thread2
        Thread thread2 = new Thread(()->System.out.print("hello"));
 */
public class Main {

    //具体的筛选实现
    public static List<Apple> filterApples(List<Apple> inventory , ApplePredicate predicate){
        List<Apple> result = new ArrayList<>();
        for (Apple apple:inventory){
            if (predicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }


    public  static  void main(String []args){
        //模拟数据集
        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple("red",140));
        inventory.add(new Apple("black",160));
        inventory.add(new Apple("red",160));
        inventory.add(new Apple("red",180));

        //在谓词中使用lamda表达式
        List<Apple> redApples = filterApples(inventory,(Apple apple)->"red".equals(apple.getColor()));
        for(Apple apple:redApples){
            System.out.print(apple.getColor()+apple.getWeight()+apple);
        }

    }
}
