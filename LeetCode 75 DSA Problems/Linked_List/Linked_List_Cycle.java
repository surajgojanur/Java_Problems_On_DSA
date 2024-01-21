public class Linked_List_Cycle{
    public boolean hasCycle(ListNode head){
        if(head==null || head.next==null){
            return false;
        }

        ListNode temp=head;
        HashMap<ListNode,Boolean> map = new HashMap<>();
        map.put(temp,true);

        while(temp.next != null){
            temp=temp.next;

            if(map.containsKey(temp)){
                return true;
            }
            map.put(temp,true);
        }
        return false;
    }
}