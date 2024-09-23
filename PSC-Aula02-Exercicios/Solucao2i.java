import javax.swing.JOptionPane;
public class Solucao2i {
    // Entrar com um número e imprimir uma das mensagens: é múltiplo de 3 ou não é.
    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Digite um número: ");
        int numeroconvertido = Integer.parseInt(numero);

        int multiplo = 3;

        if ( (multiplo * 1  == numeroconvertido))
        {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é múltiplo de " + multiplo);
        } else
        {
            if ( (multiplo * 2 == numeroconvertido) )
            {
                JOptionPane.showMessageDialog(null, "O número " + numero + " é múltiplo de " + multiplo);
            } else
            {
                if ( (multiplo * 3 == numeroconvertido) )
                {
                    JOptionPane.showMessageDialog(null, "O número " + numero + " é múltiplo de " + multiplo);
                } else
                {
                    if ( (multiplo * 4 == numeroconvertido) )
                    {
                        JOptionPane.showMessageDialog(null, "O número " + numero + " é múltiplo de " + multiplo);
                    } else 
                    {
                        if ( (multiplo * 5 == numeroconvertido) )
                        {
                            JOptionPane.showMessageDialog(null, "O número " + numero + " é múltiplo de " + multiplo);
                        } else
                        {
                            if ( (multiplo * 6 == numeroconvertido) )
                            {
                                JOptionPane.showMessageDialog(null, "O número " + numero + " é múltiplo de " + multiplo);
                            } else
                            {
                                if ( (multiplo * 7 == numeroconvertido) )
                                {
                                    JOptionPane.showMessageDialog(null, "O número " + numero + " é múltiplo de " + multiplo);
                                } else
                                {
                                    if ( (multiplo * 8 == numeroconvertido) )
                                    {
                                        JOptionPane.showMessageDialog(null, "O número " + numero + " é múltiplo de " + multiplo);
                                    } else
                                    {
                                        if ( (multiplo * 9 == numeroconvertido) )
                                        {
                                            JOptionPane.showMessageDialog(null, "O número " + numero + " é múltiplo de " + multiplo);
                                        } else
                                        {
                                            if ( (multiplo * 10 == numeroconvertido) )
                                            {
                                                JOptionPane.showMessageDialog(null, "O número " + numero + " é múltiplo de " + multiplo);
                                            } else
                                            {
                                                JOptionPane.showMessageDialog(null, "O número " + numero + " não é múltiplo de " + multiplo);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}
