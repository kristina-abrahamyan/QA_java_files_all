public class InstanceArray {
    public static void main(String[] args) {
        int[] newArray = new int[4];

        for (int i = 0; i < newArray.length; i++){
            newArray[i] = i*i;
            System.out.println(newArray[i]);
        }

        for (int value: newArray){
            System.out.println(value);
        }
//        String string1 = "One";
//        String string2 = "Two";
//        String string3 = "Three";
//        String string4 = "Four";

        StringBuilder builder = new StringBuilder();
//        builder.append(string1);
//        builder.append(string2);
//        builder.append(string3);
//        builder.append(string4);
//        System.out.println(builder);

        String[] newArray2 = new String[4];
        for (int i = 0; i < newArray.length; i++){
            newArray2[i] = Integer.toString(newArray[i]);
            builder.append(newArray2[i]);
        }
        System.out.println(builder);
    }
}
