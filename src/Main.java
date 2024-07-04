public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        Carro seuCarro = new Carro();

        Pessoa pessoa = new Pessoa();
        pessoa.nome = "João";
        meuCarro.fabricante = "Fiat";
        meuCarro.modelo = "Uno";
        meuCarro.cor = "Preto";
        meuCarro.anoFabricação = 2011;
        meuCarro.preço = 18000;
        meuCarro.proprietario = pessoa;

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Maria";
        seuCarro.fabricante = "Chevrolet";
        seuCarro.modelo = "Camaro";
        seuCarro.cor = "Vermelho";
        seuCarro.anoFabricação = 2020;
        seuCarro.preço = 23000;
        seuCarro.proprietario = pessoa1;

        meuCarro.imprimirResultado();
        seuCarro.imprimirResultado();
    }
}