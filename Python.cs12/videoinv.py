

class video:
    #defines variables that are gonna be used in the code
    def __init__(self, name, genere, cost, rented_by):
        self.name = name
        self. genere = genere
        self.cost = cost
        self.rented_by = rented_by
    
Harry_Potter = video("Harry_Potter", "Fantasy", 5.00, "Person")
To_All_The_Boys_Ive_Loved_before = video ("To_All_The_Boys_Ive_Loved_before", "Romance", 10.00, "Teenage girl")
Bee_Movie = video("Bee Movie", "Children movie", 500.00, "Perverted old man")

inventory = [Harry_Potter,To_All_The_Boys_Ive_Loved_before, Bee_Movie]
        #saves inventory
def save_inventory(inventory):
    print("saving inventory")
    f = open('data', 'w')
    for item in inventory:
        f.write(item.name + '\t' + item.genere + '\t' + str(item.cost) + '\t' + item.rented_by + '\n' )
    f.close()
        #loads inventory and prints it
def load_inventory():
    print("loading inventory")
    loaded_inventory = []
    f = open('data', 'r')
    for line in f.readlines():
        split_line = line.split('\t')
        inventory.append(video(split_line[0], split_line[1], float(split_line[2], split_line[3])))
    f.close()
    return loaded_inventory

save_inventory(inventory)