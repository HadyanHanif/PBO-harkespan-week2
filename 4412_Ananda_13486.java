// Nama    = Ananda Hadyan Hanif
// NIM     = A11.2021.13486
// Kelas   = A11.4412

//Sepeda
class Sepeda {
    
    int gear = 10;
    int gear2 = 12;
    int Rodasepeda;
    String Jenissepeda;
    String Merksepeda;

    
    void rem() {
        System.out.println("Sepeda direm");
    }

    //Construkor
    Sepeda(int jumlahRoda, String jenis, String merk) {

        Rodasepeda    = jumlahRoda;
        Jenissepeda   = jenis;
        Merksepeda    = merk;

        System.out.println("Sepeda "+jenis+" bermerk "+merk+" memiliki jumlah roda "+jumlahRoda);
    }
}

class Lampu {
    boolean nyala;
    
    void nyalakanLampu() {
        nyala = true;
    }
    void matikanLampu() {
        nyala = false;
    }
}


//Sepeda
class AksiSepeda {
    public static void main(String[] args) {
        Sepeda sepeda1 = new Sepeda(2, "Folding Bike", "Brompton");
        Sepeda sepeda2 = new Sepeda(2, "Mountain Bike", "Polygon");

        int gearSepeda1 = sepeda1.gear;
        System.out.println("Jumlah gear "+gearSepeda1);
        sepeda1.rem();

        int gearSepeda2 = sepeda2.gear2;
        System.out.println("Jumlah gear "+gearSepeda2);
        sepeda2.rem();
    }
}

//Lampu
class AksiLampu {
    public static void main(String[] args) {
        
        Lampu lampu1 = new Lampu();
        lampu1.nyalakanLampu();
        System.out.println("Apakah lampu menyala ? = "+lampu1.nyala);
        
        lampu1.matikanLampu();
        System.out.println("Apakah lampu menyala ? = "+lampu1.nyala);
    }
}