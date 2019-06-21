#include <iostream>

using namespace std;

int main() {
  int n, a, b, mayor, pasajeros; cin>>n;
  for(int i = 0; i < n; i++) {
    cin>>a>>b;
    if (i == 0) {
      mayor = pasajeros = b;
    }
    else {
      pasajeros -= a;
      pasajeros += b;
      if (pasajeros > mayor) {
        mayor = pasajeros;
      }
    }
  }
  cout<<mayor;
}
