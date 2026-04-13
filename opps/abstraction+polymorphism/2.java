interface Animal{
    void makeSound();
    void move();
}
class Dog implements Animal{
    
    public void makeSound(){
        System.out.println("Dog is barking");
    }
    public void move(){
        System.out.println("Dog is moving");
    }
}

class Bird implements Animal{
    
    public void makeSound(){
        System.out.println("Bird is making sound");
    }
    public void move(){
        System.out.println("Bird is moving");
    }
}

class Fish implements Animal{
    
    public void makeSound(){
        System.out.println("Fish is making sound");
    }
    public void move(){
        System.out.println("Fish is moving");
    }
}
class AnimalHandler{
    
    public void handler(Animal a){
        a.makeSound();
        a.move();
    }
}
class Main {
    public static void main(String[] args) {
        AnimalHandler a=new AnimalHandler();
        a.handler(new Dog());
        a.handler(new Bird());
        a.handler(new Fish());
    }
}