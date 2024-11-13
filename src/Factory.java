public class Factory {

    String nameofFactory;
    int yearfounded;

    boolean inUse;

    public static void main(String[] args) {
        new Factory();
    }


    public Factory() {
        nameofFactory = "Pumpkin factory ";
        yearfounded = 1923;
        inUse = false;
        System.out.println(nameofFactory + yearfounded);
        Pumpkin spookly = new Pumpkin("round", "blue", 20, true);
        spookly.color = "green ";
        System.out.println(spookly.size + 2);
        spookly.size = 17;
        System.out.println("changed size:" + spookly.size);
        System.out.println(spookly.color + spookly.shape + "Halloween pumpkin? " + spookly.isHalloween);
        System.out.println();
        System.out.println("spookly info");
        System.out.println();
        spookly.printInfo();
        System.out.println();
        System.out.println("Boo info");
        System.out.println();
        Pumpkin boo = new Pumpkin("square", "green", 50, false);
        boo.printInfo();
        System.out.println();
        System.out.println("Ghost info");
        System.out.println();
        Pumpkin Ghost = new Pumpkin("ball", "pink", 90, false);
        Ghost.printInfo();
        System.out.println();
        System.out.println("casper info");
        System.out.println();
        Pumpkin casper = new Pumpkin();
        casper.printInfo();



        for (int x = 0; x < 10; x++) {
            System.out.println("pumpkin number " + x);
            Pumpkin ten =new Pumpkin();
            ten.size=(int)(Math.random()*101);
            if (ten.size>50) {
                ten.isHalloween = true;


            }else {
                ten.isHalloween = false;
            }

                ten.printInfo();



        }
        System.out.println("factory aquired by a cookie company");
        System.out.println("now makes cookies and pumpkins");
        nameofFactory="P.C. Factory";
        System.out.println(nameofFactory);
        Cookie firstc = new Cookie();
       firstc.printCInfo();
    }
}





