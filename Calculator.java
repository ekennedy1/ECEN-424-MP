import java.io.*;

public class Calculator {
    private String name;
    public Float addition (Float A, Float B){
        Float result;
        result = A + B;
        return result;
    }
    public Float subtraction (Float A, Float B){
        Float result;
        result = A - B;
        return result;
    }
    public Float multiplication (Float A, Float B){
        Float result;
        result = A * B;
        return result;
    }
    public void setname (String N){
        name = N;
    }
    public String getname(){
        
        return name;
    }

}