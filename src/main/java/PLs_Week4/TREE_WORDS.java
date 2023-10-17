package PLs_Week4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TREE_WORDS extends BST<TextWord> {

    public void createTree() throws FileNotFoundException {
        Scanner readfile = new Scanner(new File("C:\\Users\\Utilizador\\OneDrive\\Ambiente de Trabalho\\Faculdade\\2º Ano\\1º Semestre\\ESINF\\ESINF_PLs_E_TPs\\src\\main\\java\\PLs_Week4\\xxx.xxx"));
        while(readfile.hasNextLine()){
            String[] pal = readfile.nextLine().split("(\\,)|(\\s)|(\\.)");
            for(String word : pal)
                if (word.length() > 0 )
                    insert(new TextWord(word, 1));
        }
        readfile.close();
    }

    /**
     * Inserts a new word in the tree, or increments the number of its occurrences.
     * @param element
     */
    @Override
    public void insert(TextWord element){
        if(element == null){
            return;
        }
        if(this.isEmpty()){
            root = new Node<>(element, null, null);
            return;
        }
        insert(element, root);
    }

    private Node<TextWord> insert(TextWord element, Node<TextWord> node){
        if(element.compareTo(node.getElement()) == 0){ // element and the node.getElement() are equal
            node.getElement().setWord(element.getWord(), node.getElement().getOcorrences() + 1); // increments the occurrence count of the word
            return node;
        }
        if(element.compareTo(node.getElement()) < 0){ // The element should be inserted into the left subtree
            if(node.getLeft() == null){
                Node<TextWord> newNode = new Node<>(element, null, null);
                node.setLeft(newNode);
                return newNode;
            }
            return insert(element, node.getLeft());
        }

        if(element.compareTo(node.getElement()) > 0){ // The element should be inserted into the right subtree
            if(node.getRight() == null){
                Node<TextWord> newNode = new Node<>(element, null, null);
                node.setRight(newNode);
                return newNode;
            }
            return insert(element, node.getRight());
        }
        return null;
    }

    /**
     * Returns a map with a list of words for each occurrence found.
     * @return a map with a list of words for each occurrence found.
     */
    public Map<Integer, List<String>> getWordsOccurrences(){
        Iterable<TextWord> textWordIterable = this.inOrder();
        Map<Integer, List<String>> result = new TreeMap<>();
        textWordIterable.forEach(textWord -> {
            if(!result.containsKey(textWord.getOcorrences()))
                result.put(textWord.getOcorrences(), new ArrayList<>());
            List<String> wordList = result.get(textWord.getOcorrences());
            wordList.add(textWord.getWord());
        });
        return result;
    }

}