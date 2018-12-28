package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WindowHome {

    public static final Target BOTON_SALDO = Target.the("Botón saldo")
            .located(By.id("com.experitest.ExperiBank:id/makePaymentButton"));

}
