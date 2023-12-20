package strategy;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Duck {
    private static final Logger logger = LoggerFactory.getLogger(Duck.class);

    public void quack() {
        logger.info("Quack!!!");
    }

    public void swim() {
        logger.info("Swim!!!");
    }

    public abstract void display();
}
