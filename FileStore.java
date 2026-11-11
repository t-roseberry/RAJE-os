/**
 * The public contract for every RAJE|os store. Do not change these signatures.
 * Round 2 runs other people's stress programs against your store through this interface.
 */
public interface FileStore {
    /** Stores a new file. Returns false if the name is taken or there are not enough free blocks. */
    boolean create(String name, String contents);

    /** Returns the file's contents, or null if no file has that name. */
    String read(String name);

    /** Removes a file and frees its blocks. Returns false if no file has that name. */
    boolean delete(String name);

    /** Returns the names of all files, in any order. */
    String[] list();

    /** Returns the number of blocks not in use by any file. */
    int freeBlocks();
}
