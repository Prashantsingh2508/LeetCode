class Solution {
    public int findPoisonedDuration(int[] arr, int duration) {

if (arr.length <= 1) {
    return duration;
}
int total=0;
    for(int i=0;i<arr.length-1;i++){

        total+=Math.min(duration, arr[i+1]-arr[i]);



    }
return total+duration;

    }
}