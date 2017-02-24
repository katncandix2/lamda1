package demo1_lamda;

/**
 * Created by ACER on 2017/2/21.
 * 方法谓词用于根据不同要求筛选苹果
 * 1.根据颜色筛选
 * 2.根据重量筛选
 * 3.....
 * 引入谓词的这一概念是为了，只需要向方法中传达这一结果即可，而非根据需求不同
 * 在我们的方法中加入过多参数，亦防止编写过多冗余且不必要的代码比如这样:
 *
 * 1.筛选队列中重量大于weight的苹果
 *   boolean isWeightApple(Queue<Apple> queue, int weight){
        for (Apple apple:queue ){
            if (apple.getWeight()>weight) {
                    //some code

                }
            }
        }
 *2.筛选队列中颜色与color等同的苹果
    boolean isRedApple(Queue<Apple> queue,String color){
        for (Apple apple:queue ){
            if (apple.getColor().equals(color)) {
                //some code
                }
             }
        }

 我们的apple Bean 设计的足够简单而需求也仅是筛选重量和颜色，我们却为此无谓的书写了大量的冗余的代码
 仅仅是修改方法中的比较规则，而引入谓词(即传递的参数不再是具体的int String 诸如此类的具体类型而是借口则能
 用很优雅的方式来解决此问题
 */


public interface ApplePredicate {
    boolean test(Apple apple);

}
