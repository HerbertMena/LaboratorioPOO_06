import javax.xml.crypto.Data;

public class HamburguesaConcreteBuilder implements HamburguesaBuilder {
    private Hamburguesa hamburguesa;
    private HamburguesaConcreteBuilder builder;

    // hacer singleton

    private HamburguesaConcreteBuilder() {
        hamburguesa = new Hamburguesa(" ", false, false, false, false),
    }
    @Override
    public void setTipoCarne(String carne){
        hamburguesa = new Hamburguesa(carne, hamburguesa.isLechuga(), hamburguesa.isTomate(),hamburguesa.isCebolla(), hamburguesa.isQueso());
    }

    @Override
    public void setLechuga(boolean lechuga){

    }

    @Override
    public void setCebolla(boolean cebolla){
        }
    @Override
    public void setqueso(boolean queso){
            }

      public void reset(){}


}