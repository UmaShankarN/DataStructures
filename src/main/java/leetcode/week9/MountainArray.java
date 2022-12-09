package leetcode.week9;

public class MountainArray {
    public boolean validMountainArray(int[] arr) {
   /*
   *  Declare two pointers p1 starts from index 0 and another p2 from index length-1
   * start the pointer p1 and iterate until length -1
   * break the loop when the number stops increasing and assign the max value to a variable
   * start the pointer p2 and iterate until 0
   * break the loop when the number stops increasing and assign the max value to a variable
   * Check if last iterated max value matches and the pointer is moved from the intial position
   * return true if the above condition matches else false
   * Initial condition to return false-  arr.length >= 3
   *
   */
    // Test Data [2 0 2], [3 5 5]

    if(arr.length <=2)
        return false;
    
    int p1 =0, p2 = arr.length-1, p1temp=-1, p2temp=-1;
    while(p1!=arr.length-1){
        if(arr[p1] == p1temp)//[3 5 5]
            return false;
        else if(arr[p1]>p1temp)
            p1temp =arr[p1];
        else{
            p1--;//[2 0 2]
            break;
        }
        p1++;
        
    }

       while(p2!=0){
        if(arr[p2] == p2temp)
            return false;
        else if(arr[p2]>p2temp)
            p2temp =arr[p2];
        else{
            p2++;
            break;
        }
        p2--;
    }

    if(p1temp==p2temp && p1>0 && p2 < arr.length-1)
        return true;
 

    return false;
   }

}
