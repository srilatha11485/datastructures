import java.util.Scanner; 
class MyNode 
{
  MyNode prev; 
  int data;
  MyNode next;
}

class MyLinkedList
{

  Scanner s=new Scanner(System.in); 
  MyNode head, last;
  MyLinkedList()
  {
 
    head=null; 
    last=null;
   }
   void create(int n)
   {

     MyNode temp; 
     for(int i=0;i<n;i++) 
     {

      temp=new MyNode(); 
      System.out.println("enter data");
      temp.data=s.nextInt();
      temp.next=null; 
      if(head=null)
      {

        head=last=temp;
        head.prev=null;
       }
       else
       {

        last.next=temp; 
        temp.prev=last; 
        last=temp;
        }
       }
   }

   void insertB()
   {
      MyNode temp =new MyNode(); 
      System.out.println("enter data");
      temp.data=s.nextInt(); 
      temp.prev=null;
      temp.next=head;
      head.prev=temp;
      head=temp;
   }
   void insertE()
   {
      MyNode temp=new MyNode();
      MyNode temp1;
      System.out.println("enter data"); 
      temp.data=s.nextInt();
      temp.next=null;
      for(templ=head;templnext!=null;temp1=templ.next);
      temp.prev=temp1; 
      templ.next=temp;
      last=temp;
   }
   void insertP(int p)
   { 
      MyNode temp=new MyNode(); 
      MyNode templ;
      int i;
      System.out.println("enter data");
      temp.data=s.nextInt();
      for(i=0,templ=head;i<p-1;templ=templ.next,i++); 
      temp.next=templ.next; 
      temp.prev=templ;
      temp1.next.prev=temp;
      templ.next=temp;
   }
   void deleteB()
   { 
      MyNode temp; 
      temp=head;
      head=temp.next; 
      head.prev=null;
      temp=null; 
   }
   void deleteE() 
   {

      MyNode temp, templ;
      for(temp=head;temp.next!=null;temp=temp.next);
      templ=temp.prev;
      templ.next=null;
      temp=null;
      last=templ;
   }
   void deleteP(int p)
   { 
       MyNode temp,temp1;
       int i;
       for(temp=head, i=0;i<p-1;i++,temp=temp.next); 
       templ=temp.next; 
       temp.next=temp1.next; 
       templ.next.prev=temp; 
       templ=null;
   }
   void displayF()
   {

       MyNode temp;
       for(temp=head;temp!=null;temp=temp.next);
          System.out.print(temp.data+"->"); 
       System.out.println("null");
   }

   void displayB()
  {
         MyNode temp;
       for(temp=last;temp!=null;temp=temp.prev) 
         System.out.print(temp.data+"->"); 
       System.out.println("null");
   }
}
class DoubleLinkedListDemo
{
   public static void main(String[] args)
   {
       Scanner s=new Scanner(System.in);
       MyLinkedList l=new MyLinkedList(); 
       System.out.println("enter the size of the list");
       int ch;
       l.create(s.nextInt());
      while(true)
      {
         System.out.println("enter your choice");
         ch=s.nextInt();
       
   switch(ch)
  {
       case 1: l.insertB();
       break;
       case 2: l.insertE();
       break;
       case 3:System.out.println("enter the position");
    l.insertP(s.nextInt());
         break;
       case 4:l.deleteB();
       break;
       case 5:l.deleteE();
       break;
       case 6: System.out.println("emter the position");
         l.deleteP(s.nextInt()); 
         break;
       case 7:l.displayF();
       break;
       case 8:l.displayB();
       break;
       default:return;
   
   
}

   
