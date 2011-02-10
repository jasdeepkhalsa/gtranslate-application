/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GTranslate.java
 *
 * Created on Oct 6, 2010, 8:51:30 AM
 */
package com.google.UI;

import com.google.api.translate.Language;
import com.google.api.translate.Translate;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.BufferedInputStream.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Johnny
 */
public class GTranslate extends javax.swing.JFrame {

    /** Creates new form GTranslate */
    public GTranslate() {
        initComponents();

        for (int i = 1; i < set.length; i++) {
            LangSel.addItem(set[i].name());
        }
        FileFilter fileter = new FileFilter() {

            @Override
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                }
                return f.getName().endsWith(".txt");
            }

            @Override
            public String getDescription() {
                return "text file";
            }
        };

        fileChooser.setFileFilter(fileter);

        checkClipBoard();

        prog.setStringPainted(true);

    }

    /**
     * Check the clipboard for content
     */
    private void checkClipBoard() {
        new Thread(new Runnable() {

            public void run() {
                while (true) {
                    if (Utils.getClipboardContents() == null ? "" != null : !Utils.getClipboardContents().equals("") && !btnPaste.isEnabled()) {
                        btnPaste.setEnabled(true);
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(GTranslate.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        option = new javax.swing.ButtonGroup();
        fileChooser = new javax.swing.JFileChooser();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        main = new javax.swing.JPanel();
        lang = new javax.swing.JLabel();
        prog = new javax.swing.JProgressBar();
        btnStart = new javax.swing.JButton();
        btnLoadFile = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtInput = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        lblSize = new javax.swing.JLabel();
        lblNrLines = new javax.swing.JLabel();
        btnPaste = new javax.swing.JButton();
        lblTime = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        General = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        translateTo = new javax.swing.JCheckBox();
        langByCode = new javax.swing.JCheckBox();
        SliderLines = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        lines = new javax.swing.JLabel();
        LangSel = new javax.swing.JComboBox();
        langCode = new javax.swing.JTextField();
        proxySettings = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        proxyHost = new javax.swing.JTextField();
        proxyPort = new javax.swing.JTextField();
        proxy = new javax.swing.JCheckBox();
        proxySettings1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();

        fileChooser.setSelectedFile(new java.io.File("E:\\Program Files\\NetBeans 6.9.1"));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GTranslate");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.RIGHT);

        main.setToolTipText("Main Display");

        lang.setText("No translation in progress");

        prog.setToolTipText("progress");

        btnStart.setFont(new java.awt.Font("Tahoma", 0, 10));
        btnStart.setText("Start");
        btnStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnStartMouseReleased(evt);
            }
        });

        btnLoadFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/google/res/package.png"))); // NOI18N
        btnLoadFile.setText("Load File");
        btnLoadFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnLoadFileMouseReleased(evt);
            }
        });

        txtInput.setColumns(20);
        txtInput.setRows(5);
        jScrollPane2.setViewportView(txtInput);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "File info", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));

        lblSize.setText("Size:");

        lblNrLines.setText("Number of lines:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSize)
                    .addComponent(lblNrLines))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNrLines)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        btnPaste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/google/res/paste.png"))); // NOI18N
        btnPaste.setText("Paste from clipboard");
        btnPaste.setEnabled(false);
        btnPaste.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPasteMouseReleased(evt);
            }
        });

        lblTime.setText("Remaining time: ");

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                    .addGroup(mainLayout.createSequentialGroup()
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainLayout.createSequentialGroup()
                                .addComponent(prog, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnStart))
                            .addComponent(lang)
                            .addGroup(mainLayout.createSequentialGroup()
                                .addComponent(btnLoadFile)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPaste))
                            .addComponent(lblTime))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(mainLayout.createSequentialGroup()
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainLayout.createSequentialGroup()
                                .addComponent(prog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lang))
                            .addComponent(btnStart))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLoadFile)
                            .addComponent(btnPaste))
                        .addGap(43, 43, 43)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Main", main);

        jPanel1.setToolTipText("Application settings");

        General.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "General settings", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));

        option.add(jCheckBox1);
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Bulk Translate");

        option.add(translateTo);
        translateTo.setText("Translate To:");
        translateTo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                translateToItemStateChanged(evt);
            }
        });

        option.add(langByCode);
        langByCode.setText("By code");
        langByCode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                langByCodeItemStateChanged(evt);
            }
        });

        SliderLines.setMajorTickSpacing(1);
        SliderLines.setMaximum(20);
        SliderLines.setMinimum(1);
        SliderLines.setSnapToTicks(true);
        SliderLines.setValue(1);
        SliderLines.setPreferredSize(new java.awt.Dimension(200, 30));
        SliderLines.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SliderLinesMouseReleased(evt);
            }
        });

        jLabel1.setText("Nr of Lines");
        jLabel1.setToolTipText("Number of lines to parse at a time");
        jLabel1.setMaximumSize(new java.awt.Dimension(61, 30));
        jLabel1.setMinimumSize(new java.awt.Dimension(61, 30));
        jLabel1.setPreferredSize(new java.awt.Dimension(61, 30));

        lines.setText("1");
        lines.setMaximumSize(new java.awt.Dimension(7, 30));
        lines.setMinimumSize(new java.awt.Dimension(7, 30));
        lines.setPreferredSize(new java.awt.Dimension(7, 30));

        LangSel.setEnabled(false);

        langCode.setText("Language Code");
        langCode.setEnabled(false);

        javax.swing.GroupLayout GeneralLayout = new javax.swing.GroupLayout(General);
        General.setLayout(GeneralLayout);
        GeneralLayout.setHorizontalGroup(
            GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GeneralLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GeneralLayout.createSequentialGroup()
                        .addComponent(SliderLines, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(lines, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox1)
                    .addGroup(GeneralLayout.createSequentialGroup()
                        .addGroup(GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(translateTo)
                            .addComponent(langByCode))
                        .addGap(23, 23, 23)
                        .addGroup(GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(langCode, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LangSel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8))
        );
        GeneralLayout.setVerticalGroup(
            GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GeneralLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SliderLines, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lines, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jCheckBox1)
                .addGap(5, 5, 5)
                .addGroup(GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(translateTo)
                    .addComponent(LangSel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GeneralLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(langByCode))
                    .addGroup(GeneralLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(langCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        proxySettings.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proxy settings", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel3.setText("Port");
        jLabel3.setToolTipText("Number of lines to parse at a time");
        jLabel3.setMaximumSize(new java.awt.Dimension(61, 30));
        jLabel3.setMinimumSize(new java.awt.Dimension(61, 30));
        jLabel3.setPreferredSize(new java.awt.Dimension(61, 30));

        jLabel4.setText("Host");
        jLabel4.setToolTipText("Number of lines to parse at a time");
        jLabel4.setMaximumSize(new java.awt.Dimension(61, 30));
        jLabel4.setMinimumSize(new java.awt.Dimension(61, 30));
        jLabel4.setPreferredSize(new java.awt.Dimension(61, 30));

        proxyHost.setEnabled(false);

        proxyPort.setEnabled(false);

        proxy.setText("Use proxy");
        proxy.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                proxyItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout proxySettingsLayout = new javax.swing.GroupLayout(proxySettings);
        proxySettings.setLayout(proxySettingsLayout);
        proxySettingsLayout.setHorizontalGroup(
            proxySettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proxySettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(proxySettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(proxySettingsLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(proxyHost, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(proxySettingsLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(proxyPort, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(proxy))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        proxySettingsLayout.setVerticalGroup(
            proxySettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, proxySettingsLayout.createSequentialGroup()
                .addComponent(proxy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(proxySettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proxyHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(proxySettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proxyPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        proxySettings1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Output settings", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));

        javax.swing.GroupLayout proxySettings1Layout = new javax.swing.GroupLayout(proxySettings1);
        proxySettings1.setLayout(proxySettings1Layout);
        proxySettings1Layout.setHorizontalGroup(
            proxySettings1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );
        proxySettings1Layout.setVerticalGroup(
            proxySettings1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(General, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(proxySettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(proxySettings1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(121, 121, 121))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(General, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(proxySettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(proxySettings1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Settings", jPanel1);

        txtOutput.setColumns(20);
        txtOutput.setEditable(false);
        txtOutput.setLineWrap(true);
        txtOutput.setRows(5);
        jScrollPane1.setViewportView(txtOutput);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Output", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartMouseReleased

        new Thread(new Runnable() {

            public void run() {
                try {
                    if (btnStart.getText().equals("Stop")) {
                        canTranslate = false;
                        btnStart.setText("Start");
                        return;
                    }
                    btnStart.setText("Stop");
                    if (translateTo.isSelected()) {
                        canTranslate = true;
                        translateToLang(set[LangSel.getSelectedIndex() + 1]);
                    } else if (langByCode.isSelected()) {
                        canTranslate = true;
                        translateToLangbyCode(langCode.getText());
                    } else {
                        canTranslate = true;
                        translateAll();
                    }
                } catch (Exception ex) {
                    Logger.getLogger(GTranslate.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }//GEN-LAST:event_btnStartMouseReleased
    /**
     * Listen to SliderLines for value change
     * @param evt
     */
    private void SliderLinesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SliderLinesMouseReleased
        nr_lines = SliderLines.getValue() * 5;
        lines.setText(nr_lines + "");
    }//GEN-LAST:event_SliderLinesMouseReleased
    /**
     *
     * @param evt
     */
    private void translateToItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_translateToItemStateChanged
        if (translateTo.isSelected()) {
            LangSel.setEnabled(true);
        } else {
            LangSel.setEnabled(false);
        }
    }//GEN-LAST:event_translateToItemStateChanged

    private void langByCodeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_langByCodeItemStateChanged
        if (langByCode.isSelected()) {
            langCode.setEnabled(true);
        } else {
            langCode.setEnabled(false);
        }
    }//GEN-LAST:event_langByCodeItemStateChanged
    /**
     * Reads a file and displays it in txtInput
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void readFile() throws FileNotFoundException, IOException {
        File file = new File(input_file);
        FileInputStream f = new FileInputStream(file);
        FileChannel ch = f.getChannel();
        ByteBuffer bb = ByteBuffer.allocateDirect(1024);
        byte[] barray = new byte[1024];
        long checkSum = 0L;
        int nRead, nGet;
        while ((nRead = ch.read(bb)) != -1) {
            if (nRead == 0) {
                continue;
            }
            bb.position(0);
            bb.limit(nRead);
            while (bb.hasRemaining()) {
                nGet = Math.min(bb.remaining(), 1024);
                bb.get(barray, 0, nGet);
                for (int i = 0; i < nGet; i++) {
                    checkSum += barray[i];
                    txtInput.append((char) barray[i] + "");
                }
            }
            bb.clear();
        }
    }
    private void btnLoadFileMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoadFileMouseReleased
        int response = fileChooser.showOpenDialog(this);
        if (response == JFileChooser.APPROVE_OPTION) {
            input_file = fileChooser.getSelectedFile().getPath();
            lblSize.setText("Size: " + fileChooser.getSelectedFile().length() + "");

            new Thread(new Runnable() {

                public void run() {
                    try {
                        txtInput.setEditable(false);
                        readFile();
                        txtInput.setEditable(true);
                        lblNrLines.setText("Number of lines: " + txtInput.getLineCount());
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(GTranslate.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(GTranslate.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }).start();
        }
    }//GEN-LAST:event_btnLoadFileMouseReleased

    private void btnPasteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPasteMouseReleased
        txtInput.setText(Utils.getClipboardContents());
    }//GEN-LAST:event_btnPasteMouseReleased

    private void proxyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_proxyItemStateChanged
        if (proxy.isSelected()) {
            proxyHost.setEnabled(true);
            proxyPort.setEnabled(true);
        } else {
            proxyHost.setEnabled(false);
            proxyPort.setEnabled(false);
        }
    }//GEN-LAST:event_proxyItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new GTranslate().setVisible(true);
            }
        });
    }

    /**
     *  Translates a whole file to <b>l</b>. Output is saved in a file name
     * @param l - Language to translate to
     * @throws Exception
     */
    public void translateToLang(Language l) throws Exception {
        int linecount = 1;
        lang.setText("Translating to : " + l.name());
        File f = new File(input_file);
        File out = new File(l.name() + ".txt");

        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(out), "UTF-8"));

        int total = Utils.countLines(input_file);
        float startTime = System.currentTimeMillis();
        label:
        while (br.ready() && canTranslate) {
            try {
                br.mark(1000);
                Translate.setHttpReferrer(refs[new Random().nextInt(1)]);
                //5 lines at a time
                String[] linesBuffer = new String[nr_lines];
                for (int j = 0; j < linesBuffer.length; j++) {
                    if (br.ready()) {
                        linesBuffer[j] = br.readLine();
                    } else {
                        linesBuffer[j] = "end";
                    }
                }
                String[] translatedText = Translate.execute(linesBuffer, Language.ENGLISH, l);

                for (int j = 0; j < translatedText.length; j++) {
                    String string = translatedText[j];
                    txtOutput.append(string + "\n");
                    if (linecount != 1) {
                        bw.newLine();
                    }
                    bw.write(string);
                    linecount++;
                    if (linecount > total) {
                        break;
                    }

                    DecimalFormat df = new DecimalFormat("##.##");
                    double proc = (((linecount * 1.0) / (total * 1.0)) * 100);
                    prog.setValue((int) proc);
                    prog.setString(df.format(proc) + "%");
                }
                Thread.sleep(100);
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage()+"@line "+linecount);
                br.reset();
            }
            int cur = (int) ((System.currentTimeMillis() - startTime) / 1000F) * (total) / linecount;
            int minutes = cur / 60;
            int sec = (cur - minutes * 60);
            int hours = minutes / 60;
            minutes -= hours * 60;
            lblTime.setText((hours / 10 == 0 ? "0" + hours : hours) + ":" + (minutes / 10 == 0 ? "0" + minutes : minutes) + ":" + (sec / 10 == 0 ? "0" + sec : sec));
        }
        bw.close();
    }

    /**
     * Translation by language code
     * @param code
     * @throws Exception
     */
    public void translateToLangbyCode(String code) throws Exception {
        Language l = Language.fromString(code);
        translateToLang(l);
    }

    /**
     * Translates to all languages
     * @throws Exception
     */
    public void translateAll() throws Exception {
        //position 0 is AUTO_DETECT
        for (int i = 1; i < set.length; i++) {
            translateToLang(set[i]);
            Thread.sleep(5000);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel General;
    private javax.swing.JComboBox LangSel;
    private javax.swing.JSlider SliderLines;
    private javax.swing.JButton btnLoadFile;
    private javax.swing.JButton btnPaste;
    private javax.swing.JButton btnStart;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lang;
    private javax.swing.JCheckBox langByCode;
    private javax.swing.JTextField langCode;
    private javax.swing.JLabel lblNrLines;
    private javax.swing.JLabel lblSize;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lines;
    private javax.swing.JPanel main;
    private javax.swing.ButtonGroup option;
    private javax.swing.JProgressBar prog;
    private javax.swing.JCheckBox proxy;
    private javax.swing.JTextField proxyHost;
    private javax.swing.JTextField proxyPort;
    private javax.swing.JPanel proxySettings;
    private javax.swing.JPanel proxySettings1;
    private javax.swing.JCheckBox translateTo;
    private javax.swing.JTextArea txtInput;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables
    private static Language[] set = Language.values();
    private int nr_lines = 1;
    private String input_file = "input.txt";
    private String[] refs = {"proiect.frevar.com",
        "google.com", "yahoo.com"
    };
    private  boolean canTranslate = false;
}
