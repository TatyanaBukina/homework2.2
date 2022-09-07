public class Slizerin extends  Hogwarts{

    int cunning;
    int determination;
    int resourcefulness;
    int lustForPower;

    public Slizerin(String fullName, int magic, int teleport, int cunning, int determination, int resourcefulness, int lustForPower) {
        super(fullName, magic, teleport);
        this.cunning = cunning;
        this.determination = determination;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }


    private int ability(){
        return  cunning+determination+resourcefulness+lustForPower;
    }
    public void print(){
        System.out.println(this);
    }

    public  void  compareSlizerin(Slizerin slizerinStudent){
        int ability1=ability();
        int ability2=slizerinStudent.ability();
        if (ability1>ability2){
            System.out.printf("Слизеринец %s лучше, чем слизеринец %s:%d VS %d%n",
            getFullName(),slizerinStudent.getFullName(), ability1,ability2);
        } else if (ability2>ability1){
            System.out.printf("Слизеринец %s лучше, чем слизеринец %s:%d VS %d%n",
            getFullName(),slizerinStudent.getFullName(), ability1,ability2);
        }
        else {
            System.out.printf("Слизеринец %s такой же,как и  слизеринец %s:%d VS %d%n",
            getFullName(),slizerinStudent.getFullName(), ability1,ability2);
        }}
    @Override
    public String toString() {
        return String.format("%s; хитрость:%d;решительность:%d; амбициозность:%d, находчивость^%d",
                super.toString(), cunning, determination, resourcefulness, lustForPower);
    }
}

