package edu.upb.ds.linkedList;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        List list1 = new List();
        List list2 = new List();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n############################");
        System.out.println("\nWelcome to the Polynomial Tool");
        System.out.println("\n############################");
        System.out.println("\nHow Many terms are you going to add?:");
        int numTerms = sc.nextInt();
        String poli = "";
        String derivate = "";
        for (int i=0;i<numTerms;i++){
            System.out.println("\n############################");
            System.out.println("\nAdding Term #"+(i+1));
            System.out.println("\n############################");
            System.out.println("\nPlease give the coeficient of the term with the sign (ex:+/- Number):");
            String coeficient = sc.next().toString();
            System.out.println("\nPlease give the exponent of the term with the sign(ex:+/- Number):");
            String exponent = sc.next().toString();
            Polinomial p= new Polinomial();
            p.setCoeficient(coeficient);
            p.setExponent(exponent);
            list1.add(p);
            int coeficientInt=Integer.parseInt(coeficient);
            int exponentInt= Integer.parseInt(exponent);
            if(exponent=="0"){
                poli+=coeficient;
            }
            else{
                if(coeficientInt>0){
                    poli+="+"+coeficient+"x^"+exponent;
                }else{
                    poli+=coeficient+"x^"+exponent;
                }
            }
            Polinomial q = new Polinomial();
            int multiplication=coeficientInt*exponentInt;
            int resultExponent=exponentInt-1;
            String newCoeficient=Integer.toString(multiplication);
            String newExponent=Integer.toString(resultExponent);
            q.setCoeficient(newCoeficient);
            q.setExponent(newExponent);
            list2.add(q);
            if(newExponent=="0"){
                derivate+=newCoeficient;
            }
            else{
                if(multiplication>0){
                    derivate+="+"+newCoeficient+"x^"+newExponent;
                }else{
                    derivate+=newCoeficient+"x^"+newExponent;
                }

            }
        }

        System.out.println("\n############################");
        System.out.println("\nPolinomial entered");
        System.out.println("\n############################");
        System.out.println(poli);
        System.out.println("\n############################");
        System.out.println("\nList of Polinomial");
        System.out.println("\n############################");
        list1.printList();
        System.out.println("\n############################");
        System.out.println("\nDerivate");
        System.out.println("\n############################");
        System.out.println(derivate);
        System.out.println("\n############################");
        System.out.println("\nList of Derivate");
        System.out.println("\n############################");
        list2.printList();
        System.out.println("\n############################");
        System.out.println("\nThanks for using the Polynomial Tool!");
        System.out.println("\n############################");
    }
}
//Developed by Pedro Gómez - ID:000396221