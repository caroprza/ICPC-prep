#include <iostream>

using namespace std;

 int main() {
   int k1, k2, k3, k4, total = 0;
   cin>>k1>>k2>>k3>>k4;
   while (k1 > 0 && k3 > 0 && k4 > 0) {
     total += 256;
     k1--;
     k3--;
     k4--;
   }
   while (k1 > 0 && k2 > 0) {
     total += 32;
     k1--;
     k2--;
   }
   cout<<total;
 }
