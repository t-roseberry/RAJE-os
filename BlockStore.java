/**
 * RAJE|os Round 1: block store.
 * Author: (your name)
 *
 * Rules: no collections (no ArrayList, HashMap, and so on). Arrays only.
 * Files are stored as chains of blocks. Each block holds up to BLOCK_SIZE characters.
 */
public class BlockStore implements FileStore {
    public static final int BLOCK_COUNT = 256;
    public static final int BLOCK_SIZE = 8;

    private static final int NO_BLOCK = -1;
    private final char[][] blockData = new char[BLOCK_COUNT][BLOCK_SIZE];
    private final boolean[] blockInUse = new boolean[BLOCK_COUNT];
    private final int[] nextBlock = new int[BLOCK_COUNT];

    private final FileEntry[] files = new FileEntry[BLOCK_COUNT];

    private static class FileEntry {
        final String name;
        final int firstBlock;

        FileEntry(String name, int firstBlock) {
            this.name = name;
            this.firstBlock = firstBlock;
        }
    }

        public BlockStore() {
            for (int i = 0; i < BLOCK_COUNT; i++) {
                nextBlock[i] = NO_BLOCK;
        }
    }


    // TODO: design your storage after your paper design is done.
    // Hint: the bank needs data, a way to link blocks, and a way to know which blocks are free.

    @Override
    public boolean create(String name, String contents) {
        // TODO
        return false;
    }

    @Override
    public String read(String name) {
        // TODO
        return null;
    }

    @Override
    public boolean delete(String name) {
        // TODO
        return false;
    }

    @Override
    public String[] list() {
        // TODO
        return new String[0];
    }

    @Override
    public int freeBlocks() {
        // TODO
        return 0;
    }
}
