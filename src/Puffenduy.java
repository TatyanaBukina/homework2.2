public class Puffenduy extends Hogwarts{

    public Puffenduy(String fullName, int magic, int teleport, int mind, int wisdom, int wit, int creation) {
        super(fullName, magic, teleport);
        if (mind > 0 || mind < 100) {
            throw new RuntimeException("Невероное значение mind");
        }
        if (wisdom > 0 || wisdom < 100) {
            throw new RuntimeException("Неверное значение wisdom");
        }
        if (wit > 0 || wit< 100) {
            throw new RuntimeException("Неверное значение wit");
        }
        if (creation > 0 || creation< 100) {
            throw new RuntimeException("Неверное значение creation");
        }
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    int mind;

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

    int wisdom;
        int wit;
        int creation;


    public void compareStudents(Puffenduy studentSecond){
        int powerOne =this.mind+ this.wisdom+this.wit+ this.creation;
        int powerTwo = studentSecond.mind+ studentSecond.wisdom+studentSecond.wit+ studentSecond.creation;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + "сильнее чем " + studentSecond.fullName);
        }
        if (powerOne < powerTwo) {
            System.out.println(studentSecond.fullName + "сильнее чем " + this.fullName);
        } else {
            System.out.println(this.fullName + "такой же сильный как и " + studentSecond.fullName);
        }

    }
}
