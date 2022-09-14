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
* Example output
  ![statistic](https://3.downloader.disk.yandex.ru/preview/9f56660f9d79b2e0324cb79988b6398a40c13161345714e0c22396991dd2b455/inf/iCmY46af0GzbdcnqEkofMmjswsRmzRznhQt_NC5basM74OXfIbD7IpphNhyt54cDwCeCnkI9--HFu4ogAmvOAw%3D%3D?uid=101874506&filename=eating.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&owner_uid=101874506&tknv=v2&size=1920x969)

* Method printInfo(); draws the field with Animals

* Example output
![console_output](https://2.downloader.disk.yandex.ru/preview/74914f477655098c116d10a8648b51862638acfa6afb011f30449800d75881f4/inf/TDY_HwcmkYORhISaYQGqwO6pVpeKiIY0NqW4keaB7kyZsmzE_O3QToIUeA9YGuOizNq_TZxx6aBuL9ERgzG5Aw%3D%3D?uid=101874506&filename=animal.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&owner_uid=101874506&tknv=v2&size=1920x969)

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
* Example output
  ![statistic](https://3.downloader.disk.yandex.ru/preview/9f56660f9d79b2e0324cb79988b6398a40c13161345714e0c22396991dd2b455/inf/iCmY46af0GzbdcnqEkofMmjswsRmzRznhQt_NC5basM74OXfIbD7IpphNhyt54cDwCeCnkI9--HFu4ogAmvOAw%3D%3D?uid=101874506&filename=eating.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&owner_uid=101874506&tknv=v2&size=1920x969)

* Method printInfo(); draws the field with Animals

* Example output
  ![console_output](https://2.downloader.disk.yandex.ru/preview/74914f477655098c116d10a8648b51862638acfa6afb011f30449800d75881f4/inf/TDY_HwcmkYORhISaYQGqwO6pVpeKiIY0NqW4keaB7kyZsmzE_O3QToIUeA9YGuOizNq_TZxx6aBuL9ERgzG5Aw%3D%3D?uid=101874506&filename=animal.png&disposition=inline&hash=&limit=0&content_type=image%2Fpng&owner_uid=101874506&tknv=v2&size=1920x969)

