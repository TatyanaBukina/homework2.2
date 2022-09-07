import java.util.Random;

public class Main {

    private  static  final Random RANDOM=new Random();
    public static void main(String[] args) {
        Griffindor harry = generateGriffindorStudent("Гарри Поттер");
        Griffindor ron = generateGriffindorStudent("Рон Уизли");
        Puffenduy cedric= generatePuffenduyStudent("Седрик Диггори");
        Kogtevran padma = generateKogtevranStaudent(" Пандма Патил");
        Slizerin drako = generateSlizerinStudent("Драко Малфой");

        harry.print();
        ron.print();
        cedric.print();
        drako.print();
        padma.print();

        harry.compareHogwarts(drako);
        harry.compareGriffindor(ron);

    }

    private static Slizerin generateSlizerinStudent(String fullName) {
        return new Slizerin(
                fullName,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );

    }


    private static Kogtevran generateKogtevranStaudent(String fullName) {
        return new Kogtevran(
                fullName,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }


    private static Puffenduy generatePuffenduyStudent(String fullName) {
        return new Puffenduy(
                fullName,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static Griffindor generateGriffindorStudent(String fullName) {
        return  new Griffindor(
                fullName,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)


        );
}
}