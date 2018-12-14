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
#Get's the total charge by adding each item that's taken out then prints inventory out
def total_charged():
    total_charged =0
    for i in inventory:
        if i.current_renter  != "":
            total_charged += float(i.price)
    return total_charged

def edit_item():
    title = input("Enter Title: ")
    for i in inventory:
        if i.title.lower() == input.lower():
            title = input("Enter new Title: ")
            year = input("Enter new year: ")
            price = input("Enter new price: ")
            genre = input("Enter new genre: ")
            shelf_number = input("Enter new Shelf Number: ")
            current_renter = input("Enter new current renter: ")
            i.title = title
            i.year = year
            i.price = price
            i.genre = genre
            i.shelf_number = shelf_number
            i.current_renter = current_renter
            save_inventory_json(inventory)



#searches the movie info by name
def search_by_name():
    title = input("Enter Title: ")
    for i in inventory:
        if i.title.lower() == input.lower():
            return i
            print(i.title, i.year, i.price, i.genre, i.shelf_number, i.current_renter, sep="\t")

    return None
     

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

    if choice == '6':
        break
    elif choice == '2':
        print_inventory()
    elif choice == '1':
        create_new_item()
    elif choice =='4':
        print(get_total_charged(inventory))
    elif choice == '5':
        i=search_by_name
        if instance (i, Item):
        print(search_by_name(invenetory))
    elif choice == '3':
        edit_item()
    else
        print("Invalid Input")