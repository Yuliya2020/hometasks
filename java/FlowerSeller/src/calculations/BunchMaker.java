package calculations;


import flowersAndAccessories.*;


import java.util.*;


public class BunchMaker {
    public static void main ( String[] args) {

        Rose redRose = new Rose(20, "red", 2.00, "today");
        Rose whiteRose = new Rose(20, "white", 2.00, "today");
        Rose yellowRose = new Rose(20, "yellow", 2.00, "today");
        Rose peachRose = new Rose(20, "peach", 2.00, "today");
        Rose wineRose = new Rose(20, "wine", 2.00, "today");

        LinkedList<Rose> rosesOfDifferentColors = new LinkedList<>();
        rosesOfDifferentColors.add(redRose);
        rosesOfDifferentColors.add(whiteRose);
        rosesOfDifferentColors.add(yellowRose);
        rosesOfDifferentColors.add(peachRose);
        rosesOfDifferentColors.add(wineRose);

        Tulip redTulip = new Tulip(18, "red", 1.50, "yesterday");
        Tulip whiteTulip = new Tulip(18, "white", 1.50, "yesterday");
        Tulip yellowTulip = new Tulip(18, "yellow", 1.50, "yesterday");
        Tulip peachTulip = new Tulip(18, "peach", 1.50, "yesterday");
        Tulip wineTulip = new Tulip(18, "wine", 1.50, "yesterday");
        Tulip pinkTulip = new Tulip(18, "pink", 1.50, "yesterday");

        LinkedList<Tulip> tulipsOfDifferentColors = new LinkedList<>();
        tulipsOfDifferentColors.add(redTulip);
        tulipsOfDifferentColors.add(whiteTulip);
        tulipsOfDifferentColors.add(yellowTulip);
        tulipsOfDifferentColors.add(peachTulip);
        tulipsOfDifferentColors.add(wineTulip);
        tulipsOfDifferentColors.add(pinkTulip);

        Iris violetIris = new Iris(17, "violet", 2.50, "yesterday");
        Iris whiteIris = new Iris(17, "white", 2.50, "yesterday");
        Iris yellowIris = new Iris(17, "yellow", 2.50, "yesterday");

        LinkedList<Iris> irisesOfDifferentColors = new LinkedList<>();
        irisesOfDifferentColors.add(violetIris);
        irisesOfDifferentColors.add(whiteIris);
        irisesOfDifferentColors.add(yellowIris);


        Ribbon redRibbon = new Ribbon("red", 0.8);
        Ribbon whiteRibbon = new Ribbon("white", 0.8);
        Ribbon yellowRibbon = new Ribbon("yellow", 0.8);
        Ribbon blueRibbon = new Ribbon("blue", 0.8);
        Ribbon greenRibbon = new Ribbon("green", 0.8);

        LinkedList<Ribbon> ribbonsOfDifferentColors = new LinkedList<Ribbon>();
        ribbonsOfDifferentColors.add(redRibbon);
        ribbonsOfDifferentColors.add(whiteRibbon);
        ribbonsOfDifferentColors.add(yellowRibbon);
        ribbonsOfDifferentColors.add(blueRibbon);
        ribbonsOfDifferentColors.add(greenRibbon);

        Packaging transparentPackaging = new Packaging("transparent", 0.5);
        Packaging brownPackaging = new Packaging("brown", 0.3);
        Packaging whitePackaging = new Packaging("white", 0.4);
        Packaging pinkPackaging = new Packaging("pink", 0.35);

        LinkedList<Packaging> packagingsOfDifferentColors = new LinkedList<>();
        packagingsOfDifferentColors.add(transparentPackaging);
        packagingsOfDifferentColors.add(brownPackaging);
        packagingsOfDifferentColors.add(whitePackaging);
        packagingsOfDifferentColors.add(pinkPackaging);

        Scanner in = new Scanner(System.in);
        System.out.println("input 1 for rose, 2 for tulip or 3 for iris");
        int firstKindOfFlowers = in.nextInt();
        System.out.println("input the flower's quantity or 0 twice if these flowers are not needed");
        int quantityOfFirstKindOfFlowers = in.nextInt();

        if (quantityOfFirstKindOfFlowers > 0) {
            if (firstKindOfFlowers == 1) {
                System.out.println("choose color of first flowers: input 0 for red, 1 for white, 2 for yellow, 3 for peach, 4 for wine or any other figure to proceed to accessories");
            } else if (firstKindOfFlowers == 2) {
                System.out.println("choose color of first flowers: input 0 for red, 1 for white, 2 for yellow, 3 for peach, 4 for wine, 5 for pink or any other figure to proceed to accessories");
            } else if (firstKindOfFlowers == 3) {
                System.out.println("choose color of first flowers: input 0 for violet, 1 for white, 2 for yellow or any other figure to proceed to accessories");
            }
        }
        int chosenColorOfFirstKindOfFlowers = in.nextInt();

        System.out.println("input 1 for rose, 2 for tulip or 3 for iris or 0 if these flowers are not needed");
        int secondKindOfFlowers = in.nextInt();
        if (secondKindOfFlowers < 4) {
            System.out.println("input the flower's quantity or 0 twice to  proceed to accessories");
        }
        int quantityOfSecondKindOfFlowers = in.nextInt();
        if (quantityOfSecondKindOfFlowers > 0) {
            if (secondKindOfFlowers == 1) {
                System.out.println("choose color of second flowers: input 0 for red, 1 for white, 2 for yellow, 3 for peach, 4 for wine or any other figure to proceed to accessories");
            } else if (secondKindOfFlowers == 2) {
                System.out.println("choose color of second flowers: input 0 for red, 1 for white, 2 for yellow, 3 for peach, 4 for wine, 5 for pink or any other figure to proceed to accessories");
            } else if (secondKindOfFlowers == 3) {
                System.out.println("choose color of second flowers: input 0 for violet, 1 for white, 2 for yellow or any other figure to proceed to accessories");
            }
        }
        int chosenColorOfSecondKindOfFlowers = in.nextInt();

        System.out.println("input 1 for rose, 2 for tulip or 3 for iris or 0 to proceed to accessories");
        int thirdKindOfFlowers = in.nextInt();
        if (thirdKindOfFlowers < 4) {

            System.out.println("input the flower's quantity or 0 twice to proceed to accessories");
        }
        int quantityOfThirdKindOfFlowers = in.nextInt();
        if (quantityOfThirdKindOfFlowers > 0) {
            if (thirdKindOfFlowers == 1) {
                System.out.println("choose color of third flowers: input 0 for red, 1 for white, 2 for yellow, 3 for peach, 4 for wine or any other figure to proceed to accessories");
            } else if (thirdKindOfFlowers == 2) {
                System.out.println("choose color of third flowers: input 0 for red, 1 for white, 2 for yellow, 3 for peach, 4 for wine, 5 for pink or any other figure to proceed to accessories");
            } else if (thirdKindOfFlowers == 3) {
                System.out.println("choose color of third flowers: input 0 for violet, 1 for white, 2 for yellow or any other figure to proceed to accessories");
            }
        }

        int chosenColorOfThirdKindOfFlowers = in.nextInt();

        System.out.println("input the ribbons' quantity or 0 twice if ribbons are not needed");
        int quantityOfRibbons = in.nextInt();
        if (quantityOfRibbons > 0) {
            System.out.println("choose color of ribbons: input 0 for red, 1 for white, 2 for yellow, 3 for blue, 4 for green or any other figure to proceed to accessories");
        }
        int chosenColorOfRibbons = in.nextInt();
        System.out.println("input the packaging's quantity or 0 twice if the bunch is complete");
        int quantityOfPackagings = in.nextInt();
        if (quantityOfPackagings > 0) {
            System.out.println("choose color of packagings: input 0 for transparent, 1 for brown, 2 for white, 3 for pink or any other figure to proceed to accessories");
        }
        int chosenColorOfPackagings = in.nextInt();
        if (quantityOfFirstKindOfFlowers != 0 && firstKindOfFlowers < 4 || quantityOfSecondKindOfFlowers != 0 && secondKindOfFlowers < 4 || quantityOfThirdKindOfFlowers != 0 && thirdKindOfFlowers < 4) {

            System.out.println("The bunch: ");
        }

        double totalCost = 0;
        int totalQuantityOfChosenFlowers = 0;

       LinkedList<Flower> chosenFlowers  = new LinkedList<Flower>();

        if (quantityOfFirstKindOfFlowers != 0) {
            if (firstKindOfFlowers == 1) {
                System.out.println(quantityOfFirstKindOfFlowers + " " + rosesOfDifferentColors.get(chosenColorOfFirstKindOfFlowers));
                totalCost = totalCost + (rosesOfDifferentColors.get(chosenColorOfFirstKindOfFlowers).getPrice() * quantityOfFirstKindOfFlowers);
                totalQuantityOfChosenFlowers = totalQuantityOfChosenFlowers + quantityOfFirstKindOfFlowers;
              chosenFlowers.add(rosesOfDifferentColors.get(chosenColorOfFirstKindOfFlowers));
            } else if (firstKindOfFlowers == 2) {
                System.out.println(quantityOfFirstKindOfFlowers + " " + tulipsOfDifferentColors.get(chosenColorOfFirstKindOfFlowers));
                totalCost = totalCost + (tulipsOfDifferentColors.get(chosenColorOfFirstKindOfFlowers).getPrice() * quantityOfFirstKindOfFlowers);
                totalQuantityOfChosenFlowers = totalQuantityOfChosenFlowers + quantityOfFirstKindOfFlowers;
                chosenFlowers.add(tulipsOfDifferentColors.get(chosenColorOfFirstKindOfFlowers));
            } else if (firstKindOfFlowers == 3) {
                System.out.println(quantityOfFirstKindOfFlowers + " " + irisesOfDifferentColors.get(chosenColorOfFirstKindOfFlowers));
                totalCost = totalCost + (irisesOfDifferentColors.get(chosenColorOfFirstKindOfFlowers).getPrice() * quantityOfFirstKindOfFlowers);
                totalQuantityOfChosenFlowers = totalQuantityOfChosenFlowers + quantityOfFirstKindOfFlowers;
                chosenFlowers.add(irisesOfDifferentColors.get(chosenColorOfFirstKindOfFlowers));
            }

        }


        if (quantityOfSecondKindOfFlowers != 0) {
            if (secondKindOfFlowers == 1) {
                System.out.println(quantityOfSecondKindOfFlowers + " " + rosesOfDifferentColors.get(chosenColorOfSecondKindOfFlowers));
                totalCost = totalCost + (rosesOfDifferentColors.get(chosenColorOfSecondKindOfFlowers).getPrice() * quantityOfSecondKindOfFlowers);
                totalQuantityOfChosenFlowers = totalQuantityOfChosenFlowers + quantityOfSecondKindOfFlowers;
                chosenFlowers.add(rosesOfDifferentColors.get(chosenColorOfSecondKindOfFlowers));
            } else if (secondKindOfFlowers == 2) {
                System.out.println(quantityOfSecondKindOfFlowers + " " + tulipsOfDifferentColors.get(chosenColorOfSecondKindOfFlowers));
                totalCost = totalCost + (tulipsOfDifferentColors.get(chosenColorOfSecondKindOfFlowers).getPrice() * quantityOfSecondKindOfFlowers);
                totalQuantityOfChosenFlowers = totalQuantityOfChosenFlowers + quantityOfSecondKindOfFlowers;
                chosenFlowers.add(tulipsOfDifferentColors.get(chosenColorOfSecondKindOfFlowers));
            } else if (secondKindOfFlowers == 3) {
                System.out.println(quantityOfSecondKindOfFlowers + " " + irisesOfDifferentColors.get(chosenColorOfSecondKindOfFlowers));
                totalCost = totalCost + (irisesOfDifferentColors.get(chosenColorOfSecondKindOfFlowers).getPrice() * quantityOfSecondKindOfFlowers);
                totalQuantityOfChosenFlowers = totalQuantityOfChosenFlowers + quantityOfSecondKindOfFlowers;
                chosenFlowers.add(irisesOfDifferentColors.get(chosenColorOfSecondKindOfFlowers));
            }
        }

        if (quantityOfThirdKindOfFlowers != 0) {
            if (thirdKindOfFlowers == 1) {
                System.out.println(quantityOfThirdKindOfFlowers + " " + rosesOfDifferentColors.get(chosenColorOfThirdKindOfFlowers));
                totalCost = totalCost + (rosesOfDifferentColors.get(chosenColorOfThirdKindOfFlowers).getPrice() * quantityOfThirdKindOfFlowers);
                totalQuantityOfChosenFlowers = totalQuantityOfChosenFlowers + quantityOfThirdKindOfFlowers;
                chosenFlowers.add(rosesOfDifferentColors.get(chosenColorOfThirdKindOfFlowers));
            } else if (thirdKindOfFlowers == 2) {
                System.out.println(quantityOfThirdKindOfFlowers + " " + tulipsOfDifferentColors.get(chosenColorOfThirdKindOfFlowers));
                totalCost = totalCost + (tulipsOfDifferentColors.get(chosenColorOfThirdKindOfFlowers).getPrice() * quantityOfThirdKindOfFlowers);
                totalQuantityOfChosenFlowers = totalQuantityOfChosenFlowers + quantityOfThirdKindOfFlowers;
                chosenFlowers.add(tulipsOfDifferentColors.get(chosenColorOfThirdKindOfFlowers));
            } else if (thirdKindOfFlowers == 3) {
                System.out.println(quantityOfThirdKindOfFlowers + " " + irisesOfDifferentColors.get(chosenColorOfThirdKindOfFlowers));
                totalCost = totalCost + (irisesOfDifferentColors.get(chosenColorOfThirdKindOfFlowers).getPrice() * quantityOfThirdKindOfFlowers);
                totalQuantityOfChosenFlowers = totalQuantityOfChosenFlowers + quantityOfThirdKindOfFlowers;
                chosenFlowers.add(irisesOfDifferentColors.get(chosenColorOfThirdKindOfFlowers));
            }

        }

        System.out.println(totalQuantityOfChosenFlowers + " flowers chosen");

        if (quantityOfRibbons != 0) {
            System.out.println(quantityOfRibbons + " " + ribbonsOfDifferentColors.get(chosenColorOfRibbons));
            totalCost = totalCost + (ribbonsOfDifferentColors.get(chosenColorOfRibbons).getPrice() * quantityOfRibbons);
        }

        if (quantityOfPackagings != 0) {

            System.out.println(quantityOfPackagings + " " + packagingsOfDifferentColors.get(chosenColorOfPackagings));
            totalCost = totalCost + (packagingsOfDifferentColors.get(chosenColorOfPackagings).getPrice() * quantityOfPackagings);
        }
        System.out.println("Total cost: " + totalCost + " byn");
        if (secondKindOfFlowers == 0 && quantityOfSecondKindOfFlowers == 0 && quantityOfThirdKindOfFlowers == 0 || firstKindOfFlowers > 3 && secondKindOfFlowers > 3 && thirdKindOfFlowers > 3) {
            System.out.println("No flowers have been chosen");
        }

            chosenFlowers.sort(Comparator.comparing(Flower::getFreshness)

                    .thenComparing(Flower::getFreshness)
                    .thenComparing(Flower::getFreshness));

        System.out.println("The chosen flowers sorted by freshness from the freshest one: " + chosenFlowers);

        System.out.println("input the minimum length of flowers");
        int minimumLengthOfFlowers = in.nextInt();
        System.out.println("input the maximum length of flowers");
        int maximumLengthOfFlowers = in.nextInt();

        LinkedList<Flower> flowersWithChosenLength  = new LinkedList<Flower>();
        int i;
        for (i = 0; i < chosenFlowers.size(); i++) {
            if ((chosenFlowers.get(i).getLength() >= minimumLengthOfFlowers) && (chosenFlowers.get(i).getLength() <= maximumLengthOfFlowers)) {
                flowersWithChosenLength.add(chosenFlowers.get(i));
            }else {}
        }
       if (flowersWithChosenLength.isEmpty()){ System.out.println("There are no flowers in the bunch with the chosen length");}
       else { System.out.println("Flowers in the bunch with the chosen length: " + flowersWithChosenLength);


       }}}





