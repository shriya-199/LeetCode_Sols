class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Step 1: Find length and last node
        ListNode temp = head;
        int cnt = 1;
        while (temp.next != null) {
            temp = temp.next;
            cnt++;
        }

        // Step 2: Make it circular
        temp.next = head;

        // Step 3: Find new head
        k = k % cnt;
        int stepsToNewHead = cnt - k;

        ListNode newTail = temp;
        while (stepsToNewHead-- > 0) {
            newTail = newTail.next;
        }

        // Step 4: Break the circle
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}