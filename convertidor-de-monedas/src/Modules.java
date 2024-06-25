public record Modules() {
    public static void menu(){
        System.out.println("=========================================");
        System.out.println("=== Bienvenido al conversor de moenda ===");
        System.out.println("=========================================");
        System.out.println("1. Dolar ==> Peso Argentino");
        System.out.println("2. Peso Argentino ==> Dolar");
        System.out.println("3. Dolar ==> Real Brasilenho");
        System.out.println("4. Real Brasilenho ==> Dolar");
        System.out.println("5. Dolar ==> Nuevo Sol");
        System.out.println("6. Nuevo Sol ==> Dolar");
        System.out.println("0. Salir");
        System.out.println("==========================================");
    }

    public static float conversion(float rate, float monto){
        return rate * monto;
    }
}

