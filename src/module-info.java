module app.financeiro {

    requires java.base;  //por padraão
    // requires app.calculo;

    requires app.api;
    uses br.com.stefany.app.Calculadora;

}