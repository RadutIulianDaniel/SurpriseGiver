package Give;

import Surprise.GatherSurprises;
import java.util.concurrent.TimeUnit;

public class GiveSurpriseAndSing extends AbstractGiveSurprises {
    public GiveSurpriseAndSing(String bagType, int waitTime){
        super(bagType, waitTime);
    }
    @Override
    public void giveWithPassion(){
        System.out.println("Singing a nice song, full of joy and genuine excitement...");
    }
}
