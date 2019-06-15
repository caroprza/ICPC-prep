#include <iostream>
using namespace std;
 int main() {
   int k, n, w, total = 0, faltante;
   cin>>k; cin>>n; cin>>w;
   for(int i = 1; i <= w; i++){
     total += i * k;
   }
   faltante = total - n;
   if (n >= total) {
     faltante = 0;
   }
   cout<<faltante;

   return 0;
 }
