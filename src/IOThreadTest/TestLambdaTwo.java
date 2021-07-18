package IOThreadTest;

public class TestLambdaTwo {
    public static void main(String[] args) {
        Ilove ilove=null;
        ilove=new Love();
        //lambda表达式
        ilove=(int a)->{
            System.out.println("我爱你"+a);
        };
        //简化参数类型
        ilove=(a)->{
            System.out.println("我爱你"+a);
        };
        //简化 小括号
        ilove=a -> {
            System.out.println("我爱你"+a);
        };
        //简化大括号
        ilove=a -> System.out.println("我爱你"+a);
        /*
        * 总结:
        * lambda表达式只能在只有一行代码的情况下才能简化大括号，如果代码块里有多行代码，不能简化大括号
        *前提必须是函数式接口
        * 多个参数可以去掉参数类型，要去掉就都去掉 必须加上小括号
        *
        * */
        ilove.love(520);

    }
}
interface  Ilove{
    void love(int a);
}
class Love implements  Ilove{
    @Override
    public void love(int a) {
        System.out.println("我爱你"+a);
    }
}