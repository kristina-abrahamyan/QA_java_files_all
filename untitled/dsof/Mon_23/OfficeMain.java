public class OfficeMain {
    public static void main(String[] args) {
        Office[] officeArray = new Office[2];
        officeArray[0] = new Office("London", 3);
        officeArray[1] = new Electronics("Manchester", 33, false, "printer");

        officeArray[0].describe();
        officeArray[1].describe();
    }
}
