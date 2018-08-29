import java.util.*;
class Animal
{
public void breed()
{
System.out.println("i m eating");
}
public void colour()
{
System.out.println("my colour is brown");
}
public void speak()
{
System.out.println("i am hungry");
}
}
class Dog extends Animal
{
public void show()
{
System.out.println("i am dog");
}
}
class Cat extends Animal
{
public void show()
{
System.out.println("i am cat");
}
}
public class Function
{
public static void main(String[] x)
{
Dog d=new Dog();
Cat c=new Cat();
d.breed();
d.colour();
d.speak();
d.show();
c.breed();
c.colour();
c.speak();
c.show();
}
}