
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.ButtonModel;
import java.util.Random;
import java.util.Date;

public class SortingMethod extends javax.swing.JFrame {
    
    public static final int ListSize = 100;
    
    public SortingMethod() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        amountGroup = new javax.swing.ButtonGroup();
        orderGroup = new javax.swing.ButtonGroup();
        sortingMethod = new javax.swing.JLabel();
        amountSort = new javax.swing.JLabel();
        radio10 = new javax.swing.JRadioButton();
        radio100 = new javax.swing.JRadioButton();
        radio1000 = new javax.swing.JRadioButton();
        radio5000 = new javax.swing.JRadioButton();
        displaySort = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        sortOrder = new javax.swing.JLabel();
        ascending = new javax.swing.JRadioButton();
        descending = new javax.swing.JRadioButton();
        sortButton = new javax.swing.JButton();
        originalNumbers = new javax.swing.JLabel();
        originalScroll = new javax.swing.JScrollPane();
        originalText = new javax.swing.JTextArea();
        sortedNumbers = new javax.swing.JLabel();
        sortedScroll = new javax.swing.JScrollPane();
        sortedText = new javax.swing.JTextArea();
        sortResult = new javax.swing.JLabel();
        resultScroll = new javax.swing.JScrollPane();
        resultText = new javax.swing.JTextArea();
        resetButton = new javax.swing.JButton();
        generateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sortingMethod.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sortingMethod.setText("Sorting Methods");

        amountSort.setText("Amount of number to sort:");

        amountGroup.add(radio10);
        radio10.setText("10");
        radio10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        amountGroup.add(radio100);
        radio100.setText("100");

        amountGroup.add(radio1000);
        radio1000.setText("1000");

        amountGroup.add(radio5000);
        radio5000.setText("5000");

        displaySort.setText("Display numbers sorted by:");

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selection Sort", "Bubble Sort", "Insertion Sort", "Merge Sort" }));

        sortOrder.setText("Sort Order:");

        orderGroup.add(ascending);
        ascending.setText("Ascending");

        orderGroup.add(descending);
        descending.setText("Descending");

        sortButton.setText("Sort");
        sortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortButtonActionPerformed(evt);
            }
        });

        originalNumbers.setText("Original Numbers:");

        originalText.setColumns(20);
        originalText.setRows(5);
        originalText.setMargin(new java.awt.Insets(4, 5, 4, 5));
        originalScroll.setViewportView(originalText);

        sortedNumbers.setText("Sorted Numbers:");

        sortedText.setEditable(false);
        sortedText.setColumns(20);
        sortedText.setRows(5);
        sortedText.setMargin(new java.awt.Insets(4, 5, 4, 5));
        sortedScroll.setViewportView(sortedText);

        sortResult.setText("Sort Results:");

        resultText.setEditable(false);
        resultText.setColumns(20);
        resultText.setRows(5);
        resultText.setMargin(new java.awt.Insets(4, 5, 4, 5));
        resultScroll.setViewportView(resultText);

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        generateButton.setText("Generate");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(originalNumbers)
                            .addComponent(originalScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(sortedNumbers))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sortedScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sortOrder)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descending)
                            .addComponent(ascending))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sortButton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sortingMethod)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(amountSort)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(radio10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radio100)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio1000)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio5000))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(displaySort)
                                .addGap(18, 18, 18)
                                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(generateButton)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sortResult)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sortingMethod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(amountSort)
                            .addComponent(radio10)
                            .addComponent(radio1000)
                            .addComponent(radio5000)
                            .addComponent(radio100)
                            .addComponent(generateButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(displaySort))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sortOrder)
                                    .addComponent(ascending))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(descending))
                            .addComponent(sortButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resetButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(originalNumbers)
                            .addComponent(sortedNumbers))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sortedScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(originalScroll)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(sortResult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultScroll)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortButtonActionPerformed
        
        int[] data = {-2, 45, 0, 11, -9};
//        String numbers[] = originalText.getText().split("\n");
        String numbers[] = originalText.getText().split("\n");
        
        if(ascending.isSelected()) {
            sortedText.setText("");
            
            if(comboBox.getSelectedIndex() == 0) {
                Date past = new Date();
                long start = System.nanoTime();
                
                for(int i= 0; i< numbers.length - 1; i++) {
                    int min_idx = i;
                    String minStr = numbers[i];
                    for(int j = i + 1; j < numbers.length; j++) {
                        if(numbers[j].compareTo(minStr) < 0) {
                            minStr = numbers[j];
                            min_idx = j;
                        }
                    }
                    String temp = numbers[i];
                    numbers[i] = numbers[min_idx];
                    numbers[min_idx] = temp;
                }
                
                Date future = new Date();
                long end = System.nanoTime();
                long execution = end - start;
                
                for(int a = 0; a < numbers.length; a++){
                    sortedText.append(numbers[a] + "\n");
                }
//                resultText.append("Selection Sort:" + "\n");
//                resultText.append("Number of times a loop was executed: " + execution + "\n");
//                resultText.append("Number of milliseconds to complete sort: " + (future.getTime() - past.getTime()) + "\n");
            } 
            else if(comboBox.getSelectedIndex() == 1) {
                for(int x = 0; x < numbers.length - 1; x++) {
                    for(int j = 0; j < numbers.length - 1; j++) {
                        if (numbers[j].compareTo(numbers[x+1]) > 0) {
                            String temp = numbers[j];
                            numbers[j] = numbers[j + 1];
                            numbers[j + 1] = temp;
                        }
                    }
                }
                for(int a = 0; a < numbers.length; a++){
                    sortedText.append(numbers[a] + "\n");
                }
            } 
            else if(comboBox.getSelectedIndex() == 2) {
                for (int i = 1; i < numbers.length; i++) {
                    String key = numbers[i];
                    int j = i - 1;

                    while (j >= 0) {
                        if(key.compareTo(numbers[j]) > 0) {
                            break;
                        }
                        numbers[j + 1] = numbers[j];
                        --j;
                    }
                    numbers[j + 1] = key;
                }
                for(int a = 0; a < numbers.length; a++){
                    sortedText.append(numbers[a] + "\n");
                }
            }
            else {
                MergeSort ob = new MergeSort();
                ob.sort(data, 0, data.length - 1);
                sortedText.setText(Arrays.toString(data));
            }
        } else if (descending.isSelected()) {
            sortedText.setText("");
            
            if(comboBox.getSelectedIndex() == 0) {
                for(int i= 0; i< numbers.length - 1; i++) {
                    int min_idx = i;
                    String minStr = numbers[i];
                    for(int j = i + 1; j < numbers.length; j++) {
                        if(numbers[j].compareTo(minStr) > 0) {
                            minStr = numbers[j];
                            min_idx = j;
                        }
                    }
                    String temp = numbers[i];
                    numbers[i] = numbers[min_idx];
                    numbers[min_idx] = temp;
                }
                for(int a = 0; a < numbers.length; a++){
                    sortedText.append(numbers[a] + "\n");
                }
            } 
            else if(comboBox.getSelectedIndex() == 1) {
                for (int x = 0; x < numbers.length - 1; x++) {
                    for (int j = 0; j < numbers.length - 1; j++) {
                        if (numbers[j].compareTo(numbers[x+1]) < 0) {
                            String temp = numbers[j];
                            numbers[j] = numbers[j + 1];
                            numbers[j + 1] = temp;
                        }
                    }
                }
                for(int a = 0; a < numbers.length; a++){
                    sortedText.append(numbers[a] + "\n");
                }
            } 
            else if(comboBox.getSelectedIndex() == 2) {
                for (int i = 1; i < numbers.length; i++) {
                    String key = numbers[i];
                    int j = i - 1;

                    while (j >= 0) {
                        if(key.compareTo(numbers[j]) < 0) {
                            break;
                        }
                        numbers[j + 1] = numbers[j];
                        --j;
                    }
                    numbers[j + 1] = key;
                }
                for(int a = 0; a < numbers.length; a++){
                    sortedText.append(numbers[a] + "\n");
                }
            } 
            else {
            }
        } else {
            resultText.setText("");
        }
        
    }//GEN-LAST:event_sortButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
       originalText.setText("");
       sortedText.setText("");
       resultText.setText("");
       amountGroup.clearSelection();
       orderGroup.clearSelection();
       comboBox.setSelectedIndex(0);
    }//GEN-LAST:event_resetButtonActionPerformed

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        originalText.setText("");
        int n1;
        Random rnd = new Random();
        
        if (radio10.isSelected()){
            for (int i = 0; i < 10; i++) {
                n1 = rnd.nextInt(9999);
                originalText.append(n1 + "\n");
            }
        } else if(radio100.isSelected()){
            for (int i = 0; i < 100; i++) {
                n1 = rnd.nextInt(9999);
                originalText.append(n1 + "\n");
            }
        } else if(radio1000.isSelected()){
            for (int i = 0; i < 1000; i++) {
                n1 = rnd.nextInt(9999);
                originalText.append(n1 + "\n");
            }
        } else if(radio5000.isSelected()){
            for (int i = 0; i < 5000; i++) {
                n1 = rnd.nextInt(9999);
                originalText.append(n1 + "\n");
            }
        } else {
            
        }
    }//GEN-LAST:event_generateButtonActionPerformed

    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortingMethod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup amountGroup;
    private javax.swing.JLabel amountSort;
    private javax.swing.JRadioButton ascending;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JRadioButton descending;
    private javax.swing.JLabel displaySort;
    private javax.swing.JButton generateButton;
    private javax.swing.ButtonGroup orderGroup;
    private javax.swing.JLabel originalNumbers;
    private javax.swing.JScrollPane originalScroll;
    private javax.swing.JTextArea originalText;
    private javax.swing.JRadioButton radio10;
    private javax.swing.JRadioButton radio100;
    private javax.swing.JRadioButton radio1000;
    private javax.swing.JRadioButton radio5000;
    private javax.swing.JButton resetButton;
    private javax.swing.JScrollPane resultScroll;
    private javax.swing.JTextArea resultText;
    private javax.swing.JButton sortButton;
    private javax.swing.JLabel sortOrder;
    private javax.swing.JLabel sortResult;
    private javax.swing.JLabel sortedNumbers;
    private javax.swing.JScrollPane sortedScroll;
    private javax.swing.JTextArea sortedText;
    private javax.swing.JLabel sortingMethod;
    // End of variables declaration//GEN-END:variables
}
