public class Puffenduy extends Hogwarts {

    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Puffenduy(String fullName, int magic, int teleport, int mind, int wisdom, int wit, int creation) {
        super(fullName, magic, teleport);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    private int ability(){
        return  mind+ wisdom+wit+creation;
    }
    public void print(){
        System.out.println(this);
    }

    public  void  compareHogwarts(Puffenduy puffenduyStudent){
        int ability1=ability();
        int ability2=puffenduyStudent.ability();
        if (ability1>ability2){
            System.out.printf("Пуффендуец %s лучше, чем пуффендуец %s:%d VS %d%n",
            getFullName(),puffenduyStudent.getFullName(), ability1,ability2);
        } else if (ability2>ability1){
            System.out.printf("Пуффендуец %s лучше, чем пуффендуец %s:%d VS %d%n",
            getFullName(),puffenduyStudent.getFullName(), ability1,ability2);
        }
        else {
            System.out.printf("Пуффендуец %s такой же,как и  пуффендуец %s:%d VS %d%n",
            getFullName(),puffenduyStudent.getFullName(), ability1,ability2);
        }
    }

    @Override
    public String toString() {
        return String.format("%s; ум:%d;мудрость:%d; остроумие:%d, творчество^%d",
                super.toString(), mind, wisdom, wit, creation);
    }
}

