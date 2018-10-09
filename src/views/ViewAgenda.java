package views;

public class ViewAgenda extends javax.swing.JFrame {

    
    public ViewAgenda() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_nombre = new javax.swing.JLabel();
        jl_email = new javax.swing.JLabel();
        jtf_nombre = new javax.swing.JTextField();
        jtf_email = new javax.swing.JTextField();
        jbtn_primero = new javax.swing.JButton();
        jbtn_anterior = new javax.swing.JButton();
        jbtn_siguiente = new javax.swing.JButton();
        jbtn_ultimo = new javax.swing.JButton();
        jbtn_nuevo = new javax.swing.JButton();
        jbtn_insertar = new javax.swing.JButton();
        jbtn_modificar = new javax.swing.JButton();
        jbtn_eliminar = new javax.swing.JButton();
        jb_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jl_nombre.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jl_nombre.setText("Nombre:");

        jl_email.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jl_email.setText("Email:");

        jtf_nombre.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        jtf_email.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        jbtn_primero.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jbtn_primero.setText("|<");

        jbtn_anterior.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jbtn_anterior.setText("<<");

        jbtn_siguiente.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jbtn_siguiente.setText(">>");

        jbtn_ultimo.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jbtn_ultimo.setText(">|");

        jbtn_nuevo.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jbtn_nuevo.setText("Nuevo");

        jbtn_insertar.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jbtn_insertar.setText("Insertar");

        jbtn_modificar.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jbtn_modificar.setForeground(new java.awt.Color(51, 51, 51));
        jbtn_modificar.setText("Modificar");

        jbtn_eliminar.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jbtn_eliminar.setText("Eliminar");

        jb_salir.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jb_salir.setText("Salir");
        jb_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_nombre)
                            .addComponent(jl_email))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_email, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(jtf_nombre)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jbtn_primero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtn_anterior)
                        .addGap(14, 14, 14)
                        .addComponent(jbtn_siguiente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn_ultimo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbtn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn_insertar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn_modificar)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jb_salir))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jb_salir)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_nombre)
                    .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_email)
                    .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_primero)
                    .addComponent(jbtn_anterior)
                    .addComponent(jbtn_siguiente)
                    .addComponent(jbtn_ultimo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_nuevo)
                    .addComponent(jbtn_insertar)
                    .addComponent(jbtn_modificar)
                    .addComponent(jbtn_eliminar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jb_salirActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAgenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_salir;
    public javax.swing.JButton jbtn_anterior;
    public javax.swing.JButton jbtn_eliminar;
    public javax.swing.JButton jbtn_insertar;
    public javax.swing.JButton jbtn_modificar;
    public javax.swing.JButton jbtn_nuevo;
    public javax.swing.JButton jbtn_primero;
    public javax.swing.JButton jbtn_siguiente;
    public javax.swing.JButton jbtn_ultimo;
    public javax.swing.JLabel jl_email;
    public javax.swing.JLabel jl_nombre;
    public javax.swing.JTextField jtf_email;
    public javax.swing.JTextField jtf_nombre;
    // End of variables declaration//GEN-END:variables
}
