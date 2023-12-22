package strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModelDuck extends Duck {
    private static final Logger logger = LoggerFactory.getLogger(ModelDuck.class);


    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }
    public void display() {
        logger.info("Model duck");
    }
}
