import java.util.Scanner;
public class juegoMarco {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double velocidadMarco = (Math.random()*(15-10))+10; 
        double tiempoMarco = (Math.random()*(10-8))+8;
        double espacioMarco,distanciaDiaMarco;
        double probabilidadClima, probabilidadMonoEscapa, probabilidadMonoCansado;
        double distanciaDiaMadre;
        double velocidadMadre = (Math.random()*(9-6))+6;
        double tiempoMadre = (Math.random()*(9-6))+6;
        double espacioMadre= 350;
        double probabilidadClimaMadre;
        boolean marcoAlcanza=false;
        String interaccion = "";
        int numeroDia = 0;
        distanciaDiaMarco = 0;
        distanciaDiaMadre = 0;
        
        do { 
            interaccion = entrada.nextLine();
            //MARCO
            numeroDia = numeroDia+1;
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
            System.out.println("Marco dia "+numeroDia);
            
            velocidadMarco = (double)((int)(velocidadMarco*100)/100);
            tiempoMarco    = (double)((int)(tiempoMarco*100)/100);

            //System.out.println("velocidad originial : "+velocidadMarco);
            //System.out.println("Tiempo de original  : "+tiempoMarco);
            //System.out.println("velocidad originial madre : "+velocidadMadre);
            //System.out.println("Tiempo de original madre  : "+tiempoMadre);

            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            //clima Marco
            probabilidadClima = Math.random();

            //System.out.println(">> probabilidad del clima "+probabilidadClima);
                if(probabilidadClima<0.1){
                    System.out.println("   -¡Ha llovido muchisimo! ");
                    velocidadMarco = velocidadMarco*0.25;
                }else if(probabilidadClima<0.4){
                    System.out.println("   -Ha llovido un poco");
                    velocidadMarco = velocidadMarco*0.75;
                }else{
                    System.out.println("   -Ha hecho un buen dia");
                }

            //FIN DEL ANALISIS DEL CLIMA
            //MONO
            probabilidadMonoCansado = Math.random();
            probabilidadMonoEscapa  = Math.random();

                if(probabilidadMonoEscapa<0.15){
                    System.out.println("> Eh perdido el tiempo buscando a Amedio!");
                    tiempoMarco = tiempoMarco -2;
                }
                if(probabilidadMonoCansado<0.25){
                    System.out.println("> El mono se ha cansado");
                    velocidadMarco = velocidadMarco*0.9;
                }

            //RESULTADO MARCO
            espacioMarco   = velocidadMarco * tiempoMarco;
            distanciaDiaMarco = distanciaDiaMarco + espacioMarco;
            System.out.println("Marco avanza "+tiempoMarco+" horas a "+velocidadMarco+" km/h recorriendo "+espacioMarco+" km");
            
            System.out.println("------------------------------------------------------------");
            //----------------------------------------------------------------------------------------------------------------------------------------------------------------------
            //MADRE
            velocidadMadre = (double)((int)(velocidadMadre*100)/100);
            tiempoMadre    = (double)((int)(tiempoMadre*100)/100);
            
            //clima Madre
            probabilidadClimaMadre = Math.random();

                if(probabilidadClimaMadre<0.1){
                    System.out.println("A mama le ha llovido muy fuerte");
                    velocidadMadre = velocidadMadre - 0.5;
                }else if(probabilidadClimaMadre<0.3){
                    System.out.println("A mama le ha llovido un poco");
                    velocidadMadre = velocidadMadre - 0.25;
                }else{
                    System.out.println("A mama le ha hecho un buen dia ");
                }

            //RESULTADO MADRE
            espacioMadre = espacioMadre + (velocidadMadre * tiempoMadre);
            
            System.out.println("Mama pudo avanzar "+tiempoMadre+" horas a "+velocidadMadre+" km/h recorriendo "+espacioMadre+" km");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            
            //--------- RESULTADO FINAL ---------
            espacioMadre = espacioMadre - distanciaDiaMarco;
            System.out.println("Distancia Total: "+espacioMadre);
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
            System.out.println("");
            if( espacioMadre<= 0 ){ marcoAlcanza=true; } 

            } while (marcoAlcanza==false);
        System.out.println("Marco ha encontrado a su madre ");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");

        












    }
}