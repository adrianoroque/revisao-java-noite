package exemplo2;


public class TestaExcecao {
	
	public static void main (String [] args) {
		int[] numeros = new int[4];
		
		try {
			numeros[1] = 10;
		}
		catch (ArithmeticException ex ) {
			
			System.out.println("Falha na operação aritimética");
		}catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Estouro de Array");
		} finally {
			System.out.println("Sempre executa este trecho");
		}
		
		
		}
	}


