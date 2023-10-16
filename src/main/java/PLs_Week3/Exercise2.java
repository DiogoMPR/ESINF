package PLs_Week3;

public class Exercise2 {

    /*
    public Map<Pessoa, Set<CartaoCredito>> anComplex (HashMap<CartaoCredito, Pessoa> mc){

        Map<Pessoa, Set<CartaoCredito>> mp = new TreeMap<>();

        for (Map.Entry<CartaoCredito, Pessoa> mccp : mc.entrySet()) {
            CartaoCredito cc = mccp.getKey();
            Pessoa p = mccp.getValue();
            Set<CartaoCredito> scc = mp.get(p);
            if (scc == null) {
                scc = new HashSet<>();
                mp.put(p,scc);
            }
            scc.add(cc);
        }
        return mp;
    }
    */

    // a) Explain what the method does.

    // This method receives a HashMap of 'CartaoCredito' that are the keys and 'Pessoa' as values
    // Then, the map is iterated by the foreach loop, that in every single entry on the map retrieves :
    // the 'CartaoCredito' number, the 'Person' and createss a set of 'CartaoCredito', if the set of 'CartaoCredito' is null, a new set is created and the retrieved person and the set 'CartaoCredito' are added to the map, the person works as key values
    // At the end of the iteration, the map is returned

    // b) Analyze its temporal complexity following Big-Oh notation. Justify.

    // Map<Pessoa, Set<CartaoCredito>> mp = new TreeMap<>(); // complexity : 1
    //
    //        for (Map.Entry<CartaoCredito, Pessoa> mccp : mc.entrySet()) { // complexity : n
    //            CartaoCredito cc = mccp.getKey(); // complexity : 1
    //            Pessoa p = mccp.getValue(); // complexity : 1
    //            Set<CartaoCredito> scc = mp.get(p); // complexity : 1
    //            if (scc == null) { // complexity : 1
    //                scc = new HashSet<>(); // complexity : 1
    //                mp.put(p,scc); // complexity : 1
    //            }
    //            scc.add(cc); // complexity : 1
    //        }
    //        return mp; // complexity : 1

    // Following the Big-Oh notation, the temporal complexity is given by the complexity of the foreach loop, meaning, that it is O(n).

}
