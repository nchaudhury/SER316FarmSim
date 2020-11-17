# FARM SIMULATOR

To run "gradle runner"

And answer questions to run a a game until the farm has over 10k in currency.

Requirements hit: 

1.	A new world must start with at least 1 farm.

2.	Farms can be of different types, such as an animal farm, a crop farm, a hybrid farm and so on. You can choose to make something up too.

3.	The simulation should run on cycles. A cycle is considered to be of 2 parts - 1 day time and 1 night time.

4.	Passive currency is earned with each new day (not night). This passive currency income is generated from selling crops or animal products, or both depending on your farm

5.	More currency can be made from farmer, animal or crop affinities

6.	Farms are automatically upgraded once the farm has acquired enough currency. This could mean that the farm is expanded to grant it more land, which allows it to hold a greater numbers of farmers, animals and crops. The upgrade may also increase the passive currency income. In order for the simulation to not run into issues, it might be a nice idea to make sure the farm only upgrades once your farm has acquired 20% (choose any % you like though) more than the cost of an upgrade. So, if an upgrade costs $1000, it will automatically upgrade at $1200 so the farm still has $200.

7.	Animal product (milk, wool, and so on) is replenished after every 2nd day. For example, if a sheep is sheared for its wool then the farmers must wait 2 cycles (day and night) to collect the wool again.

8.	Crops may be harvested 1 time every 3 cycles.

9.	Animals reside on farms; it is up to you to decide the total number of animals that your farm(s) will hold. Think of typical farm animals such a cows and pigs, but you can be creative if you wish.

Design Patterns: 

Mediator Pattern: My World.java which currently contains my main will end up as the game manager. World will have a function that will run the day flipper in a while loop while checking if the farm has reached the upper bound of the currency limit. It will also start the world off with at least 1 farm. Mediator will also oversee making the farms. 1, 2, 3 are the requirements hit

Factory Pattern: Farm.java does much of the daily tasks for us without involving the world for creation. Farm.java also handles the animals and their conditions, whether they are ready to drop goods, as well as maintaining the amount of profit from the farm. This also handles passive currency. 4, 5, 6 are the requirements hit

Decorator Pattern: The 3 types of goods, animal, farmers, and crops are decorator patterns and they handle age, affinity, and value add past certain dates. 7,8,9 are the requirements hit
