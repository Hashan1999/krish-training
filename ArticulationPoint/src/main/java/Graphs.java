import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Graphs {
int d=1;
    LinkedList<Node> traveredGraph=new LinkedList<>();

    public void addEdge(Node mainNode,Node edgeNode){
        mainNode.addEdge(edgeNode);
        //This line add because this is a Non-directed Graph.That means graph can traverse through both ways.
        edgeNode.addEdge(mainNode);
    }
    public void traverseDepthFirst(Node root){
//Stack FILO - First In Last out
        Stack<Node> stack=new  Stack<Node>();
        stack.add(root);
        while (!stack.isEmpty()){
            root=stack.pop();
            if(!root.isVisited){
                root.setDepth(d++);
                traveredGraph.add(root);
                root.isVisited=true;
            }


            for(Node node:root.getEdges()){
                if(node != null && !node.isVisited){
                    stack.add(node);
                }
            }

        }


        for (Node node : traveredGraph) {

         if(node.getDepth() != 1){
             for(Node pNode:node.getEdges()){
                 if(node.getDepth()>pNode.getDepth()){
                     node.parentNode=pNode;
                 }
             }
         }else{
             node.parentNode=null;
         }

         node.setLow(findLowIndex(node,node.parentNode));

        }

    }

    private int findLowIndex(Node node,Node backNode) {
        if (node.getDepth() == 1) {
            return 1;
        } else {
            if (backNode != null) {
                return backNode.getDepth();
            }

            int lowestIndex = node.getDepth();
            Node parentNode=node;
            for (Node next : node.getEdges()) {

                int index = findLowIndex(next,parentNode);
                 parentNode=next;
                if (index < lowestIndex) {
                    lowestIndex = index;
                }

                if (lowestIndex <= node.getDepth()) {
                    return lowestIndex;
                }
            }

            return lowestIndex;
        }
    }


    void printTraversalOrder(){
        for (Node node : traveredGraph) {

            System.out.println(node.getValue());


        }
    }


    public void printArticulationPoints(){

            System.out.println("ARTICULATION POINTS");
        for (Node node : traveredGraph) {
            if(node.parentNode != null && node.parentNode.getDepth()<=node.getLow()){
                System.out.println(node.parentNode.getValue());
            }

        }
    }
}