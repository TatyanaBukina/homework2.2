public abstract class Hogwarts {
    private String fullName;
    private int magic;
    private int teleport;


    public Hogwarts(String fullName, int magic, int teleport) {
        this.fullName = fullName;
        this.magic = magic;
        this.teleport = teleport;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTeleport() {
        return teleport;
    }

    public void setTeleport(int teleport) {
        this.teleport = teleport;
    }


    private int ability(){
        return  magic+ teleport;
    }
    public void print(){
        System.out.println(this);
    }

    public  void  compareHogwarts(Hogwarts hogwartsStudent){
        int ability1=ability();
        int ability2=hogwartsStudent.ability();
        if (ability1>ability2){
            System.out.printf("Студент %s лучше, чем студент %s:%d VS %d%n",
            getFullName(),hogwartsStudent.getFullName(), ability1, ability2);
        } else if (ability2>ability1)
            System.out.printf("Студент %s лучше, чем студент %s:%d VS %d%n",
            getFullName(),hogwartsStudent.getFullName(), ability1,ability2);
        else {
            System.out.printf("Студент %s такой же,как и  студент %s:%d VS %d%n",
                    getFullName(),hogwartsStudent.getFullName(), ability1,ability2);
        }}

    @Override
    public String toString() {
        return String.format("Студент %s; сила магии: %d; сила трансгрессии:%d",
                fullName, magic, teleport);
    }
}


