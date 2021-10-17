public class Access_Specifiers_5 {
    /*
     * Public Access   // POATE FI ACCESAT DE ORIUNDE: DIN CLASA, DIN PACHET SI DIN ALTA CLASA DIN ALT PACHET
     * Default Access / No Access Specifier, CREEM ACEASTA METODA DIN ACELASI PACHET SI CLASA SI O ACCESAM DIN ACELASI PACHET ( dar nu din alta clasa si alt pachet)
     * Private Access   // MERGE ACCESAT DOAR DIN CLASA IN CARE ESTE CREAT
     * Protected Access
     *  CAND VREM SA ACCESAM O CLASA DIN ALT PACHET TREBUIE SA O IMPORTAM
     */

    public void doThisPublic() {
        System.out.println("Public Method");
    }

    private void doThisPrivate() {
        System.out.println("Private Method");
    }
    void doThisDefault(){
        System.out.println("Private Method");
    }
}
