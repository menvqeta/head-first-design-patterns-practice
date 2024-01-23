package decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StarbuzzCoffee {

    public static final String LOG_FORMAT = "{} ${}";

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        log.info(LOG_FORMAT, beverage.getDescription(), beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        log.info(LOG_FORMAT, beverage2.getDescription(), beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        log.info(LOG_FORMAT, beverage3.getDescription(), beverage3.cost());


    }

}
