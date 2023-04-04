public class questao04 {

    /*Para chegar ao resultado eu dividi a distancia total entre as cidades pela soma das velocidades
     dos dois veiculos para obter a velocidade que se aproximam um do outro : (100km) / (190km/hr) = 0,5263hrs. 
     Como os dois veículos estão se movendo em direção um ao outro, podemos considerar que o tempo que levam 
     para se encontrar é o mesmo para ambos. Portanto, a distância percorrida pelo carro é de 110 km/h x tempo, 
     e a distância percorrida pelo caminhão é de 80 km/h x tempo. Como ja obtive o tempo em que eles se cruzam 
     faço o calculo da distancia percorrida por cada um até o encontro, sendo para o carro: 110km/h x 0,5263h = 57,89km 
     e para o caminhão: 80km/h x 42,11km e com isso conclui que o carro está mais proximo de Ribeirão Preto porque o caminhão 
     percorre uma distância menor do que o carro antes de alcançar o ponto de cruzamento na rodovia.*/
     
    public static void main(String[] args) {
        final int distanciaRP_Franca = 100; 
        final int velocidadeCarro = 110; 
        final int velocidadeCaminhao = 80; 
        final double pedagioCaminhao = 0.083;
        
        double tempoCarro = (double) distanciaRP_Franca / (velocidadeCarro + velocidadeCaminhao);
        
        double tempoCaminhao = (double) distanciaRP_Franca / (velocidadeCaminhao + velocidadeCarro) + (2 * pedagioCaminhao);
        
        if (tempoCarro < tempoCaminhao) {
            System.out.println("O carro está mais próximo de Ribeirão Preto.");
        } else {
            System.out.println("O caminhão está mais próximo de Ribeirão Preto.");
        }
    }
}