package Explorers;

import Planets.Mars;
import Planets.Planet;
import Planets.Mercury;
import Planets.Neptune;
import Planets.Saturn;
import Planets.Jupiter;
import Planets.Earth;
import Planets.Venus;
import Planets.Uranus;
import Planets.Pluto;

public interface Explorer {

    void visit(Mercury mercury);

    void visit(Mars mars);

    void visit(Saturn saturn);

    void visit(Jupiter jupiter);

    void visit(Earth earth);

    void visit(Neptune neptune);

    void visit(Venus venus);

    void visit(Uranus uranus);

    void visit(Pluto pluto);

    default void visit(Planet planet) {
        System.out.println("Landed on an unknown planet...");
    }
}