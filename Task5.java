import java.util.Scanner;
class Task5{
    public static void main(String []args) {
          
          
          Task5 object=new Task5();
          object.Process();
    }
          public void Process(){
          Scanner obj=new Scanner(System.in); 
          Task5 object=new Task5();   
          System.out.println("Enter the temperature:");
          float f =obj.nextFloat();
          System.out.println("Enter the source scale(celcius(c)/fahrenheit(f))?");
          char c=obj.next().charAt(0);
          if(c=='c'||c=='C'){
             float fl=celsiusToFahrenheit(f);
             System.out.println("Temperature(Celsius)= "+f+"\tTemperature(Fahrenheit)= "+fl);
             System.out.println("Do you wish to continue(y/n)?");
             char ch=obj.next().charAt(0);
             if(ch=='y'||ch=='Y'){
              object.Process();
              }
            }
            else if(c=='f'||c=='F'){
            float f2=fahrenheitToCelsius(f);
            System.out.println("Temperature(Celsius)= "+f2+"\tTemperature(Fahrenheit)= "+f);
            System.out.println("Do you wish to continue(y/n)?");
            char ch=obj.next().charAt(0);
            if(ch=='y'||ch=='Y'){
             object.Process();
             }
          }
        } 
        public float celsiusToFahrenheit(float f){
            float fahren = 9*f/5+32;
            return fahren;
         }
         public float fahrenheitToCelsius(float f){
            float celsius = 5*(f-32)/9;
            return celsius;    
         }     
    
}