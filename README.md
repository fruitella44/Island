# Island
## Island location with Animals and Grass

> Class Animal is abstract
>> Classes Predator, Herbivore extend Animal
>>> Classes: Bear, Eagle, Fox, Snake, Wolf >>> extend Predator
>
>>> Classes: Buffalo, Caterpillar, Deer, Duck, Goat, Hog, Horse, Mouse, Rabbit, Sheep >>> extend Herbivore


### Class Animal
* Class Animal has abstract methods: eat(); reproduction;
* Class Animal initializes parameters for all Animals
* Animal implements random direction for each animal
* Method getPosition gets the current Position of the Animal
--------------------------------------------------------------------------------------------------------------
### Class Island
* Class Island has massive of ArrayLists
* Class Island has inner class Rectangle for boarder field
* Method move check bounds of the field and run chooseTheWay();
* If the current position of the Animal in Rectangle -> [ ] <- Animal can move, or they stay on the same cell
* Method checkAnimalPosition(); checks the current position of the Animal and run ExecutorService with methods: eat(); reproduction();
* Method lifeCycle has loop and works 20 times and run ExecutorService
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

### Class Statistic
* Method getLog(); writes statistic on each iteration while Animal kills another Animal
* Method printInfo(); draws the field with Animals
![output](https://downloader.disk.yandex.ru/preview/652c9605909a69e7a390763184cd25ee13bf565a99efd25aae0b7743be0809ce/6321ea2e/TDY_HwcmkYORhISaYQGqwO6pVpeKiIY0NqW4keaB7kyZsmzE_O3QToIUeA9YGuOizNq_TZxx6aBuL9ERgzG5Aw%3D%3D?uid=0&filename=animal.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&owner_uid=0&tknv=v2&size=2048x2048)



