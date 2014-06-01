package visao;

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

	public javax.swing.JButton getBotaoPausarResumir() {
		return botaoPausarResumir;
	}

	public javax.swing.JComboBox getjComboBox1() {
		return jComboBox1;
	}

	public javax.swing.JButton getBotaoEncerrar() {
		return botaoEncerrar;
	}

	public javax.swing.JLabel getTaxaMediaDeOcupacaoDeC1() {
		return taxaMediaDeOcupacaoDeC1;
	}

	public javax.swing.JLabel getTaxaMediaDeOcupacaoDeC2() {
		return taxaMediaDeOcupacaoDeC2;
	}

	public javax.swing.JLabel getNumeroDeCanaisDeC1Ocupados() {
		return numeroDeCanaisDeC1Ocupados;
	}

	public javax.swing.JLabel getNumeroDeCanaisDeC2Ocupados() {
		return numeroDeCanaisDeC2Ocupados;
	}
	
	public javax.swing.JLabel getCampoTempoAtual() {
		return campoTempoAtual;
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// <editor-fold defaultstate="collapsed"
	// <editor-fold defaultstate="collapsed"
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
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
        jLabel10 = new javax.swing.JLabel();
        numeroDeCanaisDeC1Ocupados = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        taxaMediaDeOcupacaoDeC1 = new javax.swing.JLabel();
        numeroDeCanaisDeC2Ocupados = new javax.swing.JLabel();
        taxaMediaDeOcupacaoDeC2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botaoPausarResumir = new javax.swing.JButton();
        botaoEncerrar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        campoTempoAtual = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Execucao");

        panelEstatisticas.setBorder(javax.swing.BorderFactory.createTitledBorder("Estatisticas"));
        panelEstatisticas.setForeground(new java.awt.Color(255, 0, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setLabelFor(numeroChamadasNoSistema);
        jLabel1.setText("Chamadas no sistema");

        numeroChamadasNoSistema.setText("0");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Chamadas completadas");

        numeroChamadasCompletadas.setText("0");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Menor tempo das chamadas");

        numeroMenorTempoChamada.setText("0");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Tempo medio das chamadas");

        numeroTempoMedioChamada.setText("0");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Maior tempo das chamadas");

        numeroMaiorTempoChamada.setText("0");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 51));
        jLabel11.setText("Chamadas perdidas celula 1");

        numeroPerdidasC1.setText("0");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 51));
        jLabel13.setText("Chamadas perdidas celula 2");

        numeroPerdidasC2.setText("0");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 51));
        jLabel15.setText("Chamadas perdidas fora de area");

        numeroPerdidasFA.setText("0");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Canis de C1 ocupados");

        numeroDeCanaisDeC1Ocupados.setText("0");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Taxa media de ocupacao de C1");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Canais de c2 ocupados");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Taxa media de ocupacao de C2");

        taxaMediaDeOcupacaoDeC1.setText("0");

        numeroDeCanaisDeC2Ocupados.setText("0");

        taxaMediaDeOcupacaoDeC2.setText("0");

        javax.swing.GroupLayout panelEstatisticasLayout = new javax.swing.GroupLayout(panelEstatisticas);
        panelEstatisticas.setLayout(panelEstatisticasLayout);
        panelEstatisticasLayout.setHorizontalGroup(
            panelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstatisticasLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(panelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16))
                .addGap(34, 34, 34)
                .addGroup(panelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(taxaMediaDeOcupacaoDeC2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroDeCanaisDeC2Ocupados, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taxaMediaDeOcupacaoDeC1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroDeCanaisDeC1Ocupados)
                    .addComponent(numeroChamadasNoSistema)
                    .addGroup(panelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(numeroTempoMedioChamada, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numeroMaiorTempoChamada)
                            .addComponent(numeroMenorTempoChamada)))
                    .addComponent(numeroChamadasCompletadas)
                    .addComponent(numeroPerdidasC2)
                    .addComponent(numeroPerdidasFA, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroPerdidasC1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEstatisticasLayout.setVerticalGroup(
            panelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstatisticasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numeroChamadasNoSistema))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(numeroDeCanaisDeC1Ocupados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(taxaMediaDeOcupacaoDeC1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(numeroDeCanaisDeC2Ocupados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(taxaMediaDeOcupacaoDeC2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numeroMaiorTempoChamada, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(numeroMenorTempoChamada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(numeroTempoMedioChamada))
                .addGap(11, 11, 11)
                .addGroup(panelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(numeroChamadasCompletadas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numeroPerdidasC1)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroPerdidasC2)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEstatisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(numeroPerdidasFA))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        botaoPausarResumir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoPausarResumir.setText("Pausar");
        botaoPausarResumir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPausarResumirActionPerformed(evt);
            }
        });

        botaoEncerrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoEncerrar.setText("Encerrar");
        botaoEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEncerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoPausarResumir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoEncerrar)
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(botaoPausarResumir)
                .addComponent(botaoEncerrar))
        );

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Velocidade de Execucao");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 Passo", "3 Passos", "5 Passos" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Tempo:");

        campoTempoAtual.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        campoTempoAtual.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEstatisticas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoTempoAtual)
                        .addGap(39, 39, 39)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel17)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEstatisticas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(campoTempoAtual)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_jComboBox1ItemStateChanged
		// TODO add your handling code here:
	}// GEN-LAST:event_jComboBox1ItemStateChanged

	private void botaoEncerrarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoEncerrarActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_botaoEncerrarActionPerformed

	private void botaoPausarResumirActionPerformed(
			java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoPausarResumirActionPerformed
		// TODO add your handling code here:
		if (botaoPausarResumir.getText().equals("Pausar")) {
			botaoPausarResumir.setText("Resumir");
		} else if (botaoPausarResumir.getText().equals("Resumir")) {
			botaoPausarResumir.setText("Pausar");
		}
	}// GEN-LAST:event_botaoPausarResumirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEncerrar;
    private javax.swing.JButton botaoPausarResumir;
    private javax.swing.JLabel campoTempoAtual;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel numeroChamadasCompletadas;
    private javax.swing.JLabel numeroChamadasNoSistema;
    private javax.swing.JLabel numeroDeCanaisDeC1Ocupados;
    private javax.swing.JLabel numeroDeCanaisDeC2Ocupados;
    private javax.swing.JLabel numeroMaiorTempoChamada;
    private javax.swing.JLabel numeroMenorTempoChamada;
    private javax.swing.JLabel numeroPerdidasC1;
    private javax.swing.JLabel numeroPerdidasC2;
    private javax.swing.JLabel numeroPerdidasFA;
    private javax.swing.JLabel numeroTempoMedioChamada;
    private javax.swing.JPanel panelEstatisticas;
    private javax.swing.JLabel taxaMediaDeOcupacaoDeC1;
    private javax.swing.JLabel taxaMediaDeOcupacaoDeC2;
    // End of variables declaration//GEN-END:variables
}
