// leetcode 108 and GFG practice
public TreeNode sortedArrayToBST(int[] nums) {
    return CreateBst(nums ,0,nums.length-1);
}
public TreeNode CreateBst(int [] nums,int left,int right)
{
if (left>right)return null;
int mid =left+(right-left)/2;
TreeNode root =new TreeNode(nums[mid]);
root.left =CreateBst(nums,left,mid-1);
root.right =CreateBst(nums,mid+1,right);
return root;
}
