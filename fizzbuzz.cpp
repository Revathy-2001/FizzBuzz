#include <iostream>
using namespace std;
int main(){
  int x,y,n;
  cin >> x >> y >> n;
  if(x >= 1 && x <= 100 && y >=1 && y <= 100 & n >=1 and n <= 100)
  for(int i = 1;i <= n;i++){
    if(i%x == 0 && i%y == 0){
      cout << "FizzBuzz" << endl;
    }
    else if(i%x == 0){
      cout << "Fizz" << endl;
    }
    else if(i%y == 0){
      cout << "Buzz" << endl;
    }
    else
      cout << i << endl;
  }
}