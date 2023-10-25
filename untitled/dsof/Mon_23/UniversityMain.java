public class UniversityMain {
    public static void main(String[] args) {
        University uni = new Uni1(1);
        uni.location();

        Uni1[] uniList = new Uni1[2];
        for (int i = 0; i < uniList.length; i++){
            uniList[i] = new Uni1(i+1);
            uniList[i].location();
        }
    }
}
