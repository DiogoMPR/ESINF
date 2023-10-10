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
    // Than, the map is iterated by the foreach loop, that

    // b) Analyze its temporal complexity following Big-Oh notation. Justify.

}
