/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visao;

/**
 * 
 * @author rafaelmelchert
 */
public class TelaDeExecucao extends javax.swing.JFrame {

	/**
	 * Creates new form TelaDeExecucao
	 */
	public TelaDeExecucao() {
		initComponents();
	}

	public javax.swing.JLabel getNumeroChamadasCompletadas() {
		return numeroChamadasCompletadas;
	}

	public javax.swing.JLabel getNumeroChamadasNoSistema() {
		return numeroChamadasNoSistema;
	}

	public javax.swing.JLabel getNumeroMaiorTempoChamada() {
		return numeroMaiorTempoChamada;
	}

	public javax.swing.JLabel getNumeroMenorTempoChamada() {
		return numeroMenorTempoChamada;
	}

	public javax.swing.JLabel getNumeroPerdidasC1() {
		return numeroPerdidasC1;
	}

	public javax.swing.JLabel getNumeroPerdidasC2() {
		return numeroPerdidasC2;
	}

	public javax.swing.JLabel getNumeroPerdidasFA() {
		return numeroPerdidasFA;
	}

	public javax.swing.JLabel getNumeroTempoMedioChamada() {
		return numeroTempoMedioChamada;
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEstatisticas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        numeroChamadasNoSistema = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        numeroChamadasCompletadas = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        numeroMenorTempoChamada = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        numeroTempoMedioChamada = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        numeroMaiorTempoChamada = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        numeroPerdidasC1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        numeroPerdidasC2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        numeroPerdidasFA = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botaoPausarResumir = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        botaoAvancar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelEstatisticas.setBorder(javax.swing.BorderFactory.createTitledBorder("Estatisticas"));

        jLabel1.setText("Chamadas no sistema");

        numeroChamadasNoSistema.setText("0");

        jLabel3.setText("Chamadas completadas");

        numeroChamadasCompletadas.setText("0");

        jLabel5.setText("Menor tempo das chamadas");

        numeroMenorTempoChamada.setText("0");

        jLabel7.setText("Tempo medio das chamadas");

        numeroTempoMedioChamada.setText("0");

        jLabel9.setText("Maior tempo das chamadas");

        numeroMaiorTempoChamada.setText("0");

        jLabel11.setText("Chamadas perdidas celula 1");

        numeroPerdidasC1.setText("0");

        jLabel13.setText("Chamadas perdidas celula 2");

        numeroPerdidasC2.setText("0");

        jLabel15.setText("Chamadas perdidas fora de area");

        numeroPerdidasFA.setText("0");

        javax.swing.GroupLayout panelEstatisticasLayout = new javax.swing.GroupLayout(panelEstatisticas);
        panelEstatisticas.setLayout(panelEstatisticasLayout);
        panelEstatisticasLayout.setHorizontalGroup(
            panelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstatisticasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEstatisticasLayout.createSequentialGroup()
                        .addGroup(panelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15))
                        .addGap(29, 29, 29)
                        .addGroup(panelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numeroMaiorTempoChamada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numeroTempoMedioChamada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numeroPerdidasC1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numeroPerdidasC2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numeroPerdidasFA, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                    .addGroup(panelEstatisticasLayout.createSequentialGroup()
                        .addGroup(panelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(54, 54, 54)
                        .addGroup(panelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(numeroChamadasCompletadas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numeroChamadasNoSistema, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numeroMenorTempoChamada, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEstatisticasLayout.setVerticalGroup(
            panelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstatisticasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numeroChamadasNoSistema))
                .addGap(18, 18, 18)
                .addGroup(panelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(numeroChamadasCompletadas))
                .addGap(18, 18, 18)
                .addGroup(panelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(numeroMenorTempoChamada))
                .addGap(18, 18, 18)
                .addGroup(panelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(numeroTempoMedioChamada))
                .addGap(18, 18, 18)
                .addGroup(panelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(numeroMaiorTempoChamada))
                .addGap(18, 18, 18)
                .addGroup(panelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(numeroPerdidasC1))
                .addGap(18, 18, 18)
                .addGroup(panelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(numeroPerdidasC2))
                .addGap(18, 18, 18)
                .addGroup(panelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(numeroPerdidasFA))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        botaoPausarResumir.setText("Pausar");
        botaoPausarResumir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPausarResumirActionPerformed(evt);
            }
        });

        jLabel17.setText("Velocidade de Execucao");

        botaoAvancar.setText("Avancar");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 Passo", "3 Passos", "5 Passos" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoPausarResumir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoAvancar)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoPausarResumir)
                    .addComponent(jLabel17)
                    .addComponent(botaoAvancar)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEstatisticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEstatisticas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void botaoPausarResumirActionPerformed(
			java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoPausarResumirActionPerformed
		// TODO add your handling code here:
		if (botaoPausarResumir.getText().equals("Pausar")) {
			botaoPausarResumir.setText("Resumir");
		} else if (botaoPausarResumir.getText().equals("Resumir")) {
			botaoPausarResumir.setText("Pausar");
		}
	}// GEN-LAST:event_botaoPausarResumirActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed"
		// desc=" Look and feel setting code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase
		 * /tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(TelaDeExecucao.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(TelaDeExecucao.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(TelaDeExecucao.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TelaDeExecucao.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TelaDeExecucao().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAvancar;
    private javax.swing.JButton botaoPausarResumir;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel numeroChamadasCompletadas;
    private javax.swing.JLabel numeroChamadasNoSistema;
    private javax.swing.JLabel numeroMaiorTempoChamada;
    private javax.swing.JLabel numeroMenorTempoChamada;
    private javax.swing.JLabel numeroPerdidasC1;
    private javax.swing.JLabel numeroPerdidasC2;
    private javax.swing.JLabel numeroPerdidasFA;
    private javax.swing.JLabel numeroTempoMedioChamada;
    private javax.swing.JPanel panelEstatisticas;
    // End of variables declaration//GEN-END:variables
}
