import jsonpickle
from item import Item
inventory=[]
inventory.append(Item("Star wars", "1973", "5.00", "Sci-Fi", "4", "None"))
inventory.append(Item("Predator","1985","5.00", "Thriller","2","Chad"))


def load_inventory_json(inventory):
    #clears whatever is in invintory, opens a file, decodes the stuff inside the file from strings to array of item objects, then it, then returns the inventory
    inventory.clear()
    inventory_file = open('inventory.json', 'r')
    inventory = jsonpickle.decode(inventory_file.read())
    inventory_file.close()
    return inventory
#does the opposite above and writes stuff 
def save_inventory_json(inventory):
    inventory_file = open('inventory.json', 'w')
    json_string = jsonpickle.encode(inventory)
    inventory_file.write(json_string)
    inventory_file.close()

    

def print_inventory():
    for i in inventory:
        print(i.title, i.year, i.price, i.genre, i.shelf_number, i.current_renter, sep="\t")

#the function that allows you to make new values for the inventory
def create_new_item():
    title = input("Enter Title: ")
    year = input("Enter year: ")
    price = input("Enter price: ")
    genre = input("Enter genre: ")
    shelf_number = input("Enter Shelf Number: ")
    current_renter = input("Enter current renter: ")

    item = Item(title, year, price, genre, shelf_number, current_renter)

    inventory.append(item)

    save_inventory_json(inventory)
inventory = load_inventory_json(inventory)

while True:
    #follows a different function depending on what choice you make
    print("choose option")
    print("1. Create/add inventory item")
    print("2. View Inventory")
    print("3. Exit")
    choice = input(">")

    if choice == '3':
        break
    elif choice == '2':
        print_inventory()
    elif choice == '1':
        create_new_item()
    else:
        print("Invalid Input")