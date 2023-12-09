
package MostrarFuncao;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class Mostrar implements Serializable {

    private int num1;
    private int num2;
    private int resultado;

    public void adicao() {
        resultado = num1 + num2;

    }

    public void subtracao() {
        resultado = num1 - num2;

    }

    public void multiplicacao() {
        resultado = num1 * num2;

    }

    public void divisao() {
        resultado = num1 / num2;

    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

}
