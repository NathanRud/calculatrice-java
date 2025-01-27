import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calcul calcul = new Calcul();
        Boolean contin = true;

        ArrayList<String> liste = new ArrayList<>();

        while (contin) {
            try {
                System.out.println("Historique : " + liste);
                System.out.println("Que souhaitez vous faire ?\n1.Addition\n2.Soustration\n3.Multiplication\n4.Division");
                int choix = sc.nextInt();

                if (choix < 1 || choix > 4) {
                    System.out.println("Erreur : Veuillez choisir un nombre entre 1 et 4");
                    sc.nextLine();
                    continue;
                }

                if (choix == 1) {
                    try {
                        System.out.println("Premier chiffre a additionner : ");
                        int premnbr = sc.nextInt();
                        System.out.println("Second chiffre a additionner : ");
                        int secnbr = sc.nextInt();
                        calcul.addition(premnbr, secnbr);
                        liste.add(premnbr + "+" + secnbr + "=" + calcul.getRes());
                    } catch (InputMismatchException e) {
                        System.out.println("Erreur : Veuillez entrer des nombres valides");
                        sc.nextLine();
                        continue;
                    }

                } else if (choix == 2) {
                    try {
                        System.out.println("Premier chiffre a soustraire : ");
                        int premnbr = sc.nextInt();
                        System.out.println("Second chiffre a soustraire : ");
                        int secnbr = sc.nextInt();
                        calcul.soustraction(premnbr, secnbr);
                        liste.add(premnbr + "-" + secnbr + "=" + calcul.getRes());
                    } catch (InputMismatchException e) {
                        System.out.println("Erreur : Veuillez entrer des nombres valides");
                        sc.nextLine();
                        continue;
                    }

                } else if (choix == 3) {
                    try {
                        System.out.println("Premier chiffre a multiplier : ");
                        int premnbr = sc.nextInt();
                        System.out.println("Second chiffre a multiplier : ");
                        int secnbr = sc.nextInt();
                        calcul.multiplication(premnbr, secnbr);
                        liste.add(premnbr + "*" + secnbr + "=" + calcul.getRes());
                    } catch (InputMismatchException e) {
                        System.out.println("Erreur : Veuillez entrer des nombres valides");
                        sc.nextLine();
                        continue;
                    }

                } else if (choix == 4) {
                    try {
                        System.out.println("Premier chiffre a diviser : ");
                        int premnbr = sc.nextInt();
                        System.out.println("Second chiffre a diviser : ");
                        int secnbr = sc.nextInt();
                        if (secnbr == 0) {
                            System.out.println("Erreur : Division par zéro impossible");
                            continue;
                        }
                        calcul.division(premnbr, secnbr);
                        liste.add(premnbr + "/" + secnbr + "=" + calcul.getRes());
                    } catch (InputMismatchException e) {
                        System.out.println("Erreur : Veuillez entrer des nombres valides");
                        sc.nextLine();
                        continue;
                    }
                }

                int res = calcul.getRes();
                boolean ajout_ope = true;

                while (ajout_ope) {
                    try {
                        System.out.println("Historique : " + liste);
                        System.out.println("Resultat : " + res + ",  Ajouter une opération ? 1.Oui 2.Non");
                        int choixSuite = sc.nextInt();

                        if (choixSuite != 1 && choixSuite != 2) {
                            System.out.println("Erreur : Veuillez choisir 1 ou 2");
                            continue;
                        }

                        if (choixSuite == 1) {
                            System.out.println("1.Additioner\n2.Soustration\n3.Multiplication\n4.Division");
                            int choixadd = sc.nextInt();

                            if (choixadd < 1 || choixadd > 4) {
                                System.out.println("Erreur : Veuillez choisir un nombre entre 1 et 4");
                                continue;
                            }

                            try {
                                if (choixadd == 1) {
                                    System.out.println("Quel chiffre additionner a " + res + " ?");
                                    int chiffreadd = sc.nextInt();
                                    int resbef = calcul.getRes();
                                    calcul.rajoutadd(res, chiffreadd);
                                    res = calcul.getRes();
                                    liste.add(resbef + "+" + chiffreadd + "=" + calcul.getRes());
                                } else if (choixadd == 2) {
                                    System.out.println("Quel chiffre soustraire a " + res + " ?");
                                    int chiffreadd = sc.nextInt();
                                    int resbef = calcul.getRes();
                                    calcul.rajoutsous(res, chiffreadd);
                                    res = calcul.getRes();
                                    liste.add(resbef + "6" + chiffreadd + "=" + calcul.getRes());
                                } else if (choixadd == 3) {
                                    System.out.println("Quel chiffre multiplier a " + res + " ?");
                                    int chiffreadd = sc.nextInt();
                                    int resbef = calcul.getRes();
                                    calcul.rajoutmult(res, chiffreadd);
                                    res = calcul.getRes();
                                    liste.add(resbef + "*" + chiffreadd + "=" + calcul.getRes());
                                } else if (choixadd == 4) {
                                    System.out.println("Quel chiffre diviser a " + res + " ?");
                                    int chiffreadd = sc.nextInt();
                                    if (chiffreadd == 0) {
                                        System.out.println("Erreur : Division par zéro impossible");
                                        continue;
                                    }
                                    int resbef = calcul.getRes();
                                    calcul.rajoutdiv(res, chiffreadd);
                                    res = calcul.getRes();
                                    liste.add(resbef + "/" + chiffreadd + "=" + calcul.getRes());
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Erreur : Veuillez entrer un nombre valide");
                                sc.nextLine();

                            }
                        } else if (choixSuite == 2) {
                            System.out.println("Resultat final du calcul : " + res);
                            System.out.println("Historique : " + liste);
                            ajout_ope = false;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Erreur : Veuillez entrer un nombre valide");
                        sc.nextLine();

                    }
                }

                try {
                    System.out.println("Refaire un calcul ? 1.Oui 2.Non");
                    int quit = sc.nextInt();
                    if (quit != 1 && quit != 2) {
                        System.out.println("Erreur : Veuillez choisir 1 ou 2");
                        continue;
                    }
                    if (quit == 2) {
                        contin = false;
                        System.out.println("Historique : " + liste);
                        System.out.println("A bientôt !");
                    } else if (quit == 1) {
                        contin = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Erreur : Veuillez entrer un nombre valide");
                    sc.nextLine();

                }
            } catch (InputMismatchException e) {
                System.out.println("Erreur : Veuillez entrer un nombre valide");
                sc.nextLine();

            }
        }
    }
}