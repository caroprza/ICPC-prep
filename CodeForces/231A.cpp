#include <iostream>
using namespace std;

int main() {
  int problemas, total = 0;
  cin>>problemas;
  for(int i = 0; i < problemas; i++) {
    int a, b, c, votos;
    cin>>a; cin>> b; cin>>c;
    votos = a + b + c;
    if (votos >= 2) {
      total ++;
    }
  }
  cout<<total;

  return 0;
}
