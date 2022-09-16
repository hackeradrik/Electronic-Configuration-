public class EC {

    public static void main(String[] args)
    {

        int Z = 84;

        if(Z>2){
            System.out.print("1s2 ");
            Z-=2;

            if(Z>2){
                System.out.print("2s2 ");
                Z-=2;
                if(Z>6){
                    System.out.print("2p6 ");
                    Z-=6;
                    if(Z>2){
                        System.out.print("3s2"+" ");
                        Z-=2;
                        if(Z>6){

                            System.out.print("3p6"+" ");
                            Z-=6;
                            if(Z>2){
                                System.out.print("4s2"+" ");
                                Z-=2;
                                if(Z>10){
                                    System.out.print("3d10"+" ");
                                    Z-=10;
                                    if(Z>6){
                                        System.out.print("4p6 ");
                                        Z-=6;
                                        if(Z>2){
                                            System.out.print("5s2 ");
                                            Z-=2;
                                            if(Z>10){
                                                System.out.print("4d10 ");
                                                Z-=10;
                                                if(Z>6){

                                                    System.out.print("5p6 ");
                                                    Z-=6;
                                                    if(Z>2){
                                                        System.out.print("6s2 ");
                                                        Z-=2;
                                                        if(Z>14){
                                                            System.out.print("4f14 ");
                                                            Z-=14;

                                                            if(Z>10){
                                                                System.out.print("5d10 ");
                                                                Z-=10;
                                                                if(Z>6){

                                                                    System.out.print("6p6 ");
                                                                    Z-=6;
                                                                    if(Z>2){
                                                                        System.out.print("7s2 ");
                                                                        Z-=2;
                                                                        if(Z>14){
                                                                            System.out.print("5f14");
                                                                            Z-=14;
                                                                            if(Z>10){
                                                                                System.out.print("6d10 ");
                                                                                Z-=10;
                                                                                if(Z>6){
                                                                                    System.out.print("7p6 ");//end
                                                                                    Z-=6;

                                                                                }
                                                                                else if(Z==0){}
                                                                                else {
                                                                                    System.out.print("7p"+Z+" ");
                                                                                }
                                                                            }
                                                                            else if(Z==0){}
                                                                            else {
                                                                                System.out.print("6d"+Z+" ");
                                                                            }
                                                                        }
                                                                        else if(Z==0){}
                                                                        else {
                                                                            System.out.print("5f"+Z+" ");
                                                                        }
                                                                    }
                                                                    else if(Z==0){}
                                                                    else {
                                                                        System.out.print("7s"+Z+" ");
                                                                    }
                                                                }
                                                                else if(Z==0){}
                                                                else {
                                                                    System.out.print("6p"+Z+" ");
                                                                }
                                                            }
                                                            else if(Z==0){}
                                                            else {
                                                                System.out.print("5d"+Z+" ");
                                                            }
                                                        }
                                                        else if(Z==0){}
                                                        else {
                                                            System.out.print("4f"+Z+" ");
                                                        }
                                                    }
                                                    else if(Z==0){}
                                                    else {
                                                        System.out.print("6s"+ Z +" ");
                                                    }

                                                }
                                                else if(Z==0){}
                                                else {
                                                    System.out.print("5p"+Z+" ");
                                                }
                                            }
                                            else if(Z==0){}
                                            else {
                                                System.out.print("4d"+Z+" ");
                                            }

                                        }
                                        else if(Z==0){}
                                        else {
                                            System.out.print("5s"+Z+" ");
                                        }
                                    }
                                    else if(Z==0){}
                                    else {
                                        System.out.print("4p"+Z+" ");
                                    }
                                }
                                else if(Z==0){}
                                else{
                                    System.out.print("3d"+Z+" ");
                                }
                            }
                            else if(Z==0){}
                            else{
                                System.out.print("4s"+Z+" ");
                            }
                        }
                        else if(Z==0){}
                        else {
                            System.out.print("3p"+Z+" ");
                        }
                    }
                    else if(Z==0){}
                    else {
                        System.out.print("3s"+Z+" ");
                    }
                }
                else if(Z==0){}
                else {
                    System.out.print("2p"+Z+" ");
                }
            }
            else if(Z==0){}
            else {
                System.out.print("2s"+Z+" ");
            }

        }
        else{
            System.out.print("1s"+Z+" ");
        }
    }
}
