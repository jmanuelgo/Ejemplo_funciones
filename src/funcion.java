public class funcion {

    public int contar(int n)
    { int c=0;
        while(n>0)
        {
            n=n/10;
            c=c+1;
        }
        return c;
    }
    public int nro_divisibilidades(int n)
    { int c=0, i;

        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c=c+1;
            }
        }

        return c;
    }
    public int invertir(int n)
    {int d, nn=0;
        while(n>0)
        {   d=n%10;
            nn=(nn*10)+d;
            n=n/10;

        }
        return nn;
    }
}

