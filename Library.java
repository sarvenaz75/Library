/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;
import java.util.Scanner;
/**
 *
 * @author Sarv
 */
public class Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Member ozv = new Member();
        
        
        Scanner scanner = new Scanner(System.in);
        ozv.meghdar();
            while(true){
            try{
            System.out.println("1-Create");
            System.out.println("2-Print");
            System.out.println("3-Update");
            System.out.println("4-Delete");
            
            int n = scanner.nextInt();
            switch (n){
                case 1:{ 
                    System.out.println("Name : ");
                    String nameOzv = scanner.next();
                    System.out.println("Age : ");
                    int senOzv = scanner.nextInt();
                    System.out.println("Gender : ");
                    char fm = scanner.next().charAt(0);
                    ozv.Create(nameOzv, senOzv, fm);
                    System.out.println(ozv.shenase);
                }
                break;
                case 2:{
                    System.out.println("Enter id : ");
                    int shomare = scanner.nextInt();
                    ozv.isValid(shomare);
                    if(ozv.isValid(shomare) == true){
                    ozv.Read(shomare);
                    }
                    else{
                        System.out.println("Invalid id ");
                    }
                }
                break;
                case 3:{
                    System.out.println("Enter id you want to update : ");
                    int m = scanner.nextInt();
                    ozv.isValid(m);
                    if(ozv.isValid(m) == true){
                    ozv.Read(m);
                    System.out.println("new Name : ");
                    String newNameOzv = scanner.next();
                    System.out.println("new Age : ");
                    int newSenOzv = scanner.nextInt();
                    System.out.println("new Gender : ");
                    char newfm = scanner.next().charAt(0);
                    ozv.Update(newNameOzv, newSenOzv, newfm);
                    }
                    else{
                        System.out.println("Invalid id ");
                    }
                }
                break;
                case 4:{
                    System.out.println("Enter id : ");
                    int shomare_B = scanner.nextInt();
                    ozv.isValid(shomare_B);
                    if(ozv.isValid(shomare_B) == true){
                    ozv.Delete(shomare_B);
                    }
                    else{
                        System.out.println("Invalid id ");
                    }
                }
                break;
                case 5:{
                    System.out.println("Enter the name : ");
                    String searchName = scanner.next();
                    
                    
                    ozv.nameSearch(searchName);
                    
                    
                        break ;
                    
                }
                default:
                    System.exit(n);
            }
            
            } 
                 catch(Exception ex){
                System.out.println("choose a number from 1 to 4 ");
                scanner.nextLine();
                continue; 
                
            
          
                 }  
            
        }
    }
}
    

