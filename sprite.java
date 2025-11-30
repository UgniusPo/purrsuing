//Initialise player sprite, allows physics

public class Sprite {
    PImage player;
    float player_x, player_y, change_x, change_y, w, h, center_x, center_y;

    public Sprite(String filename, float scale, float x, float y) {
        player = loadImage(filename);
        w = player.width * scale;
        h = player.height * scale;
        player_x = x;
        player_y = y;
        change_x = 0;
        change_y = 0;
    }

    public Sprite(String filename, float scale) {
        this(filename, scale, 0, 0);
    }

    public void display() {
        image(player, center_x, 668);
    }

    public void update() {
        center_x += change_x;
        center_y += change_y;
    }
}