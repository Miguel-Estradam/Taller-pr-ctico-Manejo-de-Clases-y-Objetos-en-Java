package Clases;

/**
 *
 * @author Miguel Alejandro Muñoz Estrada
 */
public class bankAccount {

   
   //variables de la clase
    private int accountNumber;
    protected  boolean activated;
    
    
    // GET Y SET
    /**
     * Optener Estado de cuenta
     */
    public boolean getActivated() {
        return activated;
    }
    /**
     * Cambiar estado de cuentra
     * @param  activated true o false
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    
     /**
     * Optener Estado de cuenta
     */
    public int getAccountNumber() {
        return accountNumber;
    }
    /**
     * iNGRESAR NUMERO DE CUENTA
     * @param accountNumber solo numeros enteros
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
