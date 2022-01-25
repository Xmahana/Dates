#Variables
result = 0

year_1 = int (input("\n\nInsert the first year: ")) * 365
month_1 = int(input("Insert the first month: ")) * 31
day_1 = int(input("Insert the first day: "))

year_2 = int (input("\nInsert the second year: ")) * 365
month_2 = int(input("Insert the second month: ")) * 31
day_2 = int(input("Insert the second day: ")) 

result = year_1 + month_1 + day_1 - year_2 - month_2 - day_2

#Process

result = year_1 + month_1 + day_1 - year_2 - month_2 - day_2

#Output

if result == 0:
    print("Both dates are equal")
elif result > 0:
    print("The first date is the higher")
elif result < 0:
    print("The second date is the higher")
else:
    print("Error")    

