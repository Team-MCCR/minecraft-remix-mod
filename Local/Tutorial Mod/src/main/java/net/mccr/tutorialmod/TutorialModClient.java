package net.mccr.tutorialmod;

import net.fabricmc.api.ClientModInitializer;
import net.mccr.tutorialmod.block.ModBlocks;
import net.mccr.tutorialmod.item.ModItems;

public class TutorialModClient implements ClientModInitializer {


    @Override
    public void onInitializeClient() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        
    }
}
