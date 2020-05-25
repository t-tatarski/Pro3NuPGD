package pl.truecolourz;

public class Wolf {

    Main main;
    Position position;
    int points;

    {
        position=Position.LEFTDOWN;
        points=0;
    }



    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;

    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
