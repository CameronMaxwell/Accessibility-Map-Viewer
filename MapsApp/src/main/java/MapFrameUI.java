import java.util.*;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Image;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 * Draws and manages the window for displaying in-building maps.
 * 
 * @author Kyven Tran
 * @author Trevor Seaman
 */
public class MapFrameUI extends javax.swing.JFrame {

    private final String[] buildingsList = {"Middlesex College", "Thompson Engineering Building", "Westminister Hall"};
    private final int[] middlesexFloors = {0, 1, 2, 3, 4};
    private final String[] middlesexFloorsList = {"Floor 0", "Floor 1", "Floor 2", "Floor 3", "Floor 4"};
    private final int[] thompsonFloors = {0, 1, 2, 3, 4, 5};
    private final String[] thompsonFloorsList = {"Floor 0", "Floor 1", "Floor 2", "Floor 3", "Floor 4", "Floor 5"};
    private final int[] westministerFloors = {0, 1, 2, 3};
    private final String[] westministerFloorsList = {"Floor 0", "Floor 1", "Floor 2", "Floor 3"};
    private final String[] roomTypesList = {"Room Type", "Classroom", "Kitchen", "Lab", "Library", "Mechanical Room", "Men's Washroom", "Office", "Servery", "Server Room", "Women's Washroom"};
    /**
     * Building name
     */
    public String building;
    /**
     * SideBar object for sidebar in window
     */
    SideBar sidebar;
    /**
     * Map object for map in window
     */
    Map map;
    /**
     * MapFrameUI constructor. Creates a MapFrameUI object.
     */
    public MapFrameUI() {
        building = "Thompson Engineering Building";
        this.setTitle("Western Map System");

        sidebar = new SideBar(building);
        int floor = sidebar.getFloor();
        map = new Map();
        Point[] points = {};
        map.buildMap(building, floor, points);
        initComponents();
        //displaySideBarList();
    }
    
    public String getBuilding() {
        return building;
    }
    
    public int getFloor() {
        return sidebar.getFloor();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        Sidebar = new javax.swing.JPanel();
        Search = new javax.swing.JTextField();
        Favourited = new javax.swing.JToggleButton();
        FloorNum = new javax.swing.JComboBox<>();
        RoomType = new javax.swing.JComboBox<>();
        sideBarListPane = new javax.swing.JScrollPane();
        sideBarList = new javax.swing.JList<>();
        mapPanel = new javax.swing.JPanel(){

            public void paintComponent(Graphics g) {
                ImageIcon mapIcon = new ImageIcon("Assets/Maps/ThompsonEngineeringBuilding-1.png"); // Create icon
                Image img = mapIcon.getImage(); // Create image
                g.drawImage(img, 0, 0, this.getSize().width, this.getSize().height, this);

            }

        };
        toolbarPanel = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();
        buildingSelect = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        Sidebar.setBackground(new java.awt.Color(153, 153, 153));
        Sidebar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Search.setBackground(new java.awt.Color(204, 204, 204));
        Search.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        Favourited.setBackground(new java.awt.Color(204, 204, 204));
        Favourited.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Favourited.setText("Favourites");
        Favourited.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FavouritedActionPerformed(evt);
            }
        });

        FloorNum.setBackground(new java.awt.Color(204, 204, 204));
        FloorNum.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        if (building.equals(buildingsList[0])) {
            FloorNum.setModel(new javax.swing.DefaultComboBoxModel<>(middlesexFloorsList));
        } else if (building.equals(buildingsList[1])) {
            FloorNum.setModel(new javax.swing.DefaultComboBoxModel<>(thompsonFloorsList));
        } else if (building.equals(buildingsList[2])) {
            FloorNum.setModel(new javax.swing.DefaultComboBoxModel<>(westministerFloorsList));
        }
        FloorNum.setSelectedIndex(1);
        FloorNum.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FloorNumItemStateChanged(evt);
            }
        });

        RoomType.setBackground(new java.awt.Color(204, 204, 204));
        RoomType.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        RoomType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Room Type", "Classroom", "Office", "Library", "Cafeteria", "Men's Washroom", "Women's Washroom" }));
        RoomType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RoomTypeItemStateChanged(evt);
            }
        });

        sideBarList.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Point[] points = sidebar.searchPOI("");
        ArrayList<String> pointsNames = new ArrayList<String>();
        for (int i = 0; i < points.length; i++) {
            pointsNames.add(points[i].getName());
        }
        sideBarList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = pointsNames.toArray(String[]::new);
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        sideBarList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                sideBarListValueChanged(evt);
            }
        });
        sideBarListPane.setViewportView(sideBarList);

        javax.swing.GroupLayout SidebarLayout = new javax.swing.GroupLayout(Sidebar);
        Sidebar.setLayout(SidebarLayout);
        SidebarLayout.setHorizontalGroup(
            SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SidebarLayout.createSequentialGroup()
                        .addComponent(sideBarListPane)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SidebarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SidebarLayout.createSequentialGroup()
                        .addComponent(Favourited, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(FloorNum, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(RoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        SidebarLayout.setVerticalGroup(
            SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidebarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Favourited)
                    .addComponent(FloorNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RoomType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(sideBarListPane)
                .addContainerGap())
        );

        javax.swing.GroupLayout mapPanelLayout = new javax.swing.GroupLayout(mapPanel);
        mapPanel.setLayout(mapPanelLayout);
        mapPanelLayout.setHorizontalGroup(
            mapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        mapPanelLayout.setVerticalGroup(
            mapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 876, Short.MAX_VALUE)
        );

        toolbarPanel.setBackground(new java.awt.Color(153, 153, 153));
        toolbarPanel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        homeButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        homeButton.setText("Campus Map");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        helpButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        helpButton.setText("Help");
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });

        buildingSelect.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        buildingSelect.setModel(new javax.swing.DefaultComboBoxModel<>(buildingsList));
        if (building.equals(buildingsList[0])) {
            buildingSelect.setSelectedIndex(0);
        } else if (building.equals(buildingsList[1])) {
            buildingSelect.setSelectedIndex(1);
        } else if (building.equals(buildingsList[2])) {
            buildingSelect.setSelectedIndex(2);
        }
        buildingSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buildingSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout toolbarPanelLayout = new javax.swing.GroupLayout(toolbarPanel);
        toolbarPanel.setLayout(toolbarPanelLayout);
        toolbarPanelLayout.setHorizontalGroup(
            toolbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolbarPanelLayout.createSequentialGroup()
                .addComponent(homeButton)
                .addGap(18, 18, 18)
                .addComponent(helpButton)
                .addGap(18, 18, 18)
                .addComponent(buildingSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 547, Short.MAX_VALUE))
        );
        toolbarPanelLayout.setVerticalGroup(
            toolbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolbarPanelLayout.createSequentialGroup()
                .addGroup(toolbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeButton)
                    .addComponent(helpButton)
                    .addComponent(buildingSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toolbarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mapPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(toolbarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mapPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private String[] sideBarList() {
        //Point[] pointsArr = sidebar.getPoints();
        Point testPoint1 = new Point(0, 0, "Point A", "Classroom", 1, "Middlesex College", true, true);
        Point testPoint2 = new Point(0, 0, "Point B", "Classroom", 1, "Thompson Engineering Building", true, true);
        Point[] pointsArr = {testPoint1, testPoint2};
        ArrayList<String> pointsNames = new ArrayList<String>();
        for (int i = 0; i < pointsArr.length; i++) {
            pointsNames.add(pointsArr[i].getName());
        }
        return pointsNames.toArray(String[]::new);
    }
    /**
     * Updates sidebar if the Favourites button is toggled
     * @param evt Event of user pressing Favourites button
     */
    private void FavouritedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FavouritedActionPerformed
        // TODO add your handling code here:
        if (Favourited.isSelected()) {
            System.out.println("Favourites toggled");
            sidebar.enableOnlyFavourites(true);
        } else {
            System.out.println("Favourites untoggled");
            sidebar.enableOnlyFavourites(false);
        }
        sidebar.refresh();
    }//GEN-LAST:event_FavouritedActionPerformed

    /**
     * Updates sidebar if the Floor in the Floor Number combo box is changed
     * @param evt Event of item change in Floor Number combo box
     */
    private void FloorNumItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FloorNumItemStateChanged
        // TODO add your handling code here:
        String selectedFloor = (String) FloorNum.getSelectedItem();
        System.out.println(selectedFloor);
        if (selectedFloor == null) {
            return;
        }
        String selectedFloorNum = selectedFloor.replace("Floor ", "");
        int floorNum = Integer.parseInt(selectedFloorNum);
        sidebar.enableOnlyFloor(floorNum);
        sidebar.refresh();
    }//GEN-LAST:event_FloorNumItemStateChanged

    /**
     * Updates sidebar if the Room Type in the Room Type combo box is changed
     * @param evt Event of item change in Room Type combo box
     */
    private void RoomTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RoomTypeItemStateChanged
        // TODO add your handling code here:
        String selectedRoomType = (String) RoomType.getSelectedItem();
        System.out.println(selectedRoomType);
        sidebar.enableOnlyIcon(selectedRoomType);
        sidebar.refresh();
    }//GEN-LAST:event_RoomTypeItemStateChanged

    /**
     * Updates sidebar if the user uses the search bar
     * @param evt Event of user pressing Enter while typing in search bar
     */
    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
        String searchTerm = Search.getText();
        System.out.println(searchTerm);
        Point[] points = sidebar.searchPOI(searchTerm);
        ArrayList<String> pointsList = new ArrayList<String>();
        for (int i = 0; i < points.length; i++) {
            pointsList.add(points[i].getName());
        }
        sideBarList.setListData(pointsList.toArray(String[]::new));
    }//GEN-LAST:event_SearchActionPerformed

    /**
     * Sends the user back to the home page upon pressing the Home button
     * @param evt Event of user pressing Home button
     */
    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        System.out.println("Send to home page");
    }//GEN-LAST:event_homeButtonActionPerformed

    /**
     * Updates building upon user changing the building in the Building combo box
     * @param evt Event of item change in Building combo box
     */
    private void buildingSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buildingSelectActionPerformed
        // TODO add your handling code here:
        String selectedBuilding = (String) buildingSelect.getSelectedItem();
        System.out.println(selectedBuilding);
        building = selectedBuilding;
        sidebar.setBuilding(building);
        FloorNum.removeAllItems();
        if (building.equals(buildingsList[0])) {
            for (int i = 0; i < middlesexFloorsList.length; i++) {
                FloorNum.addItem(middlesexFloorsList[i]);
            }
        } else if (building.equals(buildingsList[1])) {
            for (int i = 0; i < thompsonFloorsList.length; i++) {
                FloorNum.addItem(thompsonFloorsList[i]);
            }
        } else if (building.equals(buildingsList[2])) {
            for (int i = 0; i < westministerFloorsList.length; i++) {
                FloorNum.addItem(westministerFloorsList[i]);
            }       
        }
        Favourited.setSelected(false);
        RoomType.setSelectedIndex(0);
        FloorNum.setSelectedIndex(1);
        Search.setText("Search");
        sideBarList.clearSelection();
    }//GEN-LAST:event_buildingSelectActionPerformed

    /**
     * Opens help menu upon user pressing Help button
     * @param evt Event of user pressing Help button
     */
    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        // TODO add your handling code here:
        System.out.println("Insert help popup");
        HelpMenu helpMenu = new HelpMenu();
        helpMenu.display();
    }//GEN-LAST:event_helpButtonActionPerformed

    private void sideBarListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_sideBarListValueChanged
        // TODO add your handling code here:
        System.out.println(sideBarList.getSelectedValue());
        
        int index = sideBarList.getSelectedIndex();
        
    }//GEN-LAST:event_sideBarListValueChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MapFrameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MapFrameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MapFrameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MapFrameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MapFrameUI().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Favourited;
    private javax.swing.JComboBox<String> FloorNum;
    private javax.swing.JComboBox<String> RoomType;
    private javax.swing.JTextField Search;
    private javax.swing.JPanel Sidebar;
    private javax.swing.JComboBox<String> buildingSelect;
    private javax.swing.JButton helpButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel mapPanel;
    private javax.swing.JList<String> sideBarList;
    private javax.swing.JScrollPane sideBarListPane;
    private javax.swing.JPanel toolbarPanel;
    // End of variables declaration//GEN-END:variables
}
