
import java.awt.Color;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.model.ZipParameters;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;



public class mainFrame extends javax.swing.JFrame  {
    public static final File cd = new File(System.getProperty("user.dir")+"\\lib");
    public static File mFile;
    public static boolean musicState = true;
    public static boolean updated = true;
    public static boolean busy = false;

    
    public mainFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        BInstall = new javax.swing.JButton();
        BUninstall = new javax.swing.JButton();
        BUpdate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        ip = new javax.swing.JTextField();
        ping = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ourpack");
        setMaximumSize(new java.awt.Dimension(400, 230));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 230));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        BInstall.setText("Install");
        BInstall.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BInstall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInstallActionPerformed(evt);
            }
        });

        BUninstall.setText("Uninstall");
        BUninstall.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BUninstall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUninstallActionPerformed(evt);
            }
        });

        BUpdate.setText("Checking For Update");
        BUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUpdateActionPerformed(evt);
            }
        });

        jScrollPane2.setAutoscrolls(true);

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.setWrapStyleWord(true);
        textArea.setAutoscrolls(false);
        textArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(textArea);

        ip.setEditable(false);
        ip.setText("  IP : ourfantasycraft.ddns.net");
        ip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipActionPerformed(evt);
            }
        });

        ping.setEditable(false);
        ping.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Music");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BInstall, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                    .addComponent(ip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BUninstall, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(ping))
                .addContainerGap())
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BUninstall)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BInstall)
                        .addComponent(BUpdate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ping, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(ip)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void BUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUpdateActionPerformed
        if (updated == false && busy == false){
            busy = true;
            if(mFile.delete()){
                System.out.println(mFile.getName() + " Deleted");
            }
            File cFile = new File(cd+"\\config.zip");
            if(cFile.delete()){
                System.out.println(cFile.getName() + " Deleted");
            }
            this.BUpdate.setText("Downloading Update");
            this.BUpdate.setForeground(Color.yellow.darker().darker().darker());
            Thread t1 = new Thread(){
                @Override
                public void run(){
                    try {
                        String file = ExportResource("getPackage.bat");
                        Desktop.getDesktop().open(new File(file));
                        File fi = new File(cd+"\\mods.zip");
                        while(true){
                            if(fi.exists()){
                                if (new File(cd+"\\tmpmodlist.yml").exists() == false){
                                    initCheckUpdate();
                                    busy = false;
                                    Runtime.getRuntime().gc();
                                    break;
                                }
                                sleep(1000);
                            }
                            else
                                sleep(1000);
                        }
                    } catch (Exception ex) {
                        Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                }
            };
            t1.start();
        }
        initCheckUpdate();
    }//GEN-LAST:event_BUpdateActionPerformed
        
    private void BUninstallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUninstallActionPerformed
        if (updated == true && busy == false){
            try {
                //System.out.println("DEBUG");
                String mc = System.getenv("APPDATA")+"\\.minecraft";
                File modFolder = new File(mc+"\\mods");
                File configFolder = new File(mc+"\\config");
                int i = 0;
                if(modFolder.exists()){
                    while(true){
                        File BackUpModFolder = new File(mc+"\\OurpackBackUpJob\\mods.zip.old"+i);
                        if(BackUpModFolder.exists()){
                            i++;
                        }else{
                            try {
                                BackUpModFolder.createNewFile();
                                File BackUpConfigFolder = new File(mc+"\\OurpackBackUpJob\\config.zip.old"+i);
                                BackUpConfigFolder.createNewFile();
                            } catch (IOException ex) {
                                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            break;
                        }
                    }
                }
                else{
                    File BackUpModFolder = new File(mc+"\\OurpackBackUpJob\\mods.zip");
                    File BackUpConfigFolder = new File(mc+"\\OurpackBackUpJob\\config.zip");
                    try {
                        BackUpModFolder.createNewFile();
                        BackUpConfigFolder.createNewFile();
                    } catch (IOException ex) {
                        Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }                    
                }
                try{
                    ZipFile BUMF = new ZipFile(mc+"\\OurpackBackUpJob\\mods.zip");
                    ZipFile BUCF = new ZipFile(mc+"\\OurpackBackUpJob\\config.zip");
                    ZipParameters parameters = new ZipParameters();
                    BUMF.addFolder(modFolder, parameters);
                    BUCF.addFolder(configFolder, parameters);
                    System.out.println("Finished Backing Up Mods & Config Folders");
                }catch(ZipException e){}
                deleteDirectory(modFolder);
                deleteDirectory(configFolder);
                System.out.println("Finished Uninstalling Mods and Configs");
                Dialog dl = new Dialog("Finished Unstalling New Mods and Configs",new File("done.mp3"));
                Runtime.getRuntime().gc();
            }catch(IOException e){
                System.out.println("Something went wrong with the Install process");
                System.out.print(e);
            }
        }
        busy = false;
        //System.out.println("DEBUG : " + updated +"|" +busy);
    }//GEN-LAST:event_BUninstallActionPerformed

    private void BInstallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInstallActionPerformed
        if (updated == true && busy == false){
            try {
                //System.out.println("DEBUG");
                String mc = System.getenv("APPDATA")+"\\.minecraft";
                File modFolder = new File(mc+"\\mods");
                File configFolder = new File(mc+"\\config");
                int i = 0;
                if(modFolder.exists()){
                    while(true){
                        File BackUpModFolder = new File(mc+"\\OurpackBackUpJob\\mods.zip.old"+i);
                        if(BackUpModFolder.exists()){
                            i++;
                        }else{
                            try {
                                BackUpModFolder.createNewFile();
                                File BackUpConfigFolder = new File(mc+"\\OurpackBackUpJob\\config.zip.old"+i);
                                BackUpConfigFolder.createNewFile();
                            } catch (IOException ex) {
                                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            break;
                        }
                    }
                }
                else{
                    File BackUpModFolder = new File(mc+"\\OurpackBackUpJob\\mods.zip");
                    File BackUpConfigFolder = new File(mc+"\\OurpackBackUpJob\\config.zip");
                    try {
                        BackUpModFolder.createNewFile();
                        BackUpConfigFolder.createNewFile();
                    } catch (IOException ex) {
                        Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }                    
                }
                try{
                    ZipFile BUMF = new ZipFile(mc+"\\OurpackBackUpJob\\mods.zip");
                    ZipFile BUCF = new ZipFile(mc+"\\OurpackBackUpJob\\config.zip");
                    ZipParameters parameters = new ZipParameters();
                    BUMF.addFolder(modFolder, parameters);
                    BUCF.addFolder(configFolder, parameters);
                    System.out.println("Finished Backing Up Mods & Config Folders");
                }catch(ZipException e){}
                deleteDirectory(modFolder);
                deleteDirectory(configFolder);
                System.out.println("Finished Uninstalling Mods & Config");
                try{
                    ZipFile zf1 = new ZipFile(mFile);
                    //System.out.println("z1f is Valid Zipfile: " + zf1.isValidZipFile());
                    zf1.extractAll(mc);
                    ZipFile zf2 = new ZipFile(cd+"\\config.zip");
                    //System.out.println("z2f is Valid Zipfile: " + zf2.isValidZipFile());
                    zf2.extractAll(mc);
                    System.out.println("Finished Installing Mods & Config");
                    Dialog dl = new Dialog("Finished Installing New Mods and Configs",new File("done.mp3"));
                    Runtime.getRuntime().gc();
                }catch(ZipException e){System.out.println("WHAT"+e);}
            }catch(IOException e){
                System.out.println("Something went wrong with the Install process");
                System.out.print(e);
            }
        }
        busy = false;
        //System.out.println("DEBUG : " + updated +"|" +busy);
    }//GEN-LAST:event_BInstallActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Thread thread = new Thread(){
        @Override
            public void run(){
                System.out.println("Try not to poke this screen, a little selected area \"■■\" by miss click/drag\n" +
                                    "\nMay freeze the whole process until you release that selected area");
                initPackage();
                initTextArea();
                initPing();
                initCheckUpdate();
                initMusic();
                Runtime.getRuntime().gc();
            }

        
        };
        thread.start();
    }//GEN-LAST:event_formWindowOpened

    private void ipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ipActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        if(musicState){
            musicState = false;
        }
        else{
            musicState = true;
        }
    }//GEN-LAST:event_jMenu2MouseClicked


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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try{
                    if (args[0].equals("batch")){
                        new mainFrame().setVisible(true);
                        if (new File(System.getenv("APPDATA")+"\\.minecraft").exists() == false){
                            try {
                                Dialog dl = new Dialog("Couldn't find Minecraft Folder\nTerminating App.",new File("no.mp3"));
                                this.finalize();
                                
                            } catch (Throwable ex) {
                                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }                    
                }catch(java.lang.ArrayIndexOutOfBoundsException e){
                    try {
                        Dialog bC = new Dialog("Please run this with Ourpack.bat instead",new File("no.mp3"));
                        this.finalize();
                    } catch (Throwable ex) {
                        
                    }
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BInstall;
    private javax.swing.JButton BUninstall;
    private javax.swing.JButton BUpdate;
    private javax.swing.JTextField ip;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTextField ping;
    protected javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
    // <editor-fold defaultstate="collapsed" desc="initTextArea">
    private void initTextArea() {
        File modList = new File(cd+"\\modlist.yml");
        String content = "";
        if (!modList.exists()){
            this.textArea.setText("ERROR READING MODLIST FILE\n");
            this.textArea.setForeground(Color.RED.darker().darker());
        }
        else{
            try {
                FileReader fr = new FileReader(modList);
                BufferedReader br = new BufferedReader(fr);
                this.textArea.setText("\t                    Ourpack ver "+br.readLine().split(":")[1]+"\n");                
                while((content = br.readLine()) != null){
                    try{
                        this.textArea.setText(this.textArea.getText()+content+"\n");
                    }
                    catch(java.lang.NullPointerException e){
                        br.close();
                        fr.close();
                        break;
                    }
                }
                this.textArea.setCaretPosition(0);
                br.close();
                fr.close();
            } catch (IOException ex) {                
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }
        
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="initPing">
    private void initPing() {
        Thread t1 = new Thread(){
        @Override
            public void run(){
                try {
                    InetAddress address = InetAddress.getByName("ourfantasycraft.ddns.net");
                    while(true){
                        try{
                            Socket sc = new Socket(address.getHostAddress(),25565);
                            long startTime = System.currentTimeMillis();
                            if(address.isReachable(1000)){
                                int delay = ((int) (startTime - System.currentTimeMillis()))+1;
                                if (delay < 100){
                                    ping.setText(Integer.toString(delay)+" ms");
                                    ping.setForeground(Color.GREEN.darker().darker());
                                    ip.setForeground(Color.GREEN.darker().darker());
                                }
                                else{
                                    if (delay > 500){
                                        ping.setText(Integer.toString(delay)+" ms");
                                        ping.setForeground(Color.RED.darker().darker());
                                        ip.setForeground(Color.GREEN.darker().darker());
                                    }
                                    else{
                                        ping.setText(Integer.toString(delay)+" ms");
                                        ping.setForeground(Color.YELLOW.darker().darker());
                                        ip.setForeground(Color.GREEN.darker().darker());
                                    }
                                }
                                try {
                                    sleep(1000);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            else{
                                ping.setText("D/C");
                                ping.setForeground(Color.RED.darker().darker());
                                ip.setForeground(Color.RED.darker().darker());
                                try {
                                    sleep(1000);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }catch(java.net.ConnectException e){try {
                            ping.setText("D/C");
                            ping.setForeground(Color.RED.darker().darker());
                            ip.setForeground(Color.RED.darker().darker());
                            sleep(1000);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
                            }
}                       
                    }
                } catch (UnknownHostException ex) {
                    Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        };
        t1.start();
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="initMusic">
    private void initMusic() {
        try {
            InputStream in = mainFrame.class.getResourceAsStream("bgm.mp3");
            AudioStream as = new AudioStream(in);    

            Thread t1 = new Thread(){
                @Override
                public void run(){
                    int timeElapsed = 0;
                    while(true){
                        if(musicState){
                            AudioPlayer.player.start(as);
                            jMenu2.setText("Stop Music");
                            timeElapsed++;
                            if(timeElapsed > 617){
                                try {
                                    in.close();
                                } catch (IOException ex) {
                                    Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                break;
                            }
                        }
                        else{
                            AudioPlayer.player.interrupt();
                            AudioPlayer.player.stop(as);
                            AudioPlayer.player.stop(in);
                            
                            jMenu2.setText("Play Music");
                        }
                        try {
                            sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    try {
                        as.close();
                    } catch (IOException ex) {
                        Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    initMusic();
                }
            };
            t1.start();
        } catch (IOException ex) {System.out.println("ERROR READING BGM FILE ");
        ex.printStackTrace();}
        
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="getNewModList">
    private void getNewModList() {
        try {
            /*ProcessBuilder pb = new ProcessBuilder("cmd", "/c", cd+"\\getFile.bat");
            File dir = new File(cd+"\\");
            pb.directory(dir);
            try {
            Process p = pb.start();
            try {
            p.waitFor();
            } catch (InterruptedException ex) {
            Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            } catch (IOException ex) {
            Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            */
            String file = ExportResource("getFile.bat");
            ProcessBuilder pb = new ProcessBuilder("cmd", "/c", file);
            File dir = new File(cd+"\\");
            pb.directory(dir);
            try {
                Process p = pb.start();
                try {
                    p.waitFor();
                } catch (InterruptedException ex) {
                    Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (IOException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="initCheckUpdate">
    private void initCheckUpdate() {
        getNewModList();
        try{
            FileReader fr1 = new FileReader(cd+"\\modlist.yml");
            BufferedReader br1 = new BufferedReader(fr1);       
            FileReader fr2 = new FileReader(cd+"\\tmpmodlist.yml");
            BufferedReader br2 = new BufferedReader(fr2);
            String line1 = br1.readLine().split(":")[1];
            String line2 = br2.readLine().split(":")[1];
            //System.out.println(line1 + line2);
            if (!line1.equalsIgnoreCase(line2)){
                this.BUpdate.setText("OUTDATED");
                this.BUpdate.setForeground(Color.RED.darker().darker());
                updated = false;
            }
            else{
                this.BUpdate.setText("UPDATED");
                this.BUpdate.setForeground(Color.GREEN.darker().darker());
                updated = true;
            }
            br1.close();
            fr1.close();
            br2.close();
            fr2.close();
        }catch(IOException | java.lang.NullPointerException e){
                this.BUpdate.setText("ERROR");
                this.BUpdate.setForeground(Color.RED.darker());
                updated = false;
        }
        File mcBackUp = new File(System.getenv("APPDATA")+"\\.minecraft\\OurpackBackUpJob\\");
        if (!mcBackUp.exists())
            mcBackUp.mkdir();
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="ExportResource">
    static public String ExportResource(String resourceName) throws Exception {
        InputStream stream = null;
        OutputStream resStreamOut = null;
        String jarFolder;
        try {
            stream = mainFrame.class.getResourceAsStream(resourceName);//note that each / is a directory down in the "jar tree" been the jar the root of the tree
            if(stream == null) {
                throw new Exception("Cannot get resource \"" + resourceName + "\" from Jar file.");
            }
            int readBytes;
            byte[] buffer = new byte[4096];
            jarFolder = System.getProperty("user.dir")+"\\lib\\";
            //System.out.println(jarFolder);
            resStreamOut = new FileOutputStream(jarFolder + resourceName);
            while ((readBytes = stream.read(buffer)) > 0) {
                resStreamOut.write(buffer, 0, readBytes);
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            stream.close();
            resStreamOut.close();
        }

        return jarFolder + resourceName;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="initPackage">
    private void initPackage(){
        try {
            ZipFile zf = new ZipFile(cd+"\\package.zip");
            zf.extractAll(cd.toString());
            File file = new File(cd+"\\package.zip");
            file.delete();
            mFile = new File(cd+"\\mods.zip");
            //System.out.println("mods zip "+ mFile.exists());
        } catch (ZipException ex) {}
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="deleteDirectory">
    public void deleteDirectory(File file) {
        if (file.isDirectory()) {
            File[] entries = file.listFiles();
            if (entries != null) {
                for (File entry : entries) {
                    deleteDirectory(entry);
                    System.out.println("\u001B[32mDeleted " + entry);
                }
            }
        }
        file.delete();        
    }
    // </editor-fold>

}
