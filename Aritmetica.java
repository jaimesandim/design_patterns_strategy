public class Aritmetica implements ICalcMedia{
    @Override
    public double CalculaMedia(double numA, double numB) {
        return ((numA + numB) / 2);
    }

    @Override
    public String Situacao(double media) {
        if (media > 5.0){
            return "Aprovado";
        }
        else{
            return "Reprovado";
        }
    }
}
