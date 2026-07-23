class mygrandpa {
    void display(){
    System.out.println("my grandfather is a farmer.");
    }
}
class mydaddy extends mygrandpa{
    void show(){
    System.out.println("my father is a business man");
    }
}
class me extends mydaddy{
    void display1(){
    System.out.println("I am a student");   
    }
}
public class Main{
    public static void main(String[]args){
    me obj=new me();
    obj.display();
    obj.show();
    obj.display1();
    }
}
