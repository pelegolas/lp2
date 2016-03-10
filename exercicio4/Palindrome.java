public class Palindrome{
	public static void main(String[] args){
		String entrada = args[0];		
		String fim;
		String teste = entrada;
		fim = teste;
		int stringSize,a,b,tamanho,posicao1,posicao=0,i,j;
		boolean deuRuim = false;
		tamanho = teste.length();	
		stringSize = teste.length();
		while(tamanho > 1 && deuRuim == false){				
			a = tamanho;
			for(posicao1=0; posicao1 <= posicao; posicao1++){	
				b = posicao1 + a;		
				teste = fim.substring(posicao1,b); 
				StringBuffer sb = new StringBuffer(teste);
				sb.reverse();
				String contrario = sb.toString();
				if(teste.equals(contrario)){
					j = b - 1;
					System.out.println(teste); 
					System.out.println("Posicao: " + posicao1 + " Até " + j);
					deuRuim = true;				
				}
			}
			posicao++;
			tamanho--;
		}
		if(deuRuim == false){
			System.out.println("Não existe palindrome na palavra escolhida.");
		}
	}
}
