public class TrobarMaxiMinimMOD {

        public static void main(String[] args) {
        int vector[] = {12,3,-3,65,-5,88,99,2,23,54,33,27,53,96,0,};


        int valorminmax = vector[0];
        for (int i = 0; i < vector.length; i++){
            if (valorminmax > vector[i]){
            valorminmax = vector[i];
            }
        }
        System.out.println("El valor més petit del Array es el: "+ valorminmax);
        
        for (int i = 0; i < vector.length; i++){
            if (valorminmax < vector[i]){
            valorminmax = vector[i];
            }
        }
        System.out.println("El valor més gran del Array es el: "+ valorminmax);
    }
}
