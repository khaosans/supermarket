[![Build Status](https://travis-ci.org/khaosans/supermarket.svg?branch=master)](https://travis-ci.org/khaosans/supermarket)

## SuperMarket

This program simulates a supermarket which has items.  Each item is then passed through the register which will yield the total price of all items.
For this simulation, each price is mapped as follows:

```
ItemA = 20
```

```
ItemB = 50
```

```
ItemC = 30
```

In the case of ItemB, there is a special which says if you buy 5 item B's, you will only need to pay for the price 3 of item B's.  Other than that, its face value for each item.

The value of these items can be set using the constructor when instantiating new objects or by using the setters for each item.

## Installation

```git clone git@github.com:khaosans/supermarket.git```

```mvn clean install```

## Usage

In the SuperMarket.java main you can call the method checkout on any string of products (A,B or C):

```
System.out.println(SuperMarket.checkOut("ABBACBBAB"));
```

Used to instantiate another supermarket with non-default prices (Item A, Item B, Item C):

```
new SuperMarket(1,2,3);
```

Change prices of the supermarket:

```
new SuperMarket(1,2,3);
setPriceOfItemA(10);
setPriceOfItemB(20);
setPriceOfItemC(30)
```




