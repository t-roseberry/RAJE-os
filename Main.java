public class Main {
    public static void main(String[] args) {
        FileStore store = new BlockStore();
        System.out.println("free at start (expect " + BlockStore.BLOCK_COUNT + "): " + store.freeBlocks());
        System.out.println("create hello.txt (expect true): " + store.create("hello.txt", "Hello, world!"));
        System.out.println("read hello.txt (expect Hello, world!): " + store.read("hello.txt"));
        System.out.println("free now (expect " + (BlockStore.BLOCK_COUNT - 2) + "): " + store.freeBlocks());
        System.out.println("delete hello.txt (expect true): " + store.delete("hello.txt"));
        System.out.println("free again (expect " + BlockStore.BLOCK_COUNT + "): " + store.freeBlocks());
    }
}
