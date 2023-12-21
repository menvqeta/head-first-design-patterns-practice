package strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlyWithWings implements FlyBehaviour {
    private static final Logger logger = LoggerFactory.getLogger(FlyWithWings.class);

    @Override
    public void fly() {
        logger.info("Fly");
    }
}
