#include <iostream>
#include <cmath>
using namespace std;
double Ptbac2(float a, float b, float c) {
	double delta = pow(b,2) - 4 * a  * c;
	if (delta < 0) {
//		cout << "Pt vo nghiem\n";
	} 
	if (delta == 0) {
//		cout << "Pt co nghiem kep: x = " << (-b/(2*a)) << endl;
	} else {
//		cout << "pt co 2 nghiem phan biet " << endl;
	}
}
int main() {
	float a, b, c;
	cout << "ok\n";
	cin >> a >> b >> c;
 	Ptbac2(a, b, c);
	cout << "hello world";
	return 0;
}