#include <stdio.h>

int main(){

//Variables

int year_1, month_1, day_1, year_2, month_2, day_2;
int result = 0;

//Process

printf("\n\nInsert the first year: ");
scanf("%i", &year_1);
printf("Insert the first month: ");
scanf("%i", &month_1);
printf("Insert the first day: ");
scanf("%i", &day_1);

printf("\n%i/%i/%i\n", day_1, month_1, year_1);

printf("\nInsert the second year: ");
scanf("%i", &year_2);
printf("Insert the second month: ");
scanf("%i", &month_2);
printf("Insert the second day: ");
scanf("%i", &day_2);
printf("\n%i/%i/%i\n", day_2, month_2, year_2);


if(year_1 > year_2){
        result = 1;     
}else{
    if(year_1 < year_2){
        result = 2;     
    }else{
        if(month_1 > month_2){
            result = 1;     
        }else{
            if(month_1 < month_2){
                result = 2;
            }else{
                if(day_1 > day_2){
                    result = 1;
                }else{
                    if(day_1 < day_2){
                        result = 2;
                    }
                }
            }
        }   
    }   
}



//Output
switch(result){
        case 0: printf("Both dates are equal"); break;
        case 1: printf("The first date is higher"); break;
        case 2: printf("The second date is higher"); break;
        default: printf("An error has ocurred");
    }
printf("\n");    
printf("%i", result);
}