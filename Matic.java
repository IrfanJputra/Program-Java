class Matic extends Motor {
	public Matic (String nama, String keterangan, String jenis){
	super (nama, keterangan, jenis);
	}

	public void rincian () {
	System.out.println("nama motor = " + nama);
	System.out.println("keterangan = " + keterangan);
	System.out.println("jenis = " + jenis);
	}

	public static void main (String[] args){
	Matic Matics = new Matic ("","","");
	Matics.nama  		= "honda beat";
	Matics.keterangan 	= "buatan jepang";
	Matics.jenis 		= "bensin";
	Matics.rincian();
	}
}