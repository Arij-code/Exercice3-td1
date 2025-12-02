Public class Exercice3{
    Public static void main(string[]args)
    {
        int[]tab=New int[5];
        tab[0]=11;
        tab[1]=3;
        tab[2]=5;
        tab[3]=9;
        tab[4]=22;
        ///////////////// int[]tab={11,3,5,9,22}
    }
    ////////////////parcourir et afficher les elements du tableau 
    /// methode1:
    for(int i=0;i<tab.lenght;i++)
    /// methode2:
    for(int x:tab)
    {System Out.Println(x);}
    ////////// chercher le max+min+somme
    int max,min,somme;
    max=tab[0];
    min=tab[0];
    for(int x:tab)
    somme+=x;
    if{ ( x>max )
    {max=x;} }
    else{
    {min=x;}
    }
System Out.Println("la somme"=+somme+,"max"=+max,"min"=+min);
    }
