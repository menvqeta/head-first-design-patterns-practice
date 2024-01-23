package factory;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    public void prepare() {
        log.info("Preparing: {}", name);
        log.info("Tossing dough: {}", dough);
        log.info("Adding sauce: {}", sauce);
        log.info("Adding toppings: ");
        for(String topping: toppings) {
            log.info(" {}", topping);
        }
    }

    public void bake() {
        log.info("Bake for 25 minutes at 350");
    }

    public void cut() {
        log.info("Cutting the pizza into diagonal slices");
    }

    public void box() {
        log.info("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
