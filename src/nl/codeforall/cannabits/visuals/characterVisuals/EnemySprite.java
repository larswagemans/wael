package nl.codeforall.cannabits.visuals.characterVisuals;

import nl.codeforall.cannabits.gamelogic.Direction;
import nl.codeforall.cannabits.visuals.FieldDirection;
import nl.codeforall.cannabits.visuals.Screen;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class EnemySprite extends Sprite {
    private final static String pictureSource = "enemysprites/Zombie/tile011.png";
    private Picture sprite;

    public EnemySprite(int col, int row, Screen screen, Direction direction){
        super(col,row,screen,direction);
        this.sprite = new Picture(getXcoordinate(),getYcoordinate(),pictureSource);
        show();
    }

    @Override
    public void show() {
        sprite.draw();
    }

    @Override
    public void hide() {
        sprite.delete();
    }

    @Override
    public void move(FieldDirection direction) throws InterruptedException {
        int travelDistance = getScreen().getCellsize();
        switch(direction){

            case UP:
                setFieldDirection(FieldDirection.UP);
                Thread.sleep(1000);
                sprite.translate(0, -travelDistance);
                break;
            case DOWN:
                setFieldDirection(FieldDirection.DOWN);
                Thread.sleep(1000);
                sprite.translate(0, travelDistance);
                break;
            case LEFT:
                setFieldDirection(FieldDirection.LEFT);
                Thread.sleep(1000);
                sprite.translate(-travelDistance,0);
                break;
            case RIGHT:
                setFieldDirection(FieldDirection.RIGHT);
                Thread.sleep(1000);
                sprite.translate(travelDistance, 0);
                break;
        }
    }

    public int getHeight(){
       return sprite.getHeight();
    }


}
