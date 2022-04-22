package p003;

import java.io.*;
import java.util.Arrays;
import java.util.Base64;

public class Solution {

    public Solution(){

    }

    private String serialize(Node node){
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(baos);

            // Method for serialization of object
            out.writeObject(node);
            out.close();
            return Base64.getEncoder().encodeToString(baos.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Node deserialize(String serial){
        try {
            byte[] data = Base64.getDecoder().decode(serial);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));

            Object node = ois.readObject();
            ois.close();
            return (Node) node;
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Node node = new Node("root", new Node("left", new Node("left.left")), new Node("right"));
        if (!sol.deserialize(sol.serialize(node)).left.left.value.equals("left.left")) System.out.println(" Not Equal");
    }
}
