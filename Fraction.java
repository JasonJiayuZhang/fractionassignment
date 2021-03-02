class Fraction {
    private int numerator;
    private int denominator;
    
    Fraction(){
    this.numerator = 3;    
    this.denominator = 5;
    }
    
     public Fraction(Fraction f) { 
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    }


    public Fraction(int den, int num){
         this.denominator = den;
        if(denominator == 0) {
            System.out.println("den equels 0, change to 1");
           denominator = 1;
        }else{
         this.numerator = num;     
    }
}

public int getNum() {
    return this.numerator;
}

public int getDen(){
    return this.denominator;
}

public String toString(){
   return this.getNum()+"/"+this.getDen(); 
}

public Fraction(String f) { 
        int idx = f.indexOf("/");
        String num = f.substring(0, idx);
        String den = f.substring(idx+1);
        this.numerator = Integer.parseInt(num);
        int intD = Integer.parseInt(den);
        if (intD == 0) {
            System.out.println("error change to 1");
            denominator = 1;
        } else {
            this.denominator = intD;
        }

    }
    
}