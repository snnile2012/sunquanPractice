package cn.com.snnile.leetcode;

import java.util.ArrayList;
import java.util.List;

/*
 * 《两数相加》
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * e1:
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 *
 * e2:
 * 输入：l1 = [0], l2 = [0]
 * 输出：[0]
 *
 * e3:
 * 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * 输出：[8,9,9,9,0,0,0,1]
 */
public class TwoNumAdd {

    public static void main(String[] args) {
        Node n11 = new Node(9);
        Node n12 = new Node(9);
        Node n13 = new Node(9);
        Node n14 = new Node(9);
        Node n15 = new Node(9);
        Node n16 = new Node(9);
        Node n17 = new Node(9);
        n11.nextNode = n12;
        n12.nextNode = n13;
        n13.nextNode = n14;
        n14.nextNode = n15;
        n15.nextNode = n16;
        n16.nextNode = n17;
        List<Node> firstList = new ArrayList<>();
        firstList.add(n11);
        firstList.add(n12);
        firstList.add(n14);
        firstList.add(n15);
        firstList.add(n16);
        firstList.add(n17);

        Node n21 = new Node(9);
        Node n22 = new Node(9);
        Node n23 = new Node(9);
        Node n24 = new Node(9);
        n21.nextNode = n22;
        n22.nextNode = n23;
        n23.nextNode = n24;
        List<Node> secondList = new ArrayList<>();
        secondList.add(n21);
        secondList.add(n22);
        secondList.add(n23);
        secondList.add(n24);

        // 取第一个链表代表整数值
        int sumFirst = sumNodeList(firstList);
        // 取第二个链表代表整数值
        int sumSecond = sumNodeList(secondList);
        // 计算两个链表代表数值之和
        int sumTotal = sumFirst + sumSecond;
        System.out.println(sumTotal);
        // 将sumTotal转换为Node链表
        List<Node> sumList = new ArrayList<>();
        String sumTotalString = String.valueOf(sumTotal);
        for (int i = sumTotalString.length() - 1; i >= 0 ; i--) {
            int currentNum = sumTotalString.charAt(i) - '0';
            Node node = new Node(currentNum);
            sumList.add(node);
        }
        for (int i = 0; i < sumList.size(); i++) {
            System.out.print(sumList.get(i).value);
        }

    }

    // 根据链表获取其代表的整数值
    public static int sumNodeList(List<Node> list) {
        int sum = 0;
        int factor = 1;
        int length = list.size();
        for (int i = 0; i < length; i++) {
            Node firstInnerNode = list.get(i);
            sum = (firstInnerNode.value * factor) + sum;
            factor = factor * 10;
        }
        System.out.println(sum);
        return sum;
    }

}

class Node {
    public int value;
    public Node nextNode;
    public Node(int value) {
        this.value = value;
    }
}