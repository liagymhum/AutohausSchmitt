public class Methoden {
    public int elesInArray(Object[] array){
        int i = 0;
        for(Object o : array){
            if(o != null){
                i++;
            }
        }
        return i;
    }
}
