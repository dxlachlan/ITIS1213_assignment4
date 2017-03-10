/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingprogram;

import java.awt.Color;
import java.io.File;
import java.util.ArrayList;

/**
 * This model holds everything that the user has added to the canvas, and keeps
 * track of the current state (i.e. selected color and shape, etc.)
 *
 * @author clatulip, for ITIS 1213 @ UNC Charlotte
 */
public class DrawingModel {

    // arrays to hold the shapes
//    private ArrayList<Line> lines = new ArrayList<>();
//    private ArrayList<Rectangle> rects = new ArrayList<>();
    private ArrayList<Shape> shapes = new ArrayList<>();
    private ArrayList<Shape> undoList = new ArrayList<>();

    void getFillColor(Color colorVar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // enumerated type that defines the different shapes that can be drawn
    public enum ShapeType {

        LINE, RECT, CIRC, SQUA
    }

    // currently selected shape and color
    private ShapeType currentShape;
    private Color lineColor;
    private Color fillColor;

    // variables to make drawing real-time interactive
    private boolean mouseDown; // is the mouse pressed down?
    private int startX; // x coord where mouse pressed down
    private int startY; // y coord where mouse pressed down
    private int currentX; // currentX pos
    private int currentY; // currentY pos

    //constructor
    public DrawingModel() {
        currentShape = ShapeType.LINE;
        lineColor = Color.BLACK;
        fillColor = Color.WHITE;
        mouseDown = false;
        currentX = 0;
        currentY = 0;
    }

    /**
     * Adds a new Line object to the drawing model
     *
     * @param line Line object
     */
    public void addNewLine(Line line) {
        shapes.add(line);
    }

    /**
     * Adds a new Rectangle object to the drawing model
     *
     * @param rect Rectangle object
     */
    public void addNewRect(Rectangle rect) {
        shapes.add(rect);
    }

    /**
     * Adds a new Circle object to the drawing model
     *
     * @param circ Circle Object
     */
    public void addNewCirc(Circle circ) {
        shapes.add(circ);
    }

    /**
     * Add a new Square object to the drawing model
     *
     * @param squa
     */
    public void addNewSqua(Square squa) {
        shapes.add(squa);
    }

    /**
     * Undo Method
     *
     * @param shape
     */
    public void undo() {

        //ensure that code isn't ran if there aren't any shapes to undo
        if (shapes.size() > 0) {
            //initialize the variable to hold the shape object
            Shape undo;
            //store the last shape object from the arrayList
            undo = shapes.get(shapes.size() - 1);
            //add the shape to be undone to the undo arrayList
            undoList.add(undo);
            //remove the shape from the current shape arrayList
            shapes.remove(shapes.size() - 1);

        } else {

            System.out.println("There are no shapes to undo!");

        }

    }

    /**
     * Redo Shape Method
     *
     * @param shape
     */
    public void redo() {

        if (undoList.size() > 0) {

            //instantiate//initialize the shape object to hold the object(s)
            Shape redo;
            //get the shape to redo from the end of the undo arrayList
            redo = undoList.get(undoList.size() - 1);
            //add the list back to the current shapes list
            shapes.add(redo);
            //remove the shape from the undo arrayList
            undoList.remove(undoList.size() - 1);

        } else {

            System.out.println("There are no shapes to redo!");

        }

    }

//    /**
//     * Gives you the list of lines in the model
//     * @return ArrayList<Line>
//     */
//    public ArrayList<Line> getLines() {
//        return lines;
//    }
//    
//    /**
//     * Gives you the list of rectangles in the model
//     * @return ArrayList<Rectangle>
//     */
//    public ArrayList<Rectangle> getRects() {
//        return rects;
//    }
//    
    /**
     * Gives you the list of shapes in the model
     *
     * @return ArrayList<Shape>
     */
    public ArrayList<Shape> getShapes() {
        return shapes;
    }

//    /**
//     * Removes all shapes the user has drawn
//     */
//    public void clearModel() {
//        lines.clear();
//        rects.clear();
//    }
    /**
     * Removes all shapes the user has drawn
     */
    public void clearModel() {
        shapes.clear();
    }

    /**
     * Returns the currently selected shape type (what the user would draw if
     * they clicked and dragged).
     *
     * @return ShapeType
     */
    public ShapeType getCurrentShape() {
        return currentShape;
    }

    /**
     * Sets the current shape type (what the user will draw if they click and
     * drag)
     *
     * @param currentShape
     */
    public void setCurrentShape(ShapeType currentShape) {
        this.currentShape = currentShape;
    }

    /**
     * Returns the current lineColor for drawing
     *
     * @return Color
     */
    public Color getLineColor() {
        return lineColor;
    }

    /**
     * Sets the current lineColor for drawing
     *
     * @param lineColor Color
     */
    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }

    /**
     * Allows you to check whether user has their mouse pressed down
     *
     * @return boolean true if mouse is down
     */
    public boolean isMouseDown() {
        return mouseDown;
    }

    /**
     * Sets the mouseDown to true or false
     *
     * @param mouseDown boolean true if mouse button is pressed down
     */
    public void setMouseDown(boolean mouseDown) {
        this.mouseDown = mouseDown;
    }

    /**
     * Returns current x coordinate of cursor
     *
     * @return int x coord
     */
    public int getCurrentX() {
        return currentX;
    }

    /**
     * Sets the current X coord of cursor
     *
     * @param currentX int x coord
     */
    public void setCurrentX(int currentX) {
        this.currentX = currentX;
    }

    /**
     * Returns current y coordinate of cursor
     *
     * @return int y coord
     */
    public int getCurrentY() {
        return currentY;
    }

    /**
     * Sets the current y coordinate of cursor
     *
     * @param currentY int y coord
     */
    public void setCurrentY(int currentY) {
        this.currentY = currentY;
    }

    /**
     * Returns the x coordinate where the mouse was pressed down
     *
     * @return int x coord
     */
    public int getStartX() {
        return startX;
    }

    /**
     * Set the x coordinate of where the mouse was pressed down
     *
     * @param startX int x coordinate
     */
    public void setStartX(int startX) {
        this.startX = startX;
    }

    /**
     * Returns the y coordinate of where the mouse was pressed down
     *
     * @return int y
     */
    public int getStartY() {
        return startY;
    }

    /**
     * Set the y coordinate of where the mouse was pressed down
     *
     * @param startY int y coord
     */
    public void setStartY(int startY) {
        this.startY = startY;
    }

    /**
     * Returns the current fill color for drawing
     *
     * @return Color fillColor
     */
    public Color getFillColor() {
        return fillColor;
    }

    /**
     * Sets the current fill color for drawing
     *
     * @param fillColor Color
     */
    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

}
