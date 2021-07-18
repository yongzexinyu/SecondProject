package IOThreadTest;
//推导lambda表达式
public class TestLambda {
    //2.静态内部类
   static class Like1 implements  Ilike{
        @Override
        public void like() {
            System.out.println("我喜欢你1");
        }
    }

    public static void main(String[] args) {
        Ilike ilike=new Like();
        ilike.like();
        Ilike ilike1=new Like1();
        ilike1.like();
        //局部内部类
        class Like2 implements  Ilike{
            @Override
            public void like() {
                System.out.println("我喜欢你2");
            }
        }
        //匿名内部类 没有类的名称 必须借助接口或者父类
        Ilike ilike2=new Like2();
        ilike2.like();
        Ilike like= new Ilike(){
           @Override
           public void like() {
               System.out.println("我喜欢你3");
           }
       };
      like.like();
      //lambda表达式
        Ilike ilike3=()-> {
            System.out.println("我喜欢你4");
        };
        ilike3.like();

    }


}
//定义函数式接口
interface Ilike{
    void like();
}
//1.实现类
class Like implements  Ilike{
    @Override
    public void like() {
        System.out.println("我喜欢你");
    }
}