public class Circle {
    // Define the radius attribute
    private double radius;

    // Constructor with default radius value
    public Circle() {
        this(1.0); // Chain to the constructor with a parameter
    }

    // Constructor with user-provided radius value
    public Circle(double radius) {
        // Validate the radius value
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        this.radius = radius;
    }

    // Getter method for the radius attribute
    public double getRadius() {
        return radius;
    }

    // Setter method for the radius attribute
    public void setRadius(double radius) {
        // Validate the radius value
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        this.radius = radius;
    }
}