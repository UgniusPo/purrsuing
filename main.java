
Sprite p;
final static float MOVE_SPEED = 5;
int coins = 0;
boolean game = true;

void setup() {
    fullscreen();

    // load player sprite into game
    p = new Sprite("Karl.png", 1.0, 100, 800);

    // set sky (temp)
    background(135, 206, 235);
}

void draw() {
    // exit game if esc pressed
    if (key == ESC) {
        exit();
    }

    // Draw Character
    p.display();
    p.update();

    // MOVEMENT
    if (keyPressed == true) {
        if (keyCode == RIGHT) {
            p.change_x = MOVE_SPEED;
        } else if (keyCode == LEFT) {
            p.change_x = -MOVE_SPEED;
        } else if (keyCode == UP) {
            p.change_y = MOVE_SPEED;
        } else if (keyCode == DOWN) {
            p.change_y = -MOVE_SPEED;
        }
    } else {
        p.change_x = 0;
        p.change_y = 0;
    }

    // Coin Display
    fill(0, 0, 0);
    textSize(15);
    text("Coins: " + coins);
}
