public class User {
    private String name;
    private int money;
    private int ci;

    public User(String name, int money, int ci) {
        this.name = name;
        this.money = money;
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }
    public static void imprimirUsuarios(User aux) {
        System.out.println("================");
        System.out.println("Nombre : " + aux.getName());
        System.out.println("Saldo : " + aux.getMoney() );
        System.out.println("Numero de Carnet: " + aux.getCi());
        System.out.println("================");
    }
}
