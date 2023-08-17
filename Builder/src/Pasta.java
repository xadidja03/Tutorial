public class Pasta {
    private String xemir;
    private String sos;
    private String ingrediyentler;

    public String getXemir() {
        return xemir;
    }

    public void setXemir(String xemir) {
        this.xemir = xemir;
    }

    public String getSos() {
        return sos;
    }

    public void setSos(String sos) {
        this.sos = sos;
    }

    public String getIngrediyentler() {
        return ingrediyentler;
    }

    public void setIngrediyentler(String ingrediyentler) {
        this.ingrediyentler = ingrediyentler;
    }

    public void hazirla() {
        System.out.println("Pasta hazırlanır...");
        System.out.println("Xemir: " + xemir);
        System.out.println("Sos: " + sos);
        System.out.println("Ingrediyentler: " + ingrediyentler);
    }
}
