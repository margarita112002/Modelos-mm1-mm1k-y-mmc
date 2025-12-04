public class TartasFrerardColas {

    // ======= MODELO M/M/1 =======
    public static void mm1(double lambda, double mu) {

    System.out.println("===== MODELO M/M/1 - Tartas Frerard =====");

     double rho = lambda / mu;                    // ρ = λ/μ
     double P0 = 1 - rho;                         // P0 = 1 - ρ
     double L = rho / (1 - rho);                  // L = ρ / (1 - ρ)
     double Lq = (rho * rho) / (1 - rho);         // Lq = ρ² / (1 - ρ)
     double W = L / lambda;                       // W = L / λ
     double Wq = Lq / lambda;                     // Wq = Lq / λ

    System.out.println("λ (tasa de llegadas): " + lambda);
        System.out.println("μ (tasa de servicio): " + mu);
        System.out.println("ρ (utilización): " + rho);
        System.out.println("P0 (sistema vacío): " + P0);
        System.out.println("L (clientes en el sistema): " + L);
        System.out.println("Lq (clientes en cola): " + Lq);
        System.out.println("W (tiempo en sistema): " + W);
        System.out.println("Wq (tiempo en cola): " + Wq);
        System.out.println();
    }
 // ======= M/M/1/K =======//
    public static void mm1k(double lambda, double mu, int K) {
        System.out.println("===== MODELO M/M/1/" + K + " - Tartas Frerard =====");

        double rho = lambda / mu;
        double P0;
        if (rho == 1) {
            P0 = 1.0 / (K + 1);
        } else {
            P0 = (1 - rho) / (1 - Math.pow(rho, K + 1)); 
        }
         // Probabilidad de que el sistema este lleno
        double PK = P0 * Math.pow(rho, K);
         double L = 0;
        for (int n = 0; n <= K; n++) {
            L += n * P0 * Math.pow(rho, n);
        }
        double lambdaEf = lambda * (1 - PK);

        // Tiempos
        double W = L / lambdaEf;
        double Lq = L - (1 - P0); //M/M/1/K
        double Wq = Lq / lambdaEf;
