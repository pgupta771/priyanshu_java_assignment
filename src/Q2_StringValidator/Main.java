package Q2_StringValidator;

@FunctionalInterface
interface StringValidator{
    boolean validate(String value);
}

public class Main{
     public static boolean validate(String value, StringValidator validator){
         return validator.validate(value);
     }

     public static void main(String[] args){
         String check = "Helloooothisisprii";

         System.out.println(validate(check,v->!v.isEmpty()));
         System.out.println(validate(check, v->v.length()>5));
         System.out.println(validate(check,v->Character.isUpperCase(v.charAt(0))));
     }
}