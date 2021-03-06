package nowcoder.jianzhioffer.a.a15_代码的鲁棒性_反转链表;

/*
 * 输入一个链表，反转链表后，输出链表的所有元素。
 * */
public class Solution {
    /*public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }*/
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode ReverseList(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode pNode = head;
        ListNode pPre = null; // 头节点的前一个节点是空
        ListNode newHead = null;

        while (pNode != null) {

            ListNode tempNext = pNode.next; // 预先保存下一个节点
            if (tempNext == null) {
                // 下一个几点为空，即反转后的头节点 ，保存一下
                newHead = pNode;
            }
            pNode.next = pPre; // 转变方向
            // 前一个元素（反转后要指向的元素） 和  下一个要处理的元素
            pPre = pNode;
            pNode = tempNext;   //将保存的后面的节点作为下一次循环的p
        }

        return newHead;
    }
}
