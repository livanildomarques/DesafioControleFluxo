import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println(e.getMessage());
			
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;
        if (contagem>0){//se o parametro um for maior que o parametro 2, o resultado da subtração será negativo, logo será 'false'
            for (int contador=1; contador <= contagem; contador++){
                System.out.println("Imprimindo o número: "+contador);
            }
        } else {
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
        }
		//realizar o for para imprimir os números com base na variável contagem
	}
}
