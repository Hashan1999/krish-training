import java.util.*;

/**
 *
 * @author HASHA
 */
public class Graph{
    ArrayList<Node> traveredGraph=new ArrayList<>();

    public void addEdge(Node mainNode,Node edgeNode){
        mainNode.addEdge(edgeNode);
        //This line add because this is a Non-directed Graph.That means graph can traverse through both ways.
        edgeNode.addEdge(mainNode);
    }

    public void traverseBreadthFirst(Node root){
//Stack FILO - First In Last out
            Stack<Node> stack=new  Stack<Node>();
            stack.add(root);
            while (!stack.isEmpty()){
                root=stack.pop();
                if(!root.isVisited){
                    traveredGraph.add(root);
                    root.isVisited=true;
                }


                for(Node node:root.getEdges()){
                    if(node != null && !node.isVisited){
                        stack.add(node);
                    }
                }

            }


        printTraversalOrder();

    }

    void printTraversalOrder(){
        for (Node node : traveredGraph) {
            System.out.println(node.getValue());
        }
    }

}

class Node{
    private ArrayList<Node> edges=new ArrayList<>();
    boolean isVisited=false;
    private String value;

    public Node(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ArrayList<Node> getEdges() {
        return edges;
    }

    public void addEdge(Node edge) {
        this.edges.add(edge);
    }



}

class Test{
    public static void main(String[] args) {

        Node node0=new Node("0");
        Node node1=new Node("1");
        Node node2=new Node("2");
        Node node3=new Node("3");
        Node node4=new Node("4");
        Node node5=new Node("5");
        Node node6=new Node("6");
        Node node7=new Node("7");



        Graph g=new Graph();
        g.addEdge(node0, node3);
        g.addEdge(node3, node5);
        g.addEdge(node5, node6);
        g.addEdge(node6, node2);
        g.addEdge(node2, node1);
        g.addEdge(node3, node7);
        g.addEdge(node7, node4);


        g.traverseBreadthFirst(node0);
    }
}
