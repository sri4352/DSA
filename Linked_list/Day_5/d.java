// leetcode 23 and GFG practice
public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list2 ==null)return list1;
    if (list1==null)return list2;
    if (list1.val<=list2.val)
    {
        list1.next =mergeTwoLists(list1.next,list2);
        return list1;
    }
    else
    {
        list2.next =mergeTwoLists(list1,list2.next);
        return list2;
    }
}

public ListNode partitionAndMerge(ListNode[] listNodes,int start,int end)
{
    if (start==end)return listNodes[start];
    if (start>end)return null;
    int mid =start+(end-start)/2;
    ListNode l1 =partitionAndMerge(listNodes,start,mid);
    ListNode l2 =partitionAndMerge(listNodes,mid+1,end);
    return mergeTwoLists(l1,l2);

}
public ListNode mergeKLists(ListNode[] lists) {
    int n =lists.length;
    if (n==0)return null;
    return partitionAndMerge(lists,0,n-1);
}
