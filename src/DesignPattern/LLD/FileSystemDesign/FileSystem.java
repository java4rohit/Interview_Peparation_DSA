package DesignPattern.LLD.FileSystemDesign;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class FileSystem {

    class Node {
        boolean isFile = false;
        Map<String, Node> children = new TreeMap<>();
        StringBuilder content = new StringBuilder();
    }

    private final Node root;

    public FileSystem() {
        root = new Node();
    }

    private Node traverse(String path) {
        String[] parts = path.split("/");
        Node curr = root;
        for (int i = 1; i < parts.length; i++) {
            curr.children.putIfAbsent(parts[i], new Node());
            curr = curr.children.get(parts[i]);
        }
        return curr;
    }

    public List<String> ls(String path) {
        Node node = root;
        List<String> result = new ArrayList<>();

        if (!path.equals("/")) {
            String[] parts = path.split("/");
            for (int i = 1; i < parts.length; i++) {
                node = node.children.get(parts[i]);
            }
            if (node.isFile) {
                result.add(parts[parts.length - 1]);
                return result;
            }
        }

        result.addAll(node.children.keySet());
        return result;
    }

    public void mkdir(String path) {
        traverse(path);
    }

    public void addContentToFile(String filePath, String content) {
        Node node = traverse(filePath);
        node.isFile = true;
        node.content.append(content);
    }

    public String readContentFromFile(String filePath) {
        Node node = traverse(filePath);
        return node.content.toString();
    }
}
