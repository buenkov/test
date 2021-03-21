package example;

public class Tank {
    private int[] position = {0, 0};
    private String direction = "x";
    private int fuel = 0;
    private int tankcount = 0;
    static int t_count =1;
    final String name = "T34";

    int refill(String r_fuel) {
        if (r_fuel.equals("ask") == true || r_fuel.equals("?") == true || r_fuel.equals("") == true) {
            System.out.println("В баке танка "+ name+"-"+ getTankount()+" " + getFuel() + " литров");
            return fuel;
        } else {
            r_fuel = r_fuel.replaceAll("[^-0-9]", "");
            if (Integer.parseInt(r_fuel) > 0) {
                setFuel(fuel+=Integer.parseInt(r_fuel));
                System.out.println("Заправка танка " + name+"-"+ getTankount()+" на " + r_fuel + " литров произведена. В баке " + getFuel() + " литров");
                                return fuel;
            } else System.out.println("На заправке сливать топливо из танка "+name+"-"+ getTankount()+" запрещено");
            return fuel;
        }
    }

    public Tank() {
        this.position[0] = 0;
        this.position[1] = 0;
        this.fuel = 100;
        this.tankcount=t_count++;

    }

    public Tank(int posx, int posy) {
        this.position[0] = posx;
        this.position[1] = posy;
        this.fuel = 100;
        this.tankcount=t_count++;
    }

    public Tank(int posx, int posy, int fuel) {
        this.position[0] = posx;
        this.position[1] = posy;
        this.fuel = fuel;
        this.tankcount=t_count++;
    }


    void printPosition() {
        System.out.println("The Tank is at " + name + "-" + tankcount + " " + position[0] + ", " + position[1] + " now.");
    }

    int[] goForward(int hod) {
        if (hod < 0 && -hod > -fuel)
            hod = -fuel;
        else if (hod > fuel)
            hod = fuel;
        switch (direction) {
            case "-x":
                position[0] -= hod;
                break;
            case "x":
                position[0] += hod;
                break;
            case "-y":
                position[1] += hod;
                break;
            case "y":
                position[1] -= hod;
                break;
        }
        return position;
    }

    int[] goBackward(int hod) {
        goForward(-hod);
//        if (hod < 0 && -hod > -fuel)
//            hod = -fuel;
//        else if (hod > fuel)
//            hod = fuel;
//        switch (direction) {
//            case "-x":
//                position[0] += hod;
//                break;
//            case "x":
//                position[0] -= hod;
//                break;
//            case "-y":
//                position[1] -= hod;
//                break;
//            case "y":
//                position[1] += hod;
//                break;
//        }
        return position;
    }

    String turnRight() {
        switch (direction) {
            case "-x":
                direction = "y";
                break;
            case "x":
                direction = "-y";
                break;
            case "-y":
                direction = "-x";
                break;
            case "y":
                direction = "x";
                break;
        }
        return direction;
    }

    String turnLeft() {
        switch (direction) {
            case "-x":
                direction = "-y";
                break;
            case "x":
                direction = "y";
                break;
            case "-y":
                direction = "x";
                break;
            case "y":
                direction = "-x";
                break;
        }
        return direction;
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int direction) {
        this.fuel = direction;
    }
    public int getTankount() {
        return tankcount;
    }

    public void setTankcount(int direction) {
        this.tankcount = direction;
    }

}
