public class Slizerin extends  Hogwarts{

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

    public Slizerin(String fullName, int magic, int teleport, int cunning, int determination, int resourcefulness, int lustForPower) {
        super(fullName, magic, teleport);
        if (cunning> 0 || cunning < 100) {
            throw new RuntimeException("Невероное значение mind");
        }
        if (determination > 0 || determination < 100) {
            throw new RuntimeException("Неверное значение wisdom");
        }
        if (resourcefulness > 0 || resourcefulness< 100) {
            throw new RuntimeException("Неверное значение wit");
        }
        if (lustForPower > 0 || lustForPower< 100) {
            throw new RuntimeException("Неверное значение creation");
        }
        this.cunning = cunning;
        this.determination = determination;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    int cunning;
    int determination;
    int resourcefulness;
    int lustForPower;

    public void compareStudents(Slizerin studentSecond){
        int powerOne =this.cunning+ this.determination+this.resourcefulness+ this.lustForPower;
        int powerTwo = studentSecond.cunning+ studentSecond.determination+studentSecond.resourcefulness+ studentSecond.lustForPower
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
