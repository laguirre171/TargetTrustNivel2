package br.com.tt;

/**
 * @author instrutor
 *
 */
public class Calcular {

  /**
   * teste
   */
  private transient Integer valor1 = 0;
  /**
   * teste sfdgsfg sfdgs df
   */
  private transient Integer valor2 = 0;
  /**
   * teste sfgs dfgsdfgsd
   */
  private transient Integer resultado = 0;



  /**
   * 
   */
  public Calcular() {
    super();
  }

  /**
   * @param valor1
   */
  public void setValor1(Integer valor1) {

    this.valor1 = valor1;

  }


  public void setValor2(Integer v2) {

    valor2 = v2;

  }

  public void somar() {
    resultado = valor1 + valor2;
  }

  public Integer getResultado() {
    return resultado;
  }

}
