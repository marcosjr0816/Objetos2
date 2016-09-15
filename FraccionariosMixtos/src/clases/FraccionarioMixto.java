/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Marcos Sarmientos
 */
public class FraccionarioMixto {
    
    private int numerador;
    private int denominador;
    private int entero;
    
    public FraccionarioMixto(int entero,int numerador, int denominador) throws DenominadorCeroException{
        this.numerador = numerador;
        this.denominador = denominador;
        this.entero = entero;
        if (denominador==0) {
            throw new DenominadorCeroException();
        }
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }
    
    public FraccionarioMixto sumar(FraccionarioMixto f2) throws DenominadorCeroException{
        FraccionarioMixto f;
        
        int nume,deno,ente,an1,ad1,an2,ad2,num,den;
        an1=(this.entero*this.denominador)+this.numerador;
        ad1=this.denominador;
        an2=(f2.entero*f2.denominador)+f2.numerador;
        ad2=f2.denominador;
        nume=(an1*ad2)+(ad1*an2);
        deno=ad1*ad2;
        ente=nume/deno;
        num=nume%deno;
        den=deno;
        f=new FraccionarioMixto(ente,num, den);
        return f;
    }
    public FraccionarioMixto restar(FraccionarioMixto f2) throws DenominadorCeroException{
        FraccionarioMixto f;
        
        int nume,deno,ente,an1,ad1,an2,ad2,num,den;
        an1=(this.entero*this.denominador)+this.numerador;
        ad1=this.denominador;
        an2=(f2.entero*f2.denominador)+f2.numerador;
        ad2=f2.denominador;
        nume=(an1*ad2)-(ad1*an2);
        deno=ad1*ad2;
        ente=nume/deno;
        num=nume%deno;
        den=deno;
        f=new FraccionarioMixto(ente,num, den);
        return f;
    }
    public FraccionarioMixto multiplicar(FraccionarioMixto f2) throws DenominadorCeroException{
        FraccionarioMixto f;
        
        int nume,deno,ente,an1,an2,ad1,ad2,num,den;
        an1=(this.entero*this.denominador)+this.numerador;
        ad1=this.denominador;
        an2=(f2.entero*f2.denominador)+f2.numerador;
        ad2=f2.denominador;
        num=an1*an2;
        den=ad1*ad2;
        ente=num/den;
        nume=num%den;
        deno=den;
        f=new FraccionarioMixto(ente,nume, deno);
        return f;
    }
    public FraccionarioMixto dividir(FraccionarioMixto f2) throws DenominadorCeroException{
        FraccionarioMixto f;
        
        int nume,deno,ente,an1,an2,ad1,ad2,num,den;
        an1=(this.entero*this.denominador)+this.numerador;
        ad1=this.denominador;
        an2=(f2.entero*f2.denominador)+f2.numerador;
        ad2=f2.denominador;
        num=an1*ad2;
        den=ad1*an2;
        ente=num/den;
        nume=num%den;
        deno=den;
        f=new FraccionarioMixto(ente,nume, deno);
        return f;
    }
    public FraccionarioMixto covertirafraccion() throws DenominadorCeroException{
        FraccionarioMixto f;
        int nume,deno,ente;
        
        nume=(this.entero*this.denominador)+this.numerador;
        deno=this.denominador;
        ente=this.entero;
        f=new FraccionarioMixto(ente,nume, deno);
        return f;
    }
}
