package utfpr.ct.dainf.if62c.avaliacao;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná DAINF - Departamento
 * Acadêmico de Informática IF62C - Fundamentos de Programação 2
 *
 * Primeira avaliação parcial 2014/2.
 *
 * @author
 */
public class Complexo {

    private double real;
    private double img;

    public Complexo() {
    }

    public Complexo(double real, double img) {
        // completar a implementação
        this.real = real;
        this.img = img;
    }

    // implementar getReal()
    public double getReal() {
        return real;
    }

    // implementar getImg()
    public double getImg() {
        return img;
    }

    public Complexo soma(Complexo c) {
        return new Complexo(real + c.real, img + c.img);
    }

    // implementar sub(Complexo)
    public Complexo sub(Complexo s) {
        return new Complexo(real - s.real, img - s.img);
    }

    // implementar prod(double)
    public Complexo prod(double r) {
        return new Complexo(r * real, r * img);
    }

    // implementar prod(Complexo)
    public Complexo prod(Complexo p) {
        return new Complexo(real * p.real - img * p.img, img * p.real + real * p.img);
    }

    //public Complexo 
    // implementar div(Complexo)
    public Complexo div(Complexo d) {
        return new Complexo((real * d.real + img * d.img) / Math.pow(d.real, 2) + Math.pow(d.img, 2), (d.real * img - real * d.img) / Math.pow(d.real, 2) + Math.pow(d.img, 2));
    }

    // implementar sqrt()
    public Complexo[] sqrt() {
        // completar implementação
        // retornar o vetor contendo as raízes
        Complexo raiz [] = new Complexo[2];
        double rho = Math.sqrt(Math.pow(real, 2) + Math.pow(img, 2));
        double phi = 0;
        if (real == 0 && img == 0) {
            phi = 0;
        }
        if (real == 0 && img > 0){
            phi = Math.PI/2;
        }
        if (real == 0 && img < 0){
            phi = 3*Math.PI/2;
        }
        if (real > 0){
            phi = 1/Math.tan(img/real);
        }
        if (real < 0){
            phi = 1/Math.tan(img/real) + Math.PI;
        }
        raiz [0] = new Complexo(rho*Math.cos(phi/2), rho*Math.sin(phi/2));
        raiz [1] = new Complexo(rho*Math.cos(phi/2 + Math.PI), rho*Math.sin(phi/2 + Math.PI));
        return raiz;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (int) (Double.doubleToLongBits(real)
                ^ (Double.doubleToLongBits(real) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(img)
                ^ (Double.doubleToLongBits(img) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        final Complexo c = (Complexo) obj;
        return obj != null && getClass() == obj.getClass()
                && real == c.real && img == c.img;
    }

    @Override
    public String toString() {
        return String.format("%+f%+fi", real, img);
    }
}
