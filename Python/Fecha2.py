#Variables
result = 0

year_1 = int (input("\n\nInsert the first year: "))
month_1 = int(input("Insert the first month: "))
day_1 = int(input("Insert the first day: "))

year_2 = int (input("\nInsert the second year: "))
month_2 = int(input("Insert the second month: "))
day_2 = int(input("Insert the second day: "))

#Process

if year_1 < year_2:
    result = 2
else:
    if year_1 > year_2:
        result = 1
    else:
        if month_1 < month_2:
            result = 2
        else:
            if month_2 > month_2:
                result = 1
            else:
                if day_1 < day_2:
                    result = 2
                else:
                    if day_1 > day_2:
                        result = 1

#Output

if result == 0:
    print("Both dates are equal")
elif result == 1:
    print("The first date is the higher")
elif result == 2:
    print("The second date is the higher")
else:
    print("Error")    

