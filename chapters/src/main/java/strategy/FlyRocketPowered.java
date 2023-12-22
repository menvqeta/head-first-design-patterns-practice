package strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlyRocketPowered implements FlyBehaviour {
    private static final Logger logger = LoggerFactory.getLogger(FlyRocketPowered.class);

    @Override
    public void fly() {
        logger.info("Rocket fly");
    }
}
