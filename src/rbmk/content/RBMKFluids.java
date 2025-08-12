package rbmk.content;
import mindustry.type.*;
import mindustry.content.Liquids;
import rbmk.RBMKMod;

public class RBMKFluids {
    public static Liquid steam;

    public static void load(){
        steam = new Liquid("rbmk-steam", Liquids.water.color.cpy().lerp(Color.lightGray, 0.4f)){{
            heatCapacity = 0.4f;   // 蒸汽比热容
            temperature = 0.6f;
            gas = true;
        }};
    }
}