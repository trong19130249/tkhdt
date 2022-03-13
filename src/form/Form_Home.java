
package form;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import model.Model_Card;
import model.StatusType;
import swing.ScrollBar;

/**
 *
 * @author trong
 */
public class Form_Home extends javax.swing.JPanel {


    public Form_Home() {
        initComponents();
        card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon/stock.png")), "Số lượng sản phẩm", "140", "Tăng 60%"));
        card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon/profit.png")), "Tổng lợi nhuận", "150000000đ", "Tăng 25%"));
        card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon/flag.png")), "Số hoá đơn", "5000", "Tăng 70%"));
        // add row table
        jScrollPane1.setVerticalScrollBar(new ScrollBar());
        jScrollPane1.getVerticalScrollBar().setBackground(Color.WHITE);
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        jScrollPane1.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        table.addRow(new Object[]{"Nguyễn văn A", "500000đ", "09000000000", "25 Apr,2018", StatusType.ACCEPT});
        table.addRow(new Object[]{"Nguyễn văn A", "500000đ", "09000000000", "25 Apr,2018", StatusType.RECEIVE});
        table.addRow(new Object[]{"Nguyễn văn A", "500000đ", "09000000000", "25 Apr,2018", StatusType.SHIP});
        table.addRow(new Object[]{"Nguyễn văn B", "500000đ", "09000000000", "25 Apr,2018", StatusType.RECEIVE});
        table.addRow(new Object[]{"Nguyễn văn A", "500000đ", "09000000000", "25 Apr,2018", StatusType.ACCEPT});
        table.addRow(new Object[]{"Nguyễn văn A", "500000đ", "09000000000", "25 Apr,2018", StatusType.ACCEPT});
        table.addRow(new Object[]{"Nguyễn văn A", "500000đ", "09000000000", "25 Apr,2018", StatusType.ACCEPT});
        table.addRow(new Object[]{"Nguyễn văn A", "500000đ", "09000000000", "25 Apr,2018", StatusType.RECEIVE});
        table.addRow(new Object[]{"Nguyễn văn B", "500000đ", "09000000000", "25 Apr,2018", StatusType.RECEIVE});
        table.addRow(new Object[]{"Nguyễn văn C","500000đ", "09000000000", "25 Apr,2018", StatusType.RECEIVE});
        table.addRow(new Object[]{"Nguyễn văn A", "500000đ", "09000000000", "25 Apr,2018", StatusType.RECEIVE});
        table.addRow(new Object[]{"Nguyễn văn A", "500000đ", "09000000000", "25 Apr,2018", StatusType.RECEIVE});
        table.addRow(new Object[]{"Nguyễn văn A", "500000đ", "09000000000", "25 Apr,2018", StatusType.RECEIVE});
        table.addRow(new Object[]{"Nguyễn văn D", "500000đ", "09000000000", "25 Apr,2018", StatusType.RECEIVE});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JLayeredPane();
        card1 = new component.Card();
        card2 = new component.Card();
        card3 = new component.Card();
        panelBorder1 = new swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new swing.Table();

        setBackground(new java.awt.Color(242, 242, 242));

        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        card1.setColor1(new java.awt.Color(142, 142, 250));
        card1.setColor2(new java.awt.Color(123, 123, 245));
        panel.add(card1);

        card2.setColor1(new java.awt.Color(186, 123, 247));
        card2.setColor2(new java.awt.Color(167, 94, 236));
        panel.add(card2);

        card3.setColor1(new java.awt.Color(241, 208, 62));
        card3.setColor2(new java.awt.Color(211, 184, 61));
        panel.add(card3);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("Standard Table Design");

        jScrollPane1.setBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên khách hàng", "Giá", "SĐT", " Ngày", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.Card card1;
    private component.Card card2;
    private component.Card card3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLayeredPane panel;
    private swing.PanelBorder panelBorder1;
    private swing.Table table;
    // End of variables declaration//GEN-END:variables
}
