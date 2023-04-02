class Adder {
	int arr[]= {1,2,3,4,5};
	int targetsum=6;
	void sumnum() {
		for (int i=0;i<arr.length;i++) {
			for (int j=1;j<arr.length;j++) {
				if (arr[i]+arr[j]==targetsum) {					
					System.out.println(arr[i]+','+arr[j]);
					break;
				}
			}
		}
	}
    public static void main(String [] args) {
        Adder ad =new Adder();
        ad.sumnum();
}
}

