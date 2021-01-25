package reproductor;

// JFRAME DEL PROYECTO
public class Reloj extends javax.swing.JFrame {
    
    
    private CronometroRunnable cronometroR;       // INICIALIZACION  VARIABLE TIPO "CronometroRunnable"
    private Thread hiloReproductor;               // INICIALIZACION  VARIBLE  TIPO "ReproducctorRunnable"

    // CONSTRUCTOR DE LA CLASE 
    public Reloj(){               //SE BUSCA TENER UN HILO EN PARALELO QUE VAYA ACTUALIZANDO SEGUNDO A SEGUNDO LA HORA.
        
        initComponents();
        
        // NO INTEREZA DETENER EL HILO DEL RELOJ, POR LO TANTO SE DECLARA UNA VARIABLE ANONIMA
        new Thread(new HoraRunnable(HoraTxt)).start();      // SE CREA UN HILO DE LA CLASE "HoraRunnable"
            
        // EL HILO DEL CRONOMETRO NO PUEDE SER ANONIMO YA QUE SE LE APLICAN METODOS PARA PODER MANEJARLO (START, PAUSE, RESET);
        cronometroR = new CronometroRunnable(CronometroTxt);
        new Thread(cronometroR).start();                    // EL HILO CORRE EN EL FONDO DEL PROGRAMA PERO NO SE LE HAN CONFIGURADO LAS ACCIONES DEL MISMO
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HoraLabel = new javax.swing.JLabel();
        HoraTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        CronometroLabel = new javax.swing.JLabel();
        CronometroTxt = new javax.swing.JTextField();
        btnStart = new javax.swing.JButton();
        btnPause = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnMusicPlay = new javax.swing.JButton();
        btnMusicPause = new javax.swing.JButton();
        btnMusicStop = new javax.swing.JButton();
        CronometroLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HoraLabel.setText("Hora :");

        HoraTxt.setEditable(false);
        HoraTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        HoraTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoraTxtActionPerformed(evt);
            }
        });

        CronometroLabel.setText("Cronometro:");

        CronometroTxt.setEditable(false);
        CronometroTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        CronometroTxt.setText("0000");
        CronometroTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CronometroTxtActionPerformed(evt);
            }
        });

        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnPause.setText("Pause");
        btnPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPauseActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnMusicPlay.setText("Play");
        btnMusicPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusicPlayActionPerformed(evt);
            }
        });

        btnMusicPause.setText("Pause");
        btnMusicPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusicPauseActionPerformed(evt);
            }
        });

        btnMusicStop.setText("Stop");
        btnMusicStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusicStopActionPerformed(evt);
            }
        });

        CronometroLabel1.setText("Musica :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 45, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addComponent(HoraLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(HoraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(CronometroLabel)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnPause)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnReset))
                                .addComponent(CronometroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnStart))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnMusicPlay)
                        .addGap(50, 50, 50)
                        .addComponent(btnMusicPause)
                        .addGap(45, 45, 45)
                        .addComponent(btnMusicStop))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(CronometroLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HoraLabel)
                    .addComponent(HoraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CronometroLabel)
                    .addComponent(CronometroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStart)
                    .addComponent(btnPause)
                    .addComponent(btnReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CronometroLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMusicPlay)
                    .addComponent(btnMusicPause)
                    .addComponent(btnMusicStop))
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void HoraTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoraTxtActionPerformed

    }//GEN-LAST:event_HoraTxtActionPerformed

    private void CronometroTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CronometroTxtActionPerformed

    }//GEN-LAST:event_CronometroTxtActionPerformed
    // JBUTTON PAUSE
    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseActionPerformed
        
        cronometroR.pausar();
        
    }//GEN-LAST:event_btnPauseActionPerformed
    // JBUTTON START
    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
       
        cronometroR.comenzar();
        
    }//GEN-LAST:event_btnStartActionPerformed
    // JBUTTON RESET
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        
        cronometroR.resetear();
        
    }//GEN-LAST:event_btnResetActionPerformed
    //JBUTTON PLAY MUSIC
    private void btnMusicPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusicPlayActionPerformed

       // CODIGO DE CONTROL - EJECUTA UNA VEZ EL HILO EL CUAL EVITA LA SUPERPOSICION DE LA MUSICA
       if(hiloReproductor == null || !hiloReproductor.isAlive()){      // SI EL HILO DE REPRODUCCION ES NULO O NO ESTA VIVO (MUERE NORMAL), SE STARTEA (CREA EL HILO)
            hiloReproductor = new Thread(new ReproductorRunnable());   
            hiloReproductor.start();
       // SI EL HILO ESTA EN PAUSA, SE ESPERA QUE CUANDO SE DE PLAY VUELVA ARRANCAR
       }else{
           hiloReproductor.resume();          // VUELVE ARRANCAR EL HILO SUSPENDIDO - "resume, suspend, stop" METODO DEPRECADO PERO PARA EL CASO FUNCIONA.
       }
    }//GEN-LAST:event_btnMusicPlayActionPerformed
    //JBUTTON PAUSE MUSIC
    private void btnMusicPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusicPauseActionPerformed
        // EVENTO PAUSE MUSIC -  EL OBJETO REPRODUCTOR NO PUEDE SER NULO (NullPointerException)
        if(hiloReproductor != null && hiloReproductor.isAlive()){
            hiloReproductor.suspend();       
        }                                
    }//GEN-LAST:event_btnMusicPauseActionPerformed
    //JBUTTON STOP MUSIC
    private void btnMusicStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusicStopActionPerformed
        // EVENTO STOP MUSIC - MATA EL HILO (SIEMPRE Y CUANDO ESTE VIVO)
        if(hiloReproductor != null && hiloReproductor.isAlive()){
            hiloReproductor.stop();
        }
    }//GEN-LAST:event_btnMusicStopActionPerformed
    // METODO MAIN
    public static void main(String args[]) {
        
        //SE CREA UNA NUEVA CLASE ANONIMA QUE IMPLEMENTA "Runnable" Y SOBRE-ESCRIBE SU METODO "run"
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // SE ABRE EL PANEL (JFRAME) Y SE HACE VISIBLE
                new Reloj().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CronometroLabel;
    private javax.swing.JLabel CronometroLabel1;
    private javax.swing.JTextField CronometroTxt;
    private javax.swing.JLabel HoraLabel;
    private javax.swing.JTextField HoraTxt;
    private javax.swing.JButton btnMusicPause;
    private javax.swing.JButton btnMusicPlay;
    private javax.swing.JButton btnMusicStop;
    private javax.swing.JButton btnPause;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnStart;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
