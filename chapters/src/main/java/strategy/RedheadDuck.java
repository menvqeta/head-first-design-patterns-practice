package strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RedheadDuck extends Duck {
    private static final Logger logger = LoggerFactory.getLogger(RedheadDuck.class);

    public void display() {
        logger.info("Looks like a {}", RedheadDuck.class.getCanonicalName());
    }
}
