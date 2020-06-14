package com.mitchej123.hodgepodge.loader;

import com.mitchej123.hodgepodge.loader.util.ClassRef;

public class References {

    public static ClassRef cIBlockAccess, cBlockDoublePlant;
    public static ClassRef gt_API;
    public static ClassRef cHogClient, cRenderBlocks, cBlock;
    public static ClassRef bopFoliageRenderer;

    static
    {
        gt_API = new ClassRef("gregtech.api.GregTech_API");
        gt_API.addMethod("getClientPollutionAt", ClassRef.INT, ClassRef.INT, ClassRef.INT);

        cHogClient = new ClassRef("com.mitchej123.hodgepodge.core.HodgePodgeClient");
        cIBlockAccess = new ClassRef("net.minecraft.world.IBlockAccess", "ahl");
        cBlock = new ClassRef("net.minecraft.block.Block", "aji");

        cRenderBlocks = new ClassRef("net.minecraft.client.renderer.RenderBlocks", "blm");
        cRenderBlocks.addMethod("renderStandardBlock", "func_147784_q", "q", ClassRef.BOOLEAN, cBlock, ClassRef.INT, ClassRef.INT, ClassRef.INT);
        cHogClient.addMethod("renderStandardBlock_colorMultiplier", ClassRef.INT, ClassRef.INT, cBlock, ClassRef.INT, ClassRef.INT);

        cRenderBlocks.addMethod("renderBlockLiquid", "func_147721_p", "p", ClassRef.BOOLEAN, cBlock, ClassRef.INT, ClassRef.INT, ClassRef.INT);
        cHogClient.addMethod("renderBlockLiquid_colorMultiplier", ClassRef.INT, ClassRef.INT, cBlock, ClassRef.INT, ClassRef.INT);

        cBlockDoublePlant = new ClassRef("net.minecraft.block.BlockDoublePlant", "ako");
        cRenderBlocks.addMethod("renderBlockDoublePlant", "func_147774_a", "a", ClassRef.BOOLEAN, cBlockDoublePlant, ClassRef.INT, ClassRef.INT, ClassRef.INT);
        cHogClient.addMethod("renderBlockDoublePlant_colorMultiplier", ClassRef.INT, ClassRef.INT, cBlock, ClassRef.INT, ClassRef.INT);

        cRenderBlocks.addMethod("renderCrossedSquares", "func_147746_l", "l", ClassRef.BOOLEAN, cBlock, ClassRef.INT, ClassRef.INT, ClassRef.INT);
        cHogClient.addMethod("renderCrossedSquares_colorMultiplier", ClassRef.INT, ClassRef.INT, cBlock, ClassRef.INT, ClassRef.INT);

        cRenderBlocks.addMethod("renderBlockVine", "func_147726_j", "j", ClassRef.BOOLEAN, cBlock, ClassRef.INT, ClassRef.INT, ClassRef.INT);
        cHogClient.addMethod("renderBlockVine_colorMultiplier", ClassRef.INT, ClassRef.INT, cBlock, ClassRef.INT, ClassRef.INT);

        bopFoliageRenderer = new ClassRef("biomesoplenty.client.render.blocks.FoliageRenderer");
        bopFoliageRenderer.addMethod("renderCrossedSquares", ClassRef.BOOLEAN, cBlock, ClassRef.INT, ClassRef.INT, ClassRef.INT, cRenderBlocks);
    }
}