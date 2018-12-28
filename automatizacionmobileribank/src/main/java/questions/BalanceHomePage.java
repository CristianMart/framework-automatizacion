package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterface.WindowHome;

public class BalanceHomePage implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return WindowHome.BOTON_SALDO.resolveFor(actor).isVisible();
    }

    public static BalanceHomePage isVisible() {
        return new BalanceHomePage();
    }

}
