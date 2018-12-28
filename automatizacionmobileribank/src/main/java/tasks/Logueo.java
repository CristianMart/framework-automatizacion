package tasks;

import model.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.WindowLogin;

import java.util.List;

public class Logueo implements Task {

    private List<Usuario> data;

    public Logueo(List<Usuario> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
           actor.attemptsTo(Enter.theValue(data.get(0).getUser()).into(WindowLogin.CAMPO_USUARIO));
           actor.attemptsTo(Enter.theValue(data.get(0).getPass()).into(WindowLogin.CAMPO_CLAVE));
           actor.attemptsTo(Click.on(WindowLogin.BOTON_LOGIN));
    }

    public static Logueo inEribank(List<Usuario> data) {

        return Tasks.instrumented(Logueo.class, data);
    }
}
