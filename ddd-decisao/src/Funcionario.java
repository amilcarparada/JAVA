public class Funcionario { // abre classe
    String nome;
    String cargo;
    double salario;

    // ESTRUTURA DECISÃO SIMPLES
    public double calcularBonus() { // abre metodo
        if (salario > 5000) { // abre if
            return salario * 0.05;
        } //fecha if
        return 0;
    } // fecha metodo

    // ESTRUTURA DECISÃO COMPLETA
    public double calcularGratificacao() { // abre metodo
        if (cargo .equalsIgnoreCase("Vendedor")) { // abre if
            return salario * 0.05;
        } // fecha if
        else{ // abre else
            return 500;
        } // fecha else
    } // fecha metodo

    // ESTRUTURA DECISÃO ENCADEADA
    public double calcularIRPF() { // abre metodo
        double salarioFinal = salario + calcularBonus() + calcularGratificacao();
        if (salarioFinal <= 2259){ // abre if
            return 0;} // fecha if
        else  if (salarioFinal < 5000){ // abre else
                return salarioFinal * 0.075;} // fecha else
        else if (salarioFinal < 10000){ // abre else
                    return salarioFinal * 0.125;} // fecha else
        else { // abre else
            return salarioFinal * 0.275;} // fecha else

    } // fecha metodo

    // OPERADORES LÓGICOS: ! é não, && é e, || é ou

} // fecha classe
