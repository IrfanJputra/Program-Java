class Motor extends Kendaraan {
	String jenis;

	public Motor (String nama, String keterangan, String jenis) {
	super (nama, keterangan);
	jenis = jenis;
	}

	public void rincian(){
	System.out.println("nama Motor = " + nama);
	System.out.println("keterangan = " + keterangan);
	System.out.println("jenis = " + jenis);
	}
}