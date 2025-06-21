package isotope.content;

import arc.struct.*;
import mindustry.Vars;
import mindustry.content.*;
import mindustry.ctype.*;
import mindustry.game.Objectives.*;
import mindustry.type.*;

import static mindustry.content.Blocks.*;
import static mindustry.content.TechTree.*;
import static isotope.content.DDBlocks;

public class ISOTechTree {
    public static TechNode context = null;
    public static void load() {
        addToNode(mechanicalDrill, () -> node(isotopeReactor));
}
