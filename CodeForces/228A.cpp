#include <iostream>
using namespace std;

int main() {
  int s1, s2, s3, s4, n = 3;
  cin>>s1>>s2>>s3>>s4;
  if (s2 != s1) {
    n--;
  }
  if (s3 != s2 && s3 != s1) {
    n--;
  }
  if (s4 != s3 && s4 != s2 && s4 != s1) {
    n--;
  }
  cout<<n;
  return 0;
}
