public class AEA2 {

    public static void main (String [] args) {

        // An array storing different ages
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        float avg, sum = 0;

        // Get the length of the array
        int length = ages.length;

        // Loop through the elements of the array
        for (int age : ages) {
        // sum += age == sum = age + sum
            sum += age;
        }
        // Calculate the average by dividing the sum by the length
        avg = sum / length;

        // Print the average
        System.out.println("The average age is: " + avg);

        // Volem que imprimeixi el nombre més gran del array
        int NombreGran = ages[0];
        for (int edat : ages){
            if (NombreGran < edat){
                NombreGran = edat;
            }
        }
        System.out.println("El nombre més gran és el : " + NombreGran);

        // Volem que imprimeixi el nombre més petit del array
        int NombrePetit = ages[0];
        for (int edat : ages){
            if (NombrePetit > edat){
                NombrePetit = edat;
            }
        }
        System.out.println("El nombre més petit és el : " + NombrePetit);

        //Volem la diferencia entre l'edat més gran i la més petita
        int DiffGranPetit = NombreGran - NombrePetit;
        System.out.println("La diferència entre les dues edats és de : " + DiffGranPetit + " anys");
    }
}


