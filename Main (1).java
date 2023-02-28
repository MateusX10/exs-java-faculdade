class Main {
  public static void main(String[] args) {
    byte tipobyte = 111;
    short tiposhort = 1012;
    int tipoint = 319990;
    long tipolong = 304232121242L;
    boolean tipoboolean = true;
    char tipochar = 'C';
    float tipofloat = 31.1f;
    double tipodouble = 12.1;
    boolean permissao = false;

    if (permissao){
      System.out.println("Tipo byte: " + tipobyte);
      System.out.println("Tipo short: " + tiposhort);
      System.out.println("Tipo int: " + tipoint);
      System.out.println("Tipo long: " + tipolong);
      System.out.println("Tipo char: " + tipochar);
      System.out.println("Tipo float: " + tipofloat);
      System.out.println("Tipo boolean: " + tipoboolean);
      System.out.println("Tipo double: " + tipodouble);
    
    }

    else {
      System.out.println("Erro, permissão negada!");
    }
    
    
  }
}