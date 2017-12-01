/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydatastructures;

/**
 *
 * @author vik
 */
public class AddingTwoLinkedLists {
    
    LinkedList<Integer> list1=new LinkedList<>();
    LinkedList<Integer> list2=new LinkedList<>();
    LinkedList<Integer> list3=new LinkedList<>();
    int num1;
    int num2;
    int sum;
    int carry;
        
    public void additionOfLists(LinkedList<Integer> list1,LinkedList<Integer> list2){
        
        for(LinkedList<Integer>.Node<Integer> x=list1.head,y=list2.head;x!=null||y!=null;x=x.next,y=y.next){
            num1=x.item;
            num2=x.item;
            sum=num1+num2+carry;
            carry=0;
            
            if(sum>=10){
                carry=sum/10;
                
            }
            list3.insertAtBegin(sum);
            
            
        }
        
    }
    
    
}
