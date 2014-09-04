#include<iostream>
using namespace std;
int main() {
	int a[] = {10,20,30,40,50};
	int * p[] = {a,a+1,a+2,a+3,a+4};
	int ** ptr = p;
	**ptr++;					//Equivalent to ptr++ : Will point to next p : ptr = ptr+1 OR ptr = p+1 AND *(p+1)=a+1;
	cout << ptr-p << " ";		//ptr-p =1;
	cout << *ptr-a << " ";		//*ptr-a = *(p+1)-a = a+1 -a =1;
	cout << **ptr <<endl;		//**ptr = *(*(p+1)) = *(a+1) = 20;
	*++*ptr;					//Equivalent to ++*ptr : Will still point to same p, but that p will point to next a : ptr=p+1 AND *(p+1)=a+2
	cout << ptr-p << " ";		//ptr-p =1;
	cout << *ptr-a << " ";		//*ptr-a = *(p+1)-a = a+2 -a =2;
	cout << **ptr <<endl;		//**ptr = *(*(p+1)) = *(a+2) = 30;
	++**ptr;					//ptr will point to same p, p will point to same a+2, but value at a+2 i.e.a[2]=30+1;
	cout << ptr-p << " ";		//ptr-p=1;
	cout << *ptr-a << " ";		//*ptr-a = *(p+1)-a = a+2 -a =2;
	cout << **ptr <<endl;		//**ptr = *(*(p+1)) = *(a+2) = 31;
	return 0;
}
