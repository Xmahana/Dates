import javax.swing.JOptionPane;

public class date {
    public static void main(String[] args){
    
    //Variables
    int year_1, year_2, month_1, month_2, day_1, day_2;
    int result = 2;

    //Process
    year_1 = 365 * (Integer.parseInt(JOptionPane.showInputDialog(null, "Insert the year of the first date")));
    month_1 = 31 * Integer.parseInt(JOptionPane.showInputDialog(null, "Insert the month of the first date"));
    day_1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insert the day of the first date"));
    
    year_2 =  365 * Integer.parseInt(JOptionPane.showInputDialog(null, "Insert the year of the second date"));
    month_2 = 31 * Integer.parseInt(JOptionPane.showInputDialog(null, "Insert the month of the second date"));
    day_2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insert the day of the second date"));

    System.out.println(day_1 + "/" + (month_1/31) + "/" + (year_1/365));
    System.out.println(day_2 + "/" + (month_2/31) + "/" + (year_2/365));    

    result = year_1 + month_1 + day_1 - year_2 - month_2 - day_2;
    
    //Output

    if(result > 0){
        JOptionPane.showMessageDialog(null, "The first date si the higher");
        System.out.println("The first date si the higher");
    }else if(result < 0){
        JOptionPane.showMessageDialog(null, "The second date is the higher");
        System.out.println("The second date is the higher");
    }else{
        JOptionPane.showMessageDialog(null, "Both dates are equal");
        System.out.println("Both dates are equal");
    }

    }
}
