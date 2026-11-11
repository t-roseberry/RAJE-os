public class Main {
    public static void main(String[] args) {
        FileStore store = new BlockStore();
        System.out.println("free at start (expect " + BlockStore.BLOCK_COUNT + "): " + store.freeBlocks());

        // Step 2: a one-block file
        System.out.println("create hi.txt (expect true): " + store.create("hi.txt", "Hi world"));
        System.out.println("read hi.txt (expect Hi world): " + store.read("hi.txt"));
        System.out.println("free now (expect " + (BlockStore.BLOCK_COUNT - 1) + "): " + store.freeBlocks());

        // Step 3: a file of several blocks
        System.out.println("create hello.txt (expect true): " + store.create("hello.txt", "Hello, world!"));
        System.out.println("read hello.txt (expect Hello, world!): " + store.read("hello.txt"));
        System.out.println("free now (expect " + (BlockStore.BLOCK_COUNT - 3) + "): " + store.freeBlocks());

        // Step 4: delete frees every block
        System.out.println("delete hi.txt (expect true): " + store.delete("hi.txt"));
        System.out.println("delete hello.txt (expect true): " + store.delete("hello.txt"));
        System.out.println("free again (expect " + BlockStore.BLOCK_COUNT + "): " + store.freeBlocks());
    }
}