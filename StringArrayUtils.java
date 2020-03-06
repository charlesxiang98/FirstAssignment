 

/**
 * Created by Yang on 1/23/20.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
  
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        int i =array.length;
        return array[i-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        int i=array.length;
        return array[i-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(int i=0;i<array.length;i++){
            if(value==array[i]){
                return true;
            }
            
        }
        return true;
    }
     

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String [] b=new String[array.length];
        int j=array.length;
        for(int i=0;i<array.length;i++){
            if(j>=1){
            b[j-1]=array[i];
            j=j-1;}
            else{
            break;}
        }
        return b;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int flag=0;
        int j=array.length;
        for(int i=0;i<=j/2 && j!=0;i++){
            if (array[i] != array[j - i - 1]) { 
                flag = 1; 
                break; 
            } 
        }
        if(flag==1){return false;}
        return true;
        
        
        }
            
        
    
    

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean[] mark = new boolean[26]; 
        int index = 0; 
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length(); j++){
            if ('A' <= array[i].charAt(j) &&  
                    array[i].charAt(j) <= 'Z'&& array[i].charAt(j)!=' '){ 
                index = array[i].charAt(j) - 'A'; }
            else if('a' <= array[i].charAt(j) &&  
                    array[i].charAt(j) <= 'z'&&array[i].charAt(j)!=' '){ 
                index = array[i].charAt(j) - 'a'; }
            mark[index]=true;
            
        }
    }
        for (int i = 0; i <= 25; i++) 
            if (mark[i] == false) 
                return (false); 
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int res=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==value){
                res++;
            } 
        }
        return res;
    }
    

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        
        String[]array2=new String[array.length-1];
        for(int i=0,k=0;i<array.length;i++){
            if (i == array.length) { 
                continue; 
            } 
            if(array[i]!=valueToRemove){
                array2[k++]=array[i];}
        }
        return array2;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int slow =0;
        for(int fast=1;fast<array.length;fast++){
            if(array[slow]!=array[fast]){
                slow++;
                array[slow]=array[fast];
           
            }
            
           }
           String[]array2=new String[slow+1];
           for(int j=0;j<slow+1;j++){
                array2[j]=array[j];
            }
            return array2;
        }
        
 

    

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
                int slow =0;
        StringBuilder builder=new StringBuilder();
        for(int fast=0;fast<array.length;fast++){
            while(fast<array.length-1 &&array[fast]==array[fast+1]){
                builder.append(array[fast]);
                fast++;
            }
            builder.append(array[fast]);
            array[slow++]=builder.toString();
            builder.delete(0,builder.length());
            
           }
           String[] Array2=new String[slow];
           for(int j=0;j<slow;j++){
                Array2[j]=array[j];
            }
            return Array2;
        }
}

