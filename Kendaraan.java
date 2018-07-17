class Kendaraan {
	String nama;
	String keterangan;
	String jenis;

	public Kendaraan (String nama, String keterangan){
	nama = nama;
	keterangan = keterangan;
	}

	public void rincian(){
	System.out.println("nama = " + nama);
	System.out.println("keterangan = " + keterangan);
	}
	public static void main(String[] args){
	System.out.println("class Kendaraan");
	}
}