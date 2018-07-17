class Manual extends Mobil {
	
	public Manual (String nama, String keternagan, String jenis) {
	super (nama, keterangan, jenis);
	}

	public void rincian() {
	System.out.println("nama Mobil = " + nama);
	System.out.println("keterangan = " + keterangan);
	System.out.println("jenis = " + jenis);
	}
}
