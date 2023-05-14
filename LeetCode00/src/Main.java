class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        Solution solution = new Solution();
        MyLinkedList myLinkedList = new MyLinkedList();
        for (int n : nums) {
            myLinkedList.add(n);
        }
        myLinkedList.printLinkedList();

        solution.removeElements(myLinkedList.head, 6);

        myLinkedList.printLinkedList();
    }
}

class Solution {
    // 移除链表指定元素
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode temp = dummyHead;

        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return dummyHead.next;
    }
}

class MyLinkedList {
    public ListNode head; // 链表头节点
    private ListNode tempNode; // 临时节点

    // 初始化链表
    public MyLinkedList() {
        head = new ListNode();
    }

    // 向链表中添加节点
    public void add(int val) {
        tempNode = head;
        ListNode node = new ListNode(val);

        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = node;
    }

    // 从头到尾打印链表元素
    public void printLinkedList() {
        tempNode = head;
        System.out.print("链表元素如下：");
        while (tempNode.next != null) {
            System.out.print(tempNode.next.val);
            tempNode = tempNode.next;
        }
    }
}