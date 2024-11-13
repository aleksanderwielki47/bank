abstract class Bank{
    public abstract void podaj_karte();
    public abstract void podaj_pin();
    public abstract void podaj_kwote();
    public void potwierdzenie(){
        System.out.println("Zatwierdzamy prosby wyplaty");
    }
    public void stankonta(){
        System.out.println("Zostalo XXXzlotych");
    }
    public void potwierdzenie2(){
        System.out.println("prosba o wyplate zatwierdzona");
    }
    public abstract void wyplata();
    public abstract void podziekowania();




}

class Bankomat extends Bank {
    @Override
    public void podaj_karte(){
        System.out.println("Prosze o wlozenie karty");
    }
    @Override
    public void podaj_pin(){
        System.out.println("Prosze o podanie karty");
    }
    @Override
    public void podaj_kwote(){
        System.out.println("Prosze o kwoty do wyplacenia ");
    }
    @Override
    public void wyplata(){
        System.out.println("automat drukuje banknoty");
    }
    @Override
    public void podziekowania(){
        System.out.println("dziekujemy za skorzystanie z naszych uslog");
    }
}





public class Main {
    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat();
        bankomat.podaj_karte();
        bankomat.podaj_pin();
        bankomat.podaj_kwote();
        bankomat.potwierdzenie();
        bankomat.stankonta();
        bankomat.potwierdzenie2();
        bankomat.wyplata();
        bankomat.podziekowania();
        }
    }
