#include <iostream>
using namespace std;

int main() {
  int n, caso, policias = 0, k = 0;
  cin>>n;
  for(int i = 0; i < n; i++) {
    cin>>caso;
    if (caso > 0) {
      policias += caso;
    }
    else if (policias > 0 && caso < 0) {
      policias--;
    }
    else if (policias == 0 && caso < 0) {
      k++;
    }
  }
  cout<<k;
  return 0;
}
