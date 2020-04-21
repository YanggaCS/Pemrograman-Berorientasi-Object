class Encap
{
    private String nama;
    private int umur;
    public String  getNama()
    {
        return nama;
    }
    public void setNama(String nama)
    {
        this.nama=nama;
    }
    public int getUmur()
    {
        return umur;
    }
    public void setUmur(int umur)
    {
        this.umur=umur;
    }
}
public class Encapsulation
{
    public static void main (String [] magician)
    {
    Encap e=new Encap();
    e.setNama("YanggaCS");
    e.setUmur (21);
    System.out.println("Nama "+e.getNama());
    System.out.println("Umur "+e.getUmur ());
    }
}