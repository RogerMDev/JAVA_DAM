public class FeedBack {
    
    //Param. entrada: la resposta i el valor secret (dos String)
    //Param. sortida: si s’ha encertat (un booleà)
    public boolean resoldreResposta(String secret, String resposta) {
        String res = generarPista(secret, resposta);
        boolean fi = false;
        System.out.print("La resposta és [" + res + "].");
        if (resposta.equals(secret)){
            System.out.println("Has encertat!");
            fi = true;
        } else {
            System.out.println("Continua intentant" + "-" + "ho!");
        }
        return fi;
    }

    //Param. entrada: la resposta i el secret que cal comparar (text)
    //Param. sortida: la pista que cal mostrar (un text)
    public String generarPista(String s, String r) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char charSecret = s.charAt(i);
            char charResposta = r.charAt(i);
            if (charSecret == charResposta) {
                res = res + MasterMind.TOT_CORRECTE;
            }
            else if (s.indexOf(charResposta) != - 1){
                res = res + MasterMind.MALA_POSICIO;
            }
            else {
                res = res + MasterMind.INCORRECTE;
            }
        }
        return res;
    }
}
