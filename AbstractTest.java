import java.util.Scanner;
abstract class Animal{
	private String name;
	private int age;
	public Animal(){}
	public Animal(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String getName(){
		return name;

	}
	public void setName(String name){
		this.name = name;

	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public abstract void eat();

}
class Cat extends Animal{
	public Cat(){};
	public Cat (String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("猫吃鱼");
	}
	

}
class Dog extends Animal{
	public Dog(){};
	public Dog(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("狗吃肉");
	}

}	



class AbstractTest{
	public static void main(String[] args){
		Dog d = new Dog();
		d.setName("笨笨");
		d.setAge(12);
		System.out.println(d.getName()+"---"+d.getAge());
		d.eat();
		Dog d2 = new Dog("笨笨",12);
		System.out.println(d2.getName()+"---"+d2.getAge());
		d2.eat();
		System.out.println("-----------------------------------");
		Animal a = new Dog();
		a.setName("笨笨");
		a.setAge(12);
		System.out.println(a.getName()+"---"+a.getAge());
		Cat c = new Cat();
		c.setName("狸猫");
		c.setAge(6);
		System.out.println(c.getName()+"---"+c.getAge());
		Animal a1 = new Cat();
		a.setName("狸猫");
		a.setAge(6);
		System.out.println(a.getName()+"---"+a.getAge());
		a1.eat();

		System.out.println("测试冲突222222");
		

	}
}
