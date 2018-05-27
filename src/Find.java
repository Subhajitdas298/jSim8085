
public class Find extends javax.swing.JFrame {

    Assembler o;

    public Find() {
        initComponents();
    }

    public Find(Assembler o) {
        this.o = o;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelFind = new javax.swing.JLabel();
        jTextFieldFind = new javax.swing.JTextField();
        jTextFieldReplace = new javax.swing.JTextField();
        jLabelReplace = new javax.swing.JLabel();
        jCheckBoxMatchCase = new javax.swing.JCheckBox();
        jButtonFind = new javax.swing.JButton();
        jButtonReplace = new javax.swing.JButton();
        jButtonReplaceAll = new javax.swing.JButton();
        jLabelStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Find");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 204, 204));
        setBounds(new java.awt.Rectangle(300, 300, 0, 0));
        setResizable(false);

        jLabelFind.setText("Find : ");
        jLabelFind.setName("jLabelFind"); // NOI18N

        jTextFieldFind.setName("jTextFieldFind"); // NOI18N
        jTextFieldFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFindActionPerformed(evt);
            }
        });

        jTextFieldReplace.setName("jTextFieldReplace"); // NOI18N

        jLabelReplace.setText("Replace:");
        jLabelReplace.setName("jLabelReplace"); // NOI18N

        jCheckBoxMatchCase.setMnemonic('m');
        jCheckBoxMatchCase.setText("Match Case");
        jCheckBoxMatchCase.setName("jCheckBoxMatchCase"); // NOI18N

        jButtonFind.setMnemonic('f');
        jButtonFind.setText("Find");
        jButtonFind.setName("jButtonFind"); // NOI18N
        jButtonFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFindActionPerformed(evt);
            }
        });

        jButtonReplace.setMnemonic('r');
        jButtonReplace.setText("Replace");
        jButtonReplace.setName("jButtonReplace"); // NOI18N
        jButtonReplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReplaceActionPerformed(evt);
            }
        });

        jButtonReplaceAll.setMnemonic('a');
        jButtonReplaceAll.setText("Replace All");
        jButtonReplaceAll.setName("jButtonReplaceAll"); // NOI18N
        jButtonReplaceAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReplaceAllActionPerformed(evt);
            }
        });

        jLabelStatus.setForeground(new java.awt.Color(102, 102, 255));
        jLabelStatus.setName("jLabelStatus"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelFind)
                                        .addGap(26, 26, 26))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelReplace)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldFind, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldReplace, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBoxMatchCase)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jButtonFind)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonReplace)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonReplaceAll)))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFind)
                    .addComponent(jTextFieldFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldReplace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelReplace))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxMatchCase)
                    .addComponent(jLabelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFind)
                    .addComponent(jButtonReplace)
                    .addComponent(jButtonReplaceAll))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    boolean status = false;
    private void jButtonFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFindActionPerformed
        jLabelStatus.setText("");
        if (!status) {
            o.find = 0;
        }
        o.jTextAreaAssemblyLanguageEditor.requestFocus();
        String text = o.jTextAreaAssemblyLanguageEditor.getText().toString();
        int n = text.length();
        String findString = jTextFieldFind.getText().toString().trim();
        int wordLength = findString.length();
        status = false;

        for (int i = (o.find == 0) ? o.find : o.find + 1; i < n - wordLength; i++) {
            if (jCheckBoxMatchCase.isSelected()) {

                if (text.substring(i, i + wordLength).equals(findString)) {
                    o.jTextAreaAssemblyLanguageEditor.select(i, i + wordLength);
                    o.find = i;
                    status = true;
                    break;
                }
            } else {
                if (text.substring(i, i + wordLength).equalsIgnoreCase(findString)) {
                    o.jTextAreaAssemblyLanguageEditor.select(i, i + wordLength);
                    o.find = i;
                    status = true;
                    break;
                }
            }
        }
        if (!status) {
            jLabelStatus.setText("Not found.");
        }

    }//GEN-LAST:event_jButtonFindActionPerformed
    int past = 0;
    private void jButtonReplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReplaceActionPerformed
        jButtonFindActionPerformed(evt);
        if (o.find < o.jTextAreaAssemblyLanguageEditor.getText().length() && past != o.find) {
            past = o.find;
            if (status) {
                o.jTextAreaAssemblyLanguageEditor.replaceSelection(jTextFieldReplace.getText());
                o.textEditor.colorEditor();
                o.textEditor.undo[++o.textEditor.undoIndex] = o.jTextAreaAssemblyLanguageEditor.getText();
                o.textEditor.caretPos[++o.textEditor.undoIndex] = o.jTextAreaAssemblyLanguageEditor.getCaretPosition();
            }
        }

    }//GEN-LAST:event_jButtonReplaceActionPerformed

    private void jButtonReplaceAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReplaceAllActionPerformed
        status = true;
        while (status) {
            jButtonFindActionPerformed(evt);
            if (o.find < o.jTextAreaAssemblyLanguageEditor.getText().length() && past != o.find) {
                past = o.find;
                if (status) {
                    o.jTextAreaAssemblyLanguageEditor.replaceSelection(jTextFieldReplace.getText());
                    o.textEditor.colorEditor();
                    o.textEditor.undo[++o.textEditor.undoIndex] = o.jTextAreaAssemblyLanguageEditor.getText();
                    o.textEditor.caretPos[++o.textEditor.undoIndex] = o.jTextAreaAssemblyLanguageEditor.getCaretPosition();
                }
            }
        }

    }//GEN-LAST:event_jButtonReplaceAllActionPerformed

    private void jTextFieldFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFindActionPerformed

    public void find() {
        initComponents();
        jLabelReplace.setVisible(false);
        jTextFieldReplace.setVisible(false);
        jButtonReplace.setVisible(false);
        jButtonReplaceAll.setVisible(false);
        jLabelStatus.setText("");
        jTextFieldFind.setText(o.jTextAreaAssemblyLanguageEditor.getSelectedText());

    }

    public void replace() {
        initComponents();
        jLabelReplace.setVisible(true);
        jTextFieldReplace.setVisible(true);
        jButtonReplace.setVisible(true);
        jButtonReplaceAll.setVisible(true);
        jLabelStatus.setText("");
        jTextFieldFind.setText(o.jTextAreaAssemblyLanguageEditor.getSelectedText());

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Find().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFind;
    private javax.swing.JButton jButtonReplace;
    private javax.swing.JButton jButtonReplaceAll;
    private javax.swing.JCheckBox jCheckBoxMatchCase;
    private javax.swing.JLabel jLabelFind;
    private javax.swing.JLabel jLabelReplace;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JTextField jTextFieldFind;
    private javax.swing.JTextField jTextFieldReplace;
    // End of variables declaration//GEN-END:variables
}
