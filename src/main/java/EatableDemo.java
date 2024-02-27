public class EatableDemo {
    public static void main(String[] args) {
//这个lambda有点类似接口实现类
        useEateble((int a,int b)->{
           return a+b;
        });
    }
//lambda练习，只需要接口和这个类，不需要接口实现类
    public static void useEateble(Eatable a) {
        int sum=a.add(10,14);
        System.out.println(sum);
    }
}
