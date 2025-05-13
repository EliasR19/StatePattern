package Maquinita;
public class Maina {

	public static void main(String[] args) {
		
		MaquinaJuegos maquina = new MaquinaJuegos();
		
		System.out.println("Empezar");

			maquina.precionarBoton();
			maquina.ingresarFicha();
			maquina.ingresarFicha();
			maquina.ingresarFicha();
			
			System.out.println(maquina.getCantFichas());

			maquina.precionarBoton();
			System.out.println(maquina.iniciarJuego());

		}

}


