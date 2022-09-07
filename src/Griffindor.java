public class Griffindor extends Hogwarts {

    private int honor;
    public int bravery;
    public int dignity;

    public Griffindor(String fullName, int magic, int teleport, int honor, int bravery, int dignity) {
        super(fullName, magic, teleport);
        this.honor = honor;
        this.bravery = bravery;
        this.dignity = dignity;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getDignity() {
        return dignity;
    }

    public void setDignity(int dignity) {
        this.dignity = dignity;
    }
    private int ability(){
        return  honor+ bravery+dignity;
    }
    public void print(){
        System.out.println(this);
    }

    public  void  compareGriffindor(Griffindor griffindorStudent) {
        int ability1 = ability();
        int ability2 = griffindorStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Гриффиндорец %s лучше, чем гриффиндорец %s:%d VS %d%n",
                    getFullName(), griffindorStudent.getFullName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Гриффиндорец %s лучше, чем гриффиндорец %s:%d VS %d%n",
                    getFullName(), griffindorStudent.getFullName(), ability1, ability2);
        } else {
            System.out.printf("Гриффиндорец %s такой же,как и  гриффиндорец %s:%d VS %d%n",
                    getFullName(), griffindorStudent.getFullName(), ability1, ability2);

        }
    }

    @Override
    public String toString() {
        return String.format("%s; благородство:%d;честь:%d; храбрость:%d",
                super.toString(),honor,dignity,bravery);
}}




