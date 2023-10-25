public abstract class University {
    public abstract void location();
}

class Uni1 extends University {
    private int rank;

    public Uni1(int rank) {
        this.rank = rank;
    }

    @Override
    public void location() {
        if (rank == 1) {
            System.out.println("The uni location is in Cambridge");
        } else {
            System.out.println("Not in Cambridge!");
        }
    }
}

//public interface Ownership{
//    public String ownershipType;
//}
