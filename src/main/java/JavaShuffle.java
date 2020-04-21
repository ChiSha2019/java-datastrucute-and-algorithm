public class JavaShuffle {
    public static void main(String[] args) {
        String[] deckofCard = new String[52];

        for(int i = 0; i<deckofCard.length; i++){
            deckofCard[i] = Integer.toString(i);
        }

        for(String i : deckofCard)
            System.out.print(i + " ");
        System.out.println();
        shuffle(deckofCard);
        for(String i : deckofCard)
        System.out.print(i + " ");
    }
    static void shuffle(String[] arr){
        int mid = arr.length/2;
        String[] newArray = new String[arr.length];

        if (arr.length - 1 >= 0) System.arraycopy(arr, 0, newArray, 0, arr.length - 1);

        for(int i = 0; i < arr.length-1 ; i++){
            if(i %2 == 0){
                arr[i] = newArray[i/2];
            }else {
                arr[i] = newArray[i/2 + mid];
            }
        }
    }
}
