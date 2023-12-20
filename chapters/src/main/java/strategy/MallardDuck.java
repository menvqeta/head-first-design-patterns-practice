package strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MallardDuck extends Duck {
    private static final Logger logger = LoggerFactory.getLogger(MallardDuck.class);

    public void display() {
        logger.info("Looks like a {}", MallardDuck.class.getCanonicalName());
    }
}
