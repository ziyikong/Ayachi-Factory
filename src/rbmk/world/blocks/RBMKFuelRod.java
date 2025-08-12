package rbmk.world.blocks;
import arc.util.*;
import mindustry.world.*;
import mindustry.world.meta.*;
import rbmk.content.RBMKStats;

public class RBMKFuelRod extends Block {
    public float baseHeat = 8f;
    public float baseNeutron = 2f;

    public RBMKFuelRod(String name){
        super(name);
        update = true;
        solid = true;
    }

    @Override
    public void setStats(){
        super.setStats();
        stats.add(Stat.basePowerGeneration, baseHeat, StatUnit.powerSecond);
    }

    public class RBMKFuelRodBuild extends Building {
        @Override
        public void updateTile(){
            // 每 tick 产生热量与中子
            float k = nearby() > 0 ? 1.2f : 1f; // 靠近慢化剂时倍增
            RBMKStats.neutronFlux += baseNeutron * k;
            heat(baseHeat * k);
        }
    }
}