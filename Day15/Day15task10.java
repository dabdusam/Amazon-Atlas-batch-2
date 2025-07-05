// Edge class to represent a connection between two vertices
class Edge {
    int src, dest;

    Edge(int s, int d) {
        src = s;
        dest = d;
    }
}

// Graph class using an edge list representation
class Graph {
    int vertices;
    Edge[] edges;
    int edgeCount = 0;

    // Constructor
    Graph(int vertices, int maxEdges) {
        this.vertices = vertices;
        edges = new Edge[maxEdges];
    }

    // Add edge to the graph
    void addEdge(int src, int dest) {
        edges[edgeCount++] = new Edge(src, dest);
    }

    // Display all edges
    void displayEdges() {
        System.out.println("Edges in the graph:");
        for (int i = 0; i < edgeCount; i++) {
            System.out.println("Edge from " + edges[i].src + " to " + edges[i].dest);
        }
    }
}

// Main class to run the graph logic
public class Day15task10 {
    public static void main(String[] args) {
        int vertices = 5;
        int maxEdges = 8;

        Graph graph = new Graph(vertices, maxEdges);

        // Add edges as seen in the image
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 5);
        graph.addEdge(2, 5);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(3, 5);

        // Display all edges
        graph.displayEdges();
    }
}

