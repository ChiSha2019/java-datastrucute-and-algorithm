package groupthePepoleLeetCode;

import java.util.*;

public class GroupThePeople {
    public static void main(String[] args) {
        int[] groupSizes = {2,1,3,3,3,2};
        int length = groupSizes.length;
        int [] arrayCopy = new int [length];
        for(int i=0; i < length; i++){
            arrayCopy[i] = groupSizes[i];
        }

        Arrays.sort(arrayCopy);
        HashMap<Integer, ArrayList<Integer>> iDHm = new HashMap<>();
        //j is ID, arrayCopy[i] is key for hashmap
        for(int i = 0; i< length; i++){
            for(int j =0; j < length; j++){
                if(groupSizes[j] == arrayCopy[i]){
                    if(!iDHm.containsKey(arrayCopy[i])){
                        ArrayList<Integer> arrayList = new ArrayList<>();
                        arrayList.add(j);
                        iDHm.put(arrayCopy[i], arrayList);
                    }else{
                        ArrayList<Integer> arrayList = iDHm.get(arrayCopy[i]);
                        if(!arrayList.contains(j)) {
                            arrayList.add(j);
                            iDHm.put(arrayCopy[i], arrayList);
                        }
                    }
                }
            }
        }
        System.out.println(iDHm);
        ArrayList<List<Integer>> outputlist = new ArrayList<>();
        for (Map.Entry<Integer,ArrayList<Integer>> entry : iDHm.entrySet()){
            outputlist.add(entry.getValue());
        }
        System.out.println(outputlist);

    }
}
