package strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RubberDuck extends Duck {
    private static final Logger logger = LoggerFactory.getLogger(RubberDuck.class);

    public void display() {
        logger.info("Rubber Duck !!!");
    }

    @Override
    public void performQuack() {
        logger.info("Squeak");
    }


}
