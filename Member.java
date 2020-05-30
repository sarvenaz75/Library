/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;
/**
 *
 * @author Sarv
 */
public class Member {
    public int[] id = new int[100] ;
    public int[] age = new int[100];
    public String[] name = new String[100];
    public char[] gender = new char[100];
    public boolean[] isEmpty = new boolean[100];
    int i;
    public int shenase = 1111 ; 
    
    public void meghdar(){
        for(i=0; i<name.length; i++){
            name[i] = " ";
        }
    }
    
    public int Create(String nam , int sen , char jensiat ){
       
       i=0;
       while(isEmpty[i] == true){
           i++;
       }
       name[i] = nam ;
       age[i] = sen ;
       gender[i] = jensiat ;
       isEmpty[i] = true;
       shenase++;
       id[i] = shenase;
       return shenase ; 
     }
    
    
    public void Read(int shenase){
        for(i=0; i<id.length; i++){
            if(id[i] == shenase){
               if(isEmpty[i] == true){
               System.out.println("Name is : " + name[i] + " " + "age is : " + age[i] + " " + "gender is : " + " " + gender[i]);
               break;
              }
              else{
               System.out.println("This member has been deleted !");
               break;
               
              }
            } 
        }
    }
    public void Update(String newName , int newAge , char newGender){
        i=0;
        while(id[i] != shenase){
            i++;
        }
        if(id[i] == shenase){
        name[i] = newName;
        age[i] = newAge;
        gender[i] = newGender;
        System.out.println("Updated successfully !");
        }
        else{
            System.out.println("Invalid id number !!! ");
        }
    }
    
    
    public void Delete(int shenase){ 
        i=0;
        while(id[i] != shenase){
            i++;
        }
                name[i] = " ";
                age[i] = 0;
                gender[i] = '-';
                isEmpty[i] = false;
                System.out.println("Member deleted successfully ! ");
    }
    
    public boolean isValid(int shenase){
        i=0;
        while(i < id.length-1)
            if(id[i] == shenase)
                return true;
            else
                i++;
                return false;
        
    }
    
    public void nameSearch(String nam){
        i=0;
        while(i < name.length-1){
            if(name[i].isEmpty()){
                i++;
            }
            else{
                if(name[i].contains(nam)){
                    System.out.println(name[i]+ " ");
                    i++;
                }
                else{
                    i++;
                }
            }
        }
    }
    public void exactNameSearch(String nam){
        i=0;
        while(i < name.length-1){
            if(name[i].isEmpty()){
                i++;
            }
            else{
                if(name[i].equalsIgnoreCase(nam)){
                    System.out.println(name[i]+ " ");
                    i++;
                }
                else{
                    i++;
                }
            }
        }
    }
    public void ageSearch(int sen){
        i=0;
        while(i < age.length-1){
                if(age[i] == sen ){
                    System.out.println(name[i]+ " ");
                    i++;
                }
                else{
                    i++;
                }
            }
    }
    
    public void genderSearch(char jensiat){
        i=0;
        while(i < gender.length-1){
                if(gender[i] == jensiat ){
                    System.out.println(name[i]+ " ");
                    i++;
                }
                else{
                    i++;
                }
            }
    }
}

