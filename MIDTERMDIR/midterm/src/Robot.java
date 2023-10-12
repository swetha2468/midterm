class Robot {
    // Attributes of a Robot
    private final int ID;     // Unique identifier for the robot
    private int x;         // X-coordinate of the robot's position
    private int y;         // Y-coordinate of the robot's position
    private String direction;     // Current direction of the robot


    // Constructor to create a Robot with an initial ID and default values
    public Robot(int ID) {
        this.ID = ID;
        this.x = 0;
        this.y = 0;
        this.direction = "East";
    }


    public void setDirection(String direction) {
        this.direction = direction;
    }

    // Method to advance the robot based on its current direction
    public void advance() {
        switch (direction) {
            case "North":
                y++;
                break;
            case "East":
                x++;
                break;
            case "South":
                y--;
                break;
            case "West":
                x--;
                break;
            default:
                throw new IllegalArgumentException("Invalid direction: " + direction);
        }
    }

    // Method to display the robot's state (ID, position, and direction)
    public void display() {
        System.out.println("Robot ID: " + ID);
        System.out.println("Position: (" + x + ", " + y + ")");
        System.out.println("Direction: " + direction);
    }
}
