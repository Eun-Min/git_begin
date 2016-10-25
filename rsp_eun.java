import java.util.Scanner;

public class Game {
	
	/* Rock Scissors Paper Game competing with two computers in Java 
	 +------------+------------+-----------+ 
	 | computer 1 | computer 2 |  Users    | 
	 +============+============+===========+ 
	 | Random     | Random     | Input     | 
	 +------------+------------+-----------+ 
	 | Only enter English, not other lg    | 
	 +------------+------------+-----------+
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner s = new Scanner(System.in);
	
	  int a=(int)Math.round(Math.random()*3);  
	  int b=(int)Math.round(Math.random()*3);
	  
	  String game , name; // 입력받은 값을 저장할 변수들
	  int comwin = 0, mewin=0 ;
	  
	  System.out.println("(컴퓨터와 하는 가위바위보 게임)");
	  System.out.print("사용자의 이름을 입력하세요>>");
	  name = s.next();
	  
	 //사용자의 이름 입력받기

	  for(int i=0; i<11; i++){
		  
		  System.out.print("가위,바위,보 중 하나만 입력하세요 >> ");
		  game = s.next();
		  
		  switch(game){  
		    case "가위":
		    {
		     if(a==1 && b==1){
		      break;
		     }
		     else if(a==2 &&  b==3){
		      break;
		     }
		     else if(a==3 &&  b==2){
		      break;
		      }
		     else if(a==3 &&  b==3){
		      mewin++;
		      break;
		     }
		     else{
		      comwin++;
		      break;
		      }
		  
		    }
		    case "바위":
		     if(a==2 &&  b==2){
		      break;
		      }
		     else if(a==1 &&  b==3){
		      break;
		      }
		     else if(a==3 &&  b==1){
		      break;
		     }
		     else if(a==3 &&  b==3){
		      comwin++;
		      break; 
		     }
		     else{
		      mewin++;
		      break;
		     }
		    case "보":
		     if(a==3 &&  b==3){
		      break;
		      }
		     else if(a==1 &&  b==2){
		      break;
		     }
		     else if(a==2 &&  b==1){
		      break;
		     }
		     else if(a==1 &&  b==1){
		      comwin++;
		      break;
		      }
		     else{
		      mewin++;
		      break;
		     }
		    }
			}
	
	  	if(mewin>comwin){
	  		System.out.println(name+"님이 이기셨습니다.");
	  	}
	  	else{
		  System.out.println("컴퓨터가 이겼습니다.");
	  		}
	  	
		}
	}