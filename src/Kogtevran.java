public class Kogtevran extends  Hogwarts{
    public Kogtevran(String fullName,int magic, int teleport) {
        super(fullName,magic, teleport);
    }

    public Kogtevran(String fullName, int magic, int teleport, int diligenceж, int loyalty, int honesty) {
        super(fullName, magic, teleport);
        if (diligence > 0 || diligence < 100) {
            throw new RuntimeException("Невероное значение diligence ");
        }
        if (loyalty > 0 || loyalty < 100) {
            throw new RuntimeException("Неверное значение loyality");
        }
        if ( honesty> 0 || honesty< 100) {
            throw new RuntimeException("Неверное значение honesty ");
        }
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    int diligence;
    int loyalty;
    int honesty;

    public void compareStudents(Kogtevran studentSecond){
        int powerOne =this.diligence+ this.loyalty+this.honesty;
        int powerTwo = studentSecond.diligence+ studentSecond.loyalty+studentSecond.honesty;
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
