class BinarySearch {
  public static void main(String[] args) {
    System.out.println("==== 이진탐색 ====");
    System.out.println("순환: "+binaryS1(0, arr.length - 1, 5)); // 2
    System.out.println("반복: "+binarySearch(0, arr.length - 1, 99)); // 8
  }

  static int[] arr = { 1, 3, 5, 7, 8, 10, 20, 35, 99, 100 }; // 검색 배열

  static int binaryS1(int low, int high, int key){
    int mid;
    if(low <= high){
      mid = (low+high)/2;

      if(key == arr[mid]){  //중간값과 검색값 비교
        return mid;
      } else if(key < arr[mid]){
        return binaryS1(low, mid-1, key);
     } else {
        return binaryS1(mid+1, high, key);
     }
  }
    return -1;
 }
  
  static int binarySearch(int low, int high, int key) {
    int mid; // 중간값
    while (low <= high) {
      mid = (low + high) / 2;

      if (arr[mid] == key)
        return mid;
      else if (arr[mid] > key)
        high = mid - 1;
      else
        low = mid + 1;
    }
    return -1;
  }

}