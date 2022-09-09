package Assignment0;
public class HelloWorld implements HelloWorld_Interface {

public static void main(String args[]){
    System.out.println(say_it());
    System.out.println("hello world");
}


  public HelloWorld ( ) {
  }

public String say_it() {
	return "hello world";
}

public String say_it_loud() {
	return "HELLO WORLD";
}
  

}