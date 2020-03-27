package edu.campus02;

public class Hamster {
    private String fellfarbe;

    public Hamster(String fellfarbe) {
        this.setFellfarbe(fellfarbe);
    }

    // Getter:
    public String getFellfarbe() {
        if (this.fellfarbe == null) {
            return "Braun";
        } else {
            return this.fellfarbe;
        }
    }

    // Setter:
    public void setFellfarbe(String neueFarbe) {
        switch (neueFarbe) {
            case "Braun":
            case "Weiß":
            case "Schwarz":
                this.fellfarbe = neueFarbe;
                break;
            default:
                System.out.println("Fellfarbe inkorrekt");
                System.out.println("Wird auf Braun gesetzt");
                this.fellfarbe = "Braun";
        }
    }
}
