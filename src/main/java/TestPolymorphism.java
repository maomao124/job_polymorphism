/**
 * Project name(项目名称)：作业 多态
 * Package(包名): PACKAGE_NAME
 * Class(类名): TestPolymorphism
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/12
 * Time(创建时间)： 20:59
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class TestPolymorphism
{
    public static void main(String[] args)
    {
        // 以多态方式分别实例化子类对象并调用eat()方法
        /********* begin *********/
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal lion = new Lion();
        dog.eat();
        cat.eat();
        lion.eat();
        /********* end *********/
    }
}

// Animal类中定义eat()方法
class Animal
{
    /********* begin *********/
    public void eat()
    {

    }
    /********* end *********/
}

// Dog类继承Animal类 复写eat()方法
class Dog extends Animal
{
    /********* begin *********/
    public void eat()
    {
        System.out.println("eating bread...");
    }
    /********* end *********/
}

// Cat类继承Animal类 复写eat()方法
class Cat extends Animal
{
    /********* begin *********/
    public void eat()
    {
        System.out.println("eating rat...");
    }
    /********* end *********/
}

// Lion类继承Animal类 复写eat()方法
class Lion extends Animal
{
    /********* begin *********/
    public void eat()
    {
        System.out.println("eating meat...");
    }
    /********* end *********/
}

