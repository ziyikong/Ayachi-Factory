package rbmk;
import mindustry.mod.Mod;
import rbmk.content.*;

public class RBMKMod extends Mod {
    @Override
    public void loadContent(){
        RBMKFluids.load();
        RBMKBlocks.load();
    }
}