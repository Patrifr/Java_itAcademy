package SPRINT1.TASCA_1.N1.Exercici1_Grup_Musica;

public class Vent extends Instrument{

        Vent(String nom, int preu) {
            super(nom, preu);
        }

        String tocar() {
            return "Està sonant un instrument de vent.";
        }

}
