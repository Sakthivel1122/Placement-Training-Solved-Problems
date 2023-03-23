class BATSMAN{
    public static void quality(){
        System.out.println("I am BATSMAN");
    }
}
class BOWLER extends BATSMAN{
    public static void quality(){
        BATSMAN.quality();
        System.out.println("I am BOWLER too");
    }
}
public class Problem2 {
    public static void main(String[] args) {
        BOWLER obj = new BOWLER();
        obj.quality();
    }
}
