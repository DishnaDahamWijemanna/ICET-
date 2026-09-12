import java.util.*;
class Example8{
		public static void main(String args[]){
				int [] rainfallVal ={2346,1945,2060,1781,2365,1005,1162,1016,1512,2231,1903,12061,1005,1545,
									2156,2037,1583,3668};
									
				System.out.println("the number of districts - "+rainfallVal.length);
				int y =0;
				for(int i =0;i<rainfallVal.length;i++){
						if(rainfallVal[i]>=2000){
								y++;
								
						}
						
				}
				System.out.println("the number of districts with more than 2000mm - "+y);
				int z =0;
				for(int i =0;i<rainfallVal.length;i++){
						if(rainfallVal[i]<1000){
							z++;
							
						}
				}
				System.out.println("the number of districts with less than 1000mm - "+z);
				double totRainVal =0;
				for(int i =0;i<rainfallVal.length;i++){
						totRainVal +=rainfallVal[i];
						
				}
				double avg = (totRainVal/rainfallVal.length);
				System.out.println("the average annual rainfall values of all districts - "+avg);
				
		}
}
