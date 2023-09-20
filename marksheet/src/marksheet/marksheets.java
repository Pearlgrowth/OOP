package marksheet;

public class marksheets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String iTem1="kathir", iTem2="Lakshmi", iTem3="Aishwarya";
        String iTem4="1", iTem5="2", iTem6="3";
        int CN = 0100100100;
        int Ks1 = 10, Ks2 = 20, Ks3 = 30, Ks4 = 40, Ks5 = 50;
        int Ls1 = 90, Ls2 = 80, Ls3 = 70, Ls4 = 80, Ls5 = 100;
        int As1 = 90, As2 = 85, As3 = 75, As4 = 65, As5 = 95;
        int total1= Ks1 + Ks2 + Ks3 + Ks4 + Ks5; 
        int total2= Ls1 + Ls2 + Ls3 + Ls4 + Ls5;
        int total3= As1 + As2 + As3 + As4 + As5;
        int average1 = total1/5;
        int average2 = total2/5;
        int average3 = total3/5;
        int sumAverage = average1 + average2 + average3;
        int averages1 = (Ks1 + Ls1 + As1)/ 3;
        int averages2 = (Ks2 + Ls2 + As2)/ 3;
        int averages3 = (Ks3 + Ls3 + As3)/ 3;
        int averages4 = (Ks4 + Ls4 + As4)/ 3;
        int averages5 = (Ks5 + Ls5 + As5)/ 3;
        System.out.println("Welcome to Student Mark List Application");
        System.out.println("_______________________________________________________________________________");
        System.out.println("SNo   Student Name     Sub1    Sub2    Sub3    Sub4    Sub5    Total   Average");
        System.out.println("_______________________________________________________________________________");
        System.out.println(iTem4 +  "\t" +iTem1 + "\t\t" + Ks1 +  "\t" +Ks2 + "\t" + Ks3  + "\t" + Ks4 +"\t"  + Ks5  +  "\t" +  total1 + "\t"+ average1);
        System.out.println(iTem5 +  "\t" +iTem2 + "\t\t" + Ls1 +  "\t" +Ls2 + "\t" + Ls3  + "\t" + Ls4 +"\t"  + Ls5  +  "\t" +  total2 + "\t"+ average2);
        System.out.println(iTem6 +  "\t" +iTem3 + "\t" + As1 +  "\t" +As2 + "\t" + As3  + "\t" + As4 +"\t"  + As5  +  "\t" +  total3 + "\t"+ average3);
        System.out.println("_______________________________________________________________________________");
        System.out.println("SumofAverages" +"\t\t\t\t\t\t\t\t"  + sumAverage);
        System.out.println("_______________________________________________________________________________");
        System.out.println("AverageperUnit"+"\t\t"   + averages1 + "\t" + averages2 + "\t" + averages3 + "\t" + averages4 + "\t" + averages5);
        
	}

}
