package pneumaticCraft.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.oredict.OreDictionary;
import pneumaticCraft.common.block.pneumaticPlants.BlockBurstPlant;
import pneumaticCraft.common.block.pneumaticPlants.BlockChopperPlant;
import pneumaticCraft.common.block.pneumaticPlants.BlockCreeperPlant;
import pneumaticCraft.common.block.pneumaticPlants.BlockEnderPlant;
import pneumaticCraft.common.block.pneumaticPlants.BlockFireFlower;
import pneumaticCraft.common.block.pneumaticPlants.BlockFlyingFlower;
import pneumaticCraft.common.block.pneumaticPlants.BlockHeliumPlant;
import pneumaticCraft.common.block.pneumaticPlants.BlockLightningPlant;
import pneumaticCraft.common.block.pneumaticPlants.BlockPotionPlant;
import pneumaticCraft.common.block.pneumaticPlants.BlockPropulsionPlant;
import pneumaticCraft.common.block.pneumaticPlants.BlockRainPlant;
import pneumaticCraft.common.block.pneumaticPlants.BlockRepulsionPlant;
import pneumaticCraft.common.block.pneumaticPlants.BlockSlimePlant;
import pneumaticCraft.common.block.pneumaticPlants.BlockSquidPlant;
import pneumaticCraft.common.config.Config;
import pneumaticCraft.common.itemBlock.ItemBlockPneumaticCraft;
import pneumaticCraft.common.itemBlock.ItemBlockPressureChamberWall;
import pneumaticCraft.common.thirdparty.ThirdPartyManager;
import pneumaticCraft.lib.Names;
import pneumaticCraft.lib.PneumaticValues;
import pneumaticCraft.lib.Textures;
import cpw.mods.fml.common.registry.GameRegistry;

public class Blockss{

    public static Block pressureTube;
    public static Block airCompressor;
    public static Block airCannon;
    public static Block pressureChamberWall;
    public static Block pressureChamberValve;
    public static Block pressureChamberInterface;
    //public static Block squidPlant;
    //public static Block fireFlower;
    //public static Block creeperPlant;
    //public static Block slimePlant;
    //public static Block rainPlant;
    //public static Block enderPlant;
    //public static Block lightningPlant;
    //public static Block adrenalinePlant;
    //public static Block burstPlant;
    //public static Block potionPlant;
    //public static Block repulsionPlant;
    //public static Block heliumPlant;
    //public static Block flyingFlower;
    //public static Block musicPlant;
    //public static Block propulsionPlant;
    //public static Block chopperPlant;
    public static Block chargingStation;
    public static Block elevatorBase;
    public static Block elevatorFrame;
    public static Block vacuumPump;
    public static Block pneumaticDoorBase;
    public static Block pneumaticDoor;
    public static Block assemblyPlatform;
    public static Block assemblyIOUnit;
    public static Block assemblyDrill;
    public static Block assemblyLaser;
    public static Block assemblyController;
    public static Block advancedPressureTube;
    public static Block compressedIron;
    public static Block uvLightBox;
    public static Block securityStation;
    public static Block universalSensor;
    public static Block universalActuator;
    public static Block aerialInterface;
    public static Block electrostaticCompressor;
    public static Block aphorismTile;
    public static Block omnidirectionalHopper;
    public static Block elevatorCaller;
    public static Block programmer;
    public static Block creativeCompressor;
    public static Block plasticMixer;
    public static Block liquidCompressor;
    public static Block advancedLiquidCompressor;
    public static Block advancedAirCompressor;
    public static Block liquidHopper;
    public static Block droneRedstoneEmitter;
    public static Block heatSink;
    public static Block vortexTube;
    public static Block programmableController;
    public static Block gasLift;
    public static Block refinery;
    public static Block thermopneumaticProcessingPlant;
    public static Block keroseneLamp;
    public static Block keroseneLampLight;
    public static Block sentryTurret;

    public static void init(){
        pressureTube = new BlockPressureTube(Material.iron, PneumaticValues.DANGER_PRESSURE_PRESSURE_TUBE, PneumaticValues.MAX_PRESSURE_PRESSURE_TUBE, PneumaticValues.VOLUME_PRESSURE_TUBE).setBlockName("pressureTube");
        advancedPressureTube = new BlockPressureTube(Material.iron, PneumaticValues.DANGER_PRESSURE_ADVANCED_PRESSURE_TUBE, PneumaticValues.MAX_PRESSURE_ADVANCED_PRESSURE_TUBE, PneumaticValues.VOLUME_ADVANCED_PRESSURE_TUBE).setBlockName("advancedPressureTube");
        airCompressor = new BlockAirCompressor(Material.iron).setBlockName("airCompressor");
        advancedAirCompressor = new BlockAdvancedAirCompressor(Material.iron).setBlockName("advancedAirCompressor");
        airCannon = new BlockAirCannon(Material.iron).setBlockName("airCannon");
        pressureChamberWall = new BlockPressureChamberWall(Material.iron).setResistance(2000.0F).setBlockName("pressureChamberWall");
        pressureChamberValve = new BlockPressureChamberValve(Material.iron).setResistance(2000.0F).setBlockName("pressureChamberValve");
        //slimePlant = new BlockSlimePlant().setBlockName("slimePlant");
        //creeperPlant = new BlockCreeperPlant().setBlockName("creeperPlant");
        //squidPlant = new BlockSquidPlant().setBlockName("squidPlant");
        //fireFlower = new BlockFireFlower().setBlockName("fireFlower");
        //rainPlant = new BlockRainPlant().setBlockName("rainPlant");
        //enderPlant = new BlockEnderPlant().setBlockName("enderPlant");
        //lightningPlant = new BlockLightningPlant().setBlockName("lightningPlant");
        //burstPlant = new BlockBurstPlant().setBlockName("burstPlant");
        //potionPlant = new BlockPotionPlant().setBlockName("potionPlant");
        //heliumPlant = new BlockHeliumPlant().setBlockName("heliumPlant");
        //propulsionPlant = new BlockPropulsionPlant().setBlockName("propulsionPlant");
        //repulsionPlant = new BlockRepulsionPlant().setBlockName("repulsionPlant");
        //flyingFlower = new BlockFlyingFlower().setBlockName("flyingFlower");
        //chopperPlant = new BlockChopperPlant().setBlockName("chopperPlant");
        chargingStation = new BlockChargingStation(Material.iron).setBlockName("chargingStation");
        elevatorBase = new BlockElevatorBase(Material.iron).setBlockName("elevatorBase");
        elevatorFrame = new BlockElevatorFrame(Material.iron).setBlockName("elevatorFrame");
        pressureChamberInterface = new BlockPressureChamberInterface(Material.iron).setResistance(2000.0F).setBlockName("pressureChamberInterface");
        vacuumPump = new BlockVacuumPump(Material.iron).setBlockName("vacuumPump");
        pneumaticDoorBase = new BlockPneumaticDoorBase(Material.iron).setBlockName("pneumaticDoorBase");
        pneumaticDoor = new BlockPneumaticDoor(Material.iron).setBlockName("pneumaticDoor");
        assemblyIOUnit = new BlockAssemblyIOUnit(Material.iron).setBlockName("assemblyIOUnit");
        assemblyPlatform = new BlockAssemblyPlatform(Material.iron).setBlockName("assemblyPlatform");
        assemblyDrill = new BlockAssemblyDrill(Material.iron).setBlockName("assemblyDrill");
        assemblyLaser = new BlockAssemblyLaser(Material.iron).setBlockName("assemblyLaser");
        assemblyController = new BlockAssemblyController(Material.iron).setBlockName("assemblyController");
        compressedIron = new BlockCompressedIron(Material.iron).setBlockTextureName(Textures.BLOCK_COMPRESSED_IRON).setStepSound(Block.soundTypeMetal).setBlockName("compressedIronBlock");
        uvLightBox = new BlockUVLightBox(Material.iron).setBlockName("uvLightBox");
        securityStation = new BlockSecurityStation(Material.iron).setBlockName("securityStation");
        universalSensor = new BlockUniversalSensor(Material.iron).setBlockName("universalSensor");
        universalActuator = new BlockUniversalActuator(Material.iron).setBlockName("universalActuator");
        aerialInterface = new BlockAerialInterface(Material.iron).setBlockName("aerialInterface");
        electrostaticCompressor = new BlockElectrostaticCompressor(Material.iron).setBlockName("electrostaticCompressor");
        aphorismTile = new BlockAphorismTile(Material.rock).setHardness(1.5F).setResistance(4.0F).setBlockName("aphorismTile");
        omnidirectionalHopper = new BlockOmnidirectionalHopper(Material.iron).setBlockName("omnidirectionalHopper");
        liquidHopper = new BlockLiquidHopper(Material.iron).setBlockName("liquidHopper");
        elevatorCaller = new BlockElevatorCaller(Material.iron).setBlockName("elevatorCaller");
        programmer = new BlockProgrammer(Material.iron).setBlockName("programmer");
        creativeCompressor = new BlockCreativeCompressor(Material.iron).setBlockName("creativeCompressor");
        plasticMixer = new BlockPlasticMixer(Material.iron).setBlockName("plasticMixer");
        liquidCompressor = new BlockLiquidCompressor(Material.iron).setBlockName("liquidCompressor");
        advancedLiquidCompressor = new BlockAdvancedLiquidCompressor(Material.iron).setBlockName("advancedLiquidCompressor");
        droneRedstoneEmitter = new BlockDroneRedstoneEmitter().setBlockName("droneRedstoneEmitter");
        heatSink = new BlockHeatSink(Material.iron).setBlockName("heatSink");
        vortexTube = new BlockVortexTube(Material.iron).setBlockName("vortexTube");
        programmableController = new BlockProgrammableController(Material.iron).setBlockName("programmableController");
        gasLift = new BlockGasLift(Material.iron).setBlockName("gasLift");
        refinery = new BlockRefinery(Material.iron).setBlockName("refinery");
        thermopneumaticProcessingPlant = new BlockThermopneumaticProcessingPlant(Material.iron).setBlockName("thermopneumaticProcessingPlant");
        keroseneLamp = new BlockKeroseneLamp(Material.iron).setBlockName("keroseneLamp");
        keroseneLampLight = new BlockKeroseneLampLight().setBlockName("keroseneLampLight");
        sentryTurret = new BlockSentryTurret(Material.iron).setBlockName("sentryTurret");

        registerBlocks();

        OreDictionary.registerOre(Names.BLOCK_IRON_COMPRESSED, compressedIron);
    }

    private static void registerBlocks(){
        registerBlock(pressureTube);
        registerBlock(airCompressor);
        registerBlock(advancedAirCompressor);
        registerBlock(airCannon);
        registerBlock(pressureChamberWall, ItemBlockPressureChamberWall.class);//TODO legacy remove item block.
        registerBlock(pressureChamberValve);
        //registerBlock(slimePlant);
        //registerBlock(creeperPlant);
        //registerBlock(squidPlant);
        //registerBlock(fireFlower);
        //registerBlock(rainPlant);
        //registerBlock(enderPlant);
        //registerBlock(lightningPlant);
        //registerBlock(burstPlant);
        //registerBlock(potionPlant);
        //registerBlock(heliumPlant);
        //registerBlock(propulsionPlant);
        //registerBlock(repulsionPlant);
        //registerBlock(flyingFlower);
        //registerBlock(chopperPlant);
        registerBlock(chargingStation);
        registerBlock(elevatorBase);
        registerBlock(elevatorFrame);
        registerBlock(pressureChamberInterface);
        registerBlock(vacuumPump);
        registerBlock(pneumaticDoorBase);
        registerBlock(pneumaticDoor);
        registerBlock(assemblyIOUnit);
        registerBlock(assemblyPlatform);
        registerBlock(assemblyDrill);
        registerBlock(assemblyLaser);
        registerBlock(assemblyController);
        registerBlock(advancedPressureTube);
        registerBlock(compressedIron);
        registerBlock(uvLightBox);
        registerBlock(securityStation);
        registerBlock(universalSensor);
        //     registerBlock(universalActuator);
        registerBlock(aerialInterface);
        registerBlock(electrostaticCompressor);
        registerBlock(aphorismTile);
        registerBlock(omnidirectionalHopper);
        registerBlock(liquidHopper);
        registerBlock(elevatorCaller);
        registerBlock(programmer);
        registerBlock(creativeCompressor);
        registerBlock(plasticMixer);
        registerBlock(liquidCompressor);
        registerBlock(advancedLiquidCompressor);
        registerBlock(droneRedstoneEmitter);
        registerBlock(heatSink);
        registerBlock(vortexTube);
        registerBlock(programmableController);
        registerBlock(gasLift);
        registerBlock(refinery);
        registerBlock(thermopneumaticProcessingPlant);
        registerBlock(keroseneLamp);
        if(!Config.disableKeroseneLampFakeAirBlock) registerBlock(keroseneLampLight);
        registerBlock(sentryTurret);
    }

    public static void registerBlock(Block block){
        registerBlock(block, ItemBlockPneumaticCraft.class);
    }

    private static void registerBlock(Block block, Class<? extends ItemBlockPneumaticCraft> itemBlockClass){
        GameRegistry.registerBlock(block, itemBlockClass, block.getUnlocalizedName().substring("tile.".length()));
        ThirdPartyManager.instance().onBlockRegistry(block);
    }
}