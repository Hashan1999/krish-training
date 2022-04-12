import java.util.ArrayList;

class Node {
    private ArrayList<Node> edges = new ArrayList<>();
    int depth;
    int low;
    Node parentNode;
    boolean isVisited = false;
    private String value;


    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

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

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }


}
