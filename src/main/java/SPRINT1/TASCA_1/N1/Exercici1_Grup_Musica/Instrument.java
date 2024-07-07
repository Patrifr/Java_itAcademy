package SPRINT1.TASCA_1.N1.Exercici1_Grup_Musica;

abstract class Instrument {
        String nom;
        int preu;

        Instrument(String nom, int preu){
            this.nom = nom;
            this.preu = preu;
        }
        {
            System.out.println("Bloc d'inicialització: Carregant...");
        }
        static{
            System.out.println("Bloc estátic: Està carregant l'instrument.");
        }

        //get
        public String getNom(){
            return this.nom;
        }
        public int getPreu() {
            return this.preu;
        }
        //set
        public void setNom(String nom) {
            this.nom = nom;
        }
        public void setPreu(int preu) {
            this.preu = preu;
        }

        abstract String tocar();

    }

