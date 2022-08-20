//package com.company;
//
//public class PC
//{
//    private Case theCase;
//    private Monitor monitors;
//    private Motherboard motherboard;
//
//    public PC(Case theCase, Monitor monitors, Motherboard motherboard) {
//        this.theCase = theCase;
//        this.monitors = monitors;
//        this.motherboard = motherboard;
//    }
//
//    public Case getTheCase() {
//        return theCase;
//    }
//
//    public Monitor getMonitors() {
//        return monitors;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
//}  Another example follows that makes the methods not accessable by the main method

package com.company;

public class PC
{
    private Case theCase;
    private Monitor monitors;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitors, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitors = monitors;
        this.motherboard = motherboard;
    }


    public void powerUp()
    {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo()
    {
        //fancy graphics
        monitors.drawPixelAt(1200,50,"Yellow");
    }

//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getMonitors() {
//        return monitors;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }
}
