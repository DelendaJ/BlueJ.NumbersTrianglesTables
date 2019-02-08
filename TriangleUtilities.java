 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String answer = "";
        for (int i = 1; i <= numberOfStars; i++)
        {answer += "*";
        }      
        return answer;    
   
        
        
    }
    
    public static String getTriangle(int numberOfRows) {
        String floor = "";
        for (int i = 1; i <= numberOfRows; i++)
        {floor += (getRow(i) + "\n");
          
        
    } return floor;
}


    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
