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
