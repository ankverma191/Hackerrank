public static void main(String[] args) {
        int [] a =  { 1, 2, 3, 4, 5};
        int [] b = new int[a.length];
        int k = 4; // Right Rotation
        for (int i = 0 ; i < a.length ; i = i + 1) {
            b[(i + k)%a.length] = a[i];
        }  
        
        for (int i : b) {
            System.out.print(i + " ");
        }
    }
