public class Task {
    public static void main(String[] args) {

        int ageChild = 6;

        boolean canNot= ageChild<5;
        boolean onlyWithAdult = ageChild >=5 && ageChild <14;
        boolean alone = ageChild >=14;

        if (canNot){
            System.out.println("Если ребенку " + ageChild +" лет, ему нельзя кататься на аттракционе");
        }
        else if (onlyWithAdult){
            System.out.println("Если ребенку " + ageChild + " лет, ему можно кататься на аттракционе только со взрослым");
        }
        else if (alone){
            System.out.println("Если ребенку "+ ageChild +" лет, ему можно кататься на аттракционе одному");
        }
    }
}
