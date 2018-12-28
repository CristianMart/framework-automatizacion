package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class WindowLogin {

    public static final Target CAMPO_USUARIO = Target.the("Campo de usuario")
            .located(By.id("com.experitest.ExperiBank:id/usernameTextField"));

    public static final Target CAMPO_CLAVE = Target.the("Campo de clave")
            .located(By.id("com.experitest.ExperiBank:id/passwordTextField"));

    public static final Target BOTON_LOGIN  = Target.the("Botón de login")
            .located(By.id("com.experitest.ExperiBank:id/loginButton"));

}
