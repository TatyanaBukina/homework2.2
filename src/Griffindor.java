public class Griffindor extends Hogwarts {


    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public int getDignity() {
        return dignity;
    }

    private int honor;
    private int bravery;
    private int dignity;

    public Griffindor() {
        super(fullName, magic, teleport);
        if (honor > 0 || honor < 100) {
            throw new RuntimeException("Невероное значение honor");
        }
        if (bravery > 0 || bravery < 100) {
            throw new RuntimeException("Неверное значение bravery");
        }
        if (dignity > 0 || dignity < 100) {
            throw new RuntimeException("Неверное значение digniry");
        }
        this.honor = honor;
        this.bravery = bravery;
        this.dignity = dignity;
    }
    public void compareStudents(Griffindor studentSecond){
        int powerOne =this.honor+ this.bravery+this.dignity;
        int powerTwo = studentSecond.honor+ studentSecond.dignity+studentSecond.bravery;
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
