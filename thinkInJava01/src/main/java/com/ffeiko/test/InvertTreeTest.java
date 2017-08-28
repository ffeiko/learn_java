package com.ffeiko.test;



/**
 * Created by Administrator on 2017/8/28.
 * 这个地方写的是伪代码,所没有办法测试,说一下思路
 */
public class InvertTreeTest {

//    //这是递归方法
//    TreeNode* invertTree(TreeNode* root) {
//        if (!root) return nullptr;
//        else {
//            TreeNode *temp = root->left;
//            root->left = root->right;
//            root->right = temp;
//        }
//        invertTree(root->left);
//        invertTree(root->right);
//
//        return root;
//    }
//
//    //进行递归简化
//    TreeNode* invertTree(TreeNode* root) {
//        if (root) {
//            invertTree(root->left);
//            invertTree(root->right);
//            std::swap(root->left, root->right);
//        }
//        return root;
//    }
//
//    //非递归形式@chammika
//    TreeNode* invertTree(TreeNode* root) {
//        std::stack<TreeNode*> stk;
//        stk.push(root);
//
//        while (!stk.empty()) {
//            TreeNode* p = stk.top();
//            stk.pop();
//            if (p) {
//                stk.push(p->left);
//                stk.push(p->right);
//                std::swap(p->left, p->right);
//            }
//        }
//        return root;
//    }

//    这一道题，一眼看过去，我们立刻就能得到的信息是：
//
//    这是一个二叉树，与二叉树有关的算法基本都与递归相关联。
//    这个二叉树是以链表形式实现的。
//    翻转，将左子树变为右子树，右子树变为左子树。
//    翻转的操作仅需改变双亲指针。
//    简化我们所得到的信息，即得到，我们需要通过递归来改变双亲的指针以实现翻转操作。
//
//    其实这道题算的上是一道应用分治思想的典型题了，我们按照如下步骤进行算法的编写：
//
//    分解问题：二叉树的翻转涉及到左右子树，故而我们可以采用二分的方式进行分解，先进行左子树的遍历翻转，再进行右子树的遍历翻转。
//    求解问题：当我们一次遍历到某一为nullptr的叶结点时，返回上一非空结点，交换这一非空结点的左右子树，此为递归时的出口。
//    合并问题：寻着递归链向上回溯，针对每一个分解后的问题进行合并（无相关代码，由递归性质决定）。
//    综上，我们可以看到，先设计一个递归出口，何时能够让递归终止if (!root) return nullptr; 此为出口的一种，
//    我们也可以将递归出口设置在最后，此时我们需要设置的是满足什么条件才能开始递归if (root)
//    { /* ... */ } 条件不满足时，我们可以开始递归的回溯return
}
