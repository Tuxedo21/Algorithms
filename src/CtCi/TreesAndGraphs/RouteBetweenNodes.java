package CtCi.TreesAndGraphs;


import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by tuxedo21 on 4/05/17.
 */
public class RouteBetweenNodes {

static boolean searchPath(gNode start, gNode end){
    if(start.equals(end))
        return true;
    LinkedList<gNode> queue = new LinkedList<>();
    start.state = State.Visiting;
    queue.add(start);
    gNode u;
    while (!queue.isEmpty()){
        u = queue.removeFirst(); // dequeue
        if (u != null){
            for(gNode v : u.getAdjacent()){
                if(v.state == State.Unvisited){
                    if(v == end){
                        return true;
                    }else {
                        v.state = State.Visiting;
                        queue.add(v);
                    }
                }
            }
        }
    }
    return false;
}



public static void main(String[] args) {


        gNode s0 = new gNode(State.Unvisited,"0");
        gNode s1 = new gNode(State.Unvisited,"1");
        gNode s2 = new gNode(State.Unvisited,"2");
        gNode s3 = new gNode(State.Unvisited,"3");
        gNode s4 = new gNode(State.Unvisited,"4");
        gNode s5 = new gNode(State.Unvisited,"5");
        gNode s6 = new gNode(State.Unvisited,"6");
        gNode s7 = new gNode(State.Unvisited,"7");
        gNode s8 = new gNode(State.Unvisited,"8");
        gNode s9 = new gNode(State.Unvisited,"9");
        gNode s10 = new gNode(State.Unvisited,"10");
        gNode s11 = new gNode(State.Unvisited,"11");
        gNode s12 = new gNode(State.Unvisited,"12");
        gNode s13 = new gNode(State.Unvisited,"13");
        gNode s14 = new gNode(State.Unvisited,"14");
        gNode s15 = new gNode(State.Unvisited,"15");
        gNode s16 = new gNode(State.Unvisited,"16");
        gNode s17 = new gNode(State.Unvisited,"17");
        gNode s18 = new gNode(State.Unvisited,"18");
        gNode s19 = new gNode(State.Unvisited,"19");
        gNode s20 = new gNode(State.Unvisited,"20");
        gNode s21 = new gNode(State.Unvisited,"21");

        ArrayList<gNode> s0edges = new ArrayList<>();
        s0edges.add(s1);
        s0edges.add(s2);
        s0edges.add(s3);
        s0.setAdjacent(s0edges);

        ArrayList<gNode> s1edges = new ArrayList<>();
        s0edges.add(s0);
        s0edges.add(s2);
        s0edges.add(s3);
        s0.setAdjacent(s1edges);

        ArrayList<gNode> s2edges = new ArrayList<>();
        s0edges.add(s5);
        s0edges.add(s6);
        s0edges.add(s7);
        s0.setAdjacent(s2edges);



        System.out.println(s0.equals(s1));
        System.out.println(searchPath(s0,s9)+"");


    }

}
