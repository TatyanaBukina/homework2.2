public class Kogtevran extends  Hogwarts{


    int diligence;
    int loyalty;
    int honesty;

    public Kogtevran(String fullName, int magic, int teleport, int diligence, int loyalty, int honesty) {
        super(fullName, magic, teleport);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }


    private int ability(){
        return  diligence+loyalty+honesty;
    }
    public void print(){
        System.out.println(this);
    }

    public  void  compareKogtevran(Kogtevran kogtevranStudent){
        int ability1=ability();
        int ability2=kogtevranStudent.ability();
        if (ability1>ability2){
            System.out.printf("Когтевранец %s лучше, чем когтевранецт %s:%d VS %d%n",
            getFullName(),kogtevranStudent.getFullName(), ability1,ability2);
        } else if (ability2>ability1){
            System.out.printf("Когтевранец %s лучше, чем когтевранец %s:%d VS %d%n",
            getFullName(),kogtevranStudent.getFullName(), ability1,ability2);
        }
        else {
            System.out.printf("Когтевранец %s такой же,как и  когтевранец %s:%d VS %d%n",
            getFullName(),kogtevranStudent.getFullName(), ability1,ability2);
        }}
    @Override
    public String toString() {
        return String.format("%s; трудолюбие:%d; верность:%d, честность^%d",
                super.toString(), diligence,loyalty, honesty);
}
}
