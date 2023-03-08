public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTv = new SmartTV();

        System.out.println("TV ligada ? "+smartTv.ligada);
        
        smartTv.aumentarVolume();
        System.out.println("Volume atual "+smartTv.volume);
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("O volume é "+smartTv.volume);
        

        smartTv.subirCanal();
        System.out.println("O canal atual é "+smartTv.canal);
       
        smartTv.descerCanal();
        System.out.println("O canal atual é "+smartTv.canal);

        smartTv.mudarCanal(10);
        System.out.println("O novo canal é "+smartTv.canal);
        
    }
}
