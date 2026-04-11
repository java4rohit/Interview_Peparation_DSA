package DesignPattern.LLD.FileSystemDesign;

public class TestFileSystem {
    public static void main(String[] args) {
        FileSystem fs = new FileSystem();

        fs.mkdir("/a/b/c");
        fs.addContentToFile("/a/b/c/file.txt", "Hello");

        System.out.println(fs.ls("/"));            // Output: ["a"]
        System.out.println(fs.ls("/a/b/c"));       // Output: ["file.txt"]
        System.out.println(fs.readContentFromFile("/a/b/c/file.txt")); // "Hello"
    }
}
