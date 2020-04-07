package mobile_programming;


 class Machine
 {
//변수정의
public String fuel;

public int speed=0;

//기본 생성자 정의
 Machine(){}

//생성자 정의
Machine (String fuel, int speed){

this.fuel = fuel;

this.speed = speed;

}


//속도값을 리턴하는 함수
int getSpeed(){

return speed;

}


//속도를 올리는 함수
void speedUp(int value) {

if( (value+speed) < 200) {

speed = speed + value;

}else {

System.out.println("speed reach the maximum...");

}

}


//속도를 내리는 함수
void speedDown(int value) {

if( (speed-value) >= 0) {

speed = speed - value;

}else {

System.out.println("speed reach the minimum...");

}

}

}


// Machine 상속 
public class FlyingMachine extends Machine {

	 FlyingMachine(String fuel, int speed)
	 {
		 this.fuel=fuel;
		 this.speed=speed;

	 }

	 void speedUp(int value) {

		 if( (value+speed) < 1000) {

		 speed = speed + value;

		 }else {

		 System.out.println("speed reach the maximum...");

		 }

		 }


	public static void main(String[] args) {


		FlyingMachine  fm  = new FlyingMachine("Gasoline",0);

		Machine   mm  = new Machine("Diesel",0);


//FlyingMachin speedUp
		System.out.println("\n FlyingMachine speedUp ");
	    fm.speedUp(500);
	System.out.println("현재속도 500");
	 fm.speedUp(500);
	 fm.speedUp(500);


//Machine speedUp
	System.out.println("\n Machine speedUp ");
		mm.speedUp(70);
		System.out.println("현재 속도  70");

		mm.speedUp(70);
		System.out.println("현재 속도  140");


		mm.speedUp(70);


	}

}
