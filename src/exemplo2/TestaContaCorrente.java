package exemplo2;

public class TestaContaCorrente {

	public static void main(String[] args) {
		
		Cliente natan = new Cliente ("Natal", "123.456.789-12", 25);
		ContaPoupanca contaNatan = new ContaPoupanca ();
        contaNatan.setCliente(natan);
        contaNatan.setAgencia("1234-5");
        contaNatan.setNumero("1234-2");
        contaNatan.setSaldo(2000f);
        
        Cliente jackson = new Cliente ("Jackson", "123.456.123-12", 35);
		ContaCorrente contaJackson = new ContaCorrente ();
        contaNatan.setCliente(jackson);
        contaNatan.setAgencia("1233-5");
        contaJackson.setLimite(500f);
        contaNatan.setNumero("1238-2");
        contaNatan.setSaldo(3000f);
        
        
        

        // contaNatan.deposita (600f);
        // contaJackson.saca (500f);
        
        contaJackson.transfere(-500f, contaNatan); 
        
        
        System.out.println(contaNatan);
        System.out.println(contaJackson);
		

	}

}
