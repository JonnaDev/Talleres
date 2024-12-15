import javax.swing.JOptionPane;

public class areas {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Bienvenido al sistema de áreas y volúmenes.");
        int Area = 0, Volumen = 0, Perimetro, Altura = 0, Base = 0, Lados = 0;
        double diametro;

        String[] opciones = {
            "Cuadrado",
            "Rectángulo",
            "Triángulo",
            "Círculo",
            "Cilindro",
            "Cono"
        };
        
        String figuraSeleccionada = (String) JOptionPane.showInputDialog(
            null,
            "Seleccione el tipo de figura:",
            "Menú de figuras",
            JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            opciones[0]
        );

        if (figuraSeleccionada == null) {
            JOptionPane.showMessageDialog(null, "No eligió un dato válido, cerrando el programa...");
            return; 
        }


        if (figuraSeleccionada.equals("Rectángulo")) {
            try {
                Altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura"));
                Base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base"));
                Area = Altura * Base;
                Perimetro = 2 * (Base + Altura);
                Double Diagonal = Math.sqrt(Math.pow(Base, 2) + Math.pow(Altura, 2));
                JOptionPane.showMessageDialog(null,
                    "Resultado de la figura: " + figuraSeleccionada + ":\n"
                    + "Area: " + Area + "\n"
                    + "Perimetro: " + Perimetro + "\n"
                    + "La diagonal: " + Diagonal
                );
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada no válida para Rectángulo, cerrando el programa...");
            }
        } else if (figuraSeleccionada.equals("Cuadrado")) {
            try {
                Lados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los lados del cuadrado"));
                Area = Lados * Lados;
                Perimetro = 4 * Lados;
                double Diagonal = Lados * Math.sqrt(2);
                JOptionPane.showMessageDialog(null,
                    "Resultado de la figura: " + figuraSeleccionada + "\n" +
                    "El area del cuadrado es: " + Area + "\n"
                    + "El perimetro del cuadrado es: " + Perimetro + "\n"
                    + "El diagonal del cuadrado: " + Diagonal
                );
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada no válida para Cuadrado, cerrando el programa...");
            }
        } else if (figuraSeleccionada.equals("Triángulo")) {
            try {
                double a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer lado del triángulo:"));
                double b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo lado del triángulo (base):"));
                double c = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tercer lado del triángulo:"));
                double s = (a + b + c) / 2;
                double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                double altura = (2 * area) / b;

                JOptionPane.showMessageDialog(null,
                    "Resultado de la figura: " + figuraSeleccionada + "\n"
                    + "El area es: " + area + "\n"
                    + "La altura es: " + altura + "\n"
                    + "Perimetro: " + s
                );
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada no válida para Triángulo, cerrando el programa...");
            }
        } else if (figuraSeleccionada.equals("Círculo")) {
            try {
                double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del círculo:"));
                double area = Math.PI * Math.pow(radio, 2);
                double perimetro = 2 * Math.PI * radio;
                double Diametro = 2 * radio;

                JOptionPane.showMessageDialog(null,
                    "Resultados de la figura: " + figuraSeleccionada + "\n" +
                    "Área: " + area + "\n" +
                    "Perímetro (circunferencia): " + perimetro + "\n" +
                    "Diámetro: " + Diametro
                );
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada no válida para Círculo, cerrando el programa...");
            }
        } else if (figuraSeleccionada.equals("Cilindro")) {
            try {
                double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio de la base del cilindro:"));
                double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del cilindro:"));
                double volumen = Math.PI * Math.pow(radio, 2) * altura;
                double areasuperficial = 2 * Math.PI * Math.pow(radio, 2) + 2 * Math.PI * altura;

                JOptionPane.showMessageDialog(null,
                    "Resultados para el cilindro: " + figuraSeleccionada + "\n" +
                    "Volumen: " + volumen + "\n" +
                    "Área superficial: " + areasuperficial
                );
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada no válida para Cilindro, cerrando el programa...");
            }
        } else if (figuraSeleccionada.equals("Cono")) {
            try {
                double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio de la base del cono:"));
                double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del cono:"));
                double generatriz = Math.sqrt(Math.pow(radio, 2) + Math.pow(altura, 2));
                double volumen = (1.0 / 3) * Math.PI * Math.pow(radio, 2) * altura;
                double areaSuperficial = Math.PI * radio * (radio + generatriz);

                JOptionPane.showMessageDialog(null,
                    "Resultados para la figura: " + figuraSeleccionada + " \n" +
                    "Volumen: " + volumen + "\n" +
                    "Área superficial: " + areaSuperficial + "\n" +
                    "Generatriz: " + generatriz
                );
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada no válida para Cono, cerrando el programa...");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No eligió un dato válido, cerrando el programa...");
        }
    }
}
