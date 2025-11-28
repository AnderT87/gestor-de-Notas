package com.mycompany.gestornotas.utilidades;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class PanelRedondeado extends JPanel {
    private int radio = 15;
    private Color colorBorde = Color.BLACK;

    public PanelRedondeado() {
        setOpaque(false);
    }

    public PanelRedondeado(int radio) {
        this.radio = radio;
        setOpaque(false);
    }

    public PanelRedondeado(int radio, Color colorFondo) {
        this.radio = radio;
        setOpaque(false);
        setBackground(colorFondo);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Dibujar fondo redondeado
        g2d.setColor(getBackground());
        g2d.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, radio, radio);

        // Dibujar borde redondeado
        g2d.setColor(colorBorde);
        g2d.setStroke(new BasicStroke(1));
        g2d.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, radio, radio);

        super.paintComponent(g);
    }

    public void setRadio(int radio) {
        this.radio = radio;
        repaint();
    }

    public void setColorBorde(Color colorBorde) {
        this.colorBorde = colorBorde;
        repaint();
    }
}
