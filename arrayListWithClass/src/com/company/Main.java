package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Customer> customers=new ArrayList<Customer>();
//Referans numarası ile tutulur


        //customers.add(new Customer(1,"Halime","Ok"));
        //Yukarıdaki ifadeyi silmek istedik ama direk remove ile silinemedi
        //Bunu silmek için kullanacağımız yöntem
        Customer halime=new Customer(1,"halime","ok");

        customers.add(new Customer(2,"Aysun","Ok"));
        customers.add(new Customer(3,"Ebru","Ok"));
        //Burda engini silmeye çalıştık ama silinmez çünkü her newlemede farklı referans numaralrı tutar
        //Örneğin başta 1,2,3 olduğunu düşünürsek remove olan kısımda 4. referansı tanımlamış olduk
        //Oysa biz 1. referanstaki değeri silmek istiyorduk
       // customers.remove(new Customer(1,"Halime","Ok"))
       //Yukarıdaki ifadeden silemedik bunun yerine

        customers.remove(halime);
        for(Customer customer:customers){
            System.out.println(customer.firstName);
        }


    }
}
