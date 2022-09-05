public abstract class Hogwarts {

    String fullName;
    int magic;
    int teleport;

    public Hogwarts(String fullName, int magic, int teleport) {
        this.magic = magic;
        this.teleport = teleport;
        this.fullName = fullName;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        if (magic > 0 || magic < 100) {
            throw new RuntimeException("Неверное значение");
        }
        this.magic = magic;
        this.magic = magic;
    }

    public int getTeleport() {
        return teleport;
    }

    public void setTeleport(int teleport) {
        if (teleport > 0 || teleport < 100) {
            throw new RuntimeException("Неверное значение");
        }
        this.teleport = teleport;
    }

    public static  void compareStudents(Hogwarts studentsFirst, Hogwarts studentSecond) {
        int powerOne = studentsFirst.magic + studentsFirst.teleport;
        int powerTwo = studentSecond.magic + studentSecond.teleport;
        if (powerOne > powerTwo) {
            System.out.println(studentsFirst.fullName + "сильнее чем " + studentSecond.fullName);
        }
        if (powerOne < powerTwo) {
            System.out.println(studentSecond.fullName + "сильнее чем " + studentsFirst.fullName);
        } else {
            System.out.println(studentsFirst.fullName + "такой же сильный как и " + studentSecond.fullName);
        }

    }
}

