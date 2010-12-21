/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MapEditor.java
 *
 * Created on 21.12.2010, 01:34:12
 */

package mapeditor;

import org.jdesktop.application.Action;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import javax.swing.Timer;
import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import java.awt.*;
import java.io.*;
import javax.swing.JOptionPane;
import java.util.zip.*;
import engine.game.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author Philipp
 */
public class MapEditor extends JFrame {

    public static Image tiles;
    public static Image sprites;
    public static int tab;
    public static String tilepath="";
    public static String spritepath="";

    public static int cameraPrefHeight;
    public static int cameraTolerance;

    public static javax.swing.JFrame toolbox;
    public static boolean toolboxVisible = false;

    public static javax.swing.JFrame about;

    public static javax.swing.JFrame mapEdit;

    public static Dimension maxSize = new Dimension(0,0);
    public static Dimension minSize = new Dimension(48,48);

    /** Creates new form MapEditor */
    public MapEditor() {
        initComponents();

        tiles = Toolkit.getDefaultToolkit().getImage("newsmb.png");
        tilepath = "newsmb.png";
        tileChooser.image = tiles;

        sprites = Toolkit.getDefaultToolkit().getImage("mario.gif");
        spritepath = "mario.gif";
        spriteChooser.image = sprites;

        addComponentListener(resizeListener);

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createNewMapFrame = new javax.swing.JFrame();
        jButton1 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        mainPanel = new javax.swing.JPanel();
        MapScrollPane = new javax.swing.JScrollPane();
        MapPanel = new Map();
        menuBar = new javax.swing.JMenuBar();
        javax.swing.JMenu fileMenu = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem exitMenuItem = new javax.swing.JMenuItem();
        WindowMenu = new javax.swing.JMenu();
        toolsCheckBox = new javax.swing.JCheckBoxMenuItem();
        gridCheckBox = new javax.swing.JCheckBoxMenuItem();
        bgLayerCheckBox = new javax.swing.JCheckBoxMenuItem();
        cameraCheckBox = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        createNewMapFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        createNewMapFrame.setTitle("New Map");
        createNewMapFrame.setAlwaysOnTop(true);
        createNewMapFrame.setMinimumSize(new java.awt.Dimension(151, 100));
        createNewMapFrame.setName("createNewMapFrame"); // NOI18N
        createNewMapFrame.setResizable(false);
        createNewMapFrame.setSize(new java.awt.Dimension(164, 100));

        jButton1.setText("OK");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSpinner1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSpinner1.setName("jSpinner1"); // NOI18N
        jSpinner1.setValue(10);
        jSpinner1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jSpinner1PropertyChange(evt);
            }
        });

        jSpinner2.setName("jSpinner2"); // NOI18N
        jSpinner2.setValue(10);

        org.jdesktop.layout.GroupLayout createNewMapFrameLayout = new org.jdesktop.layout.GroupLayout(createNewMapFrame.getContentPane());
        createNewMapFrame.getContentPane().setLayout(createNewMapFrameLayout);
        createNewMapFrameLayout.setHorizontalGroup(
            createNewMapFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(createNewMapFrameLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(createNewMapFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, createNewMapFrameLayout.createSequentialGroup()
                        .add(jSpinner1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(34, 34, 34)
                        .add(jSpinner2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, createNewMapFrameLayout.createSequentialGroup()
                        .add(jButton1)
                        .add(54, 54, 54))))
        );
        createNewMapFrameLayout.setVerticalGroup(
            createNewMapFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(createNewMapFrameLayout.createSequentialGroup()
                .addContainerGap()
                .add(createNewMapFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jSpinner1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jSpinner2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jButton1)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Map Editor");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        mainPanel.setName("mainPanel"); // NOI18N

        MapScrollPane.setMinimumSize(new java.awt.Dimension(0, 0));
        MapScrollPane.setName("MapScrollPane"); // NOI18N
        MapScrollPane.setPreferredSize(new java.awt.Dimension(586, 447));

        MapPanel.setName("MapPanel"); // NOI18N

        org.jdesktop.layout.GroupLayout MapPanelLayout = new org.jdesktop.layout.GroupLayout(MapPanel);
        MapPanel.setLayout(MapPanelLayout);
        MapPanelLayout.setHorizontalGroup(
            MapPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 792, Short.MAX_VALUE)
        );
        MapPanelLayout.setVerticalGroup(
            MapPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 572, Short.MAX_VALUE)
        );

        MapScrollPane.setViewportView(MapPanel);

        org.jdesktop.layout.GroupLayout mainPanelLayout = new org.jdesktop.layout.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, MapScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(MapScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
        );

        menuBar.setBackground(new java.awt.Color(153, 153, 153));
        menuBar.setName("menuBar"); // NOI18N

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance().getContext().getActionMap(MapEditor.class, this);
        fileMenu.setAction(actionMap.get("saveFile")); // NOI18N
        fileMenu.setBackground(new java.awt.Color(153, 153, 153));
        fileMenu.setText("File");
        fileMenu.setName("fileMenu"); // NOI18N

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("New");
        jMenuItem3.setName("jMenuItem3"); // NOI18N
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem3);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Save");
        jMenuItem1.setName("jMenuItem1"); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Open");
        jMenuItem2.setName("jMenuItem2"); // NOI18N
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem2);

        exitMenuItem.setAction(actionMap.get("quit")); // NOI18N
        exitMenuItem.setText("Quit");
        exitMenuItem.setName("exitMenuItem"); // NOI18N
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        WindowMenu.setBackground(new java.awt.Color(153, 153, 153));
        WindowMenu.setText("Window");
        WindowMenu.setName("WindowMenu"); // NOI18N

        toolsCheckBox.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        toolsCheckBox.setSelected(true);
        toolsCheckBox.setText("Tools");
        toolsCheckBox.setName("toolsCheckBox"); // NOI18N
        toolsCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toolsCheckBoxActionPerformed(evt);
            }
        });
        WindowMenu.add(toolsCheckBox);

        gridCheckBox.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        gridCheckBox.setSelected(true);
        gridCheckBox.setText("Show Grid");
        gridCheckBox.setName("gridCheckBox"); // NOI18N
        WindowMenu.add(gridCheckBox);

        bgLayerCheckBox.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        bgLayerCheckBox.setText("Show Background Layer");
        bgLayerCheckBox.setName("bgLayerCheckBox"); // NOI18N
        WindowMenu.add(bgLayerCheckBox);

        cameraCheckBox.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        cameraCheckBox.setText("Show Camera");
        cameraCheckBox.setName("cameraCheckBox"); // NOI18N
        WindowMenu.add(cameraCheckBox);

        menuBar.add(WindowMenu);

        jMenu1.setBackground(new java.awt.Color(153, 153, 153));
        jMenu1.setText("Help");
        jMenu1.setName("jMenu1"); // NOI18N

        jMenuItem4.setText("About ...");
        jMenuItem4.setName("AboutMenuItem"); // NOI18N
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 554, Short.MAX_VALUE)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(mainPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 417, Short.MAX_VALUE)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(mainPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        public boolean copyFile(File src, File dest) throws IOException{

        if(!src.equals(dest)){
            FileInputStream fis  = new FileInputStream(src);
            FileOutputStream fos = new FileOutputStream(dest);
            try {
                byte[] buf = new byte[1024];
                int i = 0;
                while ((i = fis.read(buf)) != -1) {
                    fos.write(buf, 0, i);
                }
            }
            catch (Exception e) {
                System.out.println("ERROR copying files: " + e);
            }
            finally {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            }
            return true;
        }
        return false;

    }

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Map.clear();
        createNewMapFrame.setVisible(true);
}//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //System.out.println("Save - gedrückt!");
        int ow=0;

        JFileChooser fc = new JFileChooser();

        int value = fc.showSaveDialog(this);
        if (value == fc.APPROVE_OPTION){
            int h = Map.Height();
            int w = Map.Width();
            File file = fc.getSelectedFile();

            //Check if file already exists
            if (file.exists()){
                ow = JOptionPane.showConfirmDialog(null,"File already exists - overwrite?", "Error", JOptionPane.YES_NO_OPTION);
                if (ow == 0){
                    file.delete();
                }
            }

            //Create the level file
            File levelFile = new File("level");
            if(levelFile.exists()){
                System.out.println("level already exists");
            }
            if (ow == 0){
                String str="";
                try{
                    FileWriter fw = new FileWriter(levelFile);
                    for (int y=0;y<=h;y+=16){
                        for (int x=0;x<=w;x+=16){
                            if (Map.tile[x/16][y/16].x>-16){
                                str += ""+(char)(48+Map.tile[x/16][y/16].x/16);
                            } else{
                                str += " ";
                            }
                        }
                        str += "\n";
                    }
                    fw.write(str);
                    fw.close();
                } catch(Exception e){
                    System.out.println("ERROR saving level file: " + e);
                }

                // Copy files to cache
                try{

                    copyFile(new File(Toolbox.bg0TextField.getText()), new File("bg0.png"));
                    copyFile(new File(Toolbox.bg1TextField.getText()), new File("bg1.png"));
                    copyFile(new File(tilepath), new File("tilesheet.png"));

                } catch(Exception e){
                    System.out.println("ERROR copying files: " + e);
                }

                // Add files to achrive
                String filenames[] = {
                    "level",
                    "tilesheet.png",
                    "bg0.png",
                    "bg1.png",
                };

                // Create a buffer for reading the files
                byte[] buf = new byte[1024];

                try {
                    // Create the ZIP file
                    String outFilename = file.getPath();
                    ZipOutputStream out = new ZipOutputStream(new FileOutputStream(outFilename));

                    // Compress the files
                    for (int i=0; i<filenames.length; i++) {
                        FileInputStream in = new FileInputStream(filenames[i]);

                        // Add ZIP entry to output stream.
                        out.putNextEntry(new ZipEntry(filenames[i]));

                        // Transfer bytes from the file to the ZIP file
                        int len;
                        while ((len = in.read(buf)) > 0) {
                            out.write(buf, 0, len);
                        }

                        // Complete the entry
                        out.closeEntry();
                        in.close();
                    }

                    // Complete the ZIP file
                    out.close();

                    // Delete the created level file
                    levelFile.delete();
                } catch (IOException e) {
                    System.out.println("ERROR saving level archive: " + e);
                }

            }
        }
}//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        //System.out.println("Open - gedrückt!");
        JFileChooser fc = new JFileChooser();

        int value = fc.showOpenDialog(null);
        if (value == fc.APPROVE_OPTION){
            File file = fc.getSelectedFile();

            new Level(file.getPath()).load();

            //load images into editor:
            Toolbox.bg1TextField.setText(new File("bg1.png").getPath());
            Toolbox.bg0TextField.setText(new File("bg0.png").getPath());

            //load tile sheet into editor:
            MapEditor.tilepath = "tilesheet.png";
            MapEditor.tiles = Toolkit.getDefaultToolkit().getImage("tilesheet.png");
            tileChooser.image = MapEditor.tiles;
            Map.img = MapEditor.tiles;
            Toolbox.TilesetPanel.setPreferredSize(new Dimension(MapEditor.tiles.getWidth(Toolbox.ImportButton), MapEditor.tiles.getHeight(Toolbox.ImportButton)));
            tileChooser.image = tiles;
            Map.img = tiles;
        }
}//GEN-LAST:event_jMenuItem2ActionPerformed

    private void toolsCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toolsCheckBoxActionPerformed
        toolbox.setVisible(toolsCheckBox.getState());
}//GEN-LAST:event_toolsCheckBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Toolbox.jSpinner1.setValue(jSpinner1.getValue());
        Toolbox.jSpinner2.setValue(jSpinner1.getValue());

        Map.setMapSize(Integer.parseInt(jSpinner1.getValue().toString())*16,Integer.parseInt(jSpinner2.getValue().toString())*16);
        createNewMapFrame.dispose();
}//GEN-LAST:event_jButton1ActionPerformed

    private void jSpinner1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jSpinner1PropertyChange
        if (Integer.parseInt(jSpinner2.getValue().toString())<0){
            jSpinner2.setValue("0");
        }
        if (Integer.parseInt(jSpinner2.getValue().toString())>999){
            jSpinner2.setValue("999");
        }
        if (Integer.parseInt(jSpinner1.getValue().toString())<0){
            jSpinner2.setValue("0");
        }
        if (Integer.parseInt(jSpinner1.getValue().toString())>999){
            jSpinner2.setValue("999");
        }
}//GEN-LAST:event_jSpinner1PropertyChange

    public static ComponentListener resizeListener = new ComponentAdapter(){

        @Override
        public void componentResized(ComponentEvent evt) {

            //get component
            Component c = (Component)evt.getSource();

            boolean maxwidth = c.getSize().width >= maxSize.width;
            boolean maxheight = c.getSize().height >= maxSize.height + 48;

            //resize component if too big:
            if(c.getSize().height > maxSize.height && maxSize.height >= minSize.height){
                if(maxwidth){
                    c.setSize(c.getWidth(), maxSize.height);
                }
                else{
                    c.setSize(c.getWidth(), maxSize.height + 15);
                }
            }

            if(c.getSize().width > maxSize.width && maxSize.width >= minSize.width){
                if(maxheight){
                    c.setSize(maxSize.width, c.getHeight());
                }
                else{
                    c.setSize(maxSize.width + 15, c.getHeight());
                }
            }

            //resize if too small:
            if(c.getSize().height < minSize.height){
                c.setSize(c.getWidth(), minSize.height);
            }

            if(c.getSize().width < minSize.width){
                c.setSize(minSize.width, c.getHeight());
            }


        }
    };


    @Override
    public void setMaximumSize(Dimension maximumSize) {
        maxSize = maximumSize;
    }


    public static void setAbout(JFrame about) {
        MapEditor.about = about;
    }

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        about.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        new Level("").clean();
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                mapEdit = new MapEditor();
                mapEdit.setVisible(true);
            }
        });

        toolbox = new Toolbox();
        toolbox.setVisible(true);

        about = new MapEditorAbout();
        about.setVisible(false);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel MapPanel;
    public static javax.swing.JScrollPane MapScrollPane;
    public static javax.swing.JMenu WindowMenu;
    public static javax.swing.JCheckBoxMenuItem bgLayerCheckBox;
    public static javax.swing.JCheckBoxMenuItem cameraCheckBox;
    public static javax.swing.JFrame createNewMapFrame;
    public static javax.swing.JCheckBoxMenuItem gridCheckBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem2;
    public javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    public static javax.swing.JCheckBoxMenuItem toolsCheckBox;
    // End of variables declaration//GEN-END:variables

}