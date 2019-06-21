#include <iostream>
using namespace std;

int main() {
  int n, m, k = 1;
  cin>>n>>m;
  char snake[n][m];
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
      if (i%2 == 0) {
        snake[i][j] = '#';
      }
      else {
        if (k%2 != 0) {
          snake[i][j] = '.';
          if (j == (m - 1)) {
            snake[i][j] = '#';
          }
        }
        else {
          snake[i][j] = '.';
          if (j == 0) {
            snake[i][j] = '#';
          }
        }
      }
    }
    if (i%2 != 0) {
      k++;
    }
  }
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
      cout<<snake[i][j];
    }
    cout<<endl;
  }
}
