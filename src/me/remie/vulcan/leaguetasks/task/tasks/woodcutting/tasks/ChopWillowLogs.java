package me.remie.vulcan.leaguetasks.task.tasks.woodcutting.tasks;

import me.remie.vulcan.leaguetasks.LeagueScript;
import me.remie.vulcan.leaguetasks.task.LeagueTask;
import me.remie.vulcan.leaguetasks.task.tasks.woodcutting.WoodcuttingCore;
import me.remie.vulcan.leaguetasks.task.tasks.woodcutting.WoodcuttingTree;

/**
 * Created by Reminisce on Mar 08, 2024 at 12:13 AM
 *
 * @author Reminisce <thereminisc3@gmail.com>
 * @Discord reminisce <138751815847116800>
 */
public class ChopWillowLogs extends LeagueTask {

    private final WoodcuttingCore woodcuttingCore;

    public ChopWillowLogs(final LeagueScript script) {
        super(script, "Chop 100 Willow Logs");
        this.woodcuttingCore = new WoodcuttingCore(script, this.getName(), WoodcuttingTree.WILLOW);
    }

    @Override
    public void run() {
        this.woodcuttingCore.run();
    }

}
