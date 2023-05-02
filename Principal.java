public class Principal {
    
        public static void main(String[] args) {
            Bike bike = new Bike ("Magrelz", "Canão", "Preta", 3087);
    
            System.out.println(bike.getMarca());
            System.out.println(bike.getModelo());
            System.out.println(bike.getCor());
            System.out.println(bike.getAno());
            System.out.println("");
            

            Mobilete mobilete = new Mobilete ("Caloi", "Claudete", "Rosa", 19085);

            System.out.println(mobilete.getMarca());
            System.out.println(mobilete.getModelo());
            System.out.println(mobilete.getCor());
            System.out.println(mobilete.getAno());
            System.out.println("");

            Patinete patinete = new Patinete ("Petanhas", "Dinheiro", "Jesus", 2010);

            System.out.println(patinete.getMarca());
            System.out.println(patinete.getModelo());
            System.out.println(patinete.getCor());
            System.out.println(patinete.getAno());
            System.out.println("");
        }   

    }

