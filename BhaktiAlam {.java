import java.util.Scanner;


 class BhaktiAlam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Duku . Weekday : 915.000 . Weekend : 1.025.000 . Holiday : 1.225.000");
        System.out.println("Jeruk . Weekday : 915.000 . Weekend : 1.025.000 . Holiday : 1.225.000");
        System.out.println("Alpukat . Weekday : 575.000 . Weekend : 695.000 . Holiday : 895.000");
        System.out.println("Jambu Air . Weekday : 575.000 . Weekend : 695.000 . Holiday : 895.000");
        System.out.println("Durian . Weekday : 595.000 . Weekend : 715.000 . Holiday : 915.000");
        System.out.println("Melon . Weekday : 595.000 . Weekend : 715.000 . Holiday : 915.000");
        System.out.println("Belimbing . Weekday : 495.000 . Weekend : 575.000 . Holiday : 755.000");
        System.out.println("Mangga . Weekday : 495.000 . Weekend : 575.000 . Holiday : 755.000");
        System.out.println("Kedondong . Weekday : 495.000 . Weekend : 575.000 . Holiday : 755.000");
        System.out.println("Pilih cottage : ");
        String cottage = input.nextLine();
        int harga = 0;
        String jadwal = input.nextLine();

        if(cottage.equals("Duku")|cottage.equals("Jeruk")){
            switch(jadwal){
                case "Weekday":
                harga = 915000;
                break;
                case "Weekend":
                harga = 1025000;
                break;
                case "Holiday":
                harga = 1225000;
                break;
                default:
                harga = 0;
                break;
            }
        }else if(cottage.equals("Alpukat")|cottage.equals("Jambu Air")){
            switch(jadwal){
                case "Weekday":
                harga = 575000;
                break;
                case "Weekend":
                harga = 695000;
                break;
                case "Holiday":
                harga = 895000;
                break;
                default:
                harga = 0;
                break;
            }
        }else if (cottage.equals("Durian")|cottage.equals("Melon")){
            switch(jadwal){
                case "Weekday":
                harga = 595000;
                break;
                case "Weekend":
                harga = 715000;
                break;
                case "Holiday":
                harga = 915000;
                break;
                default:
                harga = 0;
                break;
            }
        }else if(cottage.equals("Belimbing")|cottage.equals("Mangga")|cottage.equals("Kedondong")){
            switch(jadwal){
                case "Weekday":
                harga = 495000;
                break;
                case "Weekend":
                harga = 575000;
                break;
                case "Holiday":
                harga = 755000;
                break;
                default:
                harga = 0;
                break;
            }
        }
        System.out.println("Cottage Yang Anda Pilih : "+cottage);
        System.out.println("Jadwal Yang Anda Pilih : "+jadwal);
        System.out.println("Total Harga : "+harga);
            
        }
            
        }
        
        

        
            
            
        
        
    

    
    

