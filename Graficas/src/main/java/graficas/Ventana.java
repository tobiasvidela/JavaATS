// Graficas y Eventos
package graficas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame; //ventana (mesa)
import javax.swing.JLabel;
import javax.swing.JPanel; //panel (papel para escribir sobre la mesa)
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {
    public JPanel panel;
    JLabel titulo = new JLabel("Ingrese su nombre:");
    JTextField campo = new JTextField();
    JTextArea cajaTexto = new JTextArea();
    JButton boton = new JButton();
    JLabel saludo = new JLabel();
    
    final String osRuta = System.getProperty("user.dir");
    String packageRuta = osRuta.concat("/../../..");
    
    //Constructor
    public Ventana() {
        setSize(500, 500); // Establecemos el tamaño de la ventana (y la coordenada (0,0) por defecto)
        setTitle("Graficas y Eventos (Último: Copiar texto escrito)");
        //setLocation(x, y); // Establecemos la posición inicial de la ventana
        //setBounds(x, y, 500, 600); // ubicación (x,y), tamaño = (width, height)
        setLocationRelativeTo(null); // Establecemos la ventana en el centro
        
        setResizable(true); // Establecemos si la ventana puede cambiar de tamaño o no
        setMinimumSize(new Dimension(200,200)); // Establecemos el tamaño mínimo
        
        //getContentPane().setBackground(Color.lightGray); // Establecemos el color del fondo de la ventana

        iniciarComponentes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Termina la ejecución del programa al cerrar la ventana
    }
    
    private void iniciarComponentes() {
        agregarPaneles();
        //agregarEtiquetas();
        //agregarBotones();
        //agregarRadioBotones();
        //agregarCajasDeTexto();
        //agregarAreasDeTexto();
        //agregarListasDesplegables();
        pruebaEjemplo();
    }
    
    private void agregarPaneles() {
        panel = new JPanel(); // Creación de un panel
        panel.setLayout(null); // Desactivamos el diseño
        this.getContentPane().add(panel); // Agregamos el panel a la ventana
    }
    
    private void pruebaEjemplo() {
        //agregarTítulo();
        
        agregarCajaDeTexto();
        
        //agregarBoton();
        
        agregarAreaDeTexto();
    }
    
    private void agregarTítulo() {
        
        titulo.setBounds(30, 15, 350, 60);
        titulo.setFont(new Font("cooper black",1,26));
        panel.add(titulo);
    }
    
    private void agregarCajaDeTexto() {
        campo.setBounds(20, 30, 150, 30);
        panel.add(campo);
        
        eventoDelTeclado();
    }
    
    private void agregarAreaDeTexto() {
        cajaTexto.setBounds(230, 30, 200, 300);
        panel.add(cajaTexto);
        
        //JScrollPane (sobre el área de texto)
        JScrollPane scroll = new JScrollPane(cajaTexto,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(230, 30, 200, 300);
        panel.add(scroll);
    }
    
    private void agregarBoton() {
        boton.setBounds(250, 350, 200, 30);
        boton.setText("¡Pulsa Aquí!");
        boton.setFont(new Font("copper black",0,18)); // 0: Plano | 17: tamaño (en puntos)
        panel.add(boton);
        
        //saludo
        saludo.setBounds(10, 200, 450, 40);
        saludo.setFont(new Font("arial",3,32));
        panel.add(saludo);
        
        //Agregando Evento de tipo ActionListener
        
        //agregarOyenteDeAccion();
        
        agregarOyenteDeRaton();
    }
    
    private void agregarOyenteDeAccion() {
        ActionListener listener;
        listener = (ActionEvent ae) -> {
            saludo.setText("Hola " + campo.getText() + "!");
        };
        boton.addActionListener(listener); // Agregamos un ActionListener para el botón
    }
    
    private void agregarOyenteDeRaton() {
        
        MouseListener oyenteRaton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                cajaTexto.append("mouseClicked\n");
            }

            @Override
            public void mousePressed(MouseEvent me) {
                cajaTexto.append("mousePressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                cajaTexto.append("mouseReleased\n");
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                cajaTexto.append("mouseEntered\n");
            }

            @Override
            public void mouseExited(MouseEvent me) {
                cajaTexto.append("mouseExited\n");
            }
        };
        
        boton.addMouseListener(oyenteRaton);
    }
    
    private void agregarOyenteDeTeclado() {
        //Oyente de Teclado
    }
    
    private void eventoDelTeclado() {
        KeyListener oyenteDeTeclado = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                //cajaTexto.append("keyTyped\n");
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                //cajaTexto.append("keyPressed\n");
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                //cajaTexto.append("keyReleased\n");
                cajaTexto.append(ke.getKeyChar() + "");
            }
        };
        
        campo.addKeyListener(oyenteDeTeclado);
    }
    
    //Teoria
    
    private void agregarEtiquetas() {
        //Etiqueta tipo texto
        
        JLabel etiqueta = new JLabel(); //instanciamos una etiqueta
        etiqueta.setText("Si puedes imaginarlo, puedes programarlo");
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER); // Centrar texto
        etiqueta.setBounds(0, 10, 500, 30);
        //etiqueta.setForeground(Color.MAGENTA); // Cambiamos el color de la letra
        //etiqueta.setOpaque(true); // Poder cambiar fondo
        //etiqueta.setBackground(Color.WHITE); // Cambiar el fondo
        etiqueta.setFont(new Font("cooper black",3,18)); // Establecemos la fuente del texto
        
        //panel.add(etiqueta); // Agregamos la etiqueta al panel
        
        //Etiqueta tipo imagen
        JLabel etiqueta2 = new JLabel();
        String rutaImagen = packageRuta.concat("/images/calculator.png");
        ImageIcon imagen = new ImageIcon(rutaImagen);
        etiqueta2.setBounds(160, 110, 200, 200);
        etiqueta2.setBackground(Color.RED);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));

        panel.add(etiqueta2);
    }
    
    private void agregarBotones() {
        final int normalWidth = 70;
        final int normalHeight = 24;
        
        JButton boton1 = new JButton();
        boton1.setText("Click"); // Establecemos texto al botón
        boton1.setBounds(215, 376, normalWidth, normalHeight);
        boton1.setEnabled(true); // Habilitamos el botón (true), o lo deshabilitamos (false)
        boton1.setMnemonic('a'); // Establecemos [alt + a] para "clickear" el botón desde el teclado
        
        //estilizar el botón
        //boton1.setForeground(Color.blue); // Establecemos el color de la letra del botón
        boton1.setFont(new Font("cooper black",Font.BOLD,14)); // Establecemos la fuente del botón
        
        panel.add(boton1);
        
        JButton boton2 = new JButton("Click2");
        boton2.setBounds(215, 405, normalWidth, normalHeight);
        boton2.setBackground(Color.lightGray);
        boton2.setEnabled(true);
        
        panel.add(boton2);
        
        JButton boton3 = new JButton();
        ImageIcon clickAqui = new ImageIcon(packageRuta.concat("/images/calculator.png"));
        boton3.setBounds(290, 376, 53, 53);
        boton3.setEnabled(true);
        boton3.setIcon(new ImageIcon(clickAqui.getImage().getScaledInstance(boton3.getWidth(), boton3.getHeight(), Image.SCALE_SMOOTH)));
        
        panel.add(boton3);
    }
    
    private void agregarRadioBotones() {
        JRadioButton radioBoton1 = new JRadioButton("Opción 1", true);
        radioBoton1.setBounds(50, 300, 100, 50);
        panel.add(radioBoton1);
        
        JRadioButton radioBoton2 = new JRadioButton("Opción 2", false);
        radioBoton2.setBounds(50, 350, 100, 50);
        panel.add(radioBoton2);
        
        JRadioButton radioBoton3 = new JRadioButton("Opción 3", false);
        radioBoton3.setBounds(50, 400, 100, 50);
        panel.add(radioBoton3);
        
        ButtonGroup grupoRadioBotones = new ButtonGroup();
        grupoRadioBotones.add(radioBoton1);
        grupoRadioBotones.add(radioBoton2);
        grupoRadioBotones.add(radioBoton3);
    }
    
    private void agregarCajasDeTexto() {
        JTextField cajaTexto = new JTextField();
        cajaTexto.setBounds(50,50,100,30);
        cajaTexto.setText("Escribe algo...");
        //System.out.println("Texto en la campo: " + cajaTexto.getText());
        panel.add(cajaTexto);
    }
    
    private void agregarAreasDeTexto() {
        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(20, 20, 300, 200);
        areaTexto.setText("Escriba el texto aquí...");
        areaTexto.append("\nEscribe por aquí...");
        areaTexto.setEditable(true); // Establecer el editado del area de texto
        //System.out.println("El texto es: " + areaTexto.getText());
        
        panel.add(areaTexto);
    }
    
    private void agregarListasDesplegables() {
        String paises[] = {"Argentina","Francia","Chile","Uruguay"};
        
        JComboBox listaDesplegable = new JComboBox(paises);
        listaDesplegable.setBounds(40, 40, 100, 30);
        listaDesplegable.addItem("Perú");
        listaDesplegable.addItem("Otro");
        //listaDesplegable.setEditable(true); // Permite que el usuario escriba y seleccione de esa forma
        listaDesplegable.setSelectedItem("Otro");
        
        panel.add(listaDesplegable);
    }
    
}
