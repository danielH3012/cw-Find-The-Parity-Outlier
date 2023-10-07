public class FindOutlier {
  static int find(int[] integers) {
    int hasil = 0;
    if(integers[0]%2==0 && integers[1]%2==0 ){
      for(int i = 0; i < integers.length; i++){
        if(modulus(integers[i]) == 1){
          hasil = integers[i];
        }
      }
    }else if(integers[0]%2==1 && integers[1]%2==1){
      for(int i = 0; i < integers.length; i++){
        if(modulus(integers[i]) == 0){
          hasil = integers[i];
        }
      }
    }else{
      if(modulus(integers[0]) == 0 && modulus(integers[2]) == 0){
        hasil = integers[1];
      }else if(modulus(integers[0]) ==  1 && modulus(integers[2]) == 1){
        hasil = integers[1];
      }else if(modulus(integers[1]) ==  0 && modulus(integers[2]) == 0){
        hasil = integers[0];
      }else if(modulus(integers[1]) ==  1 && modulus(integers[2]) == 1){
        hasil = integers[0];
      }
    }return hasil;
  }
  static int modulus(int a){
    a = a % 2;
      return a;
  }
}
