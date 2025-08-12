package rbmk.world.blocks;
import arc.util.*;
import mindustry.world.*;
import rbmk.content.RBMKStats;

public class RBMKModerator extends Block {
    public float reflectFactor = 1.4f;

    public RBMKModerator(String name){
        super(name);
        update = true;
        solid = true;
    }

    public class RBMKModeratorBuild extends Building {
        @Override
        public void updateTile(){
            // 慢化剂把快中子变成慢中子，提高通量
            if(RBMKStats.neutronFlux > 0){
                RBMKStats.neutronFlux *= reflectFactor;
            }
        }
    }
}