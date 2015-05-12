
import utfpr.ct.dainf.if62c.avaliacao.Complexo;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Primeira avaliação parcial 2014/2.
 * @author 
 */
public class Avaliacao1 {

    public static void main(String[] args) {
        // implementar main
        Complexo x = new Complexo(3,7);
        Complexo y = new Complexo(10,4);
        Complexo[] respostaX = new Complexo[2];
        Complexo[] respostaY = new Complexo [2];
        respostaX = raizesEquacao(x.prod(x), x.prod(5), new Complexo(4,0));
        respostaY = raizesEquacao(y.prod(y), y.prod(2), new Complexo(5,0));
        
        System.out.println ("x1 = " + respostaX[0].toString());
        System.out.println ("x2 = " + respostaX[1].toString());
        System.out.println ("y1 = " + respostaY[0].toString());
        System.out.println ("y2 = " + respostaY[1].toString());
    }
    
    // implementar raizesEquacao(Complexo, Complexo, Complexo)
    public static Complexo[] raizesEquacao(Complexo a, Complexo b, Complexo c){
        Complexo raiz [] = new Complexo [2];
        Complexo raizD[] = new Complexo[2];
        Complexo d = new Complexo();
        
        d = b.prod(b).sub(a.prod(c).prod(4));
        raizD = d.sqrt();
        
        raiz[0] = b.prod(-1).soma(raizD[0]).div(a.prod(2));
        raiz[1] = b.prod(-1).soma(raizD[1]).div(a.prod(2));
        return raiz;
    }
}
