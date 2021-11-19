package com.company;




        class Main {
            public static void main(String[] args) {
                personnel p = new personnel();
                p.ajouterEmploye(new Vendeur("Astrid", "Business", 45, "1995", 30000));
                p.ajouterEmploye(new Representant("Khanzou", "Vendtout", 25, "2001", 20000));
                p.ajouterEmploye(new Technicien("Ines", "Bosseur", 28, "1998", 1000));
                p.ajouterEmploye(new Manutentionnaire("Salama", "Stocketout", 32, "1998", 45));
                p.ajouterEmploye(new TechnARisque("Andrea", "Flippe", 28, "2000", 1000));
                p.ajouterEmploye(new ManutARisque("loic", "Abordage", 30, "2001", 45));

                p.afficherSalaires();
                System.out.println("Le salaire moyen dans l'entreprise est de "
                        + p.salaireMoyen() + " francs.");

            }

        }


