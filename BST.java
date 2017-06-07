import java.util.Scanner;
class BSTNode
{
	int x;
	BSTNode left,right;

	BSTNode(int data)
	{
		x=data;
		left=null;
		right=null;
	} 
	public void setLeft(BSTNode n)
	{
		left = n;
	}
	public void setRight(BSTNode n)
	{
		right = n;
	}
	public int getData()
	{
		return x;
	}
	public void setData(int data)
	{
		x = data;
	}
	public BSTNode getLeft()
	{
		return left;
	}
	public BSTNode getRight()
	{
		return right;
	}
}

class BST
{
	private BSTNode root;
	public BST()
	{
		root = null;
	}
	public void insert(int data)
	{
		root = insert(root,data);
	}
	private BSTNode insert(BSTNode node, int data)
	{
		if(node==null)
			node = new BSTNode(data);
		else
		{
			if(data<=node.getData())
			{
				node.left = insert(node.left,data);
			}
			else
			{
				node.right = insert(node.right,data);
			}	
		}
		return node;	
	}

	public void inorder()
	{
		inorder(root);
	}
	private void inorder(BSTNode r)
	{
		if(r!=null)
		{
			inorder(r.getLeft);
			System.out.println("r.getData");
			inorder(r.getRight);
		}
	}
	public void preorder()
	{
		preorder(root);
	}
	private void preorder(BSTNode r)
	{
		if(r!=null)
		{
			System.out.println("r.getData");
			preorder(r.getLeft);
			preorder(r.getRight);
		}
	}
	public void postorder()
	{
		postorder(root);
	}
	private void postorder(BSTNode r)
	{
		if(r!=null)
		{
			postorder(r.getLeft);
			postorder(r.getRight);
			System.out.println("r.getData");
		}
	}

}
class BST1
{
	public static void main(String args[])
	{
		BST bst = new BST();
		BST.insert(100);
		BST.insert(50);
		BST.insert(150);
		BST.insert(75);
		BST.insert(99);
		BST.insert(2);
		BST.insert(300);
		BST.inorder();
		BST.preorder();
		BST.postorder();
	}
}