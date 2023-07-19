class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length=nums1.length + nums2.length;
        int merged[]=new int [length];
        int i =0;
        int j=0;
        int k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                merged[k]=nums1[i];
                i++;
                k++;
            }
            else{
                merged[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<nums1.length){
            merged[k]=nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length){
            merged[k]=nums2[j];
            j++;
            k++;
        }
        double median=0.0;
        int mid=merged.length/2;
        if(merged.length %2==1){
            median=merged[mid];
        }
        else{
            median =(merged[mid]+merged[mid-1])/2.0;
        }
        return median;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int nums1[]=new int[a];
        for(int i=0;i<nums1.length;i++){
            nums1[i]=sc.nextInt();
        }
        int b=sc.nextInt();
        int nums2[]=new int [b];
        for(int i=0; i<nums2.length;i++){
            nums2[i]=sc.nextInt();
        }
        double median=findMedianSortedArrays(nums1,nums2);
        System.out.println(median);
    }
}