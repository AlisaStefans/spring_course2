package aop.spring_introduction;

public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat is created");
    }

    @Override
    public void say() {
        System.out.println("Mew-Mew");
    }
}
