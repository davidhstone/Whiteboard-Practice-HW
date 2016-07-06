//problem 1

public String doubleChar(String str) {
  
  String newString = "";
  
  for (int i = 0; i < str.length(); i++){
    
    newString = newString + str.charAt(i) + str.charAt(i);
    
  }
   return newString;
}

//problem2

public boolean cigarParty(int cigars, boolean isWeekend) {
  if ((isWeekend == true && cigars >= 40) || (isWeekend == false && (cigars >= 40 && cigars <= 60))) {
  return true;
} else {
  return false;
}
}

//problem3

public int[] rotateLeft3(int[] nums) {
  
   
   int[] newArray = new int[3];
  
  for (int i = 0; i <= 2; i++) {
    newArray[0] = nums[1];
    newArray[1] = nums[2];
    newArray[2] = nums[0];
    
  }
  return newArray;
}
