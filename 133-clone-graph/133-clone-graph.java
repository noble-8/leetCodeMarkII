/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node ==null){
            return null;
        }
        HashMap<Node,Node> cloned = new HashMap<Node,Node>();
        return clone(node,cloned);
    }
    
    public Node clone(Node node,HashMap<Node,Node> cloned){
        if(cloned.containsKey(node)){
            return cloned.get(node);
        }
        ArrayList<Node> list = new ArrayList<Node>();
        Node curr = new Node(node.val);
        cloned.put(node,curr);
        for(Node x :node.neighbors){
            list.add(clone(x,cloned));
        }
        curr.neighbors = list;
        return curr;
    }
}