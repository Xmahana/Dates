#include <stdio.h>

int main(){

//Variables

int year_1, month_1, day_1, year_2, month_2, day_2;
int result = 0;

//Process

printf("Insert the first year: ");
scanf("%i", &year_1); year_1 *= 365;
printf("Insert the first month: ");
scanf("%i", &month_1); month_1 *= 31;
printf("Insert the first day: ");
scanf("%i", &day_1); 

printf("\n%i/%i/%i\n", day_1, month_1/31, year_1/365);

printf("\nInsert the second year: ");
scanf("%i", &year_2); year_2 *= 365;
printf("Insert the second month: ");
scanf("%i", &month_2); month_2 *= 31;
printf("Insert the second day: ");
scanf("%i", &day_2);
printf("\n%i/%i/%i\n", day_2, month_2/31, year_2/365);

result = year_1 + month_1 + day_1 - year_2 - month_2 - day_2;

//Output
printf("\n");    
if(result > 0){
    printf("The first date si the higher");
    }else if(result < 0){
    printf("The second date is the higher");
    }else{
    printf("Both dates are equal");
    }
}