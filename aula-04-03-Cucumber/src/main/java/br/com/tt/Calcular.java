package br.com.tt;

/**
 * @author sala03
 *
 */
public class Calcular {


  /**
   * Primeiro Valor
   */
  private transient Integer valor1 = 0;

  /**
   * Segundo Valor
   */
  private transient Integer valor2 = 0;

  /**
   * Valor Total
   */
  private transient Integer resultado = 0;

  /**
   * Construtor
   */
  public Calcular() {
    super();
    // TODO Auto-generated constructor stub
  }

  public void setValor1(Integer v1) {
    this.valor1 = v1;
  }

  public void setValor2(Integer v2) {
    this.valor2 = v2;

  }

  public void somar() {
    resultado = valor1 + valor2;
  }

  public Integer getResultado() {
    return resultado;
  }


}
