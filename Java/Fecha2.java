import javax.swing.JOptionPane;

public class Fecha2 {
    public static void main(String[] args){
    
    //Variables
    int year_1, year_2, month_1, month_2, day_1, day_2;
    int result = 0 ;

    //Process
    year_1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insert the year of the first date"));
    month_1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insert the month of the first date"));
    day_1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insert the day of the first date"));
    
    year_2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insert the year of the second date"));
    month_2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insert the month of the second date"));
    day_2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insert the day of the second date"));
    
    System.out.println(day_1 + "/" + month_1 + "/" + year_1);
    System.out.println(day_2 + "/" + month_2 + "/" + year_2);    

    if(year_1 < year_2){
        result = 2;    
    }else{
        if(month_1 < month_2){
            result = 2;
        }else{
            if(day_1 < day_2){
                result = 2;
            }else{
                if(year_1 > year_2){
                    result = 1;    
                }else{
                    if(month_1 > month_2){
                        result = 1;
                    }else{
                        if(day_1 > day_2){
                            result = 1;
                        }
                    }
                }            
            }
        }
    }

    
    //Output

    switch(result){
        case 0: JOptionPane.showMessageDialog(null, "Both dates are equal"); 
        System.out.println("Both dates are equal"); break;
        case 1: JOptionPane.showMessageDialog(null, "The first date is higher"); 
        System.out.println("The first date is higher"); break;
        case 2: JOptionPane.showMessageDialog(null, "The second date is higher"); 
        System.out.println("The second date is higher"); break;
        default: JOptionPane.showMessageDialog(null, "An error has ocurred"); 
        System.out.println("Error");
    }
    }
}