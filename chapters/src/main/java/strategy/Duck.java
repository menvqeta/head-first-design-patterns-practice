package strategy;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Duck {
    private static final Logger logger = LoggerFactory.getLogger(Duck.class);

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() {
        logger.info("Swim!!!");
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public abstract void display();
}
