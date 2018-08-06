package designPatterns.builder.singleton;


public class Singleton2 {

   private Singleton2(){

   }

   //此处使用一个内部类来维护单例
   private static class SingletonFactory{
       private static Singleton2 singleton2 = new Singleton2();
   }

   private static Singleton2 getInstance(){
       return SingletonFactory.singleton2;
   }

   //如果该对象被用于实例化，可以保证对象在序列化前后保持一致
   public Object readResolve(){
       return getInstance();
   }


}
