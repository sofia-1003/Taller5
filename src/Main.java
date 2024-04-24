public class Main {
    public static void main(String[] args) {

        //Solución clase TapeDeck
        TapeDeck t = new TapeDeck(); //No se había creado un objeto de la clase TapeDeck, por ende no era posible acceder a los métodos de la clase
        t.canRecord = true;

        if(t.canRecord == true){
            t.recordTape();
        }

        //Solución clase DVDPlayer
        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        d.playDVD(); //Se estaba llamando un método inexistente, ya fue creado dentro de la clase DVDPlayer

        if(d.canRecord == true){
            d.recordDVD();
        }

        //Solución clase Drumkit
        DrumKit drum = new DrumKit();
        drum.snare = false;
        drum.playSnare();
        drum.playTopHat();

        if(drum.snare == true){
            drum.playSnare();
        }

        //Solución clase Echo
        Echo e1 = new Echo ();
        Echo e2 = new Echo ();

        int x = 0;
        while(x < 4){
            e1.hello();

            e2 = e1;
            if (x > 0){
                e2.count = e2.count + 1;
            }

            if (x > 1){
                e2.count = e2.count + e1.count;
            }
            x = x + 1;
        }

        System.out.println(e2.count);

        //Solución clase Echo2
        Echo2 ec1 = new Echo2 ();
        Echo2 ec2 = new Echo2 ();

        int y = 0;

        while(y < 4){
            ec1.hello();

            ec2 = ec1;
            if (y > 0){
                ec2.count = ec2.count + 4;
            }
            if (y == 3){
                ec2.count = ec2.count + ec1.count;
            }
            y = y + 1;
        }

        System.out.println(ec2.count);
    }
}