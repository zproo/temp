package bobo.algo.minimum_span_trees_08.lazy_prim_03.temp;

import bobo.algo.minimum_span_trees_08.lazy_prim_03.temp.Edge;
import bobo.algo.minimum_span_trees_08.lazy_prim_03.temp.LazyPrimMST;
import bobo.algo.minimum_span_trees_08.lazy_prim_03.temp.ReadWeightedGraph;
import bobo.algo.minimum_span_trees_08.lazy_prim_03.temp.SparseWeightedGraph;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        String filename = "E:\\github\\inbox\\面试准备\\src\\bobo\\algo\\minimum_span_trees_08\\lazy_prim_03\\testG1.txt";
        int V = 8;

        SparseWeightedGraph<Double> g = new SparseWeightedGraph<Double>(V, false);
        ReadWeightedGraph readGraph = new ReadWeightedGraph(g, filename);

        // Test Lazy Prim MST
        System.out.println("Test Lazy Prim MST:");
        LazyPrimMST<Double> lazyPrimMST = new LazyPrimMST<Double>(g);
        Vector<Edge<Double>> mst = lazyPrimMST.mstEdges();
        for( int i = 0 ; i < mst.size() ; i ++ )
            System.out.println(mst.elementAt(i));
        System.out.println("The MST weight is : " + lazyPrimMST.result());

        System.out.println();
    }
}
