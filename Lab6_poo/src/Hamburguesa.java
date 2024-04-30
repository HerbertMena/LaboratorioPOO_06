public class Hamburguesa {
    private String tipoCarne;
    private boolean lechuga;
    private boolean tomate;
    private boolean cebolla;
    private boolean queso;

    public Hamburguesa(){

    }
    public Hamburguesa(String tipoCarne, boolean lechuga, boolean tomate, boolean cebolla, boolean queso) {
        this.tipoCarne = tipoCarne;
        this.lechuga = lechuga;
        this.tomate = tomate;
        this.cebolla = cebolla;
        this.queso = queso;
    }

    public String getTipoCarne() {
        return tipoCarne;
    }

    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    public boolean isLechuga() {
        return lechuga;
    }

    public void setLechuga(boolean lechuga) {
        this.lechuga = lechuga;
    }

    public boolean isTomate() {
        return tomate;
    }

    public void setTomate(boolean tomate) {
        this.tomate = tomate;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public boolean isQueso() {
        return queso;
    }

    public void setQueso(boolean queso) {
        this.queso = queso;
    }
}
