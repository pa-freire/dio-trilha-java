public class SmartTV{

    boolean ligada = true;
    int canal = 1, volume = 25;
    
    public void aumentarVolume(){
        volume++;
        System.out.println("O volume atual é "+ volume);       
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Volume atual é "+volume);
    }

    public void mudarCanal(){
        canal++;
    } 
}

