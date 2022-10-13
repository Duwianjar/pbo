#include<iostream>
using namespace std;

int main(){
	int pilih; //ini adalah deklarasi tipe data dan variabel
	cout<<"Ini adalah program C++ "<<endl;
	cout<<"Masukkan Pilihan anda : "<<endl;
	cout<<"1. perulangan for "<<endl;
	cout<<"2. perulangan while "<<endl;
	cout<<"3. perulangan Do-while "<<endl;
	cout<<"4. array 1 dimensi "<<endl;
	cout<<"5. array multidimensi"<<endl;
	cin>>pilih; //ini adalah penggunaan inputan dinamis
	if(pilih==1){ //ini adalah penggunaan percabangan menggunakan if-else
		cout<<"anda memilih perulangan for "<<endl;
		for(int a = 1; a<=10; a++){ //ini adalah perulangan menggunakan for
			cout<<a;
		}
	}else if(pilih==2){
		cout<<"anda memilih perulangan while "<<endl;
		int a=1;
		while(a<=10){ //ini adalah penggunaan perulangan while
			cout<<a;
			a++;
		}
	}else if(pilih==3){
		cout<<"anda memilih perulangan do-while "<<endl;
		int a=11;
		do{ //ini adalah penggunaan perulangan do-while
			cout<<a<<endl;
			a++;
		}while(a<=10);
		cout<<"Nilai terakhir a "<<a;
		
	}else if(pilih==4){
		cout<<"anda memilih array dimensi 1 :  ";
		int A[5]= {1,2,3,4,5}; //ini adalah array 1 dimensi
		cout<<A[0];
		cout<<A[1];
		cout<<A[2];
		cout<<A[3];
		cout<<A[4];
	}else if(pilih==5){
		cout<<"anda memilih array multidimensi : "<<endl; //
		int arr[2][2]; //ini adalah array 2 dimensi
 
  		arr[0][0] = 15;
  		arr[0][1] = 23;
 	    arr[1][0] = 40;
  		arr[1][1] = 29;
 
  		cout << "Isi variabel arr:" << endl;
  		cout << arr[0][0] <<" "<< arr[0][1] << endl;
  		cout << arr[1][0] <<" "<< arr[1][1] << endl;
		
	}
}
