public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTv = new SmartTV();

        smartTv.aumentarVolume();
        System.out.println("Volume atual "+smartTv.volume);
        
        
        System.out.println("TV ligada ? "+smartTv.ligada);
    }
}
