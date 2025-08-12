package rbmk.content;
import mindustry.world.Block;
import rbmk.world.blocks.*;

public class RBMKBlocks {
    public static Block
            fuelRod,
            moderator,
            boiler;

    public static void load(){
        fuelRod   = new RBMKFuelRod("rbmk-fuel-rod");
        moderator = new RBMKModerator("rbmk-moderator");
        boiler    = new RBMKBoiler("rbmk-boiler");
    }
}