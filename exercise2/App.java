        import Explorers.*;
        import Planets.*;
        
        public class App {
        
            public static void main(String[] args) {
        
                Planet mars = new Mars();
                Planet saturn = new Saturn();
                Planet mercury = new Mercury();
                Planet jupiter = new Jupiter();
                Planet earth = new Earth();
                Planet neptune = new Neptune();
                Planet venus = new Venus();
                Planet uranus = new Uranus();
                Planet pluto = new Pluto();

        
                Explorer astronaut = new HumanExplorer();
                Explorer rover = new RobotExplorer();
        
                mars.accept(astronaut);
                saturn.accept(astronaut);
                mercury.accept(astronaut);
                jupiter.accept(astronaut);
                earth.accept(astronaut);
                neptune.accept(astronaut);
                venus.accept(astronaut);
                uranus.accept(astronaut);
                pluto.accept(astronaut);

                mars.accept(rover);
                saturn.accept(rover);
                mercury.accept(rover);
                jupiter.accept(rover);
                earth.accept(rover);
                neptune.accept(rover);
                venus.accept(rover);
                uranus.accept(rover);
                pluto.accept(rover);

            }
        }   