public class Test{
    public static void main(String[] args) {


        Node node1=new Node("1");
        Node node2=new Node("2");
        Node node3=new Node("3");
        Node node4=new Node("4");
        Node node5=new Node("5");
        Node node6=new Node("6");




        Graphs g=new Graphs();
        g.addEdge(node1, node2);
        g.addEdge(node1, node4);
        g.addEdge(node4, node3);
        g.addEdge(node2, node3);
        g.addEdge(node3, node5);
        g.addEdge(node5, node6);
        g.addEdge(node3, node6);


        g.traverseDepthFirst(node1);
        g.printArticulationPoints();
    }
}