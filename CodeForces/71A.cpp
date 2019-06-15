#include <iostream>
#include <string>

using namespace std;

int main() {
  int n; cin>>n;
  string str, final;
  for (int i = 0; i < n; i++) {
    getline(cin, str);
    int len = str.length();
    if (len > 10) {
      final = to_string(str[0]) + to_string((len - 2)) + to_string(str[len - 1]);
      cout<<final<<endl;
    }
    else {
      cout<<str<<endl;
    }
  }
  return 0;
}
