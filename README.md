# Island
## Island location with Animals and Grasses

> Class Animal is abstract
>> Classes Predator, Herbivore extend Animal
>>> Classes: Bear, Eagle, Fox, Snake, Wolf ------- extend Predator
> 
>>> Classes: Buffalo, Caterpillar, Deer, Duck, Goat, Hog, Horse, Mouse, Rabbit, Sheep ------- extend Herbivore

«This abstraction looks like» 

![Example](https://imgur.com/a/tblOKeQ)

### Class Animal
* Class Animal has abstract methods: eat(); reproduction;
* Class Animal initializes parameters for all Animals
* Class Animal has inner enum Direction and at the same time it sets random Direction for every animal
* Method getPosition gets the current Position of the Animal
--------------------------------------------------------------------------------------------------------------
### Class Island
* Class Island has massive of ArrayLists
* Class Island has inner class Rectangle for boarder field
* Method move check bounds of the field and run chooseTheWay(); 
If the current position of the Animal in Rectangle -> move works// or Animal cannot move above the boarder
* Method checkAnimalPosition(); checks the current position of the Animal and run ExecutorService with methods: eat(); reproduction();
* Method lifeCycle has loop and works 10 times and run ExecutorService
--------------------------------------------------------------------------------------------------------------
### Class Predator
* Method eat(); runs getPosition and gets the current position of the Animal
* If Predator has Herbivore animal on the same cell. Predator eats Herbivore
* Method reproduction(); randomly generates new Predator (50/50 chance)
--------------------------------------------------------------------------------------------------------------
### Class Herbivore
* Method eat(); runs getPosition and gets the current position of the Animal
* If Herbivore has Plants on the same cell. Herbivore eats Plants
* Method reproduction(); randomly generates new Herbivore (50/50 chance)
--------------------------------------------------------------------------------------------------------------
### Class Plants 
* Method reproduction(); generates new Plants every iteration of the Day

