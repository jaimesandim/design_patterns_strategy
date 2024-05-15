import static java.lang.Math.sqrt;

public class Geometrica implements ICalcMedia{

    @Override
    public double CalculaMedia(double numA, double numB) {
        return sqrt(numA * numB);
    }

    @Override
    public String Situacao(double media) {
        if (media > 7){
            return "Aprovado";
        }
        else{
            return "Reprovado";
        }
    }
}
