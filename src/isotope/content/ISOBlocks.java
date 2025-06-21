package isotope.content;

import arc.Core;
import arc.Events;
import arc.graphics.Color;
import arc.graphics.g2d.Draw;
import arc.graphics.g2d.Fill;
import arc.graphics.g2d.Lines;
import arc.graphics.g2d.TextureRegion;
import arc.math.Angles;
import arc.math.Interp;
import arc.math.Mathf;
import arc.math.Rand;
import arc.math.geom.Geometry;
import arc.math.geom.Position;
import arc.math.geom.Rect;
import arc.math.geom.Vec2;
import arc.scene.style.TextureRegionDrawable;
import arc.scene.ui.Image;
import arc.scene.ui.layout.Stack;
import arc.scene.ui.layout.Table;
import arc.struct.ObjectMap;
import arc.struct.Seq;
import arc.util.*;
import mindustry.Vars;
import mindustry.content.*;
import mindustry.entities.Effect;
import mindustry.entities.Mover;
import mindustry.entities.Units;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.entities.units.BuildPlan;
import mindustry.game.EventType;
import mindustry.game.Team;
import mindustry.gen.*;
import mindustry.graphics.Drawf;
import mindustry.graphics.Layer;
import mindustry.graphics.Pal;
import mindustry.graphics.Trail;
import mindustry.type.*;
import mindustry.ui.Styles;
import mindustry.world.Block;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.DirectionLiquidBridge;
import mindustry.world.blocks.distribution.DuctBridge;
import mindustry.world.blocks.distribution.MassDriver;
import mindustry.world.blocks.heat.*;
import mindustry.world.blocks.liquid.ArmoredConduit;
import mindustry.world.blocks.liquid.LiquidBlock;
import mindustry.world.blocks.power.ConsumeGenerator;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.units.Reconstructor;
import mindustry.world.blocks.units.UnitAssemblerModule;
import mindustry.world.blocks.units.UnitFactory;
import mindustry.world.consumers.ConsumeLiquid;
import mindustry.world.consumers.ConsumeLiquidFlammable;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

import static arc.graphics.g2d.Draw.*;
import static arc.math.Angles.randLenVectors;
import static mindustry.Vars.*;

import static mindustry.content.Fx.*;
import static mindustry.type.ItemStack.*;
public class ISOBlocks {
    public static Block 
            isotopeReactor = new IsotopeReactor("isotope-reactor"){{
            requirements(Category.power, with(Items.copper, 30));
            size = 1;
            powerProduction = 1f;
            ores.put(oreCopper, 0.9f);
            ores.put(oreLead, 3f);
            ores.put(oreCoal, 1.2f);
            ores.put(oreTitanium, 2.5f);
        }};
}
