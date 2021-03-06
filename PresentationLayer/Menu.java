package PresentationLayer;

public enum Menu {
    NEW("1. Make a new booking."),
    EDIT("2. Edit a booking."),
    CONFIRMATION("3. Check confirmation status."),
    PAYMENT("4. Make a payment."),
    EXIT("5. Exit from the application.");

    public final String label;

    private Menu(String lbl) {
       this.label = lbl;
    }
    //Method will be invoked and will print menu items which the user will wish to act upon
    public void DisplayMenu() {
        System.out.println("Main Menu");
        System.out.println("=========================================================");
        System.out.println(Menu.NEW.label);
        System.out.println(Menu.EDIT.label);
        System.out.println(Menu.CONFIRMATION.label);
        System.out.println(Menu.PAYMENT.label);
        System.out.println(Menu.EXIT.label);
        System.out.println("=========================================================");
    }
}

