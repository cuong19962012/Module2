package ss12_java_collection_framework.thuc_hanh.create_binary_search_tree;

public interface Tree<E> {
    public boolean insert(E e);

    /**
     * Inorder traversal from the root
     */
    public void inorder();

    /**
     * Get the number of nodes in the tree
     */
    public int getSize();
}
