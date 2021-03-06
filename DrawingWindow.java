/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingprogram;

import java.awt.Color;

/**
 *
 * @author clatulip
 */
public class DrawingWindow extends javax.swing.JFrame {

    private DrawingModel myModel;
    private boolean assign;
    

    /**
     * Constructor that creates new JFrame form with various elements on it The
     * elements have been designed using NetBeans design view
     */
    public DrawingWindow(DrawingModel model) {
        // save the model so we can use it
        myModel = model;
        // this calls the NetBeans auto-generated code that creates the
        // window and adds all the GUI elements to it
        initComponents();
        // change the window title (you can change this whatever you want)
        this.setTitle("Celine's Basic Drawing Program");
        // pass the drawingModel to the canvas, because it needs it, too
        drawingCanvas.setModel(myModel);
        assign = true;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        clearButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        undoButton = new javax.swing.JButton();
        redoButton = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(60, 0), new java.awt.Dimension(60, 0), new java.awt.Dimension(60, 32767));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        drawingCanvas = new drawingprogram.DrawingCanvas();
        shapeComboBox = new javax.swing.JComboBox();
        lineColorButton = new javax.swing.JButton();
        fillColorButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        clearButton.setText("Clear");
        clearButton.setFocusable(false);
        clearButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clearButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(clearButton);

        saveButton.setText("Save");
        saveButton.setFocusable(false);
        saveButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        saveButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(saveButton);

        undoButton.setText("Undo");
        undoButton.setFocusable(false);
        undoButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        undoButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        undoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(undoButton);

        redoButton.setText("Redo");
        redoButton.setFocusable(false);
        redoButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        redoButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        redoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redoButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(redoButton);
        jToolBar1.add(filler1);
        jToolBar1.add(filler3);

        drawingCanvas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        drawingCanvas.setPreferredSize(new java.awt.Dimension(500, 500));
        drawingCanvas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                drawingCanvasMouseDragged(evt);
            }
        });
        drawingCanvas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                drawingCanvasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                drawingCanvasMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout drawingCanvasLayout = new javax.swing.GroupLayout(drawingCanvas);
        drawingCanvas.setLayout(drawingCanvasLayout);
        drawingCanvasLayout.setHorizontalGroup(
            drawingCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        drawingCanvasLayout.setVerticalGroup(
            drawingCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        shapeComboBox.setModel(new javax.swing.DefaultComboBoxModel(getShapeTypeValues())
        );
        shapeComboBox.setSelectedItem(myModel.getCurrentShape());
        shapeComboBox.setToolTipText("Pick a shape to draw");
        shapeComboBox.setPreferredSize(new java.awt.Dimension(50, 27));
        shapeComboBox.setRequestFocusEnabled(false);
        shapeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shapeComboBoxActionPerformed(evt);
            }
        });

        lineColorButton.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        lineColorButton.setText("Line Color");
        lineColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineColorButtonActionPerformed(evt);
            }
        });

        fillColorButton.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        fillColorButton.setText("Fill Color");
        fillColorButton.setFocusable(false);
        fillColorButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fillColorButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        fillColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillColorButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 360, Short.MAX_VALUE)
                        .addComponent(lineColorButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(fillColorButton))
                            .addComponent(shapeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(drawingCanvas, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(shapeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fillColorButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(drawingCanvas, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lineColorButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Clear button handler
     *
     * @param evt
     */
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // tell the model to clear itself and then update the canvas
        myModel.clearModel();
        drawingCanvas.update();
    }//GEN-LAST:event_clearButtonActionPerformed

    /**
     * Mouse pressed handler
     *
     * @param evt gives access to x and y coords where mouse pressed down
     */
    private void drawingCanvasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawingCanvasMousePressed
        // Get the x and y coords
        startX = evt.getX();
        startY = evt.getY();
        // stuff to enable interactive drawing
        myModel.setMouseDown(true);
        myModel.setStartX(startX);
        myModel.setStartY(startY);
    }//GEN-LAST:event_drawingCanvasMousePressed

    /**
     * Mouse released handler
     *
     * @param evt gives access to x and y coords where mouse was released
     */
    private void drawingCanvasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawingCanvasMouseReleased
        // Get the x and y coords
        endX = evt.getX();
        endY = evt.getY();
        // add new shape to the model
        switch (myModel.getCurrentShape()) {
            case LINE:
                myModel.addNewLine(new Line(
                        startX,
                        startY,
                        endX,
                        endY,
                        myModel.getLineColor()));
                break;
            case RECT:
                myModel.addNewRect(new Rectangle(
                        startX,
                        startY,
                        endX,
                        endY,
                        myModel.getLineColor(),
                        myModel.getFillColor()));
                break;

            case CIRC:
                myModel.addNewCirc(new Circle(
                        startX,
                        startY,
                        endX,
                        endY,
                        myModel.getLineColor(),
                        myModel.getFillColor()));
                break;
            case SQUA:
                myModel.addNewSqua(new Square(
                        startX,
                        startY,
                        endX,
                        endY,
                        myModel.getLineColor(),
                        myModel.getFillColor()));
                break;

        }
        myModel.setMouseDown(false);
        drawingCanvas.update();
    }//GEN-LAST:event_drawingCanvasMouseReleased

    /**
     * Canvas mouse drag handler, gets called whenever the user is dragging
     * cursor across canvas with button pressed
     *
     * @param evt gives access to current x and y coords
     */
    private void drawingCanvasMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawingCanvasMouseDragged
        // get x and y coords, save in model
        myModel.setCurrentX(evt.getX());
        myModel.setCurrentY(evt.getY());
        // update canvas (needed to make drawing interactive)
        drawingCanvas.update();
    }//GEN-LAST:event_drawingCanvasMouseDragged

    /**
     * Handler for the shapeComboBox NB: you should not need to change this code
     *
     * @param evt
     */
    private void shapeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shapeComboBoxActionPerformed
        // update current shape in model
        DrawingModel.ShapeType selectedShape = DrawingModel.ShapeType.values()[shapeComboBox.getSelectedIndex()];
        myModel.setCurrentShape(selectedShape);

    }//GEN-LAST:event_shapeComboBoxActionPerformed

    /**
     * Save button handler
     *
     * @param evt
     */
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // create and show the save file dialog window
        SaveDialogWindow saveWindow = new SaveDialogWindow(drawingCanvas);
        saveWindow.setVisible(true);
    }//GEN-LAST:event_saveButtonActionPerformed

    private void undoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoButtonActionPerformed
        //undo 
        myModel.undo();
        repaint();


    }//GEN-LAST:event_undoButtonActionPerformed

    private void redoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redoButtonActionPerformed
        // redo code
        myModel.redo();
        repaint();
    }//GEN-LAST:event_redoButtonActionPerformed

    private void fillColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillColorButtonActionPerformed
        // TODO add your handling code here:
        assign = true;
        
        ColorPickerWindow colorwin = new ColorPickerWindow(myModel, assign);
        colorwin.setVisible(true);
        
        
    }//GEN-LAST:event_fillColorButtonActionPerformed

    private void lineColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineColorButtonActionPerformed
        // TODO add your handling code here:
        assign = false;
        ColorPickerWindow colorwin = new ColorPickerWindow(myModel, assign);
        colorwin.setVisible(true);
    }//GEN-LAST:event_lineColorButtonActionPerformed

    /**
     * This is used to populate the comboBox on the window
     *
     * @return the list of shapes in the enumerated type
     */
    private DrawingModel.ShapeType[] getShapeTypeValues() {
        return DrawingModel.ShapeType.values();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private drawingprogram.DrawingCanvas drawingCanvas;
    private javax.swing.JButton fillColorButton;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton lineColorButton;
    private javax.swing.JButton redoButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox shapeComboBox;
    private javax.swing.JButton undoButton;
    // End of variables declaration//GEN-END:variables

    // local fields needed for interactive drawing
    private int startX;
    private int startY;
    private int endX;
    private int endY;
    private int currentX;
    private int currentY;

}
