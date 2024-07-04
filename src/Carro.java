public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int anoFabricação;
    Pessoa proprietario;
    float preço;


    double IPVA(){
        if (tempoDeuso() < 10){
            return preço * 0.04;
        } else {
            System.out.println("Não precisa ser pago o IPVA");
        }
        return 0;
    }

    int tempoDeuso() {
        int tempoDeUso = 2024 - anoFabricação;

        if (tempoDeUso == 0){
            tempoDeUso = 0;
        }

        return tempoDeUso;
    }
    double CalcularValorRevenda(){
        int tempoDeUso = tempoDeuso();
        double ValordeRevenda = (preço / 20) * (20 - tempoDeUso);

        return ValordeRevenda;
    }

    void imprimirResultado(){
        System.out.println("Meu carro é " + fabricante + " " + modelo + " e custa R$ " + preço + "meu carro tem o dono: " + proprietario.nome);
        System.out.println("Valor de revenda: " + CalcularValorRevenda());
        System.out.println("Tempo de uso: " + tempoDeuso() + " anos");
        System.out.println("IPVA: R$ " + IPVA());
    }
}
