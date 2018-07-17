class Mobil extends Kendaraan {
	String jenis;

	public Mobil (String nama, String keterangan, String jenis) {
	super (nama, keterangan);
	jenis = jenis;
	}

	public void rincian(){
	System.out.println("nama Mobil = " + nama);
	System.out.println("keterangan = " + keterangan);
	System.out.println("jenis = " + jenis);
	}
}