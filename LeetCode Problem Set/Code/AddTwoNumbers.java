/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class AddTwoNumbers{
	//ListNode is a defined class in the problem
	//The list nodes come from existing lists. This is why they have nonnull next values.
	public ListNode addTwoNumbers(ListNode l1, ListNode l2){
		ListNode dummyHead = new ListNode(0);
		ListNode curr = dummyHead;
		int carry = 0;
		
		while(l1 != null || l2 != null || carry != 0){
			//This notation is just an if-then conditional
			// (CONDITION) ? [WHAT HAPPENS IF TRUE] : [WHAT HAPPENS IF FALSE]
			
			int x = (l1 != null) ? l1.val : 0;
			int y = (l2 != null) ? l2.val : 0;
			
			int sum = carry + x + y;
			
			//dividing by 10 will give you the tens place (which should always just be 1)
			carry = sum / 10;
			
			//The modulo will give us the remainder, which, in this case, is the ones place.
			curr.next = new ListNode(sum % 10);
			
			curr = curr.next;
			
			if(l1 != null){
				l1 = l1.next;
			}
			
			if(l2 != null){
				l2 = l2.next;
			}
		}
		
		return dummyHead.next;
	}
}
