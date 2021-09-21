package InHeritance;
class Animal {
    void eat() {
        System.out.println("Parent Animal");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println(" Animal dog sounds barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Animal cat sounds meow");
    }
}

class HybridInheritance {
    public static void main(String args[]) {
        Cat c = new Cat();
        c.meow();
        c.eat();
        Dog d = new Dog();
        d.bark();;
        d.eat();
        // c.bark(); //C.T.Error
    }
}
