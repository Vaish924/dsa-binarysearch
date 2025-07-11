public class binarytree {
    static class NODE
    {
        int data;
        NODE left;
        NODE right;

        NODE(int data)
        {
            this.data=data;
            left=null;
            right=null;
        }
    }
    public static class binary
    {
       static int idx=-1;
        public static NODE func(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            NODE newNode=new NODE(nodes[idx]);
            newNode.left=func(nodes);
            newNode.right=func(nodes);
            return newNode;

        }

    }

    public static void main(String args[])
    {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binary tree=new binary();

        NODE root=tree.func(nodes);
        System.out.println(root.data);
    }
}
