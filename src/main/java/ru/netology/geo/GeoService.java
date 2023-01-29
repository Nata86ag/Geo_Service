package ru.netology.geo;

import ru.netology.entity.Location;

public interface GeoService {

    ru.netology.entity.Location byIp(String ip);

    Location byCoordinates(double latitude, double longitude);
}
