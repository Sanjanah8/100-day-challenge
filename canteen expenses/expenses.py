def calculate_canteen_expense():
    """
    Calculates total canteen expense based on user input.
    """

    total_expense = 0

    while True:
        item_name = input("Enter item name (or 'done' to finish): ")
        if item_name.lower() == "done":
            break

        try:
            item_price = float(input("Enter item price: "))
        except ValueError:
            print("Invalid price. Please enter a number.")
            continue

        total_expense += item_price

    return total_expense

expense = calculate_canteen_expense()
print("Total canteen expense:", expense)
