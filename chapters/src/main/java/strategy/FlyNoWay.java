package strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlyNoWay implements FlyBehaviour {
    private static final Logger logger = LoggerFactory.getLogger(FlyNoWay.class);

    @Override
    public void fly() {
        logger.info("Do nothing.");
    }

}
