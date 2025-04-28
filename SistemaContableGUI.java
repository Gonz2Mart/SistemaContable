package sistemacontable;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SistemaContableGUI extends javax.swing.JFrame {
    private List<Contribuyente> contribuyentes = new ArrayList<>();
    private List<Factura> facturas = new ArrayList<>();
    private List<DeclaracionFiscal> declaraciones = new ArrayList<>();
    private List<OpinionCumplimiento> opiniones = new ArrayList<>();

    public SistemaContableGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelContribuyente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldRfc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldRegimen = new javax.swing.JTextField();
        jButtonAgregarContribuyente = new javax.swing.JButton();
        jPanelFactura = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldFolio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldMontoFactura = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldEstatusFactura = new javax.swing.JTextField();
        jButtonAgregarFactura = new javax.swing.JButton();
        jPanelDeclaracion = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldTipoDeclaracion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldMontoDeclaracion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldEstatusDeclaracion = new javax.swing.JTextField();
        jButtonAgregarDeclaracion = new javax.swing.JButton();
        jPanelOpinion = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldRfcOpinion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldResultadoOpinion = new javax.swing.JTextField();
        jButtonAgregarOpinion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaOutput = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Contable");

        jLabel1.setText("RFC:");
        jLabel2.setText("Nombre:");
        jLabel3.setText("Régimen Fiscal:");
        jButtonAgregarContribuyente.setText("Agregar Contribuyente");
        jButtonAgregarContribuyente.addActionListener(evt -> agregarContribuyente());

        javax.swing.GroupLayout jPanelContribuyenteLayout = new javax.swing.GroupLayout(jPanelContribuyente);
        jPanelContribuyente.setLayout(jPanelContribuyenteLayout);
        jPanelContribuyenteLayout.setHorizontalGroup(
            jPanelContribuyenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContribuyenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContribuyenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContribuyenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldRfc)
                    .addComponent(jTextFieldNombre)
                    .addComponent(jTextFieldRegimen, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButtonAgregarContribuyente)
                .addContainerGap())
        );
        jPanelContribuyenteLayout.setVerticalGroup(
            jPanelContribuyenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContribuyenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContribuyenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldRfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContribuyenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContribuyenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldRegimen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAgregarContribuyente))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Contribuyente", jPanelContribuyente);

        jLabel4.setText("Folio:");
        jLabel5.setText("Cliente:");
        jLabel6.setText("Monto:");
        jLabel7.setText("Estatus:");
        jButtonAgregarFactura.setText("Agregar Factura");
        jButtonAgregarFactura.addActionListener(evt -> agregarFactura());

        javax.swing.GroupLayout jPanelFacturaLayout = new javax.swing.GroupLayout(jPanelFactura);
        jPanelFactura.setLayout(jPanelFacturaLayout);
        jPanelFacturaLayout.setHorizontalGroup(
            jPanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldFolio)
                    .addComponent(jTextFieldCliente)
                    .addComponent(jTextFieldMontoFactura)
                    .addComponent(jTextFieldEstatusFactura, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButtonAgregarFactura)
                .addContainerGap())
        );
        jPanelFacturaLayout.setVerticalGroup(
            jPanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldMontoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldEstatusFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAgregarFactura))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Factura", jPanelFactura);

        jLabel8.setText("Tipo:");
        jLabel9.setText("Monto:");
        jLabel10.setText("Estatus:");
        jButtonAgregarDeclaracion.setText("Agregar Declaración");
        jButtonAgregarDeclaracion.addActionListener(evt -> agregarDeclaracion());

        javax.swing.GroupLayout jPanelDeclaracionLayout = new javax.swing.GroupLayout(jPanelDeclaracion);
        jPanelDeclaracion.setLayout(jPanelDeclaracionLayout);
        jPanelDeclaracionLayout.setHorizontalGroup(
            jPanelDeclaracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDeclaracionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDeclaracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDeclaracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldTipoDeclaracion)
                    .addComponent(jTextFieldMontoDeclaracion)
                    .addComponent(jTextFieldEstatusDeclaracion, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButtonAgregarDeclaracion)
                .addContainerGap())
        );
        jPanelDeclaracionLayout.setVerticalGroup(
            jPanelDeclaracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDeclaracionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDeclaracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldTipoDeclaracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDeclaracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldMontoDeclaracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDeclaracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldEstatusDeclaracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAgregarDeclaracion))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Declaración Fiscal", jPanelDeclaracion);

        jLabel11.setText("RFC:");
        jLabel12.setText("Resultado:");
        jButtonAgregarOpinion.setText("Agregar Opinión");
        jButtonAgregarOpinion.addActionListener(evt -> agregarOpinion());

        javax.swing.GroupLayout jPanelOpinionLayout = new javax.swing.GroupLayout(jPanelOpinion);
        jPanelOpinion.setLayout(jPanelOpinionLayout);
        jPanelOpinionLayout.setHorizontalGroup(
            jPanelOpinionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpinionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOpinionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOpinionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldRfcOpinion)
                    .addComponent(jTextFieldResultadoOpinion, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButtonAgregarOpinion)
                .addContainerGap())
        );
        jPanelOpinionLayout.setVerticalGroup(
            jPanelOpinionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpinionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOpinionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldRfcOpinion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOpinionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldResultadoOpinion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAgregarOpinion))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Opinión Cumplimiento", jPanelOpinion);

        jTextAreaOutput.setColumns(20);
        jTextAreaOutput.setRows(5);
        jScrollPane1.setViewportView(jTextAreaOutput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }

    private void agregarContribuyente() {
        try {
            String rfc = jTextFieldRfc.getText();
            String nombre = jTextFieldNombre.getText();
            String regimen = jTextFieldRegimen.getText();
            Contribuyente contribuyente = new Contribuyente(rfc, nombre, regimen);
            contribuyentes.add(contribuyente);
            jTextAreaOutput.append("Contribuyente agregado: " + contribuyente.toString() + "\n");
            jTextFieldRfc.setText("");
            jTextFieldNombre.setText("");
            jTextFieldRegimen.setText("");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void agregarFactura() {
        try {
            String folio = jTextFieldFolio.getText();
            String cliente = jTextFieldCliente.getText();
            double monto = Double.parseDouble(jTextFieldMontoFactura.getText());
            String estatus = jTextFieldEstatusFactura.getText();
            Factura factura = new Factura(folio, cliente, monto, new Date(), estatus, "RFC_EMISOR", "RFC_RECEPTOR");
            facturas.add(factura);
            jTextAreaOutput.append("Factura agregada: " + factura.toString() + "\n");
            jTextFieldFolio.setText("");
            jTextFieldCliente.setText("");
            jTextFieldMontoFactura.setText("");
            jTextFieldEstatusFactura.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: El monto debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void agregarDeclaracion() {
        try {
            String tipo = jTextFieldTipoDeclaracion.getText();
            double monto = Double.parseDouble(jTextFieldMontoDeclaracion.getText());
            String estatus = jTextFieldEstatusDeclaracion.getText();
            DeclaracionFiscal declaracion = new DeclaracionFiscal(tipo, monto, new Date(), estatus);
            declaraciones.add(declaracion);
            jTextAreaOutput.append("Declaración agregada: " + declaracion.toString() + "\n");
            jTextFieldTipoDeclaracion.setText("");
            jTextFieldMontoDeclaracion.setText("");
            jTextFieldEstatusDeclaracion.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: El monto debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void agregarOpinion() {
        try {
            String rfc = jTextFieldRfcOpinion.getText();
            String resultado = jTextFieldResultadoOpinion.getText();
            OpinionCumplimiento opinion = new OpinionCumplimiento(rfc, new Date(), resultado);
            opiniones.add(opinion);
            jTextAreaOutput.append("Opinión agregada: " + opinion.toString() + "\n");
            jTextFieldRfcOpinion.setText("");
            jTextFieldResultadoOpinion.setText("");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButtonAgregarContribuyente;
    private javax.swing.JButton jButtonAgregarDeclaracion;
    private javax.swing.JButton jButtonAgregarFactura;
    private javax.swing.JButton jButtonAgregarOpinion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelContribuyente;
    private javax.swing.JPanel jPanelDeclaracion;
    private javax.swing.JPanel jPanelFactura;
    private javax.swing.JPanel jPanelOpinion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextAreaOutput;
    private javax.swing.JTextField jTextFieldCliente;
    private javax.swing.JTextField jTextFieldEstatusDeclaracion;
    private javax.swing.JTextField jTextFieldEstatusFactura;
    private javax.swing.JTextField jTextFieldFolio;
    private javax.swing.JTextField jTextFieldMontoDeclaracion;
    private javax.swing.JTextField jTextFieldMontoFactura;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldRegimen;
    private javax.swing.JTextField jTextFieldRfc;
    private javax.swing.JTextField jTextFieldRfcOpinion;
    private javax.swing.JTextField jTextFieldResultadoOpinion;
    private javax.swing.JTextField jTextFieldTipoDeclaracion;
    // End of variables declaration

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new SistemaContableGUI().setVisible(true);
        });
    }
}