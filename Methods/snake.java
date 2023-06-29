import processing.core.*;

// Snake class
class snake {
    PVector[] tail;
    PVector pos, vel;
    int size;
  
    Snake(int x, int y) {
        pos = new PVector(x, y);
        vel = new PVector(0, 0);
        size = 1;
        tail = new PVector[1];
        tail[0] = new PVector(x, y);
    }
  
    // Update the snake's position
    void update() {
        for (int i = size - 1; i > 0; i--) {
            tail[i] = tail[i - 1];
        }
        tail[0] = pos.copy();
        pos.add(vel);
    }
  
    // Display the snake on the screen
    void display() {
        for (int i = 0; i < size; i++) {
            rect(tail[i].x, tail[i].y, 10, 10);
        }
    }
  
    // Change the snake's direction
    void changeDirection(PVector newVel) {
        vel = newVel;
    }
  
    // Check if the snake is out of bounds
    boolean isOutOfBounds() {
        if (pos.x < 0 || pos.x > width) {
            return true;
        }
        if (pos.y < 0 || pos.y > height) {
            return true;
        }
        return false;
    }
}

//Main class
public class SnakeGame extends PApplet {
    Snake snake;
    PVector foodPos;
    int score;
  
    public void settings() {
        size(500, 500);
    }
  
    public void setup() {
        snake = new Snake(width / 2, height / 2);
        foodPos = new PVector(random(width), random(height));
        score = 0;
    }
  
    public void draw() {
        background(255);
  
        snake.update();
        snake.display();
  
        if (snake.isOutOfBounds()) {
            println("Game over! Your score is: " + score);
            exit();
        }
  
        fill(255, 0, 0);
        rect(foodPos.x, foodPos.y, 10, 10);
  
        if (snake.pos.x == foodPos.x && snake.pos.y == foodPos.y) {
            snake.size++;
            score++;
            foodPos = new PVector(random(width), random(height));
        }
  
        if (keyPressed) {
            if (key == 'w') {
                snake.changeDirection(new PVector(0, -1));
            } else if (key == 'a') {
                snake.changeDirection(new PVector(-1, 0));
            } else if (key == 's') {
                snake.changeDirection(new PVector(0, 1));
