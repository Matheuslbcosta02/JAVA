public class Main{
    public static void main(String[] args){

        //construindo um objeto da classe Carro
        Carro fusca = new Carro();
        fusca.ano = 1980;
        fusca.cor = "verde";
        fusca.marca = "Gol";
        fusca.modelo = "fusca";

        System.out.println(fusca.ano);
        System.out.println(fusca.cor);
        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);

        //mostrando a posição na memória que esse objeto foi criado
        System.out.println(fusca);
    }
}