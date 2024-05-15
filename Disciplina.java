public class Disciplina {
    private ICalcMedia CalcMedia;
    public double Media;
    private String nome;
    private double P1;
    private double P2;
    public String Situacao;

    public void setP1(double p1) {
        P1 = p1;
    }
    public double getP1() {
        return P1;
    }

    public void setP2(double p2) {
        P2 = p2;
    }
    public double getP2() {
        return P2;
    }

    public void setMedia(double media) {
        Media = media;
    }
    public double getMedia() {
        return Media;
    }

    public void setSituacao(String situacao) {
        Situacao = situacao;
    }
    public String getSituacao() {
        return CalcMedia.Situacao(Media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    void CalcularMedia(){
        this.Media = CalcMedia.CalculaMedia(this.P1, this.P2);
    }

    public Disciplina(ICalcMedia calcMedia) {
        CalcMedia = calcMedia;
    }
}
