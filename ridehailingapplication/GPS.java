package packages.ridehailingapplication;

// Interface GPS
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}