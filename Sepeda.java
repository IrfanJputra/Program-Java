class Sepeda extends Kendaraan {
	String jenis;

	public Sepeda (String nama, String keterangan, String jenis) {
	super (nama, keterangan);
	jenis = jenis;
	}

	public void rincian() {
	System.out.println("nama sepeda = " + nama);
	System.out.println("keterangan = " + keterangan);
	System.out.println("jenis = " + jenis);
	}
}