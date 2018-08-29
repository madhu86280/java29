abstract class Vehical
{
abstract void start();
public void stop()
{
System.out.println("stopping vehichal in abstract class");
}
}
class Twowheeler extends Vehical
{
public void start()
{
System.out.println("Starting two wheelers");
}
}
class Fourwheeler extends Vehical
{
public void start()
{
System.out.println("starting four wheeler");
}
}
class Inheritance
{
public static void main(String[] x)
{
Vehical a=new Twowheeler();
Vehical b=new Fourwheeler();
a.start();
a.stop();
b.start();
b.stop();
}
}