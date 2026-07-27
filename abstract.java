
 abstract class Animal{
    abstract void sound();
void sleep(){    
    System.out.println("animal is sleeping");
    }
 }
    class Dog extends Animal{
        void sound(){
         System.out.println("Dog barks");    
        }
    }
    public class Main{
        public static void main(String[] args){
            Dog d=new Dog();
            d.sound();
            d.sleep();
        }
    }
