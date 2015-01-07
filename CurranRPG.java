//Welcome to my RPG!  
//Go ahead and browse around :)

//Import
import hsa.*;
import java.io.File;
import java.io.IOException;
import java.awt.image.*;
import javax.imageio.*;
import javax.sound.sampled.*;

public class CurranRPG{
	public static void main(String[]args){
		//Standard main console
		Console map = new Console(20,55, "The Legend of The World God Only Knows");
		
		//Load audio
		File sndPath1 = new File("Songs/MainScreen.wav");
		Clip clip1 = null;
		AudioInputStream sndInputStream1 = null;
		DataLine.Info info1 = null;
		File sndPath2 = new File("Songs/Tutorial.wav");
		Clip clip2 = null;
		AudioInputStream sndInputStream2 = null;
		DataLine.Info info2 = null;
		File sndPath3 = new File("Songs/GameOver.wav");
		Clip clip3 = null;
		AudioInputStream sndInputStream3 = null;
		DataLine.Info info3 = null;
		File sndPath4 = new File("Songs/Boss.wav");
		Clip clip4 = null;
		AudioInputStream sndInputStream4 = null;
		DataLine.Info info4 = null;
		File sndPath5 = new File("Songs/Map1.wav");
		Clip clip5 = null;
		AudioInputStream sndInputStream5 = null;
		DataLine.Info info5 = null;
		
		try{
			sndInputStream1 = AudioSystem.getAudioInputStream(sndPath1);
			info1 = new DataLine.Info(Clip.class, sndInputStream1.getFormat());
			clip1 = (Clip) AudioSystem.getLine(info1);
			clip1.open(sndInputStream1);
			
			sndInputStream2 = AudioSystem.getAudioInputStream(sndPath2);
			info2 = new DataLine.Info(Clip.class, sndInputStream2.getFormat());
			clip2 = (Clip) AudioSystem.getLine(info2);
			clip2.open(sndInputStream2);
			
			sndInputStream3 = AudioSystem.getAudioInputStream(sndPath3);
			info3 = new DataLine.Info(Clip.class, sndInputStream3.getFormat());
			clip3 = (Clip) AudioSystem.getLine(info3);
			clip3.open(sndInputStream3);
			
			sndInputStream4 = AudioSystem.getAudioInputStream(sndPath4);
			info4 = new DataLine.Info(Clip.class, sndInputStream4.getFormat());
			clip4 = (Clip) AudioSystem.getLine(info4);
			clip4.open(sndInputStream4);
			
			sndInputStream5 = AudioSystem.getAudioInputStream(sndPath5);
			info5 = new DataLine.Info(Clip.class, sndInputStream5.getFormat());
			clip5 = (Clip) AudioSystem.getLine(info5);
			clip5.open(sndInputStream5);
			
		}catch(Exception e){	
		}
		File logofile = null;
		BufferedImage logoimage = null;
		File tutorialfile = null;
		BufferedImage tutorialimage = null;
		
		//Tutorial
		File tutorialfile1 = null;
		BufferedImage tutorialimage1 = null;
		File tutorialfile2 = null;
		BufferedImage tutorialimage2 = null;
		File tutorialfile3 = null;
		BufferedImage tutorialimage3 = null;
		File tutorialfile4 = null;
		BufferedImage tutorialimage4 = null;
		File tutorialfile5 = null;
		BufferedImage tutorialimage5 = null;
		File tutorialfile6 = null;
		BufferedImage tutorialimage6 = null;
		File tutorialfile7 = null;
		BufferedImage tutorialimage7 = null;
		File tutorialfile8 = null;
		BufferedImage tutorialimage8 = null;
		
		//stats
		File statsfile = null;
		BufferedImage statsimage = null;
		File weapfile1 = null;
		BufferedImage weapimage1 = null;
		File weapfile2 = null;
		BufferedImage weapimage2 = null;
		File weapfile3 = null;
		BufferedImage weapimage3 = null;
		File weapfile4 = null;
		BufferedImage weapimage4 = null;
		File weapfile5 = null;
		BufferedImage weapimage5 = null;
		File weapfile6 = null;
		BufferedImage weapimage6 = null;
		
		//ALL battle system images
		File Encounterfile = null;
		BufferedImage Encounterimage = null;
		File batffile = null;
		BufferedImage batfimage = null;
		File batdfile = null;
		BufferedImage batdimage = null;
		File bunnyffile = null;
		BufferedImage bunnyfimage = null;
		File bunnydfile = null;
		BufferedImage bunnydimage = null;
		File chickenffile = null;
		BufferedImage chickenfimage = null;
		File chickendfile = null;
		BufferedImage chickendimage = null;
		File guardianffile = null;
		BufferedImage guardianfimage = null;
		File guardiandfile = null;
		BufferedImage guardiandimage = null;
		File mageffile = null;
		BufferedImage magefimage = null;
		File magedfile = null;
		BufferedImage magedimage = null;
		File octopusffile = null;
		BufferedImage octopusfimage = null;
		File octopusdfile = null;
		BufferedImage octopusdimage = null;
		File redffile = null;
		BufferedImage redfimage = null;
		File reddfile = null;
		BufferedImage reddimage = null;
		File snakeffile = null;
		BufferedImage snakefimage = null;
		File snakedfile = null;
		BufferedImage snakedimage = null;
		File spiderffile = null;
		BufferedImage spiderfimage = null;
		File spiderdfile = null;
		BufferedImage spiderdimage = null;
		
		//Battle (BOSS)
		File satanfile1 = null;
		BufferedImage satanimage1 = null;
		File satanfile2 = null;
		BufferedImage satanimage2 = null;
		File satanfile3 = null;
		BufferedImage satanimage3 = null;
		File satanfile4 = null;
		BufferedImage satanimage4 = null;
		File satanfile5 = null;
		BufferedImage satanimage5 = null;
		File satanffile = null;
		BufferedImage satanfimage = null;
		File defeatfile1 = null;
		BufferedImage defeatimage1 = null;
		File defeatfile2 = null;
		BufferedImage defeatimage2 = null;
		File defeatfile3 = null;
		BufferedImage defeatimage3 = null;
		File defeatfile4 = null;
		BufferedImage defeatimage4 = null;
		File defeatfile5 = null;
		BufferedImage defeatimage5 = null;
		File defeatfile6 = null;
		BufferedImage defeatimage6 = null;
		File defeatfile7 = null;
		BufferedImage defeatimage7 = null;
		
		//Devil NPC
		File devilfile3 = null;
		BufferedImage devilimage3 = null;
		File devilfile4 = null;
		BufferedImage devilimage4 = null;
		File devilfile5 = null;
		BufferedImage devilimage5 = null;
		File devilfile6 = null;
		BufferedImage devilimage6 = null;
		File devilfile7 = null;
		BufferedImage devilimage7 = null;
		File devilfile8 = null;
		BufferedImage devilimage8 = null;
		File devilfile9 = null;
		BufferedImage devilimage9 = null;
		File devilfile10 = null;
		BufferedImage devilimage10 = null;
		File devilfile11 = null;
		BufferedImage devilimage11 = null;
		File devilfile12 = null;
		BufferedImage devilimage12 = null;
		File devilfile13 = null;
		BufferedImage devilimage13 = null;
		File devilfile14 = null;
		BufferedImage devilimage14 = null;
		File devilfile15 = null;
		BufferedImage devilimage15 = null;
		File devilfile16 = null;
		BufferedImage devilimage16 = null;
		File devilfile17 = null;
		BufferedImage devilimage17 = null;
		File devilfile18 = null;
		BufferedImage devilimage18 = null;
		
		//Goddess
		File goddessfile3 = null;
		BufferedImage goddessimage3 = null;
		File goddessfile4 = null;
		BufferedImage goddessimage4 = null;
		File goddessfile5 = null;
		BufferedImage goddessimage5 = null;
		File goddessfile6 = null;
		BufferedImage goddessimage6 = null;
		File goddessfile7 = null;
		BufferedImage goddessimage7 = null;
		File goddessfile8 = null;
		BufferedImage goddessimage8 = null;
		File goddessfile9 = null;
		BufferedImage goddessimage9 = null;
		File goddessfile10 = null;
		BufferedImage goddessimage10 = null;
		File goddessfile11 = null;
		BufferedImage goddessimage11 = null;
		File goddessfile12 = null;
		BufferedImage goddessimage12 = null;
		File goddessfile13 = null;
		BufferedImage goddessimage13 = null;
		File goddessfile14 = null;
		BufferedImage goddessimage14 = null;
		File goddessfile15 = null;
		BufferedImage goddessimage15 = null;
		
		
		//God of conquest speaking
		File keimaintrofile = null;
		BufferedImage keimaintroimage = null;
		File keimafile = null;
		BufferedImage keimaimage = null;
		File keimafile1 = null;
		BufferedImage keimaimage1 = null;
		File keimafile2 = null;
		BufferedImage keimaimage2 = null;
		File keimafile3 = null;
		BufferedImage keimaimage3 = null;
		File keimafile4 = null;
		BufferedImage keimaimage4 = null;
		File keimafile5 = null;
		BufferedImage keimaimage5 = null;
		File keimafile6 = null;
		BufferedImage keimaimage6 = null;
		File keimafile7 = null;
		BufferedImage keimaimage7 = null;
		File keimafile8 = null;
		BufferedImage keimaimage8 = null;
		File keimafile9 = null;
		BufferedImage keimaimage9 = null;
		
		//MAP 1
		//fences
		File fencefile = null;
		BufferedImage fenceimage = null;
		File fencefile1 = null;
		BufferedImage fenceimage1 = null;
		File fencefile2 = null;
		BufferedImage fenceimage2 = null;
		File fencefile3 = null;
		BufferedImage fenceimage3 = null;
		File fencefile4 = null;
		BufferedImage fenceimage4 = null;
		File fencefileB = null;
		BufferedImage fenceimageB = null;
		File fencefileC = null;
		BufferedImage fenceimageC = null;
		//grass
		File grassfile = null;
		BufferedImage grassimage = null;
		//tree
		File treefile = null;
		BufferedImage treeimage = null;
		//flower
		File flowerfile = null;
		BufferedImage flowerimage = null;
		//water
		File waterfile = null;
		BufferedImage waterimage = null;
		File waterfileC1 = null;
		BufferedImage waterimageC1 = null;
		File waterfileC2 = null;
		BufferedImage waterimageC2 = null;
		File waterfileL1 = null;
		BufferedImage waterimageL1 = null;
		File waterfileL2 = null;
		BufferedImage waterimageL2 = null;
		File waterfileL3 = null;
		BufferedImage waterimageL3 = null;
		File waterfileM1 = null;
		BufferedImage waterimageM1 = null;
		File waterfileM2 = null;
		BufferedImage waterimageM2 = null;
		File waterfileR1 = null;
		BufferedImage waterimageR1 = null;
		File waterfileR2 = null;
		BufferedImage waterimageR2 = null;
		File waterfileR3 = null;
		BufferedImage waterimageR3 = null;
		//home
		File homefile1 = null;
		BufferedImage homeimage1 = null;
		File homefile2 = null;
		BufferedImage homeimage2 = null;
		File homefile3 = null;
		BufferedImage homeimage3 = null;
		File homefile4 = null;
		BufferedImage homeimage4 = null;
		File homefile5 = null;
		BufferedImage homeimage5 = null;
		File homefile6 = null;
		BufferedImage homeimage6 = null;
		File homefile7 = null;
		BufferedImage homeimage7 = null;
		File homefile8 = null;
		BufferedImage homeimage8 = null;
		File homefile9 = null;
		BufferedImage homeimage9 = null;
		File homefile10 = null;
		BufferedImage homeimage10 = null;
		File homefile11 = null;
		BufferedImage homeimage11 = null;
		File homefile12 = null;
		BufferedImage homeimage12 = null;
		File homefile13 = null;
		BufferedImage homeimage13 = null;
		File homefile14 = null;
		BufferedImage homeimage14 = null;
		File homefile15 = null;
		BufferedImage homeimage15 = null;
		File homefile16 = null;
		BufferedImage homeimage16 = null;
		File homefile17 = null;
		BufferedImage homeimage17 = null;
		File homefile18 = null;
		BufferedImage homeimage18 = null;
		File homefile19 = null;
		BufferedImage homeimage19 = null;
		File homefile20 = null;
		BufferedImage homeimage20 = null;
		File homefile21 = null;
		BufferedImage homeimage21 = null;
		File homefile23 = null;
		BufferedImage homeimage23 = null;
		File homefile24 = null;
		BufferedImage homeimage24 = null;
		File homefile25 = null;
		BufferedImage homeimage25 = null;
		//Weapon shop
		File shopfile1 = null;
		BufferedImage shopimage1 = null;
		File shopfile2 = null;
		BufferedImage shopimage2 = null;
		File shopfile3 = null;
		BufferedImage shopimage3 = null;
		File shopfile4 = null;
		BufferedImage shopimage4 = null;
		File shopfile5 = null;
		BufferedImage shopimage5 = null;
		File shopfile6 = null;
		BufferedImage shopimage6 = null;
		File shopfile7 = null;
		BufferedImage shopimage7 = null;
		File shopfile8 = null;
		BufferedImage shopimage8 = null;
		File shopfile9 = null;
		BufferedImage shopimage9 = null;
		File shopfile10 = null;
		BufferedImage shopimage10 = null;
		File shopfile11 = null;
		BufferedImage shopimage11 = null;
		File shopfile12 = null;
		BufferedImage shopimage12 = null;
		File shopfile13 = null;
		BufferedImage shopimage13 = null;
		File shopfile14 = null;
		BufferedImage shopimage14 = null;
		File shopfile15 = null;
		BufferedImage shopimage15 = null;
		File shopfile16 = null;
		BufferedImage shopimage16 = null;
		
		//inside weapon shop
		File wshopfile1 = null;
		BufferedImage wshopimage1 = null;
		File wshopfile2 = null;
		BufferedImage wshopimage2 = null;
		File wshopfile3 = null;
		BufferedImage wshopimage3 = null;
		File wshopfile4 = null;
		BufferedImage wshopimage4 = null;
		File wshopfile5 = null;
		BufferedImage wshopimage5 = null;
		File wshopfile6 = null;
		BufferedImage wshopimage6 = null;
		File wshopfile7 = null;
		BufferedImage wshopimage7 = null;
		File wshopfile8 = null;
		BufferedImage wshopimage8 = null;
		File wshopfile9 = null;
		BufferedImage wshopimage9 = null;
		File wshopfile10 = null;
		BufferedImage wshopimage10 = null;
		
		//hero
		File herofileU = null;
		BufferedImage heroimageU = null;
		File herofileD = null;
		BufferedImage heroimageD = null;
		File herofileL = null;
		BufferedImage heroimageL = null;
		File herofileR = null;
		BufferedImage heroimageR = null;
		
		//monsters
		File monsterfile1 = null;
		BufferedImage monsterimage1 = null;
		File monsterfile2 = null;
		BufferedImage monsterimage2 = null;
		
		//MAP 2
		//Monsters (all maps)
		File monsterfile3 = null;
		BufferedImage monsterimage3 = null;
		File monsterfile4 = null;
		BufferedImage monsterimage4 = null;
		File monsterfile5 = null;
		BufferedImage monsterimage5 = null;
		File monsterfile6 = null;
		BufferedImage monsterimage6 = null;
		File monsterfile7 = null;
		BufferedImage monsterimage7 = null;
		File monsterfile8 = null;
		BufferedImage monsterimage8 = null;
		File monsterfile9 = null;
		BufferedImage monsterimage9 = null;
		
		//Devil NPC
		File devilfile = null;
		BufferedImage devilimage = null;
		
		//Cave
		File cavefile = null;
		BufferedImage caveimage = null;
		File cavefileE = null;
		BufferedImage caveimageE = null;
		File cavefileL = null;
		BufferedImage caveimageL = null;
		File cavefileR = null;
		BufferedImage caveimageR = null;
		
		//dirt
		File dirtfile = null;
		BufferedImage dirtimage = null;
		
		//road
		File roadfile1 = null;
		BufferedImage roadimage1 = null;
		File roadfile2 = null;
		BufferedImage roadimage2 = null;
		
		//stone
		File stonefile = null;
		BufferedImage stoneimage = null;
		
		//statue
		File statuefile1 = null;
		BufferedImage statueimage1 = null;
		File statuefile2 = null;
		BufferedImage statueimage2 = null;
		
		//Secret Map stuff (map 3)
		File bushfile = null;
		BufferedImage bushimage = null;
		
		//Fairy NPC
		File fairyfile1 = null;
		BufferedImage fairyimage1 = null;
		File fairyfile2 = null;
		BufferedImage fairyimage2 = null;
		File fairyfile3 = null;
		BufferedImage fairyimage3 = null;
		File fairyfile4 = null;
		BufferedImage fairyimage4 = null;
		File fairyfile5 = null;
		BufferedImage fairyimage5 = null;
		File fairyfile6 = null;
		BufferedImage fairyimage6 = null;
		
		//Heart (heal)
		File heartfile = null;
		BufferedImage heartimage = null;
		
		//Giant tree
		File gianttreefile1 = null;
		BufferedImage gianttreeimage1 = null;
		File gianttreefile2 = null;
		BufferedImage gianttreeimage2 = null;
		File gianttreefile3 = null;
		BufferedImage gianttreeimage3 = null;
		File gianttreefile4 = null;
		BufferedImage gianttreeimage4 = null;
		File gianttreefile5 = null;
		BufferedImage gianttreeimage5 = null;
		File gianttreefile6 = null;
		BufferedImage gianttreeimage6 = null;
		File gianttreefile7 = null;
		BufferedImage gianttreeimage7 = null;
		File gianttreefile8 = null;
		BufferedImage gianttreeimage8 = null;
		File gianttreefile9 = null;
		BufferedImage gianttreeimage9 = null;
		File gianttreefile10 = null;
		BufferedImage gianttreeimage10 = null;
		File gianttreefile11 = null;
		BufferedImage gianttreeimage11 = null;
		File gianttreefile12 = null;
		BufferedImage gianttreeimage12 = null;
		
		//Final map (map 4; boss)
		//boss
		File bossfile1 = null;
		BufferedImage bossimage1 = null;
		File bossfile2 = null;
		BufferedImage bossimage2 = null;
		File bossfile3 = null;
		BufferedImage bossimage3 = null;
		File bossfile4 = null;
		BufferedImage bossimage4 = null;
		
		//bridge
		File bridgefile1 = null;
		BufferedImage bridgeimage1 = null;
		File bridgefile2 = null;
		BufferedImage bridgeimage2 = null;
		File bridgefile3 = null;
		BufferedImage bridgeimage3 = null;
		File bridgefile4 = null;
		BufferedImage bridgeimage4 = null;
		File bridgefile5 = null;
		BufferedImage bridgeimage5 = null;
		File bridgefile6 = null;
		BufferedImage bridgeimage6 = null;
		File bridgefile7 = null;
		BufferedImage bridgeimage7 = null;
		File bridgefile8 = null;
		BufferedImage bridgeimage8 = null;
		File bridgefile9 = null;
		BufferedImage bridgeimage9 = null;
		File bridgefile10 = null;
		BufferedImage bridgeimage10 = null;
		File bridgefile11 = null;
		BufferedImage bridgeimage11 = null;
		File bridgefile12 = null;
		BufferedImage bridgeimage12 = null;
		File bridgefile13 = null;
		BufferedImage bridgeimage13 = null;
		File bridgefile14 = null;
		BufferedImage bridgeimage14 = null;
		File bridgefile15 = null;
		BufferedImage bridgeimage15 = null;
		File bridgefile16 = null;
		BufferedImage bridgeimage16 = null;
		File bridgefile17 = null;
		BufferedImage bridgeimage17 = null;
		File bridgefile18 = null;
		BufferedImage bridgeimage18 = null;
		File bridgefile19 = null;
		BufferedImage bridgeimage19 = null;
		File bridgefile20 = null;
		BufferedImage bridgeimage20 = null;
		
		//ground
		File groundfile = null;
		BufferedImage groundimage = null;
		
		//inside cave
		File icavefile = null;
		BufferedImage icaveimage = null;
		File icavefileE = null;
		BufferedImage icaveimageE = null;
		File icavefileE2 = null;
		BufferedImage icaveimageE2 = null;
		File icavefileE3 = null;
		BufferedImage icaveimageE3 = null;
		
		//long tree
		File longtreefile1 = null;
		BufferedImage longtreeimage1 = null;
		File longtreefile2 = null;
		BufferedImage longtreeimage2 = null;
		File longtreefile3 = null;
		BufferedImage longtreeimage3 = null;
		
		//tile
		File tilefile = null;
		BufferedImage tileimage = null;
		
		//game over
		File gameoverfile = null;
		BufferedImage gameoverimage = null;
		
		try{	
			
			//Stats
			statsfile = new File("Maps/Stats.png");
			statsimage = ImageIO.read(statsfile);
			
			//Tutorial
			tutorialfile1 = new File("Tutorial/Tutorial1.png");
			tutorialimage1 = ImageIO.read(tutorialfile1);
			tutorialfile2 = new File("Tutorial/Tutorial2.png");
			tutorialimage2 = ImageIO.read(tutorialfile2);
			tutorialfile3 = new File("Tutorial/Tutorial3.png");
			tutorialimage3 = ImageIO.read(tutorialfile3);
			tutorialfile4 = new File("Tutorial/Tutorial4.png");
			tutorialimage4 = ImageIO.read(tutorialfile4);
			tutorialfile5 = new File("Tutorial/Tutorial5.png");
			tutorialimage5 = ImageIO.read(tutorialfile5);
			tutorialfile6 = new File("Tutorial/Tutorial6.png");
			tutorialimage6 = ImageIO.read(tutorialfile6);
			tutorialfile7 = new File("Tutorial/Tutorial7.png");
			tutorialimage7 = ImageIO.read(tutorialfile7);
			tutorialfile8 = new File("Tutorial/Tutorial8.png");
			tutorialimage8 = ImageIO.read(tutorialfile8);
			
			//battle images
			Encounterfile = new File("BattleSystem/Encountered.png");
			Encounterimage = ImageIO.read(Encounterfile);
			batffile = new File("BattleSystem/BattleMaps/BatFight.png");
			batfimage = ImageIO.read(batffile);
			batdfile = new File("BattleSystem/BattleMaps/BatDead.png");
			batdimage = ImageIO.read(batdfile);
			bunnyffile = new File("BattleSystem/BattleMaps/BunnyFight.png");
			bunnyfimage = ImageIO.read(bunnyffile);
			bunnydfile = new File("BattleSystem/BattleMaps/BunnyDead.png");
			bunnydimage = ImageIO.read(bunnydfile);
			chickenffile = new File("BattleSystem/BattleMaps/ChickenFight.png");
			chickenfimage = ImageIO.read(chickenffile);
			chickendfile = new File("BattleSystem/BattleMaps/ChickenDead.png");
			chickendimage = ImageIO.read(chickendfile);
			guardianffile = new File("BattleSystem/BattleMaps/GuardianFight.png");
			guardianfimage = ImageIO.read(guardianffile);
			guardiandfile = new File("BattleSystem/BattleMaps/GuardianDead.png");
			guardiandimage = ImageIO.read(guardiandfile);
			mageffile = new File("BattleSystem/BattleMaps/MageFight.png");
			magefimage = ImageIO.read(mageffile);
			magedfile = new File("BattleSystem/BattleMaps/MageDead.png");
			magedimage = ImageIO.read(magedfile);
			octopusffile = new File("BattleSystem/BattleMaps/OctopusFight.png");
			octopusfimage = ImageIO.read(octopusffile);
			octopusdfile = new File("BattleSystem/BattleMaps/OctopusDead.png");
			octopusdimage = ImageIO.read(octopusdfile);
			redffile = new File("BattleSystem/BattleMaps/RedFight.png");
			redfimage = ImageIO.read(redffile);
			reddfile = new File("BattleSystem/BattleMaps/RedDead.png");
			reddimage = ImageIO.read(reddfile);
			snakeffile = new File("BattleSystem/BattleMaps/SnakeFight.png");
			snakefimage = ImageIO.read(snakeffile);
			snakedfile = new File("BattleSystem/BattleMaps/SnakeDead.png");
			snakedimage = ImageIO.read(snakedfile);
			spiderffile = new File("BattleSystem/BattleMaps/SpiderFight.png");
			spiderfimage = ImageIO.read(spiderffile);
			spiderdfile = new File("BattleSystem/BattleMaps/SpiderDead.png");
			spiderdimage = ImageIO.read(spiderdfile);
			
			//SATAN THE FINAL BOSS PICTURES + CUTSCENE (KINDA)
			satanfile1 = new File("BattleSystem/Boss/Satan1.png");
			satanimage1 = ImageIO.read(satanfile1);
			satanfile2 = new File("BattleSystem/Boss/Satan2.png");
			satanimage2 = ImageIO.read(satanfile2);
			satanfile3 = new File("BattleSystem/Boss/Satan3.png");
			satanimage3 = ImageIO.read(satanfile3);
			satanfile4 = new File("BattleSystem/Boss/Satan4.png");
			satanimage4 = ImageIO.read(satanfile4);
			satanfile5 = new File("BattleSystem/Boss/Satan5.png");
			satanimage5 = ImageIO.read(satanfile5);
			satanffile = new File("BattleSystem/Boss/SatanFight.png");
			satanfimage = ImageIO.read(satanffile);
			defeatfile1 = new File("BattleSystem/Boss/Defeat1.png");
			defeatimage1 = ImageIO.read(defeatfile1);
			defeatfile2 = new File("BattleSystem/Boss/Defeat2.png");
			defeatimage2 = ImageIO.read(defeatfile2);
			defeatfile3 = new File("BattleSystem/Boss/Defeat3.png");
			defeatimage3 = ImageIO.read(defeatfile3);
			defeatfile4 = new File("BattleSystem/Boss/Defeat4.png");
			defeatimage4 = ImageIO.read(defeatfile4);
			defeatfile5 = new File("BattleSystem/Boss/Defeat5.png");
			defeatimage5 = ImageIO.read(defeatfile5);
			defeatfile6 = new File("BattleSystem/Boss/Defeat6.png");
			defeatimage6 = ImageIO.read(defeatfile6);
			defeatfile7 = new File("BattleSystem/Boss/Defeat7.png");
			defeatimage7 = ImageIO.read(defeatfile7);
			
			//God of conquest speaking
			keimaintrofile = new File("Sprites/keimaintro.png");
			keimaintroimage = ImageIO.read(keimaintrofile);
			keimafile = new File("Sprites/keima.png");
			keimaimage = ImageIO.read(keimafile);
			keimafile1 = new File("Sprites/keima1.png");
			keimaimage1 = ImageIO.read(keimafile1);
			keimafile2 = new File("Sprites/keima2.png");
			keimaimage2 = ImageIO.read(keimafile2);
			keimafile3 = new File("Sprites/keima3.png");
			keimaimage3 = ImageIO.read(keimafile3);
			keimafile4 = new File("Sprites/keima4.png");
			keimaimage4 = ImageIO.read(keimafile4);
			keimafile5 = new File("Sprites/keima5.png");
			keimaimage5 = ImageIO.read(keimafile5);
			keimafile6 = new File("Sprites/keima6.png");
			keimaimage6 = ImageIO.read(keimafile6);
			keimafile7 = new File("Sprites/keima7.png");
			keimaimage7 = ImageIO.read(keimafile7);
			keimafile8 = new File("Sprites/keima8.png");
			keimaimage8 = ImageIO.read(keimafile8);
			keimafile9 = new File("Sprites/keima9.png");
			keimaimage9 = ImageIO.read(keimafile9);
			
			//Devil
			devilfile3 = new File("NPC/Devil3.png");
			devilimage3 = ImageIO.read(devilfile3);
			devilfile4 = new File("NPC/Devil4.png");
			devilimage4 = ImageIO.read(devilfile4);
			devilfile5 = new File("NPC/Devil5.png");
			devilimage5 = ImageIO.read(devilfile5);
			devilfile6 = new File("NPC/Devil6.png");
			devilimage6 = ImageIO.read(devilfile6);
			devilfile7 = new File("NPC/Devil7.png");
			devilimage7 = ImageIO.read(devilfile7);
			devilfile8 = new File("NPC/Devil8.png");
			devilimage8 = ImageIO.read(devilfile8);
			devilfile9 = new File("NPC/Devil9.png");
			devilimage9 = ImageIO.read(devilfile9);
			devilfile10 = new File("NPC/Devil10.png");
			devilimage10 = ImageIO.read(devilfile10);
			devilfile11 = new File("NPC/Devil11.png");
			devilimage11 = ImageIO.read(devilfile11);
			devilfile12 = new File("NPC/Devil12.png");
			devilimage12 = ImageIO.read(devilfile12);
			devilfile13 = new File("NPC/Devil13.png");
			devilimage13 = ImageIO.read(devilfile13);
			devilfile14 = new File("NPC/Devil14.png");
			devilimage14 = ImageIO.read(devilfile14);
			devilfile15 = new File("NPC/Devil15.png");
			devilimage15 = ImageIO.read(devilfile15);
			devilfile16 = new File("NPC/Devil16.png");
			devilimage16 = ImageIO.read(devilfile16);
			devilfile17 = new File("NPC/Devil17.png");
			devilimage17 = ImageIO.read(devilfile17);
			devilfile18 = new File("NPC/Devil18.png");
			devilimage18 = ImageIO.read(devilfile18);
			
			//Goddess
			goddessfile3 = new File("NPC/Goddess3.png");
			goddessimage3 = ImageIO.read(goddessfile3);
			goddessfile4 = new File("NPC/Goddess4.png");
			goddessimage4 = ImageIO.read(goddessfile4);
			goddessfile5 = new File("NPC/Goddess5.png");
			goddessimage5 = ImageIO.read(goddessfile5);
			goddessfile6 = new File("NPC/Goddess6.png");
			goddessimage6 = ImageIO.read(goddessfile6);
			goddessfile7 = new File("NPC/Goddess7.png");
			goddessimage7 = ImageIO.read(goddessfile7);
			goddessfile8 = new File("NPC/Goddess8.png");
			goddessimage8 = ImageIO.read(goddessfile8);
			goddessfile9 = new File("NPC/Goddess9.png");
			goddessimage9 = ImageIO.read(goddessfile9);
			goddessfile10 = new File("NPC/Goddess10.png");
			goddessimage10 = ImageIO.read(goddessfile10);
			goddessfile11 = new File("NPC/Goddess11.png");
			goddessimage11 = ImageIO.read(goddessfile11);
			goddessfile12 = new File("NPC/Goddess12.png");
			goddessimage12 = ImageIO.read(goddessfile12);
			goddessfile13 = new File("NPC/Goddess13.png");
			goddessimage13 = ImageIO.read(goddessfile13);
			goddessfile14 = new File("NPC/Goddess14.png");
			goddessimage14 = ImageIO.read(goddessfile14);
			goddessfile15 = new File("NPC/Goddess15.png");
			goddessimage15 = ImageIO.read(goddessfile15);
			
			//Logo, tutorial, etc
     		logofile = new File("Sprites/logo.png");
     		logoimage = ImageIO.read(logofile);
     		tutorialfile = new File("Sprites/tutorial.png");
     		tutorialimage = ImageIO.read(tutorialfile);
     		//fences
     		fencefile = new File("Sprites/fence.png");
     		fenceimage = ImageIO.read(fencefile);
     		fencefile1 = new File("Sprites/fence1.png");
     		fenceimage1 = ImageIO.read(fencefile1);
     		fencefile2 = new File("Sprites/fence2.png");
     		fenceimage2 = ImageIO.read(fencefile2);
     		fencefile3 = new File("Sprites/fence3.png");
     		fenceimage3 = ImageIO.read(fencefile3);
     		fencefile4 = new File("Sprites/fence4.png");
     		fenceimage4 = ImageIO.read(fencefile4);
     		fencefileB = new File("Sprites/fenceB.png");
     		fenceimageB = ImageIO.read(fencefileB);
     		fencefileC = new File("Sprites/fenceC.png");
     		fenceimageC = ImageIO.read(fencefileC);
     		//grass
     		grassfile = new File("Sprites/grass.png");
     		grassimage = ImageIO.read(grassfile);
     		//flower
     		flowerfile = new File("Sprites/flower.png");
     		flowerimage = ImageIO.read(flowerfile);
     		//tree
     		treefile = new File("Sprites/tree.png");
     		treeimage = ImageIO.read(treefile);
     		//water
     		waterfile = new File("Sprites/water.png");
     		waterimage = ImageIO.read(waterfile);
     		waterfileC1 = new File("Sprites/waterC1.png");
     		waterimageC1 = ImageIO.read(waterfileC1);
     		waterfileC2 = new File("Sprites/waterC2.png");
     		waterimageC2 = ImageIO.read(waterfileC2);
     		waterfileL1 = new File("Sprites/waterL1.png");
     		waterimageL1 = ImageIO.read(waterfileL1);
     		waterfileL2 = new File("Sprites/waterL2.png");
     		waterimageL2 = ImageIO.read(waterfileL2);
     		waterfileL3 = new File("Sprites/waterL3.png");
     		waterimageL3 = ImageIO.read(waterfileL3);
     		waterfileM1 = new File("Sprites/waterM1.png");
     		waterimageM1 = ImageIO.read(waterfileM1);
     		waterfileM2 = new File("Sprites/waterM2.png");
     		waterimageM2 = ImageIO.read(waterfileM2);
     		waterfileR1 = new File("Sprites/waterR1.png");
     		waterimageR1 = ImageIO.read(waterfileR1);
     		waterfileR2 = new File("Sprites/waterR2.png");
     		waterimageR2 = ImageIO.read(waterfileR2);
     		waterfileR3 = new File("Sprites/waterR3.png");
     		waterimageR3 = ImageIO.read(waterfileR3);
     		//home
     		homefile1 = new File("Sprites/home1.png");
     		homeimage1 = ImageIO.read(homefile1);
     		homefile2 = new File("Sprites/home2.png");
     		homeimage2 = ImageIO.read(homefile2);
     		homefile3 = new File("Sprites/home3.png");
     		homeimage3 = ImageIO.read(homefile3);
     		homefile4 = new File("Sprites/home4.png");
     		homeimage4 = ImageIO.read(homefile4);
     		homefile5 = new File("Sprites/home5.png");
     		homeimage5 = ImageIO.read(homefile5);
     		homefile6 = new File("Sprites/home6.png");
     		homeimage6 = ImageIO.read(homefile6);
     		homefile7 = new File("Sprites/home7.png");
     		homeimage7 = ImageIO.read(homefile7);
     		homefile8 = new File("Sprites/home8.png");
     		homeimage8 = ImageIO.read(homefile8);
     		homefile9 = new File("Sprites/home9.png");
     		homeimage9 = ImageIO.read(homefile9);
     		homefile10 = new File("Sprites/home10.png");
     		homeimage10 = ImageIO.read(homefile10);
     		homefile11 = new File("Sprites/home11.png");
     		homeimage11 = ImageIO.read(homefile11);
     		homefile12 = new File("Sprites/home12.png");
     		homeimage12 = ImageIO.read(homefile12);
     		homefile13 = new File("Sprites/home13.png");
     		homeimage13 = ImageIO.read(homefile13);
     		homefile14 = new File("Sprites/home14.png");
     		homeimage14 = ImageIO.read(homefile14);
     		homefile15 = new File("Sprites/home15.png");
     		homeimage15 = ImageIO.read(homefile15);
     		homefile16 = new File("Sprites/home16.png");
     		homeimage16 = ImageIO.read(homefile16);
     		homefile17 = new File("Sprites/home17.png");
     		homeimage17 = ImageIO.read(homefile17);
     		homefile18 = new File("Sprites/home18.png");
     		homeimage18 = ImageIO.read(homefile18);
     		homefile19 = new File("Sprites/home19.png");
     		homeimage19 = ImageIO.read(homefile19);
     		homefile20 = new File("Sprites/home20.png");
     		homeimage20 = ImageIO.read(homefile20);
     		homefile21 = new File("Sprites/home21.png");
     		homeimage21 = ImageIO.read(homefile21);
     		homefile23 = new File("Sprites/home23.png");
     		homeimage23 = ImageIO.read(homefile23);
     		homefile24 = new File("Sprites/home24.png");
     		homeimage24 = ImageIO.read(homefile24);
     		homefile25 = new File("Sprites/home25.png");
     		homeimage25 = ImageIO.read(homefile25);
     		//Weapon shop
     		shopfile1 = new File("Sprites/shop1.png");
     		shopimage1 = ImageIO.read(shopfile1);
     		shopfile2 = new File("Sprites/shop2.png");
     		shopimage2 = ImageIO.read(shopfile2);
     		shopfile3 = new File("Sprites/shop3.png");
     		shopimage3 = ImageIO.read(shopfile3);
     		shopfile4 = new File("Sprites/shop4.png");
     		shopimage4 = ImageIO.read(shopfile4);
     		shopfile5 = new File("Sprites/shop5.png");
     		shopimage5 = ImageIO.read(shopfile5);
     		shopfile6 = new File("Sprites/shop6.png");
     		shopimage6 = ImageIO.read(shopfile6);
     		shopfile7 = new File("Sprites/shop7.png");
     		shopimage7 = ImageIO.read(shopfile7);
     		shopfile8 = new File("Sprites/shop8.png");
     		shopimage8 = ImageIO.read(shopfile8);
     		shopfile9 = new File("Sprites/shop9.png");
     		shopimage9 = ImageIO.read(shopfile9);
     		shopfile10 = new File("Sprites/shop10.png");
     		shopimage10 = ImageIO.read(shopfile10);
     		shopfile11 = new File("Sprites/shop11.png");
     		shopimage11 = ImageIO.read(shopfile11);
     		shopfile12 = new File("Sprites/shop12.png");
     		shopimage12 = ImageIO.read(shopfile12);
     		shopfile13 = new File("Sprites/shop13.png");
     		shopimage13 = ImageIO.read(shopfile13);
     		shopfile14 = new File("Sprites/shop14.png");
     		shopimage14 = ImageIO.read(shopfile14);
     		shopfile15 = new File("Sprites/shop15.png");
     		shopimage15 = ImageIO.read(shopfile15);
     		shopfile16 = new File("Sprites/shop16.png");
     		shopimage16 = ImageIO.read(shopfile16);
     		
     		//weapon shop
     		wshopfile1 = new File("Maps/WeaponShop1.png");
     		wshopimage1 = ImageIO.read(wshopfile1);
     		wshopfile2 = new File("Maps/WeaponShop2.png");
     		wshopimage2 = ImageIO.read(wshopfile2);
     		wshopfile3 = new File("Maps/WeaponShop3.png");
     		wshopimage3 = ImageIO.read(wshopfile3);
     		wshopfile4 = new File("Maps/WeaponShop4.png");
     		wshopimage4 = ImageIO.read(wshopfile4);
     		wshopfile5 = new File("Maps/WeaponShop5.png");
     		wshopimage5 = ImageIO.read(wshopfile5);
     		wshopfile6 = new File("Maps/WeaponShop6.png");
     		wshopimage6 = ImageIO.read(wshopfile6);
     		wshopfile7 = new File("Maps/WeaponShop7.png");
     		wshopimage7 = ImageIO.read(wshopfile7);
     		wshopfile8 = new File("Maps/WeaponShop8.png");
     		wshopimage8 = ImageIO.read(wshopfile8);
     		wshopfile9 = new File("Maps/WeaponShop9.png");
     		wshopimage9 = ImageIO.read(wshopfile9);
     		wshopfile10 = new File("Maps/WeaponShop10.png");
     		wshopimage10 = ImageIO.read(wshopfile10);
     		
     		//hero
     		herofileU = new File("Sprites/heroU.png");
     		heroimageU = ImageIO.read(herofileU);
     		herofileD = new File("Sprites/heroD.png");
     		heroimageD = ImageIO.read(herofileD);
     		herofileL = new File("Sprites/heroL.png");
     		heroimageL = ImageIO.read(herofileL);
     		herofileR = new File("Sprites/heroR.png");
     		heroimageR = ImageIO.read(herofileR);
     		
     		//monsters
     		monsterfile1 = new File("Sprites/monster1.png");
     		monsterimage1 = ImageIO.read(monsterfile1);
     		monsterfile2 = new File("Sprites/monster2.png");
     		monsterimage2 = ImageIO.read(monsterfile2);
     		monsterfile3 = new File("Sprites/monster3.png");
     		monsterimage3 = ImageIO.read(monsterfile3);
     		monsterfile4 = new File("Sprites/monster4.png");
     		monsterimage4 = ImageIO.read(monsterfile4);
     		monsterfile5 = new File("Sprites/monster5.png");
     		monsterimage5 = ImageIO.read(monsterfile5);
     		monsterfile6 = new File("Sprites/monster6.png");
     		monsterimage6 = ImageIO.read(monsterfile6);
     		monsterfile7 = new File("Sprites/monster7.png");
     		monsterimage7 = ImageIO.read(monsterfile7);
     		monsterfile8 = new File("Sprites/monster8.png");
     		monsterimage8 = ImageIO.read(monsterfile8);
     		monsterfile9 = new File("Sprites/monster9.png");
     		monsterimage9 = ImageIO.read(monsterfile9);
     		
     		//devil NPC
     		devilfile = new File("Sprites/devil.png");
     		devilimage = ImageIO.read(devilfile);
     		
     		//cave
     		cavefile = new File("Sprites/cave.png");
     		caveimage = ImageIO.read(cavefile);
     		cavefileE = new File("Sprites/caveE.png");
     		caveimageE = ImageIO.read(cavefileE);
     		cavefileL = new File("Sprites/caveL.png");
     		caveimageL = ImageIO.read(cavefileL);
     		cavefileR = new File("Sprites/caveR.png");
     		caveimageR = ImageIO.read(cavefileR);
     		
     		//dirt
     		dirtfile = new File("Sprites/dirt.png");
     		dirtimage = ImageIO.read(dirtfile);
     		
     		//road
     		roadfile1 = new File("Sprites/road1.png");
     		roadimage1 = ImageIO.read(roadfile1);
     		roadfile2 = new File("Sprites/road2.png");
     		roadimage2 = ImageIO.read(roadfile2);
     		
     		//stone
     		stonefile = new File("Sprites/stone.png");
     		stoneimage = ImageIO.read(stonefile);
     		
     		//statue
     		statuefile1 = new File("Sprites/statue1.png");
     		statueimage1 = ImageIO.read(statuefile1);
     		statuefile2 = new File("Sprites/statue2.png");
     		statueimage2 = ImageIO.read(statuefile2);
     		
     		//Secret Map images (Map 3)
     		//bush
     		bushfile = new File("Sprites/bush.png");
     		bushimage = ImageIO.read(bushfile);
     		
     		//Fairy NPC
     		fairyfile1 = new File("Sprites/fairy1.png");
     		fairyimage1 = ImageIO.read(fairyfile1);
     		fairyfile2 = new File("Sprites/fairy2.png");
     		fairyimage2 = ImageIO.read(fairyfile2);
     		fairyfile3 = new File("Sprites/fairy3.png");
     		fairyimage3 = ImageIO.read(fairyfile3);
     		fairyfile4 = new File("Sprites/fairy4.png");
     		fairyimage4 = ImageIO.read(fairyfile4);
     		fairyfile5 = new File("Sprites/fairy5.png");
     		fairyimage5 = ImageIO.read(fairyfile5);
     		fairyfile6 = new File("Sprites/fairy6.png");
     		fairyimage6 = ImageIO.read(fairyfile6);
     		
     		//Giant tree
     		gianttreefile1 = new File("Sprites/gianttree1.png");
     		gianttreeimage1 = ImageIO.read(gianttreefile1);
     		gianttreefile2 = new File("Sprites/gianttree2.png");
     		gianttreeimage2 = ImageIO.read(gianttreefile2);
     		gianttreefile3 = new File("Sprites/gianttree3.png");
     		gianttreeimage3 = ImageIO.read(gianttreefile3);
     		gianttreefile4 = new File("Sprites/gianttree4.png");
     		gianttreeimage4 = ImageIO.read(gianttreefile4);
     		gianttreefile5 = new File("Sprites/gianttree5.png");
     		gianttreeimage5 = ImageIO.read(gianttreefile5);
     		gianttreefile6 = new File("Sprites/gianttree6.png");
     		gianttreeimage6 = ImageIO.read(gianttreefile6);
     		gianttreefile7 = new File("Sprites/gianttree7.png");
     		gianttreeimage7 = ImageIO.read(gianttreefile7);
     		gianttreefile8 = new File("Sprites/gianttree8.png");
     		gianttreeimage8 = ImageIO.read(gianttreefile8);
     		gianttreefile9 = new File("Sprites/gianttree9.png");
     		gianttreeimage9 = ImageIO.read(gianttreefile9);
     		gianttreefile10 = new File("Sprites/gianttree10.png");
     		gianttreeimage10 = ImageIO.read(gianttreefile10);
     		gianttreefile11 = new File("Sprites/gianttree11.png");
     		gianttreeimage11 = ImageIO.read(gianttreefile11);
     		gianttreefile12 = new File("Sprites/gianttree12.png");
     		gianttreeimage12 = ImageIO.read(gianttreefile12);
     		
     		//Heart(heal)
     		heartfile = new File("Sprites/heart.png");
     		heartimage = ImageIO.read(heartfile);
     		
     		//Final map (Map 4; boss)
     		bossfile1 = new File("Sprites/boss1.png");
     		bossimage1 = ImageIO.read(bossfile1);
     		bossfile2 = new File("Sprites/boss2.png");
     		bossimage2 = ImageIO.read(bossfile2);
     		bossfile3 = new File("Sprites/boss3.png");
     		bossimage3 = ImageIO.read(bossfile3);
     		bossfile4 = new File("Sprites/boss4.png");
     		bossimage4 = ImageIO.read(bossfile4);
     		
     		bridgefile1 = new File("Sprites/bridge1.png");
     		bridgeimage1 = ImageIO.read(bridgefile1);
     		bridgefile2 = new File("Sprites/bridge2.png");
     		bridgeimage2 = ImageIO.read(bridgefile2);
     		bridgefile3 = new File("Sprites/bridge3.png");
     		bridgeimage3 = ImageIO.read(bridgefile3);
     		bridgefile4 = new File("Sprites/bridge4.png");
     		bridgeimage4 = ImageIO.read(bridgefile4);
     		bridgefile5 = new File("Sprites/bridge5.png");
     		bridgeimage5 = ImageIO.read(bridgefile5);
     		bridgefile6 = new File("Sprites/bridge6.png");
     		bridgeimage6 = ImageIO.read(bridgefile6);
     		bridgefile7 = new File("Sprites/bridge7.png");
     		bridgeimage7 = ImageIO.read(bridgefile7);
     		bridgefile8 = new File("Sprites/bridge8.png");
     		bridgeimage8 = ImageIO.read(bridgefile8);
     		bridgefile9 = new File("Sprites/bridge9.png");
     		bridgeimage9 = ImageIO.read(bridgefile9);
     		bridgefile10 = new File("Sprites/bridge10.png");
     		bridgeimage10 = ImageIO.read(bridgefile10);
     		bridgefile11 = new File("Sprites/bridge11.png");
     		bridgeimage11 = ImageIO.read(bridgefile11);
     		bridgefile12 = new File("Sprites/bridge12.png");
     		bridgeimage12 = ImageIO.read(bridgefile12);
     		bridgefile13 = new File("Sprites/bridge13.png");
     		bridgeimage13 = ImageIO.read(bridgefile13);
     		bridgefile14 = new File("Sprites/bridge14.png");
     		bridgeimage14 = ImageIO.read(bridgefile14);
     		bridgefile15 = new File("Sprites/bridge15.png");
     		bridgeimage15 = ImageIO.read(bridgefile15);
     		bridgefile16 = new File("Sprites/bridge16.png");
     		bridgeimage16 = ImageIO.read(bridgefile16);
     		bridgefile17 = new File("Sprites/bridge17.png");
     		bridgeimage17 = ImageIO.read(bridgefile17);
     		bridgefile18 = new File("Sprites/bridge18.png");
     		bridgeimage18 = ImageIO.read(bridgefile18);
     		bridgefile19 = new File("Sprites/bridge19.png");
     		bridgeimage19 = ImageIO.read(bridgefile19);
     		bridgefile20 = new File("Sprites/bridge20.png");
     		bridgeimage20 = ImageIO.read(bridgefile20);
     		
     		//ground
     		groundfile = new File("Sprites/ground.png");
     		groundimage = ImageIO.read(groundfile);
     		
     		//inside cave
     		icavefile = new File("Sprites/icave.png");
     		icaveimage = ImageIO.read(icavefile);
     		icavefileE = new File("Sprites/icaveE.png");
     		icaveimageE = ImageIO.read(icavefileE);
     		icavefileE2 = new File("Sprites/icaveE2.png");
     		icaveimageE2 = ImageIO.read(icavefileE2);
     		icavefileE3 = new File("Sprites/icaveE3.png");
     		icaveimageE3 = ImageIO.read(icavefileE3);
     		
     		//long tree
     		longtreefile1 = new File("Sprites/longtree1.png");
     		longtreeimage1 = ImageIO.read(longtreefile1);
     		longtreefile2 = new File("Sprites/longtree2.png");
     		longtreeimage2 = ImageIO.read(longtreefile2);
     		longtreefile3 = new File("Sprites/longtree3.png");
     		longtreeimage3 = ImageIO.read(longtreefile3);
     		
     		//tile
     		tilefile = new File("Sprites/tile1.png");
     		tileimage = ImageIO.read(tilefile);
     		
     		//GameOver
     		gameoverfile = new File("Sprites/GameOver.png");
     		gameoverimage = ImageIO.read(gameoverfile);
     		
 		}catch(IOException e){ 	
 		}
 		
 		boolean blnMenuLoop;
 		blnMenuLoop = true;
 		
 		while(blnMenuLoop = true){
	 		
	 		//Hero stats
			int intHP = 50;
			int intCurrentHP = 50;
			int intMP = 50;
			int intCurrentMP = 50;
			int intLv = 1;
			int intSTR = 0;
			int intWeapAtk = 0;
			int intAttack = 0;
			int intMaxAtk = (int)(intAttack * 0.9);
			int intMinAtk = (int)(intAttack * 0.5);
			int intDef = 5;
			//int intSpeed = 5;  <-- Not implementing into the battle system
			double dblLuck = 5;
			int intChance;
			int intMaxLevel = 15;
			int intAP = 0;
			String strWeapon;
			double dblCurrentEXP = 0;
			double dblMaxEXP = (int)(10 * (Math.pow(intLv, 2)));
			double dblEXPR = 0;
			double dblEXPPerc;
			double dblDamage = 0;
			int intHeal = 0;
			int intMeal = 0;
			int intRun = 0;
			
			//Monster (Lv.1; Chicken)
			int intM1HP = 20;
			int intM1CurrentHP = 20;
			int intM1Def = 0;
			int intM1Attack = 0;
			int intM1MaxAtk = (int)(intM1Attack * 0.9);
			int intM1MinAtk = (int)(intM1Attack * 0.5);
			//gives 5 exp.
			
			//Monster (Lv.2; Bunny)
			int intM2HP = 25;
			int intM2CurrentHP = 25;
			int intM2Def = 0;
			int intM2Attack = 10;
			int intM2MaxAtk = (int)(intM2Attack * 0.9);
			int intM2MinAtk = (int)(intM2Attack * 0.5);
			//gives 15 exp.
			
			//Monster (Lv.3; Octopus)
			int intM3HP = 35;
			int intM3CurrentHP = 35;
			int intM3Def = 5;
			int intM3Attack = 20;
			int intM3MaxAtk = (int)(intM3Attack * 0.9);
			int intM3MinAtk = (int)(intM3Attack * 0.5);
			//gives 25 exp.
			
			//Monster (Lv.4; Snake)
			int intM4HP = 45;
			int intM4CurrentHP = 45;
			int intM4Def = 10;
			int intM4Attack = 20;
			int intM4MaxAtk = (int)(intM4Attack * 0.9);
			int intM4MinAtk = (int)(intM4Attack * 0.5);
			//gives 35 exp.
			
			//Monster (Lv.5; Octopus)
			int intM5HP = 70;
			int intM5CurrentHP = 70;
			int intM5Def = 5;
			int intM5Attack = 45;
			int intM5MaxAtk = (int)(intM5Attack * 0.9);
			int intM5MinAtk = (int)(intM5Attack * 0.5);
			//gives 45 exp.
			
			//Monster (Lv.6; Giant Bat)
			int intM6HP = 85;
			int intM6CurrentHP = 85;
			int intM6Def = 5;
			int intM6Attack = 50;
			int intM6MaxAtk = (int)(intM6Attack * 0.9);
			int intM6MinAtk = (int)(intM6Attack * 0.5);
			//gives 60 exp.
			
			//Monster (Lv.7; Fiery Spirit)
			int intM7HP = 120;
			int intM7CurrentHP = 120;
			int intM7Def = 25;
			int intM7Attack = 55;
			int intM7MaxAtk = (int)(intM7Attack * 0.9);
			int intM7MinAtk = (int)(intM7Attack * 0.5);
			//gives 80 exp.
			
			//Monster (Lv.8; Guardian Clone)
			int intM8HP = 200;
			int intM8CurrentHP = 200;
			int intM8Def = 25;
			int intM8Attack = 66;
			int intM8MaxAtk = (int)(intM8Attack * 0.9);
			int intM8MinAtk = (int)(intM8Attack * 0.5);
			//gives 150 exp.
			
			//Monster (Lv.9; Satan's helper )
			int intM9HP = 150;
			int intM9CurrentHP = 150;
			int intM9Def = 40;
			int intM9Attack = 80;
			int intM9MaxAtk = (int)(intM9Attack * 0.9);
			int intM9MinAtk = (int)(intM9Attack * 0.5);
			//gives 200 exp.
			
			//Final Boss (Lv. 10; SATAN)
			int intBossHP = 1666;
			int intBossCurrentHP = 1666;
			int intBossDef = 50;
			int intBossAttack = 150;
			int intBossMaxAtk = (int)(intBossAttack * 0.9);
			int intBossMinAtk = (int)(intBossAttack * 0.5);
			
 			map.drawImage(logoimage,0, 0, null);
 			clip1.start();
 			char chrMenuOption;
 			chrMenuOption = map.getChar();
 			char chrConvo;
 			
 			if(chrMenuOption == 'S' || chrMenuOption == 's'){
	 			boolean blnTutAsk = true;
	 			while(blnTutAsk == true){
	 				map.clear();
	 				map.drawImage(tutorialimage,0,0,null);
	 				char chrTutOp;
	 				chrTutOp = map.getChar();
	 				clip1.stop();
	 				if(chrTutOp == 'Y' || chrTutOp == 'y'){
		 				clip2.start();
		 				map.drawImage(tutorialimage1, 0, 0, null);
		 				chrConvo = map.getChar();
		 				map.drawImage(tutorialimage2, 0, 0, null);
		 				chrConvo = map.getChar();
		 				map.drawImage(tutorialimage3, 0, 0, null);
		 				chrConvo = map.getChar();
		 				map.drawImage(tutorialimage4, 0, 0, null);
		 				chrConvo = map.getChar();
		 				map.drawImage(tutorialimage5, 0, 0, null);
		 				chrConvo = map.getChar();
		 				map.drawImage(tutorialimage6, 0, 0, null);
		 				chrConvo = map.getChar();
		 				map.drawImage(tutorialimage7, 0, 0, null);
		 				chrConvo = map.getChar();
		 				map.drawImage(tutorialimage8, 0, 0, null);
		 				chrConvo = map.getChar();
		 				blnTutAsk = false;
		 				clip2.stop();
	 				}else if(chrTutOp == 'N' || chrTutOp == 'n'){
		 				blnTutAsk = false;
	 				}
 				}
 				
 				//opening stats window
				Console stats = new Console(15, 45, "Stats window");
				stats.drawImage(statsimage,0,0,null);
				stats.drawString(Integer.toString(intLv), 60, 90);
				stats.drawString(intCurrentHP +"/"+ intHP, 60, 125);
				stats.drawString(intCurrentMP +"/"+ intMP, 60, 143);
				stats.drawString(Integer.toString(intAttack), 60, 205);
				stats.drawString(Integer.toString(intDef), 250, 135);
				stats.drawString(Double.toString(dblLuck), 60, 260);
				stats.drawString(intMinAtk +" ~ "+ intMaxAtk, 250, 115);
				stats.drawString(Integer.toString(intAP),105, 288);
				
				//talking NPC
 				Console keima = new Console(17, 29, "God of Conquest");
 				
		 		boolean blnMap1 = true;
		 		boolean blnMap2 = false;
		 		boolean blnMap3 = false;
		 		boolean blnMap4 = false;
		 		boolean blnDevil = false;
		 		boolean blnGoddess = false;
		 		boolean blnFirstTime = true;
		 		boolean blnFirstWeapon = false;
		 		boolean blnWeaponShop =false;
		 		boolean blnKeimaCont = false;
		 			
 				int intTempCol = '0';
 				int intTempRow = '0';
 				
 				boolean blnGameOver = false;
 				boolean bln2to1 = false;
 				boolean bln1to2 = false;
 				boolean bln2to3 = false;
 				boolean bln3to2 = false;
 				boolean bln2to4 = false;
 				boolean bln4to2 = false;
 				boolean blnWto1 = false;
 				boolean blnDto2 = false;
 				boolean blnGto3 = false;
 				
 				boolean blndevilbuff = false;
 				boolean blngoddessbuff = false;
 				boolean blngoddessONETIME = true;
 				boolean blndevilONETIME = true;
 				boolean blngoddessdeal = true;
 				boolean blndevildeal = true;
 				boolean blngoddessdeal2 = true;
 				
 				boolean blnSTATS = false;
 				
 				boolean blnBMap1 = false;
 				boolean blnBMap2 = false;
 				boolean blnBMap4 = false;
 				
 				boolean blnBattle = false;
 				boolean blnMonster1 = false;
 				boolean blnMonster2 = false;
 				boolean blnMonster3 = false;
 				boolean blnMonster4 = false;
 				boolean blnMonster5 = false;
 				boolean blnMonster6 = false;
 				boolean blnMonster7 = false;
 				boolean blnMonster8 = false;
 				boolean blnMonster9 = false;
 				boolean blnBoss = false;
 				boolean blnBossBattle = false;
 				boolean blnDead = false;
 				
 				boolean blnSkills = true;
 				
 				boolean blnWeap1 = false;
 				boolean blnWeap2 = false;
 				boolean blnWeap3 = false;
 				boolean blnWeap4 = false;
 				boolean blnWeap5 = false;
 				boolean blnWeap6 = false;
 				
 				while(blnGameOver == false){
	 				//First map
					String strMap[][];
					strMap = new String[20][20];
					
					int intRow;
					int intCol;
					strMap = CurranX.loadmap("Maps/map1.csv");
					int intHRow = 17;
					int intHCol = 14;
					char chrMove = ' ';
					
					if(bln2to1 == true){
		 				intHRow = 1;
		 				intHCol = intTempCol;
	 				}else if(blnWto1 == true || blnBMap1 == true){
		 				intHRow = intTempRow;
		 				intHCol = intTempCol;
	 				}
	 				bln2to1 = false;
	 				blnWto1 = false;
					
					for(intRow = 0; intRow < 20; intRow++){
	 					for(intCol = 0; intCol < 20; intCol++){
							//draw grass
					 		if(strMap[intRow][intCol].equals("g")){
					 			map.drawImage(grassimage, intCol*20, intRow*20, null);			
					 		//draw fences 		
					 		}else if(strMap[intRow][intCol].equals("fa")){
		 						map.drawImage(fenceimage, intCol*20, intRow*20, null);		
		 					}else if(strMap[intRow][intCol].equals("f1")){
		 						map.drawImage(fenceimage1, intCol*20, intRow*20, null);		
		 					}else if(strMap[intRow][intCol].equals("f2")){
		 						map.drawImage(fenceimage2, intCol*20, intRow*20, null);	
		 					}else if(strMap[intRow][intCol].equals("f3")){
		 						map.drawImage(fenceimage3, intCol*20, intRow*20, null);		
		 					}else if(strMap[intRow][intCol].equals("f4")){
		 						map.drawImage(fenceimage4, intCol*20, intRow*20, null);	
		 					}else if(strMap[intRow][intCol].equals("fb")){
		 						map.drawImage(fenceimageB, intCol*20, intRow*20, null);	
		 					}else if(strMap[intRow][intCol].equals("fc")){
		 						map.drawImage(fenceimageC, intCol*20, intRow*20, null);
		 					//draw flower
	 						}else if(strMap[intRow][intCol].equals("p")){
		 						map.drawImage(flowerimage, intCol*20, intRow*20, null);		
		 					//draw tree 		
		 					}else if(strMap[intRow][intCol].equals("t")){
		 						map.drawImage(treeimage, intCol*20, intRow*20, null);	
		 					//draw water		 		
		 					}else if(strMap[intRow][intCol].equals("w")){
		 						map.drawImage(waterimage, intCol*20, intRow*20, null);			 		
		 					}else if(strMap[intRow][intCol].equals("wc1")){
		 						map.drawImage(waterimageC1, intCol*20, intRow*20, null);
		 					}else if(strMap[intRow][intCol].equals("wc2")){
		 						map.drawImage(waterimageC2, intCol*20, intRow*20, null);	
		 					}else if(strMap[intRow][intCol].equals("wl1")){
		 						map.drawImage(waterimageL1, intCol*20, intRow*20, null); 	
		 					}else if(strMap[intRow][intCol].equals("wl2")){
		 						map.drawImage(waterimageL2, intCol*20, intRow*20, null);
		 					}else if(strMap[intRow][intCol].equals("wl3")){
		 						map.drawImage(waterimageL3, intCol*20, intRow*20, null);	
		 					}else if(strMap[intRow][intCol].equals("wm1")){
		 						map.drawImage(waterimageM1, intCol*20, intRow*20, null);
		 					}else if(strMap[intRow][intCol].equals("wm2")){
		 							map.drawImage(waterimageM2, intCol*20, intRow*20, null);
		 					}else if(strMap[intRow][intCol].equals("wr1")){
		 						map.drawImage(waterimageR1, intCol*20, intRow*20, null);	
		 					}else if(strMap[intRow][intCol].equals("wr2")){
		 						map.drawImage(waterimageR2, intCol*20, intRow*20, null);	
		 					}else if(strMap[intRow][intCol].equals("wr3")){
		 						map.drawImage(waterimageR3, intCol*20, intRow*20, null);	 	
	 						}else if(strMap[intRow][intCol].equals("h1")){
		 						map.drawImage(homeimage1, intCol*20, intRow*20, null);	
		 					}else if(strMap[intRow][intCol].equals("h2")){
		 						map.drawImage(homeimage2, intCol*20, intRow*20, null);
		 					}else if(strMap[intRow][intCol].equals("h3")){
		 						map.drawImage(homeimage3, intCol*20, intRow*20, null);	 
		 					}else if(strMap[intRow][intCol].equals("h4")){
		 						map.drawImage(homeimage4, intCol*20, intRow*20, null);	 		
		 					}else if(strMap[intRow][intCol].equals("h5")){
		 						map.drawImage(homeimage5, intCol*20, intRow*20, null);	 
		 					}else if(strMap[intRow][intCol].equals("h6")){
		 						map.drawImage(homeimage6, intCol*20, intRow*20, null);	 		
		 					}else if(strMap[intRow][intCol].equals("h7")){
		 						map.drawImage(homeimage7, intCol*20, intRow*20, null);	 	
		 					}else if(strMap[intRow][intCol].equals("h8")){
		 						map.drawImage(homeimage8, intCol*20, intRow*20, null);	 
		 					}else if(strMap[intRow][intCol].equals("h9")){
		 						map.drawImage(homeimage9, intCol*20, intRow*20, null);	 		
		 					}else if(strMap[intRow][intCol].equals("h10")){
		 						map.drawImage(homeimage10, intCol*20, intRow*20, null);	 
		 					}else if(strMap[intRow][intCol].equals("h11")){
		 						map.drawImage(homeimage11, intCol*20, intRow*20, null);	 	
		 					}else if(strMap[intRow][intCol].equals("h12")){
		 						map.drawImage(homeimage12, intCol*20, intRow*20, null);	 	
		 					}else if(strMap[intRow][intCol].equals("h13")){
		 						map.drawImage(homeimage13, intCol*20, intRow*20, null);	 	
		 					}else if(strMap[intRow][intCol].equals("h14")){
		 						map.drawImage(homeimage14, intCol*20, intRow*20, null);	 	
		 					}else if(strMap[intRow][intCol].equals("h15")){
		 						map.drawImage(homeimage15, intCol*20, intRow*20, null);	 
		 					}else if(strMap[intRow][intCol].equals("h16")){
		 						map.drawImage(homeimage16, intCol*20, intRow*20, null);	 	
		 					}else if(strMap[intRow][intCol].equals("h17")){
		 						map.drawImage(homeimage17, intCol*20, intRow*20, null);	 	
		 					}else if(strMap[intRow][intCol].equals("h18")){
		 						map.drawImage(homeimage18, intCol*20, intRow*20, null);	 
		 					}else if(strMap[intRow][intCol].equals("h19")){
		 						map.drawImage(homeimage19, intCol*20, intRow*20, null);	 
		 					}else if(strMap[intRow][intCol].equals("h20")){
		 						map.drawImage(homeimage20, intCol*20, intRow*20, null);	 		
		 					}else if(strMap[intRow][intCol].equals("h21")){
		 						map.drawImage(homeimage21, intCol*20, intRow*20, null);	 	
		 					}else if(strMap[intRow][intCol].equals("h23")){
		 						map.drawImage(homeimage23, intCol*20, intRow*20, null);	 
		 					}else if(strMap[intRow][intCol].equals("h24")){
		 						map.drawImage(homeimage24, intCol*20, intRow*20, null);	 		
		 					}else if(strMap[intRow][intCol].equals("h25")){
		 						map.drawImage(homeimage25, intCol*20, intRow*20, null);	 		
	 						}else if(strMap[intRow][intCol].equals("s1")){
		 						map.drawImage(shopimage1, intCol*20, intRow*20, null);
		 					}else if(strMap[intRow][intCol].equals("s2")){
		 						map.drawImage(shopimage2, intCol*20, intRow*20, null);		
		 					}else if(strMap[intRow][intCol].equals("s3")){
		 						map.drawImage(shopimage3, intCol*20, intRow*20, null);		 	 	
	 						}else if(strMap[intRow][intCol].equals("s4")){
		 						map.drawImage(shopimage4, intCol*20, intRow*20, null);
		 					}else if(strMap[intRow][intCol].equals("s5")){
		 						map.drawImage(shopimage5, intCol*20, intRow*20, null);
		 					}else if(strMap[intRow][intCol].equals("s6")){
		 						map.drawImage(shopimage6, intCol*20, intRow*20, null);
		 					}else if(strMap[intRow][intCol].equals("s7")){
		 						map.drawImage(shopimage7, intCol*20, intRow*20, null);
		 					}else if(strMap[intRow][intCol].equals("s8")){
		 						map.drawImage(shopimage8, intCol*20, intRow*20, null);
		 					}else if(strMap[intRow][intCol].equals("s9")){
		 						map.drawImage(shopimage9, intCol*20, intRow*20, null);
		 					}else if(strMap[intRow][intCol].equals("s10")){
		 						map.drawImage(shopimage10, intCol*20, intRow*20, null);
		 					}else if(strMap[intRow][intCol].equals("s11")){
		 						map.drawImage(shopimage11, intCol*20, intRow*20, null);
		 					}else if(strMap[intRow][intCol].equals("s12")){
		 						map.drawImage(shopimage12, intCol*20, intRow*20, null);
		 					}else if(strMap[intRow][intCol].equals("s13")){
		 						map.drawImage(shopimage13, intCol*20, intRow*20, null);
		 					}else if(strMap[intRow][intCol].equals("s14")){
		 						map.drawImage(shopimage14, intCol*20, intRow*20, null);
		 					}else if(strMap[intRow][intCol].equals("s15")){
		 						map.drawImage(shopimage15, intCol*20, intRow*20, null);
		 					}else if(strMap[intRow][intCol].equals("s16")){
		 						map.drawImage(shopimage16, intCol*20, intRow*20, null);
	 						}else if(strMap[intRow][intCol].equals("m1")){
		 						map.drawImage(monsterimage1, intCol*20, intRow*20, null);
		 					}else if(strMap[intRow][intCol].equals("m2")){
		 						map.drawImage(monsterimage2, intCol*20, intRow*20, null);
	 						}
	 					}
 					}
 					//draw hero
	 				map.drawImage(heroimageD, intHCol*20, intHRow*20, null);
	 				
	 				//all stats
	 				if(blnBMap1 == true){
						while(intAP > 0){
							stats.clear();
							intAttack = intWeapAtk + intSTR;
	 						intMaxAtk = (int)(intAttack * 0.9);
							intMinAtk = (int)(intAttack * 0.5);
							dblMaxEXP = (int)(10 * (Math.pow(intLv, 2)));
							dblEXPPerc = (int)((dblCurrentEXP / dblMaxEXP) * 100);
	 						stats.drawImage(statsimage,0,0,null);
							stats.drawString(Integer.toString(intLv), 60, 90);
							stats.drawString(intCurrentHP +"/"+ intHP, 60, 125);
							stats.drawString(intCurrentMP +"/"+ intMP, 60, 143);
							stats.drawString(dblCurrentEXP +"/"+dblMaxEXP +" ("+dblEXPPerc+"%)", 60, 162);
							stats.drawString(Integer.toString(intAttack), 60, 205);
							stats.drawString(Integer.toString(intDef), 250, 135);
							stats.drawString(Double.toString(dblLuck), 60, 260);
							stats.drawString(intMinAtk +" ~ "+ intMaxAtk, 250, 115);
							stats.drawString(Integer.toString(intAP),105, 288);
							chrConvo = stats.getChar();
							if(chrConvo == 'h' || chrConvo == 'H'){
								intHP = intHP + 10;
								intAP = intAP - 1;
							}else if(chrConvo == 'm' || chrConvo == 'M'){
								intMP = intMP + 10;
								intAP = intAP - 1;
							}else if(chrConvo == 's' || chrConvo == 'S'){
								intSTR = intSTR + 1;
								intAP = intAP - 1;
							}else if(chrConvo == 'l' || chrConvo == 'L'){
								dblLuck = dblLuck + 1;
								intAP = intAP - 1;
							}else if(chrConvo == 'd' || chrConvo == 'D'){
								intDef = intDef + 1;
								intAP = intAP - 1;
							}
							if(blnWeap1 == true){
								stats.drawString("=RUSTY SWORD OBTAINED=",180, 215);
							}else if(blnWeap2 == true){
								stats.drawString("=LONG SWORD OBTAINED=",180, 215);
							}else if(blnWeap3 == true){
								stats.drawString("=BUSTER SWORD OBTAINED=",180, 215);
							}else if(blnWeap4 == true){
								stats.drawString("=GLADIUS OBTAINED=",185, 215);
							}else if(blnWeap5 == true){
								stats.drawString("=CLAYMORE OBTAINED=",180, 215);
							}else if(blnWeap6 == true){
								stats.drawString("=DRAGON BLADE OBTAINED=",180, 215);
							}
							
							if(blndevilbuff == true){
								stats.drawString("**{DEVIL'S CONTRACT}**", 185, 235);
							}else if(blngoddessbuff == true){
								stats.drawString("-*GODDESS' BLESSINGS*-", 185, 235);
							}
						}
					}
					blnBMap1 = false;
					
					stats.clear();
	 				intAttack = intWeapAtk + intSTR;
	 				intMaxAtk = (int)(intAttack * 0.9);
					intMinAtk = (int)(intAttack * 0.5);
					dblMaxEXP = (int)(10 * (Math.pow(intLv, 2)));
					dblEXPPerc = (int)((dblCurrentEXP / dblMaxEXP) * 100);
	 				stats.drawImage(statsimage,0,0,null);
					stats.drawString(Integer.toString(intLv), 60, 90);
					stats.drawString(intCurrentHP +"/"+ intHP, 60, 125);
					stats.drawString(intCurrentMP +"/"+ intMP, 60, 143);
					stats.drawString(dblCurrentEXP +"/"+dblMaxEXP +" ("+dblEXPPerc+"%)", 60, 162);
					stats.drawString(Integer.toString(intAttack), 60, 205);
					stats.drawString(Integer.toString(intDef), 250, 135);
					stats.drawString(Double.toString(dblLuck), 60, 260);
					stats.drawString(intMinAtk +" ~ "+ intMaxAtk, 250, 115);
					stats.drawString(Integer.toString(intAP),105, 288);
					
					if(blnWeap1 == true){
						stats.drawString("=RUSTY SWORD OBTAINED=",180, 215);
					}else if(blnWeap2 == true){
						stats.drawString("=LONG SWORD OBTAINED=",180, 215);
					}else if(blnWeap3 == true){
						stats.drawString("=BUSTER SWORD OBTAINED=",180, 215);
					}else if(blnWeap4 == true){
						stats.drawString("=GLADIUS OBTAINED=",185, 215);
					}else if(blnWeap5 == true){
						stats.drawString("=CLAYMORE OBTAINED=",180, 215);
					}else if(blnWeap6 == true){
						stats.drawString("=DRAGON BLADE OBTAINED=",180, 215);
					}
					
					if(blndevilbuff == true){
						stats.drawString("**{DEVIL'S CONTRACT}**", 185, 235);
					}else if(blngoddessbuff == true){
						stats.drawString("-*GODDESS' BLESSINGS*-", 185, 235);
					}
					
					//reseting monster stats
					//Monster (Lv.1; Chicken)
					intM1HP = 20;
					intM1CurrentHP = 20;
					intM1Def = 0;
					intM1Attack = 0;
					intM1MaxAtk = (int)(intM1Attack * 0.9);
					intM1MinAtk = (int)(intM1Attack * 0.5);
					//gives 5 exp.
					
					//Monster (Lv.2; Bunny)
					intM2HP = 25;
					intM2CurrentHP = 25;
					intM2Def = 0;
					intM2Attack = 10;
					intM2MaxAtk = (int)(intM2Attack * 0.9);
					intM2MinAtk = (int)(intM2Attack * 0.5);
					//gives 15 exp.
					
					//Monster (Lv.3; Octopus)
					intM3HP = 35;
					intM3CurrentHP = 35;
					intM3Def = 5;
					intM3Attack = 20;
					intM3MaxAtk = (int)(intM3Attack * 0.9);
					intM3MinAtk = (int)(intM3Attack * 0.5);
					//gives 25 exp.
					
					//Monster (Lv.4; Snake)
					intM4HP = 45;
					intM4CurrentHP = 45;
					intM4Def = 10;
					intM4Attack = 20;
					intM4MaxAtk = (int)(intM4Attack * 0.9);
					intM4MinAtk = (int)(intM4Attack * 0.5);
					//gives 35 exp.
					
					//Monster (Lv.5; Spider)
					intM5HP = 70;
					intM5CurrentHP = 70;
					intM5Def = 5;
					intM5Attack = 45;
					intM5MaxAtk = (int)(intM5Attack * 0.9);
					intM5MinAtk = (int)(intM5Attack * 0.5);
					//gives 45 exp.
					
					//Monster (Lv.6; Giant Bat)
					intM6HP = 85;
					intM6CurrentHP = 85;
					intM6Def = 5;
					intM6Attack = 50;
					intM6MaxAtk = (int)(intM6Attack * 0.9);
					intM6MinAtk = (int)(intM6Attack * 0.5);
					//gives 60 exp.
					
					//Monster (Lv.7; Fiery Spirit)
					intM7HP = 120;
					intM7CurrentHP = 120;
					intM7Def = 25;
					intM7Attack = 55;
					intM7MaxAtk = (int)(intM7Attack * 0.9);
					intM7MinAtk = (int)(intM7Attack * 0.5);
					//gives 80 exp.
					
					//Monster (Lv.8; Guardian Clone)
					intM8HP = 200;
					intM8CurrentHP = 200;
					intM8Def = 25;
					intM8Attack = 66;
					intM8MaxAtk = (int)(intM8Attack * 0.9);
					intM8MinAtk = (int)(intM8Attack * 0.5);
					//gives 150 exp.
					
					//Monster (Lv.9; Satan's helper )
					intM9HP = 150;
					intM9CurrentHP = 150;
					intM9Def = 40;
					intM9Attack = 80;
					intM9MaxAtk = (int)(intM9Attack * 0.9);
					intM9MinAtk = (int)(intM9Attack * 0.5);
					//gives 200 exp.
					
					//Final Boss (Lv. 10; SATAN)
					intBossHP = 1666;
					intBossCurrentHP = 1666;
					intBossDef = 50;
					intBossAttack = 150;
					intBossMaxAtk = (int)(intBossAttack * 0.9);
					intBossMinAtk = (int)(intBossAttack * 0.5);
					
	 				if(blnFirstTime == true){
	 					keima.drawImage(keimaintroimage, 0, 0, null);
	 					chrConvo = keima.getChar();
	 					keima.drawImage(keimaimage1, 0, 0, null);
	 					chrConvo = keima.getChar();
	 					keima.drawImage(keimaimage2, 0, 0, null);
	 					chrConvo = keima.getChar();
	 					keima.drawImage(keimaimage3, 0, 0, null);
	 					chrConvo = keima.getChar();
	 					keima.drawImage(keimaimage4, 0, 0, null);
	 					chrConvo = keima.getChar();
	 					keima.drawImage(keimaimage, 0, 0, null);
 					}
/////CONTINUE INDENTING HERE///////
	 					//map 1 loop
 						while(blnMap1 == true){
	 						clip5.start();
	 						if(blnKeimaCont == true){
		 						keima.drawImage(keimaimage5, 0, 0, null);
		 						chrConvo = keima.getChar();
		 						keima.drawImage(keimaimage6, 0, 0, null);
		 						chrConvo = keima.getChar();
		 						keima.drawImage(keimaimage7, 0, 0, null);
		 						chrConvo = keima.getChar();
		 						keima.drawImage(keimaimage8, 0, 0, null);
		 						chrConvo = keima.getChar();
		 						keima.close();
		 						blnKeimaCont = false;
	 						}
				
	 						chrMove = ' ';
	 						chrMove = map.getChar();
	 						if(chrMove == 'w'){
								intHRow = intHRow - 1;
								if(strMap[intHRow][intHCol].equals("s11")){
									blnMap1 = false;
									blnWeaponShop = true;
									intHRow = intHRow + 1;
									intTempRow = intHRow;
									intTempCol = intHCol;
									clip5.stop();
								}else if(strMap[intHRow][intHCol].equals("w") || strMap[intHRow][intHCol].equals("wm1") || strMap[intHRow][intHCol].equals("wm2") || strMap[intHRow][intHCol].equals("wl1") || strMap[intHRow][intHCol].equals("wl2") || strMap[intHRow][intHCol].equals("wl3") || strMap[intHRow][intHCol].equals("wr1") || strMap[intHRow][intHCol].equals("wr2") || strMap[intHRow][intHCol].equals("wr3")){
									blnMap1 = false;
									blnGameOver = true;
									clip5.stop();
								}else if(strMap[intHRow][intHCol].equals("m1")){
									blnMonster1 = true;
									blnMap1 = false;
									blnBMap1 = true;
									blnBattle = true;
									intTempRow = intHRow;
									intTempCol = intHCol;
									clip5.stop();
								}else if(strMap[intHRow][intHCol].equals("m2")){
									blnMonster2 = true;
									blnMap1 = false;
									blnBMap1 = true;
									blnBattle = true;
									intTempRow = intHRow;
									intTempCol = intHCol;
									clip5.stop();
								}else if(strMap[intHRow][intHCol].equals("fa") || strMap[intHRow][intHCol].equals("fb")|| strMap[intHRow][intHCol].equals("fb")|| strMap[intHRow][intHCol].equals("h17") || strMap[intHRow][intHCol].equals("h21")|| strMap[intHRow][intHCol].equals("h23")|| strMap[intHRow][intHCol].equals("h24")|| strMap[intHRow][intHCol].equals("h25")|| strMap[intHRow][intHCol].equals("t")|| strMap[intHRow][intHCol].equals("fb")|| strMap[intHRow][intHCol].equals("s13")|| strMap[intHRow][intHCol].equals("s14")|| strMap[intHRow][intHCol].equals("s16") || strMap[intHRow][intHCol].equals("s11") ){
									intHRow = intHRow + 1;
								}else if(intHRow <= 0 && blnFirstWeapon == true){
									blnMap1 = false;
									blnMap2 = true;
									bln1to2 = true;
									intTempCol = intHCol;
									clip5.stop();
								}else if(intHRow <= 0 && blnFirstWeapon == false){
									intHRow = intHRow + 1;
									keima.drawImage(keimaimage9, 0, 0, null);
									chrConvo = keima.getChar();
									keima.drawImage(keimaimage, 0, 0, null);
								}
							}else if(chrMove == 's'){
								intHRow = intHRow + 1;
								if(strMap[intHRow][intHCol].equals("w") || strMap[intHRow][intHCol].equals("wm1") || strMap[intHRow][intHCol].equals("wm2") || strMap[intHRow][intHCol].equals("wl1") || strMap[intHRow][intHCol].equals("wl2") || strMap[intHRow][intHCol].equals("wl3") || strMap[intHRow][intHCol].equals("wr1") || strMap[intHRow][intHCol].equals("wr2") || strMap[intHRow][intHCol].equals("wr3")){
									blnMap1 = false;
									blnGameOver = true;
								}else if(strMap[intHRow][intHCol].equals("m1")){
									blnMonster1 = true;
									blnMap1 = false;
									blnBMap1 = true;
									blnBattle = true;
									intTempRow = intHRow;
									intTempCol = intHCol;
								}else if(strMap[intHRow][intHCol].equals("m2")){
									blnMonster2 = true;
									blnMap1 = false;
									blnBMap1 = true;
									blnBattle = true;
									intTempRow = intHRow;
									intTempCol = intHCol;
								}else if(strMap[intHRow][intHCol].equals("fa") || strMap[intHRow][intHCol].equals("t") || strMap[intHRow][intHCol].equals("h1") || strMap[intHRow][intHCol].equals("h2") || strMap[intHRow][intHCol].equals("h3") || strMap[intHRow][intHCol].equals("h4") || strMap[intHRow][intHCol].equals("h5") || strMap[intHRow][intHCol].equals("fb") || strMap[intHRow][intHCol].equals("s1") || strMap[intHRow][intHCol].equals("s2") || strMap[intHRow][intHCol].equals("s3") || strMap[intHRow][intHCol].equals("s4") || intHRow == 19){
									intHRow = intHRow - 1;
								}
							}else if(chrMove == 'a'){
								intHCol = intHCol - 1;
								if(strMap[intHRow][intHCol].equals("w") || strMap[intHRow][intHCol].equals("wm1") || strMap[intHRow][intHCol].equals("wm2") || strMap[intHRow][intHCol].equals("wl1") || strMap[intHRow][intHCol].equals("wl2") || strMap[intHRow][intHCol].equals("wl3") || strMap[intHRow][intHCol].equals("wr1") || strMap[intHRow][intHCol].equals("wr2") || strMap[intHRow][intHCol].equals("wr3")){
									blnMap1 = false;
									blnGameOver = true;
								}else if(strMap[intHRow][intHCol].equals("m1")){
									blnMonster1 = true;
									blnMap1 = false;
									blnBMap1 = true;
									blnBattle = true;
									intTempRow = intHRow;
									intTempCol = intHCol;
								}else if(strMap[intHRow][intHCol].equals("m2")){
									blnMonster2 = true;
									blnMap1 = false;
									blnBMap1 = true;
									blnBattle = true;
									intTempRow = intHRow;
									intTempCol = intHCol;
								}else if(strMap[intHRow][intHCol].equals("fa") || strMap[intHRow][intHCol].equals("fb") || strMap[intHRow][intHCol].equals("h5") || strMap[intHRow][intHCol].equals("h10") || strMap[intHRow][intHCol].equals("h15") || strMap[intHRow][intHCol].equals("h20") || strMap[intHRow][intHCol].equals("h25") || strMap[intHRow][intHCol].equals("h21") || strMap[intHRow][intHCol].equals("t") || strMap[intHRow][intHCol].equals("s4") || strMap[intHRow][intHCol].equals("s8") || strMap[intHRow][intHCol].equals("s12") || strMap[intHRow][intHCol].equals("s16") || intHCol == 0 || strMap[intHRow][intHCol].equals("h16") || strMap[intHRow][intHCol].equals("s14") ){
									intHCol = intHCol + 1;
								}
							}else if(chrMove == 'd'){
								intHCol = intHCol + 1;
								if(strMap[intHRow][intHCol].equals("w") || strMap[intHRow][intHCol].equals("wm1") || strMap[intHRow][intHCol].equals("wm2") || strMap[intHRow][intHCol].equals("wl1") || strMap[intHRow][intHCol].equals("wl2") || strMap[intHRow][intHCol].equals("wl3") || strMap[intHRow][intHCol].equals("wr1") || strMap[intHRow][intHCol].equals("wr2") || strMap[intHRow][intHCol].equals("wr3")){
									blnMap1 = false;
									blnGameOver = true;
								}else if(strMap[intHRow][intHCol].equals("m1")){
									blnMonster1 = true;
									blnMap1 = false;
									blnBMap1 = true;
									blnBattle = true;
									intTempRow = intHRow;
									intTempCol = intHCol;
								}else if(strMap[intHRow][intHCol].equals("m2")){
									blnMonster2 = true;
									blnMap1 = false;
									blnBMap1 = true;
									blnBattle = true;
									intTempRow = intHRow;
									intTempCol = intHCol;
								}else if(strMap[intHRow][intHCol].equals("fa") || strMap[intHRow][intHCol].equals("t") || strMap[intHRow][intHCol].equals("h1") || strMap[intHRow][intHCol].equals("h6") || strMap[intHRow][intHCol].equals("h11") || strMap[intHRow][intHCol].equals("h16") || strMap[intHRow][intHCol].equals("h21") ||strMap[intHRow][intHCol].equals("fc") ||  strMap[intHRow][intHCol].equals("fa") || strMap[intHRow][intHCol].equals("fb") || intHCol == 19 || strMap[intHRow][intHCol].equals("h18")|| strMap[intHRow][intHCol].equals("s16") || strMap[intHRow][intHCol].equals("h23")  ){
									intHCol = intHCol -1;
								}
							}else{
								chrMove = 's';
							}
							
							System.out.println("Hero Column: "+intHCol+"   Hero Row: "+intHRow);
							
							for(intRow = 0; intRow < 20; intRow++){
	 							for(intCol = 0; intCol < 20; intCol++){
									//draw grass
						 			if(strMap[intRow][intCol].equals("g")){
						 				map.drawImage(grassimage, intCol*20, intRow*20, null);			
						 			//draw fences 		
						 			}else if(strMap[intRow][intCol].equals("fa")){
		 								map.drawImage(fenceimage, intCol*20, intRow*20, null);		
		 							}else if(strMap[intRow][intCol].equals("f1")){
		 								map.drawImage(fenceimage1, intCol*20, intRow*20, null);		
		 							}else if(strMap[intRow][intCol].equals("f2")){
		 								map.drawImage(fenceimage2, intCol*20, intRow*20, null);	
		 							}else if(strMap[intRow][intCol].equals("f3")){
		 								map.drawImage(fenceimage3, intCol*20, intRow*20, null);		
		 							}else if(strMap[intRow][intCol].equals("f4")){
		 								map.drawImage(fenceimage4, intCol*20, intRow*20, null);	
		 							}else if(strMap[intRow][intCol].equals("fb")){
		 								map.drawImage(fenceimageB, intCol*20, intRow*20, null);	
		 							}else if(strMap[intRow][intCol].equals("fc")){
		 								map.drawImage(fenceimageC, intCol*20, intRow*20, null);
		 							//draw flower
	 								}else if(strMap[intRow][intCol].equals("p")){
		 								map.drawImage(flowerimage, intCol*20, intRow*20, null);		
		 							//draw tree 		
		 							}else if(strMap[intRow][intCol].equals("t")){
		 								map.drawImage(treeimage, intCol*20, intRow*20, null);	
		 							//draw water		 		
		 							}else if(strMap[intRow][intCol].equals("w")){
		 								map.drawImage(waterimage, intCol*20, intRow*20, null);			 		
		 							}else if(strMap[intRow][intCol].equals("wc1")){
		 								map.drawImage(waterimageC1, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("wc2")){
		 								map.drawImage(waterimageC2, intCol*20, intRow*20, null);	
		 							}else if(strMap[intRow][intCol].equals("wl1")){
		 								map.drawImage(waterimageL1, intCol*20, intRow*20, null); 	
		 							}else if(strMap[intRow][intCol].equals("wl2")){
		 								map.drawImage(waterimageL2, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("wl3")){
		 								map.drawImage(waterimageL3, intCol*20, intRow*20, null);	
		 							}else if(strMap[intRow][intCol].equals("wm1")){
		 								map.drawImage(waterimageM1, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("wm2")){
		 								map.drawImage(waterimageM2, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("wr1")){
		 								map.drawImage(waterimageR1, intCol*20, intRow*20, null);	
		 							}else if(strMap[intRow][intCol].equals("wr2")){
		 								map.drawImage(waterimageR2, intCol*20, intRow*20, null);	
		 							}else if(strMap[intRow][intCol].equals("wr3")){
		 								map.drawImage(waterimageR3, intCol*20, intRow*20, null);	 	
	 								}else if(strMap[intRow][intCol].equals("h1")){
		 								map.drawImage(homeimage1, intCol*20, intRow*20, null);	
		 							}else if(strMap[intRow][intCol].equals("h2")){
		 								map.drawImage(homeimage2, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("h3")){
		 								map.drawImage(homeimage3, intCol*20, intRow*20, null);	 
		 							}else if(strMap[intRow][intCol].equals("h4")){
		 								map.drawImage(homeimage4, intCol*20, intRow*20, null);	 		
		 							}else if(strMap[intRow][intCol].equals("h5")){
		 								map.drawImage(homeimage5, intCol*20, intRow*20, null);	 
		 							}else if(strMap[intRow][intCol].equals("h6")){
		 								map.drawImage(homeimage6, intCol*20, intRow*20, null);	 		
		 							}else if(strMap[intRow][intCol].equals("h7")){
		 								map.drawImage(homeimage7, intCol*20, intRow*20, null);	 	
		 							}else if(strMap[intRow][intCol].equals("h8")){
		 								map.drawImage(homeimage8, intCol*20, intRow*20, null);	 
		 							}else if(strMap[intRow][intCol].equals("h9")){
		 								map.drawImage(homeimage9, intCol*20, intRow*20, null);	 		
		 							}else if(strMap[intRow][intCol].equals("h10")){
		 								map.drawImage(homeimage10, intCol*20, intRow*20, null);	 
		 							}else if(strMap[intRow][intCol].equals("h11")){
		 								map.drawImage(homeimage11, intCol*20, intRow*20, null);	 	
		 							}else if(strMap[intRow][intCol].equals("h12")){
		 								map.drawImage(homeimage12, intCol*20, intRow*20, null);	 	
		 							}else if(strMap[intRow][intCol].equals("h13")){
		 								map.drawImage(homeimage13, intCol*20, intRow*20, null);	 	
		 							}else if(strMap[intRow][intCol].equals("h14")){
		 								map.drawImage(homeimage14, intCol*20, intRow*20, null);	 	
		 							}else if(strMap[intRow][intCol].equals("h15")){
		 								map.drawImage(homeimage15, intCol*20, intRow*20, null);	 
		 							}else if(strMap[intRow][intCol].equals("h16")){
		 								map.drawImage(homeimage16, intCol*20, intRow*20, null);	 	
		 							}else if(strMap[intRow][intCol].equals("h17")){
		 								map.drawImage(homeimage17, intCol*20, intRow*20, null);	 	
		 							}else if(strMap[intRow][intCol].equals("h18")){
		 								map.drawImage(homeimage18, intCol*20, intRow*20, null);	 
		 							}else if(strMap[intRow][intCol].equals("h19")){
		 								map.drawImage(homeimage19, intCol*20, intRow*20, null);	 
		 							}else if(strMap[intRow][intCol].equals("h20")){
		 								map.drawImage(homeimage20, intCol*20, intRow*20, null);	 		
		 							}else if(strMap[intRow][intCol].equals("h21")){
		 								map.drawImage(homeimage21, intCol*20, intRow*20, null);	 	
		 							}else if(strMap[intRow][intCol].equals("h23")){
		 								map.drawImage(homeimage23, intCol*20, intRow*20, null);	 
		 							}else if(strMap[intRow][intCol].equals("h24")){
		 								map.drawImage(homeimage24, intCol*20, intRow*20, null);	 		
		 							}else if(strMap[intRow][intCol].equals("h25")){
		 								map.drawImage(homeimage25, intCol*20, intRow*20, null);	 		
	 								}else if(strMap[intRow][intCol].equals("s1")){
		 								map.drawImage(shopimage1, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("s2")){
		 								map.drawImage(shopimage2, intCol*20, intRow*20, null);		
		 							}else if(strMap[intRow][intCol].equals("s3")){
		 								map.drawImage(shopimage3, intCol*20, intRow*20, null);		 	 	
	 								}else if(strMap[intRow][intCol].equals("s4")){
		 								map.drawImage(shopimage4, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("s5")){
		 								map.drawImage(shopimage5, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("s6")){
		 								map.drawImage(shopimage6, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("s7")){
		 								map.drawImage(shopimage7, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("s8")){
		 								map.drawImage(shopimage8, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("s9")){
		 								map.drawImage(shopimage9, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("s10")){
		 								map.drawImage(shopimage10, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("s11")){
		 								map.drawImage(shopimage11, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("s12")){
		 								map.drawImage(shopimage12, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("s13")){
		 								map.drawImage(shopimage13, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("s14")){
		 								map.drawImage(shopimage14, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("s15")){
		 								map.drawImage(shopimage15, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("s16")){
		 								map.drawImage(shopimage16, intCol*20, intRow*20, null);
	 								}else if(strMap[intRow][intCol].equals("m1")){
		 								map.drawImage(monsterimage1, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("m2")){
		 								map.drawImage(monsterimage2, intCol*20, intRow*20, null);
	 								}
	 							}
 							}
	 
 							if(chrMove == 'w'){
 								map.drawImage(heroimageU, intHCol*20, intHRow*20, null);	
							}else if(chrMove == 's'){
								map.drawImage(heroimageD, intHCol*20, intHRow*20, null);	
							}else if(chrMove == 'a'){
								map.drawImage(heroimageL, intHCol*20, intHRow*20, null);
							}else if(chrMove == 'd'){
								map.drawImage(heroimageR, intHCol*20, intHRow*20, null);
							}
							
			 			}
			 			
			 			//Weapon Shop
			 			while(blnWeaponShop == true){
				 			map.clear();
				 			if(blnFirstTime == true){
				 				map.drawImage(wshopimage1, 0, 0, null);
								chrConvo = map.getChar();
								map.drawImage(wshopimage2, 0, 0, null);
								chrConvo = map.getChar();
								map.drawImage(wshopimage3, 0, 0, null);
								chrConvo = map.getChar();
								blnFirstTime = false;
								blnKeimaCont = true;
								blnFirstWeapon = true;
								blnWeap1 = true;
								intWeapAtk = 10;
							}
							map.drawImage(wshopimage4, 0, 0, null);
							chrConvo = map.getChar();
							if(chrConvo == 'B' || chrConvo == 'b'){
								map.drawImage(wshopimage5, 0, 0, null);
								chrConvo = map.getChar();
								if(chrConvo == 'L' || chrConvo == 'l' && intLv >= 3 && blnWeap2 == false){
									map.drawImage(wshopimage8, 0, 0, null);
									blnWeap1 = false;
									blnWeap2 = true;
									blnWeap3 = false;
									blnWeap4 = false;
									blnWeap5 = false;
									blnWeap6 = false;
									intWeapAtk = 20;
									chrConvo = map.getChar();
								}else if(((chrConvo == 'L' || chrConvo == 'l') && intLv < 3) || ((chrConvo == 'B' || chrConvo == 'b') && intLv < 5) || ((chrConvo == 'G' || chrConvo == 'g') && intLv < 7) || ((chrConvo == 'C' || chrConvo == 'c') && intLv < 10) || ((chrConvo == 'D' || chrConvo == 'd') && intLv < 15)){
									map.drawImage(wshopimage6, 0, 0, null);
									chrConvo = map.getChar();
								}else if((chrConvo == 'B' || chrConvo == 'b') && intLv >= 5 && blnWeap3 == false){
									map.drawImage(wshopimage8, 0, 0, null);
									blnWeap1 = false;
									blnWeap2 = false;
									blnWeap3 = true;
									blnWeap4 = false;
									blnWeap5 = false;
									blnWeap6 = false;
									intWeapAtk = 45;
									chrConvo = map.getChar();
								}else if((chrConvo == 'G' || chrConvo == 'g') && intLv >= 7 && blnWeap4 == false){
									map.drawImage(wshopimage8, 0, 0, null);
									blnWeap1 = false;
									blnWeap2 = false;
									blnWeap3 = false;
									blnWeap4 = true;
									blnWeap5 = false;
									blnWeap6 = false;
									intWeapAtk = 60;
									chrConvo = map.getChar();
								}else if((chrConvo == 'C' || chrConvo == 'c') && intLv >= 10 && blnWeap5 == false){
									map.drawImage(wshopimage8, 0, 0, null);
									blnWeap1 = false;
									blnWeap2 = false;
									blnWeap3 = false;
									blnWeap4 = false;
									blnWeap5 = true;
									blnWeap6 = false;
									intWeapAtk = 100;
									chrConvo = map.getChar();
								}else if((chrConvo == 'D' || chrConvo == 'd') && intLv == 15 && blnWeap6 == false){
									map.drawImage(wshopimage8, 0, 0, null);
									blnWeap1 = false;
									blnWeap2 = false;
									blnWeap3 = false;
									blnWeap4 = false;
									blnWeap5 = false;
									blnWeap6 = true;
									intWeapAtk = 200;
									chrConvo = map.getChar();
								}else if(((chrConvo == 'L' || chrConvo == 'l') && blnWeap2 == true) || ((chrConvo == 'B' || chrConvo == 'b') && blnWeap3 == true) || ((chrConvo == 'G' || chrConvo == 'g') && blnWeap4 == true) || ((chrConvo == 'C' || chrConvo == 'c') && blnWeap5 == true) || ((chrConvo == 'D' || chrConvo == 'd') && blnWeap6 == true)){
									map.drawImage(wshopimage10, 0, 0, null);
									chrConvo = map.getChar();
								}else{
									map.drawImage(wshopimage9, 0, 0, null);
									chrConvo = map.getChar();
								}
							}else if(chrConvo == 'L' || chrConvo == 'l'){
								map.drawImage(wshopimage7, 0, 0, null);
								chrConvo = map.getChar();
								blnWeaponShop = false;
								blnMap1 = true;
								blnWto1 = true;
								clip5.start();
							}else{
								map.drawImage(wshopimage9, 0, 0, null);
								chrConvo = map.getChar();
							}
						}
						
			 			//loads map 2
			 			strMap = CurranX.loadmap("Maps/map2.csv");
			 			if(bln1to2 == true){
							intHRow = 18;
							intHCol = intTempCol;
						}else if(bln3to2 == true){
							intHCol = 18;
							intHRow = intTempRow;
						}else if(bln4to2 == true){
							intHRow = 1;
							intHCol = intTempCol;
						}else if(blnDto2 == true || blnBMap2 == true){
							intHRow = intTempRow;
							intHCol = intTempCol;
						}
						
						chrMove = ' ';
			 			
						for(intRow = 0; intRow < 20; intRow++){
	 						for(intCol = 0; intCol < 20; intCol++){
									//draw grass
						 		if(strMap[intRow][intCol].equals("g")){
						 			map.drawImage(grassimage, intCol*20, intRow*20, null);			
		 						//draw flower
	 							}else if(strMap[intRow][intCol].equals("p")){
		 							map.drawImage(flowerimage, intCol*20, intRow*20, null);		
		 						//draw tree 		
		 						}else if(strMap[intRow][intCol].equals("t")){
		 							map.drawImage(treeimage, intCol*20, intRow*20, null);	
		 						//draw water		 		
		 						}else if(strMap[intRow][intCol].equals("w")){
		 							map.drawImage(waterimage, intCol*20, intRow*20, null);			 		
		 						}else if(strMap[intRow][intCol].equals("wc1")){
		 							map.drawImage(waterimageC1, intCol*20, intRow*20, null);
		 						}else if(strMap[intRow][intCol].equals("wc2")){
		 							map.drawImage(waterimageC2, intCol*20, intRow*20, null);	
		 						}else if(strMap[intRow][intCol].equals("wl1")){
		 							map.drawImage(waterimageL1, intCol*20, intRow*20, null); 	
		 						}else if(strMap[intRow][intCol].equals("wl2")){
		 							map.drawImage(waterimageL2, intCol*20, intRow*20, null);
		 						}else if(strMap[intRow][intCol].equals("wl3")){
		 							map.drawImage(waterimageL3, intCol*20, intRow*20, null);	
		 						}else if(strMap[intRow][intCol].equals("wm1")){
		 							map.drawImage(waterimageM1, intCol*20, intRow*20, null);
		 						}else if(strMap[intRow][intCol].equals("wm2")){
		 							map.drawImage(waterimageM2, intCol*20, intRow*20, null);
		 						}else if(strMap[intRow][intCol].equals("wr1")){
		 							map.drawImage(waterimageR1, intCol*20, intRow*20, null);	
		 						}else if(strMap[intRow][intCol].equals("wr2")){
		 							map.drawImage(waterimageR2, intCol*20, intRow*20, null);	
		 						}else if(strMap[intRow][intCol].equals("wr3")){
		 							map.drawImage(waterimageR3, intCol*20, intRow*20, null);	
		 						//drawing monsters 	
	 							}else if(strMap[intRow][intCol].equals("m3")){
		 							map.drawImage(monsterimage3, intCol*20, intRow*20, null);
		 						}else if(strMap[intRow][intCol].equals("m4")){
		 							map.drawImage(monsterimage4, intCol*20, intRow*20, null);
		 						}else if(strMap[intRow][intCol].equals("m5")){
		 							map.drawImage(monsterimage5, intCol*20, intRow*20, null);
		 						}else if(strMap[intRow][intCol].equals("m6")){
		 							map.drawImage(monsterimage6, intCol*20, intRow*20, null);
		 						}else if(strMap[intRow][intCol].equals("dd")){
		 							map.drawImage(devilimage, intCol*20, intRow*20, null);
		 						//Drawing dirt
		 						}else if(strMap[intRow][intCol].equals("d")){
		 							map.drawImage(dirtimage, intCol*20, intRow*20, null);
		 						//drawing cave
		 						}else if(strMap[intRow][intCol].equals("c")){
		 							map.drawImage(caveimage, intCol*20, intRow*20, null);
		 						}else if(strMap[intRow][intCol].equals("ce")){
		 							map.drawImage(caveimageE, intCol*20, intRow*20, null);
		 						}else if(strMap[intRow][intCol].equals("cl")){
		 							map.drawImage(caveimageL, intCol*20, intRow*20, null);
		 						}else if(strMap[intRow][intCol].equals("cr")){
		 							map.drawImage(caveimageR, intCol*20, intRow*20, null);
		 						//Drawing road
		 						}else if(strMap[intRow][intCol].equals("r1")){
		 							map.drawImage(roadimage1, intCol*20, intRow*20, null);
		 						}else if(strMap[intRow][intCol].equals("r2")){
		 							map.drawImage(roadimage2, intCol*20, intRow*20, null);
		 						//drawing stone
		 						}else if(strMap[intRow][intCol].equals("s")){
		 							map.drawImage(stoneimage, intCol*20, intRow*20, null);
		 						//Drawing fences
	 							}else if(strMap[intRow][intCol].equals("fa")){
		 							map.drawImage(fenceimage, intCol*20, intRow*20, null);		
		 						}else if(strMap[intRow][intCol].equals("f1")){
		 							map.drawImage(fenceimage1, intCol*20, intRow*20, null);		
		 						}else if(strMap[intRow][intCol].equals("f2")){
	 								map.drawImage(fenceimage2, intCol*20, intRow*20, null);	
	 							//draw statue
 								}else if(strMap[intRow][intCol].equals("st1")){
	 								map.drawImage(statueimage1, intCol*20, intRow*20, null);	
 								}else if(strMap[intRow][intCol].equals("st2")){
	 								map.drawImage(statueimage2, intCol*20, intRow*20, null);	
 								}
	 						}
 						}
 						//draw hero
 						if(bln1to2 == true){
 							map.drawImage(heroimageU, intHCol*20, intHRow*20, null);	
						}else if(bln3to2 == true){
							map.drawImage(heroimageL, intHCol*20, intHRow*20, null);
						}else if(bln4to2 == true || blnDto2 == true || blnBMap2 == true){
							map.drawImage(heroimageD, intHCol*20, intHRow*20, null);
						}
						bln1to2 = false;
						bln3to2 = false;
						bln4to2 = false;
 						blnDto2 = false;
 						
 						if(blnBMap2 == true){
							while(intAP > 0){
								stats.clear();
								intAttack = intWeapAtk + intSTR;
	 							intMaxAtk = (int)(intAttack * 0.9);
								intMinAtk = (int)(intAttack * 0.5);
								dblMaxEXP = (int)(10 * (Math.pow(intLv, 2)));
								dblEXPPerc = (int)((dblCurrentEXP / dblMaxEXP) * 100);
	 							stats.drawImage(statsimage,0,0,null);
								stats.drawString(Integer.toString(intLv), 60, 90);
								stats.drawString(intCurrentHP +"/"+ intHP, 60, 125);
								stats.drawString(intCurrentMP +"/"+ intMP, 60, 143);
								stats.drawString(dblCurrentEXP +"/"+dblMaxEXP +" ("+dblEXPPerc+"%)", 60, 162);
								stats.drawString(Integer.toString(intAttack), 60, 205);
								stats.drawString(Integer.toString(intDef), 250, 135);
								stats.drawString(Double.toString(dblLuck), 60, 260);
								stats.drawString(intMinAtk +" ~ "+ intMaxAtk, 250, 115);
								stats.drawString(Integer.toString(intAP),105, 288);
								chrConvo = stats.getChar();
								if(chrConvo == 'h' || chrConvo == 'H'){
									intHP = intHP + 10;
									intAP = intAP - 1;
								}else if(chrConvo == 'm' || chrConvo == 'M'){
									intMP = intMP + 10;
									intAP = intAP - 1;
								}else if(chrConvo == 's' || chrConvo == 'S'){
									intSTR = intSTR + 1;
									intAP = intAP - 1;
								}else if(chrConvo == 'l' || chrConvo == 'L'){
									dblLuck = dblLuck + 1;
									intAP = intAP - 1;
								}else if(chrConvo == 'd' || chrConvo == 'D'){
									intDef = intDef + 1;
									intAP = intAP - 1;
								}
								if(blnWeap1 == true){
									stats.drawString("=RUSTY SWORD OBTAINED=",180, 215);
								}else if(blnWeap2 == true){
									stats.drawString("=LONG SWORD OBTAINED=",180, 215);
								}else if(blnWeap3 == true){
									stats.drawString("=BUSTER SWORD OBTAINED=",180, 215);
								}else if(blnWeap4 == true){
									stats.drawString("=GLADIUS OBTAINED=",185, 215);
								}else if(blnWeap5 == true){
									stats.drawString("=CLAYMORE OBTAINED=",180, 215);
								}else if(blnWeap6 == true){
									stats.drawString("=DRAGON BLADE OBTAINED=",180, 215);
								}
								
								if(blndevilbuff == true){
									stats.drawString("**{DEVIL'S CONTRACT}**", 185, 235);
								}else if(blngoddessbuff == true){
									stats.drawString("-*GODDESS' BLESSINGS*-", 185, 235);
								}
							}
						}
						blnBMap2 = false;
						
						stats.clear();
						intAttack = intWeapAtk + intSTR;
	 					intMaxAtk = (int)(intAttack * 0.9);
						intMinAtk = (int)(intAttack * 0.5);
						dblMaxEXP = (int)(10 * (Math.pow(intLv, 2)));
						dblEXPPerc = (int)((dblCurrentEXP / dblMaxEXP) * 100);
	 					stats.drawImage(statsimage,0,0,null);
						stats.drawString(Integer.toString(intLv), 60, 90);
						stats.drawString(intCurrentHP +"/"+ intHP, 60, 125);
						stats.drawString(intCurrentMP +"/"+ intMP, 60, 143);
						stats.drawString(dblCurrentEXP +"/"+dblMaxEXP +" ("+dblEXPPerc+"%)", 60, 162);
						stats.drawString(Integer.toString(intAttack), 60, 205);
						stats.drawString(Integer.toString(intDef), 250, 135);
						stats.drawString(Double.toString(dblLuck), 60, 260);
						stats.drawString(intMinAtk +" ~ "+ intMaxAtk, 250, 115);
						stats.drawString(Integer.toString(intAP),105, 288);
 						
			 			while(blnMap2 == true){
				 			chrMove = ' ';
				 			chrMove = map.getChar();
							if(chrMove == 'w'){
								intHRow = intHRow - 1;
								if(strMap[intHRow][intHCol].equals("w") || strMap[intHRow][intHCol].equals("wm1") || strMap[intHRow][intHCol].equals("wm2") || strMap[intHRow][intHCol].equals("wl1") || strMap[intHRow][intHCol].equals("wl2") || strMap[intHRow][intHCol].equals("wl3") || strMap[intHRow][intHCol].equals("wr1") || strMap[intHRow][intHCol].equals("wr2") || strMap[intHRow][intHCol].equals("wr3")){
									blnMap2 = false;
									blnGameOver = true;
								}else if(strMap[intHRow][intHCol].equals("m3")){
									blnMonster3 = true;
									blnMap2 = false;
									blnBMap2 = true;
									blnBattle = true;
									intTempRow = intHRow;
									intTempCol = intHCol;
								}else if(strMap[intHRow][intHCol].equals("m4")){
									blnMonster4 = true;
									blnMap2 = false;
									blnBMap2 = true;
									blnBattle = true;
									intTempRow = intHRow;
									intTempCol = intHCol;
								}else if(strMap[intHRow][intHCol].equals("m5")){
									blnMonster5 = true;
									blnMap2 = false;
									blnBMap2 = true;
									blnBattle = true;
									intTempRow = intHRow;
									intTempCol = intHCol;
								}else if(strMap[intHRow][intHCol].equals("m6")){
									blnMonster6 = true;
									blnMap2 = false;
									blnBMap2 = true;
									blnBattle = true;
									intTempRow = intHRow;
									intTempCol = intHCol;
								}else if(strMap[intHRow][intHCol].equals("t") || strMap[intHRow][intHCol].equals("s") || strMap[intHRow][intHCol].equals("c") || strMap[intHRow][intHCol].equals("st2")){
									intHRow = intHRow + 1;
								}else if(strMap[intHRow][intHCol].equals("dd")){
									blnMap2 = false;
									blnDevil = true;
									intHRow = intHRow + 1;
									intTempRow = intHRow;
									intTempCol = intHCol;
								}else if(intHRow <= 0){
									blnMap2 = false;
									blnMap4 = true;
									bln2to4 = true;
									intTempCol = intHCol;
								}
							}else if(chrMove == 's'){
								intHRow = intHRow + 1;
								if(strMap[intHRow][intHCol].equals("w") || strMap[intHRow][intHCol].equals("wm1") || strMap[intHRow][intHCol].equals("wm2") || strMap[intHRow][intHCol].equals("wl1") || strMap[intHRow][intHCol].equals("wl2") || strMap[intHRow][intHCol].equals("wl3") || strMap[intHRow][intHCol].equals("wr1") || strMap[intHRow][intHCol].equals("wr2") || strMap[intHRow][intHCol].equals("wr3")){
									blnMap2 = false;
									blnGameOver = true;
								}else if(strMap[intHRow][intHCol].equals("m3")){
									blnMonster3 = true;
									blnMap2 = false;
									blnBMap2 = true;
									blnBattle = true;
									intTempRow = intHRow;
									intTempCol = intHCol;
								}else if(strMap[intHRow][intHCol].equals("m4")){
									blnMonster4 = true;
									blnMap2 = false;
									blnBMap2 = true;
									blnBattle = true;
									intTempRow = intHRow;
									intTempCol = intHCol;
								}else if(strMap[intHRow][intHCol].equals("m5")){
									blnMonster5 = true;
									blnMap2 = false;
									blnBMap2 = true;
									blnBattle = true;
									intTempRow = intHRow;
									intTempCol = intHCol;
								}else if(strMap[intHRow][intHCol].equals("m6")){
									blnMonster6 = true;
									blnMap2 = false;
									blnBMap2 = true;
									blnBattle = true;
									intTempRow = intHRow;
									intTempCol = intHCol;
								}else if(strMap[intHRow][intHCol].equals("t") || strMap[intHRow][intHCol].equals("st1") || strMap[intHRow][intHCol].equals("f1") || strMap[intHRow][intHCol].equals("fa") || strMap[intHRow][intHCol].equals("f2") || strMap[intHRow][intHCol].equals("s")){
									intHRow = intHRow - 1;
								}else if(strMap[intHRow][intHCol].equals("dd")){
									blnMap2 = false;
									blnDevil = true;
									intHRow = intHRow - 1;
									intTempRow = intHRow;
									intTempCol = intHCol;
								}else if(intHRow >= 19){
									blnMap2 = false;
									blnMap1 = true;
									bln2to1 = true;
									intTempRow = intHRow;
									intTempCol = intHCol;
									clip5.start();
								}
							}else if(chrMove == 'a'){
								intHCol = intHCol - 1;
								if(strMap[intHRow][intHCol].equals("w") || strMap[intHRow][intHCol].equals("wm1") || strMap[intHRow][intHCol].equals("wm2") || strMap[intHRow][intHCol].equals("wl1") || strMap[intHRow][intHCol].equals("wl2") || strMap[intHRow][intHCol].equals("wl3") || strMap[intHRow][intHCol].equals("wr1") || strMap[intHRow][intHCol].equals("wr2") || strMap[intHRow][intHCol].equals("wr3")){
									blnMap2 = false;
									blnGameOver = true;
								}else if(strMap[intHRow][intHCol].equals("m3")){
									blnMonster3 = true;
									blnMap2 = false;
									blnBMap2 = true;
									blnBattle = true;
									intTempRow = intHRow;
									intTempCol = intHCol;
								}else if(strMap[intHRow][intHCol].equals("m4")){
									blnMonster4 = true;
									blnMap2 = false;
									blnBMap2 = true;
									blnBattle = true;
									intTempRow = intHRow;
									intTempCol = intHCol;
								}else if(strMap[intHRow][intHCol].equals("m5")){
									blnMonster5 = true;
									blnMap2 = false;
									blnBMap2 = true;
									blnBattle = true;
									intTempRow = intHRow;
									intTempCol = intHCol;
								}else if(strMap[intHRow][intHCol].equals("m6")){
									blnMonster6 = true;
									blnMap2 = false;
									blnBMap2 = true;
									blnBattle = true;
									intTempRow = intHRow;
									intTempCol = intHCol;
								}else if(strMap[intHRow][intHCol].equals("dd")){
									blnMap2 = false;
									blnDevil = true;
									intHCol = intHCol + 1;
									intTempRow = intHRow;
									intTempCol = intHCol;
								}else if(strMap[intHRow][intHCol].equals("t") || strMap[intHRow][intHCol].equals("fa") || strMap[intHRow][intHCol].equals("st1") || strMap[intHRow][intHCol].equals("st2") || strMap[intHRow][intHCol].equals("s") || strMap[intHRow][intHCol].equals("c")){
									intHCol = intHCol + 1;
								}
							}else if(chrMove == 'd'){
								intHCol = intHCol + 1;
								if(strMap[intHRow][intHCol].equals("w") || strMap[intHRow][intHCol].equals("wm1") || strMap[intHRow][intHCol].equals("wm2") || strMap[intHRow][intHCol].equals("wl1") || strMap[intHRow][intHCol].equals("wl2") || strMap[intHRow][intHCol].equals("wl3") || strMap[intHRow][intHCol].equals("wr1") || strMap[intHRow][intHCol].equals("wr2") || strMap[intHRow][intHCol].equals("wr3")){
									blnMap2 = false;
									blnGameOver = true;
								}else if(strMap[intHRow][intHCol].equals("m3")){
									blnMonster3 = true;
									blnMap2 = false;
									blnBMap2 = true;
									blnBattle = true;
									intTempRow = intHRow;
									intTempCol = intHCol;
								}else if(strMap[intHRow][intHCol].equals("m4")){
									blnMonster4 = true;
									blnMap2 = false;
									blnBMap2 = true;
									blnBattle = true;
									intTempRow = intHRow;
									intTempCol = intHCol;
								}else if(strMap[intHRow][intHCol].equals("m5")){
									blnMonster5 = true;
									blnMap2 = false;
									blnBMap2 = true;
									blnBattle = true;
									intTempRow = intHRow;
									intTempCol = intHCol;
								}else if(strMap[intHRow][intHCol].equals("m6")){
									blnMonster6 = true;
									blnMap2 = false;
									blnBMap2 = true;
									blnBattle = true;
									intTempRow = intHRow;
									intTempCol = intHCol;
								}else if(strMap[intHRow][intHCol].equals("t") || strMap[intHRow][intHCol].equals("fa") || strMap[intHRow][intHCol].equals("st1") || strMap[intHRow][intHCol].equals("st2") || strMap[intHRow][intHCol].equals("s") || strMap[intHRow][intHCol].equals("c")){
									intHCol = intHCol - 1;
								}else if(strMap[intHRow][intHCol].equals("dd")){
									blnMap2 = false;
									blnDevil = true;
									intHCol = intHCol - 1;
									intTempRow = intHRow;
									intTempCol = intHCol;
								}else if(intHCol >=19){
									blnMap2 = false;
									blnMap3 = true;
									bln2to3 = true;
									intTempRow = intHRow;
								}
							}else{
								chrMove = 's';
							}
							
							System.out.println("Hero Column: "+intHCol+"   Hero Row: "+intHRow);
							
							for(intRow = 0; intRow < 20; intRow++){
	 							for(intCol = 0; intCol < 20; intCol++){
									//draw grass
							 		if(strMap[intRow][intCol].equals("g")){
							 			map.drawImage(grassimage, intCol*20, intRow*20, null);			
		 							//draw flower
	 								}else if(strMap[intRow][intCol].equals("p")){
		 								map.drawImage(flowerimage, intCol*20, intRow*20, null);		
		 							//draw tree 		
		 							}else if(strMap[intRow][intCol].equals("t")){
		 								map.drawImage(treeimage, intCol*20, intRow*20, null);	
		 							//draw water		 		
		 							}else if(strMap[intRow][intCol].equals("w")){
		 								map.drawImage(waterimage, intCol*20, intRow*20, null);			 		
		 							}else if(strMap[intRow][intCol].equals("wc1")){
		 								map.drawImage(waterimageC1, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("wc2")){
		 								map.drawImage(waterimageC2, intCol*20, intRow*20, null);	
		 							}else if(strMap[intRow][intCol].equals("wl1")){
		 								map.drawImage(waterimageL1, intCol*20, intRow*20, null); 	
		 							}else if(strMap[intRow][intCol].equals("wl2")){
		 								map.drawImage(waterimageL2, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("wl3")){
		 								map.drawImage(waterimageL3, intCol*20, intRow*20, null);	
		 							}else if(strMap[intRow][intCol].equals("wm1")){
		 								map.drawImage(waterimageM1, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("wm2")){
		 								map.drawImage(waterimageM2, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("wr1")){
		 								map.drawImage(waterimageR1, intCol*20, intRow*20, null);	
		 							}else if(strMap[intRow][intCol].equals("wr2")){
		 								map.drawImage(waterimageR2, intCol*20, intRow*20, null);	
		 							}else if(strMap[intRow][intCol].equals("wr3")){
		 								map.drawImage(waterimageR3, intCol*20, intRow*20, null);	
		 							//drawing monsters 	
	 								}else if(strMap[intRow][intCol].equals("m3")){
		 								map.drawImage(monsterimage3, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("m4")){
		 								map.drawImage(monsterimage4, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("m5")){
		 								map.drawImage(monsterimage5, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("m6")){
		 								map.drawImage(monsterimage6, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("dd")){
		 								map.drawImage(devilimage, intCol*20, intRow*20, null);
		 							//Drawing dirt
		 							}else if(strMap[intRow][intCol].equals("d")){
		 								map.drawImage(dirtimage, intCol*20, intRow*20, null);
		 							//drawing cave
		 							}else if(strMap[intRow][intCol].equals("c")){
		 								map.drawImage(caveimage, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("ce")){
		 								map.drawImage(caveimageE, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("cl")){
		 								map.drawImage(caveimageL, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("cr")){
		 								map.drawImage(caveimageR, intCol*20, intRow*20, null);
		 							//Drawing road
		 							}else if(strMap[intRow][intCol].equals("r1")){
		 								map.drawImage(roadimage1, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("r2")){
		 								map.drawImage(roadimage2, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("s")){
		 								map.drawImage(stoneimage, intCol*20, intRow*20, null);
		 							//Drawing fences
	 								}else if(strMap[intRow][intCol].equals("fa")){
		 								map.drawImage(fenceimage, intCol*20, intRow*20, null);		
		 							}else if(strMap[intRow][intCol].equals("f1")){
		 								map.drawImage(fenceimage1, intCol*20, intRow*20, null);		
		 							}else if(strMap[intRow][intCol].equals("f2")){
	 									map.drawImage(fenceimage2, intCol*20, intRow*20, null);	
 									}else if(strMap[intRow][intCol].equals("st1")){
	 									map.drawImage(statueimage1, intCol*20, intRow*20, null);	
 									}else if(strMap[intRow][intCol].equals("st2")){
	 									map.drawImage(statueimage2, intCol*20, intRow*20, null);	
 									}
	 							}
 							}
							if(chrMove == 'w'){
 								map.drawImage(heroimageU, intHCol*20, intHRow*20, null);	
							}else if(chrMove == 's'){
								map.drawImage(heroimageD, intHCol*20, intHRow*20, null);	
							}else if(chrMove == 'a'){
								map.drawImage(heroimageL, intHCol*20, intHRow*20, null);
							}else if(chrMove == 'd'){
								map.drawImage(heroimageR, intHCol*20, intHRow*20, null);
							}
			 			}
			 			
			 			//contracting with the devil
			 			while(blnDevil == true){
				 			map.clear();
				 			if(intLv < 5){
					 			map.drawImage(devilimage3, 0, 0, null);
					 			chrConvo = map.getChar();
					 			map.drawImage(devilimage4, 0, 0, null);
					 			chrConvo = map.getChar();
					 			map.drawImage(devilimage5, 0, 0, null);
					 			chrConvo = map.getChar();
					 			blnDevil = false;
					 			blnMap2 = true;
					 			blnDto2 = true;
				 			}else if(intLv >= 5 && blndevilONETIME == true && blngoddessbuff == false){
					 			map.drawImage(devilimage8, 0, 0, null);
					 			chrConvo = map.getChar();
					 			map.drawImage(devilimage9, 0, 0, null);
					 			chrConvo = map.getChar();
					 			map.drawImage(devilimage10, 0, 0, null);
					 			chrConvo = map.getChar();
					 			map.drawImage(devilimage11, 0, 0, null);
					 			chrConvo = map.getChar();
					 			map.drawImage(devilimage12, 0, 0, null);
					 			chrConvo = map.getChar();
					 			map.drawImage(devilimage13, 0, 0, null);
					 			chrConvo = map.getChar();
					 			map.drawImage(devilimage14, 0, 0, null);
					 			chrConvo = map.getChar();
					 			map.drawImage(devilimage15, 0, 0, null);
					 			chrConvo = map.getChar();
					 			while(blndevildeal == true){
					 				map.drawImage(devilimage16, 0, 0, null);
					 				chrConvo = map.getChar();
					 				if(chrConvo == 'Y' || chrConvo == 'y'){
						 				map.drawImage(devilimage17, 0, 0, null);
						 				chrConvo = map.getChar();
						 				blndevildeal = false;
						 				blndevilONETIME = false;
						 				blndevilbuff = true;
						 				blnDevil = false;
						 				blnMap2 = true;
						 				blnDto2 = true;
						 				intSTR = intSTR + 60;
						 				intDef = intDef * 2;
						 				dblLuck = dblLuck * 2;
						 				intHP = (int)(intHP * 0.3);
						 				intCurrentHP = intHP;
					 				}else if(chrConvo == 'N' || chrConvo == 'n'){
						 				map.drawImage(devilimage7, 0, 0, null);
						 				chrConvo = map.getChar();
						 				blndevildeal = false;
						 				blndevilONETIME = false;
						 				blnDevil = false;
						 				blnMap2 = true;
						 				blnDto2 = true;
					 				}
				 				}
			 				}else if(blngoddessbuff == true){
				 				map.drawImage(devilimage6, 0, 0, null);
				 				chrConvo = map.getChar();
				 				map.drawImage(devilimage7, 0, 0, null);
				 				chrConvo = map.getChar();
				 				blnDevil = false;
				 				blnMap2 = true;
				 				blnDto2 = true;
			 				}else if(intLv >= 5 && blndevilONETIME == false && blndevildeal == false && blndevilbuff == false){
				 				map.drawImage(devilimage7, 0, 0, null);
				 				chrConvo = map.getChar();
				 				blnDevil = false;
				 				blnMap2 = true;
				 				blnDto2 = true;
			 				}else if(intLv >= 5 && blndevilONETIME == false && blndevildeal == false && blndevilbuff == true){
				 				map.drawImage(devilimage18, 0, 0, null);
				 				chrConvo = map.getChar();
					 			blnDevil = false;
				 				blnMap2 = true;
				 				blnDto2 = true;
			 				}
			 			}
			 			//load map 3
			 			strMap = CurranX.loadmap("Maps/map3.csv");
			 			if(bln2to3 == true){
							intHRow = intTempRow;
							intHCol = 1;
						}else if(blnGto3 == true){
							intHRow = intTempRow;
							intHCol = intTempCol;
						}
						blnGto3 = false;
						bln2to3 = false;
						
						chrMove = ' ';
						
						for(intRow = 0; intRow < 20; intRow++){
	 						for(intCol = 0; intCol < 20; intCol++){
									//draw grass
						 		if(strMap[intRow][intCol].equals("g")){
						 			map.drawImage(grassimage, intCol*20, intRow*20, null);			
		 						//draw flower
	 							}else if(strMap[intRow][intCol].equals("p")){
		 							map.drawImage(flowerimage, intCol*20, intRow*20, null);		
		 						//draw tree 		
		 						}else if(strMap[intRow][intCol].equals("t")){
		 							map.drawImage(treeimage, intCol*20, intRow*20, null);	
		 						//draw water		 		
		 						}else if(strMap[intRow][intCol].equals("w")){
		 							map.drawImage(waterimage, intCol*20, intRow*20, null);			 		
		 						}else if(strMap[intRow][intCol].equals("wc1")){
		 							map.drawImage(waterimageC1, intCol*20, intRow*20, null);
		 						}else if(strMap[intRow][intCol].equals("wc2")){
		 							map.drawImage(waterimageC2, intCol*20, intRow*20, null);	
		 						}else if(strMap[intRow][intCol].equals("wl1")){
		 							map.drawImage(waterimageL1, intCol*20, intRow*20, null); 	
		 						}else if(strMap[intRow][intCol].equals("wl2")){
		 							map.drawImage(waterimageL2, intCol*20, intRow*20, null);
		 						}else if(strMap[intRow][intCol].equals("wl3")){
		 							map.drawImage(waterimageL3, intCol*20, intRow*20, null);	
		 						}else if(strMap[intRow][intCol].equals("wm1")){
		 							map.drawImage(waterimageM1, intCol*20, intRow*20, null);
		 						}else if(strMap[intRow][intCol].equals("wm2")){
		 							map.drawImage(waterimageM2, intCol*20, intRow*20, null);
		 						}else if(strMap[intRow][intCol].equals("wr1")){
		 							map.drawImage(waterimageR1, intCol*20, intRow*20, null);	
		 						}else if(strMap[intRow][intCol].equals("wr2")){
		 							map.drawImage(waterimageR2, intCol*20, intRow*20, null);	
		 						}else if(strMap[intRow][intCol].equals("wr3")){
		 							map.drawImage(waterimageR3, intCol*20, intRow*20, null);	
		 						//draw bush
	 							}else if(strMap[intRow][intCol].equals("gr")){
		 							map.drawImage(bushimage, intCol*20, intRow*20, null);	
		 						//drawing fairy
	 							}else if(strMap[intRow][intCol].equals("fa1")){
		 							map.drawImage(fairyimage1, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("fa2")){
		 							map.drawImage(fairyimage2, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("fa3")){
		 							map.drawImage(fairyimage3, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("fa4")){
		 							map.drawImage(fairyimage4, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("fa5")){
		 							map.drawImage(fairyimage5, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("fa6")){
		 							map.drawImage(fairyimage6, intCol*20, intRow*20, null);	
		 						//drawing giant tree
	 							}else if(strMap[intRow][intCol].equals("gt1")){
		 							map.drawImage(gianttreeimage1, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("gt2")){
		 							map.drawImage(gianttreeimage2, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("gt3")){
		 							map.drawImage(gianttreeimage1, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("gt4")){
		 							map.drawImage(gianttreeimage4, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("gt5")){
		 							map.drawImage(gianttreeimage5, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("gt6")){
		 							map.drawImage(gianttreeimage6, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("gt7")){
		 							map.drawImage(gianttreeimage7, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("gt8")){
		 							map.drawImage(gianttreeimage8, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("gt9")){
		 							map.drawImage(gianttreeimage9, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("gt10")){
		 							map.drawImage(gianttreeimage10, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("gt11")){
		 							map.drawImage(gianttreeimage11, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("gt12")){
		 							map.drawImage(gianttreeimage12, intCol*20, intRow*20, null);
		 						//drawing heart (heal)	
	 							}else if(strMap[intRow][intCol].equals("h")){
		 							map.drawImage(heartimage, intCol*20, intRow*20, null);	
	 							}
	 						}
 						}
 						//draw hero
 						map.drawImage(heroimageR, intHCol*20, intHRow*20, null);
 						
 						while(blnMap3 == true){
				 			chrMove = ' ';
				 			chrMove = map.getChar();
				 			
							if(chrMove == 'w'){
								intHRow = intHRow - 1;
								if(strMap[intHRow][intHCol].equals("w") || strMap[intHRow][intHCol].equals("wm1") || strMap[intHRow][intHCol].equals("wm2") || strMap[intHRow][intHCol].equals("wl1") || strMap[intHRow][intHCol].equals("wl2") || strMap[intHRow][intHCol].equals("wl3") || strMap[intHRow][intHCol].equals("wr1") || strMap[intHRow][intHCol].equals("wr2") || strMap[intHRow][intHCol].equals("wr3")){
									blnMap3 = false;
									blnGameOver = true;
								}else if(strMap[intHRow][intHCol].equals("t") || strMap[intHRow][intHCol].equals("gt10") || strMap[intHRow][intHCol].equals("gt11") || strMap[intHRow][intHCol].equals("gt12")){
									intHRow = intHRow + 1;
								}else if(strMap[intHRow][intHCol].equals("fa5") || strMap[intHRow][intHCol].equals("fa6")){
									intHRow = intHRow + 1;
									blnGoddess = true;
									blnMap3 = false;
									intTempRow = intHRow;
									intTempCol = intHCol;
								}
							}else if(chrMove == 's'){
								intHRow = intHRow + 1;
								if(strMap[intHRow][intHCol].equals("w") || strMap[intHRow][intHCol].equals("wm1") || strMap[intHRow][intHCol].equals("wm2") || strMap[intHRow][intHCol].equals("wl1") || strMap[intHRow][intHCol].equals("wl2") || strMap[intHRow][intHCol].equals("wl3") || strMap[intHRow][intHCol].equals("wr1") || strMap[intHRow][intHCol].equals("wr2") || strMap[intHRow][intHCol].equals("wr3")){
									blnMap3 = false;
									blnGameOver = true;
								}else if(strMap[intHRow][intHCol].equals("t") || strMap[intHRow][intHCol].equals("wm1")){
									intHRow = intHRow - 1;
								}else if(strMap[intHRow][intHCol].equals("fa1") || strMap[intHRow][intHCol].equals("fa2")){
									intHRow = intHRow - 1;
									blnGoddess = true;
									blnMap3 = false;
									intTempRow = intHRow;
									intTempCol = intHCol;
								}
							}else if(chrMove == 'a'){
								intHCol = intHCol - 1;
								if(strMap[intHRow][intHCol].equals("w") || strMap[intHRow][intHCol].equals("wm1") || strMap[intHRow][intHCol].equals("wm2") || strMap[intHRow][intHCol].equals("wl1") || strMap[intHRow][intHCol].equals("wl2") || strMap[intHRow][intHCol].equals("wl3") || strMap[intHRow][intHCol].equals("wr1") || strMap[intHRow][intHCol].equals("wr2") || strMap[intHRow][intHCol].equals("wr3")){
									blnMap3 = false;
									blnGameOver = true;
								}else if(strMap[intHRow][intHCol].equals("t")){
									intHCol = intHCol + 1;
								}else if(strMap[intHRow][intHCol].equals("fa2") || strMap[intHRow][intHCol].equals("fa4") || strMap[intHRow][intHCol].equals("fa6")){
									intHCol = intHCol + 1;
									blnGoddess = true;
									blnMap3 = false;
									intTempRow = intHRow;
									intTempCol = intHCol;
								}else if(intHCol <= 0){
									blnMap3 = false;
									blnMap2 = true;
									bln3to2 = true;
									intTempRow = intHRow;
								}
							}else if(chrMove == 'd'){
								intHCol = intHCol + 1;
								if(strMap[intHRow][intHCol].equals("w") || strMap[intHRow][intHCol].equals("wm1") || strMap[intHRow][intHCol].equals("wm2") || strMap[intHRow][intHCol].equals("wl1") || strMap[intHRow][intHCol].equals("wl2") || strMap[intHRow][intHCol].equals("wl3") || strMap[intHRow][intHCol].equals("wr1") || strMap[intHRow][intHCol].equals("wr2") || strMap[intHRow][intHCol].equals("wr3")){
									blnMap3 = false;
									blnGameOver = true;
								}else if(strMap[intHRow][intHCol].equals("t") || strMap[intHRow][intHCol].equals("wl2")){
									intHCol = intHCol - 1;
								}else if(strMap[intHRow][intHCol].equals("fa1") || strMap[intHRow][intHCol].equals("fa3") || strMap[intHRow][intHCol].equals("fa5")){
									intHCol = intHCol - 1;
									blnGoddess = true;
									blnMap3 = false;
									intTempRow = intHRow;
									intTempCol = intHCol;
								}
							}else{
								chrMove = 's';
							}
							
							System.out.println("Hero Column: "+intHCol+"   Hero Row: "+intHRow);
							
							for(intRow = 0; intRow < 20; intRow++){
	 							for(intCol = 0; intCol < 20; intCol++){
									//draw grass
							 		if(strMap[intRow][intCol].equals("g")){
							 			map.drawImage(grassimage, intCol*20, intRow*20, null);			
		 							//draw flower
	 								}else if(strMap[intRow][intCol].equals("p")){
		 								map.drawImage(flowerimage, intCol*20, intRow*20, null);		
		 							//draw tree 		
		 							}else if(strMap[intRow][intCol].equals("t")){
		 								map.drawImage(treeimage, intCol*20, intRow*20, null);	
		 							//draw water		 		
		 							}else if(strMap[intRow][intCol].equals("w")){
		 								map.drawImage(waterimage, intCol*20, intRow*20, null);			 		
		 							}else if(strMap[intRow][intCol].equals("wc1")){
		 								map.drawImage(waterimageC1, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("wc2")){
		 								map.drawImage(waterimageC2, intCol*20, intRow*20, null);	
		 							}else if(strMap[intRow][intCol].equals("wl1")){
		 								map.drawImage(waterimageL1, intCol*20, intRow*20, null); 	
		 							}else if(strMap[intRow][intCol].equals("wl2")){
		 								map.drawImage(waterimageL2, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("wl3")){
		 								map.drawImage(waterimageL3, intCol*20, intRow*20, null);	
		 							}else if(strMap[intRow][intCol].equals("wm1")){
		 								map.drawImage(waterimageM1, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("wm2")){
		 								map.drawImage(waterimageM2, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("wr1")){
		 								map.drawImage(waterimageR1, intCol*20, intRow*20, null);	
		 							}else if(strMap[intRow][intCol].equals("wr2")){
		 								map.drawImage(waterimageR2, intCol*20, intRow*20, null);	
		 							}else if(strMap[intRow][intCol].equals("wr3")){
		 								map.drawImage(waterimageR3, intCol*20, intRow*20, null);	
		 							//draw bush
	 								}else if(strMap[intRow][intCol].equals("gr")){
		 								map.drawImage(bushimage, intCol*20, intRow*20, null);	
		 							//drawing fairy
	 								}else if(strMap[intRow][intCol].equals("fa1")){
		 								map.drawImage(fairyimage1, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("fa2")){
		 								map.drawImage(fairyimage2, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("fa3")){
		 								map.drawImage(fairyimage3, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("fa4")){
		 								map.drawImage(fairyimage4, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("fa5")){
		 								map.drawImage(fairyimage5, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("fa6")){
		 								map.drawImage(fairyimage6, intCol*20, intRow*20, null);	
		 							//drawing giant tree
	 								}else if(strMap[intRow][intCol].equals("gt1")){
		 								map.drawImage(gianttreeimage1, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("gt2")){
		 								map.drawImage(gianttreeimage2, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("gt3")){
		 								map.drawImage(gianttreeimage1, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("gt4")){
		 								map.drawImage(gianttreeimage4, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("gt5")){
		 								map.drawImage(gianttreeimage5, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("gt6")){
		 								map.drawImage(gianttreeimage6, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("gt7")){
		 								map.drawImage(gianttreeimage7, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("gt8")){
		 								map.drawImage(gianttreeimage8, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("gt9")){
		 								map.drawImage(gianttreeimage9, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("gt10")){
		 								map.drawImage(gianttreeimage10, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("gt11")){
		 								map.drawImage(gianttreeimage11, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("gt12")){
		 								map.drawImage(gianttreeimage12, intCol*20, intRow*20, null);
		 							//drawing heart (heal)	
	 								}else if(strMap[intRow][intCol].equals("h")){
		 								map.drawImage(heartimage, intCol*20, intRow*20, null);	
	 								}
	 							}
 							}
 							
 							if(chrMove == 'w'){
 								map.drawImage(heroimageU, intHCol*20, intHRow*20, null);	
							}else if(chrMove == 's'){
								map.drawImage(heroimageD, intHCol*20, intHRow*20, null);	
							}else if(chrMove == 'a'){
								map.drawImage(heroimageL, intHCol*20, intHRow*20, null);
							}else if(chrMove == 'd'){
								map.drawImage(heroimageR, intHCol*20, intHRow*20, null);
							}
						}
						
						while(blnGoddess == true){
							map.clear();
							if(intLv >= 5 && blndevilbuff == false && blngoddessONETIME == true){	
								map.drawImage(goddessimage5, 0, 0, null);
								chrConvo = map.getChar();
								map.drawImage(goddessimage6, 0, 0, null);
								chrConvo = map.getChar();
								while(blngoddessdeal == true){
									map.drawImage(goddessimage7, 0, 0, null);
									chrConvo = map.getChar();
									if(chrConvo == 'G' || chrConvo == 'g'){
										map.drawImage(goddessimage4, 0, 0, null);
										chrConvo = map.getChar();
										map.drawImage(goddessimage3, 0, 0, null);
										chrConvo = map.getChar();
										blnGoddess = false;
										blnMap3 = true; 
										blnGto3 = true;
										blngoddessONETIME = false;
										blngoddessdeal = false;
									}else if(chrConvo == 'W' || chrConvo == 'w'){
										map.drawImage(goddessimage8, 0, 0, null);
										chrConvo = map.getChar();
										map.drawImage(goddessimage8, 0, 0, null);
										chrConvo = map.getChar();
										map.drawImage(goddessimage9, 0, 0, null);
										chrConvo = map.getChar();
										map.drawImage(goddessimage10, 0, 0, null);
										chrConvo = map.getChar();
										while(blngoddessdeal2 == true){
											map.drawImage(goddessimage11, 0, 0, null);
											chrConvo = map.getChar();
											if(chrConvo == 'H' || chrConvo == 'h'){
												intHP = intHP + 250;
												intCurrentHP = intCurrentHP + 250;
												blngoddessdeal2 = false;
												blngoddessbuff = true;
											}else if(chrConvo == 'M' || chrConvo == 'm'){
												intMP = intMP + 250;
												intCurrentMP = intCurrentMP + 250;
												blngoddessdeal2 = false;
												blngoddessbuff = true;
											}else if(chrConvo == 'A' || chrConvo == 'a'){
												intSTR = intSTR + 50;
												blngoddessdeal2 = false;
												blngoddessbuff = true;
											}else if(chrConvo == 'L' || chrConvo == 'l'){
												dblLuck = dblLuck + 30;
												blngoddessdeal2 = false;
												blngoddessbuff = true;
											}else if(chrConvo == 'D' || chrConvo == 'd'){
												intDef = intDef + 100;
												blngoddessdeal2 = false;
												blngoddessbuff = true;
											}
										}
										map.drawImage(goddessimage12, 0, 0, null);
										chrConvo = map.getChar();
										map.drawImage(goddessimage13, 0, 0, null);
										chrConvo = map.getChar();
										blnGoddess = false;
										blnMap3 = true;
										blnGto3 = true;
										blngoddessONETIME = false;
										blngoddessdeal = false;
									}
								}
							}else if(blngoddessbuff == true){
								map.drawImage(goddessimage15, 0, 0, null);
								chrConvo = map.getChar();
								blnGoddess = false;
								blnMap3 = true;
								blnGto3 = true;	
							}else if(blndevilbuff == true || (blngoddessONETIME == false && blngoddessbuff == false)){
								map.drawImage(goddessimage3, 0, 0, null);
								chrConvo = map.getChar();
								blnGoddess = false;
								blnMap3 = true;
								blnGto3 = true;	
							}else if(intLv < 5){
								map.drawImage(goddessimage14, 0, 0, null);
								chrConvo = map.getChar();
								blnGoddess = false;
								blnMap3 = true;
								blnGto3 = true;		
							}
						}
							
						//Map 4 (Final Boss)
						strMap = CurranX.loadmap("Maps/map4.csv");
						intHRow = 18;
						intHCol = intTempCol;
						chrMove = ' ';
						
						for(intRow = 0; intRow < 20; intRow++){
	 						for(intCol = 0; intCol < 20; intCol++){
									//draw grass
						 		if(strMap[intRow][intCol].equals("g")){
						 			map.drawImage(grassimage, intCol*20, intRow*20, null);			
		 						//draw flower
	 							}else if(strMap[intRow][intCol].equals("p")){
		 							map.drawImage(flowerimage, intCol*20, intRow*20, null);		
		 						//draw tree 		
		 						}else if(strMap[intRow][intCol].equals("t")){
		 							map.drawImage(treeimage, intCol*20, intRow*20, null);	
		 						//draw water		 		
		 						}else if(strMap[intRow][intCol].equals("w")){
		 							map.drawImage(waterimage, intCol*20, intRow*20, null);			 		
		 						}else if(strMap[intRow][intCol].equals("wc1")){
		 							map.drawImage(waterimageC1, intCol*20, intRow*20, null);
		 						}else if(strMap[intRow][intCol].equals("wc2")){
		 							map.drawImage(waterimageC2, intCol*20, intRow*20, null);	
		 						}else if(strMap[intRow][intCol].equals("wl1")){
		 							map.drawImage(waterimageL1, intCol*20, intRow*20, null); 	
		 						}else if(strMap[intRow][intCol].equals("wl2")){
		 							map.drawImage(waterimageL2, intCol*20, intRow*20, null);
		 						}else if(strMap[intRow][intCol].equals("wl3")){
		 							map.drawImage(waterimageL3, intCol*20, intRow*20, null);	
		 						}else if(strMap[intRow][intCol].equals("wm1")){
		 							map.drawImage(waterimageM1, intCol*20, intRow*20, null);
		 						}else if(strMap[intRow][intCol].equals("wm2")){
		 							map.drawImage(waterimageM2, intCol*20, intRow*20, null);
		 						}else if(strMap[intRow][intCol].equals("wr1")){
		 							map.drawImage(waterimageR1, intCol*20, intRow*20, null);	
		 						}else if(strMap[intRow][intCol].equals("wr2")){
		 							map.drawImage(waterimageR2, intCol*20, intRow*20, null);	
		 						}else if(strMap[intRow][intCol].equals("wr3")){
		 							map.drawImage(waterimageR3, intCol*20, intRow*20, null);	
		 						//draw bush
	 							}else if(strMap[intRow][intCol].equals("gr")){
		 							map.drawImage(bushimage, intCol*20, intRow*20, null);	
		 						//draw heart (heal)
	 							}else if(strMap[intRow][intCol].equals("h")){
		 							map.drawImage(heartimage, intCol*20, intRow*20, null);	
		 						//boss
	 							}else if(strMap[intRow][intCol].equals("b1")){
		 							map.drawImage(bossimage1, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("b2")){
		 							map.drawImage(bossimage2, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("b3")){
		 							map.drawImage(bossimage3, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("b4")){
		 							map.drawImage(bossimage4, intCol*20, intRow*20, null);
		 						//draw bridge
	 							}else if(strMap[intRow][intCol].equals("br1")){
		 							map.drawImage(bridgeimage1, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("br2")){
		 							map.drawImage(bridgeimage2, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("br3")){
		 							map.drawImage(bridgeimage3, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("br4")){
		 							map.drawImage(bridgeimage4, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("br5")){
		 							map.drawImage(bridgeimage5, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("br6")){
		 							map.drawImage(bridgeimage6, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("br7")){
		 							map.drawImage(bridgeimage7, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("br8")){
		 							map.drawImage(bridgeimage8, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("br9")){
		 							map.drawImage(bridgeimage9, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("br10")){
		 							map.drawImage(bridgeimage10, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("br11")){
		 							map.drawImage(bridgeimage11, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("br12")){
		 							map.drawImage(bridgeimage12, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("br13")){
		 							map.drawImage(bridgeimage13, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("br14")){
		 							map.drawImage(bridgeimage14, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("br15")){
		 							map.drawImage(bridgeimage15, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("br16")){
		 							map.drawImage(bridgeimage16, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("br17")){
		 							map.drawImage(bridgeimage17, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("br18")){
		 							map.drawImage(bridgeimage18, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("br19")){
		 							map.drawImage(bridgeimage19, intCol*20, intRow*20, null);	
	 							}else if(strMap[intRow][intCol].equals("br20")){
		 							map.drawImage(bridgeimage20, intCol*20, intRow*20, null);	
	 							//draw fences 		
						 		}else if(strMap[intRow][intCol].equals("fa")){
		 							map.drawImage(fenceimage, intCol*20, intRow*20, null);	
		 						//drawing monsters	
						 		}else if(strMap[intRow][intCol].equals("m7")){
		 							map.drawImage(monsterimage7, intCol*20, intRow*20, null);		
		 						}else if(strMap[intRow][intCol].equals("m8")){
		 							map.drawImage(monsterimage8, intCol*20, intRow*20, null);		
		 						}else if(strMap[intRow][intCol].equals("m9")){
		 							map.drawImage(monsterimage9, intCol*20, intRow*20, null);	
		 						//drawing ground 	
		 						}else if(strMap[intRow][intCol].equals("gf")){
		 							map.drawImage(groundimage, intCol*20, intRow*20, null);	
		 						//drawing inside cave
		 						}else if(strMap[intRow][intCol].equals("ic")){
		 							map.drawImage(icaveimage, intCol*20, intRow*20, null);		
		 						}else if(strMap[intRow][intCol].equals("ice1")){
		 							map.drawImage(icaveimageE, intCol*20, intRow*20, null);		
		 						}else if(strMap[intRow][intCol].equals("ice2")){
		 							map.drawImage(icaveimageE2, intCol*20, intRow*20, null);		
		 						}else if(strMap[intRow][intCol].equals("ice3")){
		 							map.drawImage(icaveimageE3, intCol*20, intRow*20, null);		
		 						//drawing long tree
		 						}else if(strMap[intRow][intCol].equals("lt1")){
		 							map.drawImage(longtreeimage1, intCol*20, intRow*20, null);		
		 						}else if(strMap[intRow][intCol].equals("lt2")){
		 							map.drawImage(longtreeimage2, intCol*20, intRow*20, null);		
		 						}else if(strMap[intRow][intCol].equals("lt3")){
		 							map.drawImage(longtreeimage3, intCol*20, intRow*20, null);	
		 						//drawing statue	
		 						}else if(strMap[intRow][intCol].equals("st1")){
	 								map.drawImage(statueimage1, intCol*20, intRow*20, null);	
 								}else if(strMap[intRow][intCol].equals("st2")){
	 								map.drawImage(statueimage2, intCol*20, intRow*20, null);
	 							//drawing stone	
 								}else if(strMap[intRow][intCol].equals("s")){
		 							map.drawImage(stoneimage, intCol*20, intRow*20, null);
		 						//drawing tile
	 							}else if(strMap[intRow][intCol].equals("ti")){
		 							map.drawImage(tileimage, intCol*20, intRow*20, null);
	 							}
 							}
						}
						if(blnBMap4 == true){
							intHCol = intTempCol;
							intHRow = intTempRow;
						}
						blnBMap4 = false;
						
						//draw hero
 						map.drawImage(heroimageU, intHCol*20, intHRow*20, null);
 						
 						while(blnMap4 == true){
				 			chrMove = ' ';
				 			chrMove = map.getChar();
				 			//move character
				 			if(chrMove == 'w'){
								intHRow = intHRow - 1;
								if(strMap[intHRow][intHCol].equals("w") || strMap[intHRow][intHCol].equals("wm1") || strMap[intHRow][intHCol].equals("wm2") || strMap[intHRow][intHCol].equals("wl1") || strMap[intHRow][intHCol].equals("wl2") || strMap[intHRow][intHCol].equals("wl3") || strMap[intHRow][intHCol].equals("wr1") || strMap[intHRow][intHCol].equals("wr2") || strMap[intHRow][intHCol].equals("wr3")){
									blnMap4 = false;
									blnGameOver = true;
								}else if(strMap[intHRow][intHCol].equals("b3") || strMap[intHRow][intHCol].equals("b4")){
									blnMap4 = false;
									blnBoss = true;
									blnBattle = true;
									blnBossBattle = true;
								}else if(strMap[intHRow][intHCol].equals("st2") || strMap[intHRow][intHCol].equals("s") || strMap[intHRow][intHCol].equals("fa") || strMap[intHRow][intHCol].equals("t")){
	 								intHRow = intHRow + 1;
 								}
							}else if(chrMove == 's'){
								intHRow = intHRow + 1;
								if(strMap[intHRow][intHCol].equals("w") || strMap[intHRow][intHCol].equals("wm1") || strMap[intHRow][intHCol].equals("wm2") || strMap[intHRow][intHCol].equals("wl1") || strMap[intHRow][intHCol].equals("wl2") || strMap[intHRow][intHCol].equals("wl3") || strMap[intHRow][intHCol].equals("wr1") || strMap[intHRow][intHCol].equals("wr2") || strMap[intHRow][intHCol].equals("wr3")){
									blnMap4 = false;
									blnGameOver = true;
									}else if(strMap[intHRow][intHCol].equals("b1") || strMap[intHRow][intHCol].equals("b2")){
									blnMap4 = false;
									blnBoss = true;
									blnBattle = true;
									blnBossBattle = true;
								}else if(strMap[intHRow][intHCol].equals("br1") || strMap[intHRow][intHCol].equals("br5") || strMap[intHRow][intHCol].equals("fa") || strMap[intHRow][intHCol].equals("ic") || strMap[intHRow][intHCol].equals("ice1") || strMap[intHRow][intHCol].equals("ice3") || strMap[intHRow][intHCol].equals("s") || strMap[intHRow][intHCol].equals("t")){
									intHRow = intHRow - 1;
								}else if(intHRow >= 19){
									blnMap4 = false;
									blnMap2 = true;
									bln4to2 = true;
									intTempCol = intHCol;
								}
							}else if(chrMove == 'a'){
								intHCol = intHCol - 1;
								if(strMap[intHRow][intHCol].equals("w") || strMap[intHRow][intHCol].equals("wm1") || strMap[intHRow][intHCol].equals("wm2") || strMap[intHRow][intHCol].equals("wl1") || strMap[intHRow][intHCol].equals("wl2") || strMap[intHRow][intHCol].equals("wl3") || strMap[intHRow][intHCol].equals("wr1") || strMap[intHRow][intHCol].equals("wr2") || strMap[intHRow][intHCol].equals("wr3")){
									blnMap4 = false;
									blnGameOver = true;
								}else if(strMap[intHRow][intHCol].equals("b2") || strMap[intHRow][intHCol].equals("b4")){
									blnMap4 = false;
									blnBoss = true;
									blnBattle = true;
									blnBossBattle = true;
								}else if(strMap[intHRow][intHCol].equals("st2") || strMap[intHRow][intHCol].equals("st1") || strMap[intHRow][intHCol].equals("s") || strMap[intHRow][intHCol].equals("fa") || strMap[intHRow][intHCol].equals("lf1") || strMap[intHRow][intHCol].equals("lf2") || strMap[intHRow][intHCol].equals("lf3") || strMap[intHRow][intHCol].equals("br1") || strMap[intHRow][intHCol].equals("br6") || strMap[intHRow][intHCol].equals("br11") || strMap[intHRow][intHCol].equals("br16") || strMap[intHRow][intHCol].equals("t") || strMap[intHRow][intHCol].equals("lt1") || strMap[intHRow][intHCol].equals("lt2") || strMap[intHRow][intHCol].equals("lt3")){
									intHCol = intHCol + 1;
								}
							}else if(chrMove == 'd'){
								intHCol = intHCol + 1;
								if(strMap[intHRow][intHCol].equals("w") || strMap[intHRow][intHCol].equals("wm1") || strMap[intHRow][intHCol].equals("wm2") || strMap[intHRow][intHCol].equals("wl1") || strMap[intHRow][intHCol].equals("wl2") || strMap[intHRow][intHCol].equals("wl3") || strMap[intHRow][intHCol].equals("wr1") || strMap[intHRow][intHCol].equals("wr2") || strMap[intHRow][intHCol].equals("wr3")){
									blnMap4 = false;
									blnGameOver = true;
								}else if(strMap[intHRow][intHCol].equals("b1") || strMap[intHRow][intHCol].equals("b3")){
									blnMap4 = false;
									blnBoss = true;
									blnBattle = true;
									blnBossBattle = true;
								}else if(strMap[intHRow][intHCol].equals("st2") || strMap[intHRow][intHCol].equals("st1") || strMap[intHRow][intHCol].equals("s") || strMap[intHRow][intHCol].equals("fa") || strMap[intHRow][intHCol].equals("lf1") || strMap[intHRow][intHCol].equals("lf2") || strMap[intHRow][intHCol].equals("lf3") || strMap[intHRow][intHCol].equals("br5") || strMap[intHRow][intHCol].equals("br10") || strMap[intHRow][intHCol].equals("br15") || strMap[intHRow][intHCol].equals("br20") || strMap[intHRow][intHCol].equals("t") || strMap[intHRow][intHCol].equals("lt1") || strMap[intHRow][intHCol].equals("lt2") || strMap[intHRow][intHCol].equals("lt3")){
									intHCol = intHCol - 1;
								}
							}else{
								chrMove = 's';
							}
							for(intRow = 0; intRow < 20; intRow++){
	 							for(intCol = 0; intCol < 20; intCol++){
									//draw grass
							 		if(strMap[intRow][intCol].equals("g")){
							 			map.drawImage(grassimage, intCol*20, intRow*20, null);			
		 							//draw flower
	 								}else if(strMap[intRow][intCol].equals("p")){
		 								map.drawImage(flowerimage, intCol*20, intRow*20, null);		
		 							//draw tree 		
		 							}else if(strMap[intRow][intCol].equals("t")){
		 								map.drawImage(treeimage, intCol*20, intRow*20, null);	
		 							//draw water		 		
		 							}else if(strMap[intRow][intCol].equals("w")){
		 								map.drawImage(waterimage, intCol*20, intRow*20, null);			 		
		 							}else if(strMap[intRow][intCol].equals("wc1")){
		 								map.drawImage(waterimageC1, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("wc2")){
		 								map.drawImage(waterimageC2, intCol*20, intRow*20, null);	
		 							}else if(strMap[intRow][intCol].equals("wl1")){
		 								map.drawImage(waterimageL1, intCol*20, intRow*20, null); 	
		 							}else if(strMap[intRow][intCol].equals("wl2")){
		 								map.drawImage(waterimageL2, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("wl3")){
		 								map.drawImage(waterimageL3, intCol*20, intRow*20, null);	
		 							}else if(strMap[intRow][intCol].equals("wm1")){
		 								map.drawImage(waterimageM1, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("wm2")){
		 								map.drawImage(waterimageM2, intCol*20, intRow*20, null);
		 							}else if(strMap[intRow][intCol].equals("wr1")){
		 								map.drawImage(waterimageR1, intCol*20, intRow*20, null);	
		 							}else if(strMap[intRow][intCol].equals("wr2")){
		 								map.drawImage(waterimageR2, intCol*20, intRow*20, null);	
		 							}else if(strMap[intRow][intCol].equals("wr3")){
		 								map.drawImage(waterimageR3, intCol*20, intRow*20, null);	
		 							//draw bush
	 								}else if(strMap[intRow][intCol].equals("gr")){
		 								map.drawImage(bushimage, intCol*20, intRow*20, null);	
		 							//draw heart (heal)
	 								}else if(strMap[intRow][intCol].equals("h")){
		 								map.drawImage(heartimage, intCol*20, intRow*20, null);	
		 							//boss
	 								}else if(strMap[intRow][intCol].equals("b1")){
		 								map.drawImage(bossimage1, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("b2")){
		 								map.drawImage(bossimage2, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("b3")){
		 								map.drawImage(bossimage3, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("b4")){
		 								map.drawImage(bossimage4, intCol*20, intRow*20, null);
		 							//draw bridge
	 								}else if(strMap[intRow][intCol].equals("br1")){
		 								map.drawImage(bridgeimage1, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("br2")){
		 								map.drawImage(bridgeimage2, intCol*20, intRow*20, null);	
	 									}else if(strMap[intRow][intCol].equals("br3")){
		 								map.drawImage(bridgeimage3, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("br4")){
		 								map.drawImage(bridgeimage4, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("br5")){
		 								map.drawImage(bridgeimage5, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("br6")){
		 								map.drawImage(bridgeimage6, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("br7")){
		 								map.drawImage(bridgeimage7, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("br8")){
		 								map.drawImage(bridgeimage8, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("br9")){
		 								map.drawImage(bridgeimage9, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("br10")){
		 								map.drawImage(bridgeimage10, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("br11")){
		 								map.drawImage(bridgeimage11, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("br12")){
		 								map.drawImage(bridgeimage12, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("br13")){
		 								map.drawImage(bridgeimage13, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("br14")){
		 								map.drawImage(bridgeimage14, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("br15")){
		 								map.drawImage(bridgeimage15, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("br16")){
		 								map.drawImage(bridgeimage16, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("br17")){
		 								map.drawImage(bridgeimage17, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("br18")){
		 								map.drawImage(bridgeimage18, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("br19")){
		 								map.drawImage(bridgeimage19, intCol*20, intRow*20, null);	
	 								}else if(strMap[intRow][intCol].equals("br20")){
		 								map.drawImage(bridgeimage20, intCol*20, intRow*20, null);	
	 								//draw fences 		
						 			}else if(strMap[intRow][intCol].equals("fa")){
		 								map.drawImage(fenceimage, intCol*20, intRow*20, null);	
		 							//drawing monsters	
						 			}else if(strMap[intRow][intCol].equals("m7")){
		 								map.drawImage(monsterimage7, intCol*20, intRow*20, null);		
		 							}else if(strMap[intRow][intCol].equals("m8")){
		 								map.drawImage(monsterimage8, intCol*20, intRow*20, null);		
		 							}else if(strMap[intRow][intCol].equals("m9")){
		 								map.drawImage(monsterimage9, intCol*20, intRow*20, null);	
		 							//drawing ground 	
		 							}else if(strMap[intRow][intCol].equals("gf")){
		 								map.drawImage(groundimage, intCol*20, intRow*20, null);	
		 							//drawing inside cave
		 							}else if(strMap[intRow][intCol].equals("ic")){
		 								map.drawImage(icaveimage, intCol*20, intRow*20, null);		
		 							}else if(strMap[intRow][intCol].equals("ice1")){
		 								map.drawImage(icaveimageE, intCol*20, intRow*20, null);		
		 							}else if(strMap[intRow][intCol].equals("ice2")){
		 								map.drawImage(icaveimageE2, intCol*20, intRow*20, null);		
		 							}else if(strMap[intRow][intCol].equals("ice3")){
		 								map.drawImage(icaveimageE3, intCol*20, intRow*20, null);		
		 							//drawing long tree
		 							}else if(strMap[intRow][intCol].equals("lt1")){
		 								map.drawImage(longtreeimage1, intCol*20, intRow*20, null);		
		 							}else if(strMap[intRow][intCol].equals("lt2")){
		 								map.drawImage(longtreeimage2, intCol*20, intRow*20, null);		
		 							}else if(strMap[intRow][intCol].equals("lt3")){
		 								map.drawImage(longtreeimage3, intCol*20, intRow*20, null);	
		 							//drawing statue	
		 							}else if(strMap[intRow][intCol].equals("st1")){
	 									map.drawImage(statueimage1, intCol*20, intRow*20, null);	
 									}else if(strMap[intRow][intCol].equals("st2")){
	 									map.drawImage(statueimage2, intCol*20, intRow*20, null);
	 								//drawing stone	
 									}else if(strMap[intRow][intCol].equals("s")){
		 								map.drawImage(stoneimage, intCol*20, intRow*20, null);
		 							//drawing tile
	 								}else if(strMap[intRow][intCol].equals("ti")){
		 								map.drawImage(tileimage, intCol*20, intRow*20, null);
	 								}
 								}
							}
							
							System.out.println("Hero Column: "+intHCol+"   Hero Row: "+intHRow);
							
							if(chrMove == 'w'){
 								map.drawImage(heroimageU, intHCol*20, intHRow*20, null);	
							}else if(chrMove == 's'){
								map.drawImage(heroimageD, intHCol*20, intHRow*20, null);	
							}else if(chrMove == 'a'){
								map.drawImage(heroimageL, intHCol*20, intHRow*20, null);
							}else if(chrMove == 'd'){
								map.drawImage(heroimageR, intHCol*20, intHRow*20, null);
							}
						}
						
						//THE BATTLE SYSTEM!!!!
						while(blnBattle == true){
							map.clear();
							map.drawImage(Encounterimage, 0, 0, null);
							blnDead = false;
							CurranX.pause(1500);
							map.clear();
							while(blnDead == false){
								if(blnMonster1 == true){
									map.drawImage(chickenfimage, 0, 0, null);
									map.drawString(intCurrentHP+"/"+intHP, 250, 50);
									map.drawString(intCurrentMP+"/"+intMP, 335, 50);
									map.drawString(intM1CurrentHP+"/"+intM1HP, 50, 50);
									blnSkills = true;
									while(blnSkills == true){
										map.clear();
										map.drawImage(chickenfimage, 0, 0, null);
										map.drawString(intCurrentHP+"/"+intHP, 250, 50);
										map.drawString(intCurrentMP+"/"+intMP, 335, 50);
										map.drawString(intM1CurrentHP+"/"+intM1HP, 50, 50);
										map.drawString("What will you do?", 50, 280);
										map.drawString("(A)ttack        (H)eal          (R)un", 50, 300);
										chrConvo = map.getChar();
										if(chrConvo == 'a' || chrConvo == 'A'){
											intCurrentMP = intCurrentMP - 20;
											if(intCurrentMP < 0){
												intCurrentMP = intCurrentMP + 20;
											}
											if(intCurrentMP == 0){
												map.clear();
												map.drawImage(chickenfimage, 0, 0, null);
												map.drawString(intCurrentHP+"/"+intHP, 250, 50);
												map.drawString(intCurrentMP+"/"+intMP, 335, 50);
												map.drawString(intM1CurrentHP+"/"+intM1HP, 50, 50);
												map.drawString("You can't attack without enough MP!", 50, 300);
												CurranX.pause(1500);
											}else{
												blnSkills = false;
												dblDamage = (int)(Math.random()*intMinAtk + (intMaxAtk - intMinAtk));
												intChance = (int)(Math.random()*9 + 1);
												if(intChance >= 3){
													dblDamage =  (int)(((dblLuck / 100) + 1) * dblDamage);
												}
													intM1CurrentHP = (int)(intM1CurrentHP - dblDamage);
												if(intM1CurrentHP < 0){
													intM1CurrentHP = 0;
												}
												map.clear();
												map.drawImage(chickenfimage, 0, 0, null);
												map.drawString(intCurrentHP+"/"+intHP, 250, 50);
												map.drawString(intCurrentMP+"/"+intMP, 335, 50);
												map.drawString(intM1CurrentHP+"/"+intM1HP, 50, 50);
												if(intChance <= 3){
													map.drawString("CRITICAL HIT!", 80, 340);
													map.drawString("You attacked for: "+dblDamage+" damage.", 80, 300);
												}else{
													map.drawString("You attacked for: "+dblDamage+" damage.", 80, 300);
												}
												CurranX.pause(500);
												if(intM1CurrentHP == 0){
													blnMonster1 = false;
													blnDead = true;
													blnBattle = false;
													blnMap1 = true;
													blnBMap1 = true;
													map.clear();
													map.drawImage(chickendimage, 0, 0, null);
													map.drawString(intCurrentHP+"/"+intHP, 250, 50);
													map.drawString(intCurrentMP+"/"+intMP, 335, 50);
													map.drawString(intM1CurrentHP+"/"+intM1HP, 70, 50);
													map.drawString("Victory!", 80, 300);
													CurranX.pause(1000);
													map.drawString("You have gained 10 exp.", 80, 320);
													CurranX.pause(1000);
													dblCurrentEXP = dblCurrentEXP + 10;
													if(dblCurrentEXP >= dblMaxEXP){
														map.clear();
														dblEXPR = dblCurrentEXP - dblMaxEXP;
														dblCurrentEXP = 0;
														dblCurrentEXP = dblCurrentEXP + dblEXPR;
														intLv = intLv + 1;
														intAP = intAP + 5;
														intHP = intHP + 100;
														intCurrentHP = intHP;
														intMP = intMP + 50;
														intCurrentMP = intMP;
														map.drawImage(chickendimage, 0, 0, null);
														map.drawString(intCurrentHP+"/"+intHP, 250, 50);
														map.drawString(intCurrentMP+"/"+intMP, 335, 50);
														map.drawString(intM1CurrentHP+"/"+intM1HP, 70, 50);
														map.drawString("LEVEL UP!", 90, 300);
														CurranX.pause(1000);
														map.drawString("Go use your AP in your stats table.", 80, 320);
														CurranX.pause(1000);
													}	
												}
												}
											}else if(chrConvo == 'h' || chrConvo == 'H'){
												blnSkills = false;
												intHeal = (int)(intHP * 0.2);
												intCurrentHP = intCurrentHP + intHeal;
												intMeal = (int)(intMP * 0.2);
												intCurrentMP = intCurrentMP + intHeal;
												if(intCurrentMP > intMP){
													intCurrentMP = intMP;
												}
												if(intCurrentHP > intHP){
													intCurrentHP = intHP;
												}
												map.clear();
												map.drawImage(chickenfimage, 0, 0, null);
												map.drawString(intCurrentHP+"/"+intHP, 250, 50);
												map.drawString(intCurrentMP+"/"+intMP, 335, 50);
												map.drawString(intM1CurrentHP+"/"+intM1HP, 50, 50);
												map.drawString("You recovered: "+intHeal+" HP.", 80, 300);
												map.drawString("You recovered: "+intMeal+" HP.", 80, 310);
												CurranX.pause(500);
											}else if(chrConvo == 'r' || chrConvo == 'R'){
												blnSkills = false;
												intRun = (int)(intHP * 0.5);
												if(intRun <= intCurrentHP){
													map.clear();
													map.drawImage(chickenfimage, 0, 0, null);
													map.drawString(intCurrentHP+"/"+intHP, 250, 50);
													map.drawString(intCurrentMP+"/"+intMP, 335, 50);
													map.drawString(intM1CurrentHP+"/"+intM1HP, 50, 50);
													map.drawString("You have escaped safely...", 80, 300);
													CurranX.pause(500);
													blnMonster1 = false;
													blnDead = true;
													blnBattle = false;
													blnMap1 = true;
													blnBMap1 = true;
												}else if(intRun > intCurrentHP){
													map.clear();
													map.drawImage(chickenfimage, 0, 0, null);
													map.drawString(intCurrentHP+"/"+intHP, 250, 50);
													map.drawString(intCurrentMP+"/"+intMP, 335, 50);
													map.drawString(intM1CurrentHP+"/"+intM1HP, 50, 50);
													map.drawString("You are unable to escape anymore!", 80, 300);
												}
											}
										}
									if(blnBattle == true){
										dblDamage = 0;
										dblDamage = (int)(Math.random()*intM1MinAtk + (intM1MaxAtk - intM1MinAtk));
										intCurrentHP = (int)(intCurrentHP - dblDamage);
										map.drawString("You were hit with: "+dblDamage+" damage.", 80, 320);
										CurranX.pause(500);
										if(intCurrentHP < 0){
											intCurrentHP = 0;
										}
										if(intCurrentHP == 0){
											blnMonster1 = false;
											blnDead = true;
											blnBattle = false;
											blnMap1 = false;
											blnBMap1 = false;
											blnGameOver = true;
										}
									}
								}else if(blnMonster2 == true){
									map.drawImage(bunnyfimage, 0, 0, null);
									map.drawString(intCurrentHP+"/"+intHP, 250, 50);
									map.drawString(intCurrentMP+"/"+intMP, 335, 50);
									map.drawString(intM2CurrentHP+"/"+intM2HP, 50, 50);
									blnSkills = true;
									while(blnSkills == true){
										map.clear();
										map.drawImage(bunnyfimage, 0, 0, null);
										map.drawString(intCurrentHP+"/"+intHP, 250, 50);
										map.drawString(intCurrentMP+"/"+intMP, 335, 50);
										map.drawString(intM2CurrentHP+"/"+intM2HP, 50, 50);
										map.drawString("What will you do?", 50, 280);
										map.drawString("(A)ttack        (H)eal          (R)un", 50, 300);
										chrConvo = map.getChar();
										if(chrConvo == 'a' || chrConvo == 'A'){
											intCurrentMP = intCurrentMP - 20;
											if(intCurrentMP < 0){
												intCurrentMP = 0 + 20;
											}
											if(intCurrentMP == 0){
												map.clear();
												map.drawImage(bunnyfimage, 0, 0, null);
												map.drawString(intCurrentHP+"/"+intHP, 250, 50);
												map.drawString(intCurrentMP+"/"+intMP, 335, 50);
												map.drawString(intM1CurrentHP+"/"+intM1HP, 50, 50);
												map.drawString("You can't attack without enough MP!", 50, 300);
												CurranX.pause(1500);
											}else{
												blnSkills = false;
												dblDamage = (int)(Math.random()*intMinAtk + (intMaxAtk - intMinAtk));
												intChance = (int)(Math.random()*9 + 1);
												if(intChance >= 3){
													dblDamage =  (int)(((dblLuck / 100) + 1) * dblDamage);
												}
												intM2CurrentHP = (int)(intM2CurrentHP - dblDamage);
												if(intM2CurrentHP < 0){
													intM2CurrentHP = 0;
												}
												map.clear();
												map.drawImage(bunnyfimage, 0, 0, null);
												map.drawString(intCurrentHP+"/"+intHP, 250, 50);
												map.drawString(intCurrentMP+"/"+intMP, 335, 50);
												map.drawString(intM2CurrentHP+"/"+intM2HP, 50, 50);
												if(intChance <= 3){
													map.drawString("CRITICAL HIT!", 80, 340);
													map.drawString("You attacked for: "+dblDamage+" damage.", 80, 300);
												}else{
													map.drawString("You attacked for: "+dblDamage+" damage.", 80, 300);
												}
												CurranX.pause(500);
												if(intM2CurrentHP == 0){
													blnMonster2 = false;
													blnDead = true;
													blnBattle = false;
													blnMap1 = true;
													blnBMap1 = true;
													map.clear();
													map.drawImage(bunnydimage, 0, 0, null);
													map.drawString(intCurrentHP+"/"+intHP, 250, 50);
													map.drawString(intCurrentMP+"/"+intMP, 335, 50);
													map.drawString(intM2CurrentHP+"/"+intM2HP, 70, 50);
													map.drawString("Victory!", 80, 300);
													CurranX.pause(1000);
													map.drawString("You have gained 30 exp.", 80, 320);
													CurranX.pause(1000);
													dblCurrentEXP = dblCurrentEXP + 30;
													if(dblCurrentEXP >= dblMaxEXP){
														map.clear();
														dblEXPR = dblCurrentEXP - dblMaxEXP;
														dblCurrentEXP = 0;
														dblCurrentEXP = dblCurrentEXP + dblEXPR;
														intLv = intLv + 1;
														intAP = intAP + 5;
														intHP = intHP + 100;
														intCurrentHP = intHP;
														intMP = intMP + 50;
														intCurrentMP = intMP;
														map.drawImage(bunnydimage, 0, 0, null);
														map.drawString(intCurrentHP+"/"+intHP, 250, 50);
														map.drawString(intCurrentMP+"/"+intMP, 335, 50);
														map.drawString(intM2CurrentHP+"/"+intM2HP, 70, 50);
														map.drawString("LEVEL UP!", 90, 300);
														CurranX.pause(1000);
														map.drawString("Go use your AP in your stats table.", 80, 320);
														CurranX.pause(1000);
													}
													}
												}
												}else if(chrConvo == 'h' || chrConvo == 'H'){
													blnSkills = false;
													intHeal = (int)(intHP * 0.2);
													intCurrentHP = intCurrentHP + intHeal;
													intMeal = (int)(intMP * 0.2);
													intCurrentMP = intCurrentMP + intHeal;
													if(intCurrentMP > intMP){
														intCurrentMP = intMP;
													}
													if(intCurrentHP > intHP){
														intCurrentHP = intHP;
													}
													map.clear();
													map.drawImage(bunnyfimage, 0, 0, null);
													map.drawString(intCurrentHP+"/"+intHP, 250, 50);
													map.drawString(intCurrentMP+"/"+intMP, 335, 50);
													map.drawString(intM2CurrentHP+"/"+intM2HP, 50, 50);
													map.drawString("You recovered: "+intHeal+" HP.", 80, 300);
													map.drawString("You recovered: "+intMeal+" HP.", 80, 310);
													CurranX.pause(500);
												}else if(chrConvo == 'r' || chrConvo == 'R'){
													blnSkills = false;
													intRun = (int)(intHP * 0.5);
													if(intRun <= intCurrentHP){
														map.clear();
														map.drawImage(bunnyfimage, 0, 0, null);
														map.drawString(intCurrentHP+"/"+intHP, 250, 50);
														map.drawString(intCurrentMP+"/"+intMP, 335, 50);
														map.drawString(intM2CurrentHP+"/"+intM2HP, 50, 50);
														map.drawString("You have escaped safely...", 80, 300);
														CurranX.pause(500);
														blnMonster2 = false;
														blnDead = true;
														blnBattle = false;
														blnMap1 = true;
														blnBMap1 = true;
													}else if(intRun > intCurrentHP){
														map.clear();
														map.drawImage(bunnyfimage, 0, 0, null);
														map.drawString(intCurrentHP+"/"+intHP, 250, 50);
														map.drawString(intCurrentMP+"/"+intMP, 335, 50);
														map.drawString(intM2CurrentHP+"/"+intM2HP, 50, 50);
														map.drawString("You are unable to escape anymore!", 80, 300);
													}
												}
											}
									if(blnBattle == true){
										dblDamage = 0;
										dblDamage = (int)(Math.random()*intM2MinAtk + (intM2MaxAtk - intM2MinAtk));
										intCurrentHP = (int)(intCurrentHP - dblDamage);
										map.drawString("You were hit with: "+dblDamage+" damage.", 80, 320);
										CurranX.pause(500);
										if(intCurrentHP < 0){
											intCurrentHP = 0;
										}
										if(intCurrentHP == 0){
											blnMonster2 = false;
											blnDead = true;
											blnBattle = false;
											blnMap1 = false;
											blnBMap1 = false;
											blnGameOver = true;
										}
									}
								}else if(blnMonster3 == true){
									map.drawImage(octopusfimage, 0, 0, null);
									map.drawString(intCurrentHP+"/"+intHP, 240, 65);
									map.drawString(intCurrentMP+"/"+intMP, 335, 65);
									map.drawString(intM3CurrentHP+"/"+intM3HP, 60, 63);
									blnSkills = true;
									while(blnSkills == true){
										map.clear();
										map.drawImage(octopusfimage, 0, 0, null);
										map.drawString(intCurrentHP+"/"+intHP, 240, 65);
										map.drawString(intCurrentMP+"/"+intMP, 335, 65);
										map.drawString(intM3CurrentHP+"/"+intM3HP, 60, 63);
										map.drawString("What will you do?", 50, 310);
										map.drawString("(A)ttack        (H)eal          (R)un", 50, 330);
										chrConvo = map.getChar();
										if(chrConvo == 'a' || chrConvo == 'A'){
											intCurrentMP = intCurrentMP - 20;
											if(intCurrentMP < 0){
												intCurrentMP = 0 + 20;
											}
											if(intCurrentMP == 0){
												map.clear();
												map.drawImage(octopusfimage, 0, 0, null);
												map.drawString(intCurrentHP+"/"+intHP, 250, 50);
												map.drawString(intCurrentMP+"/"+intMP, 335, 50);
												map.drawString(intM1CurrentHP+"/"+intM1HP, 50, 50);
												map.drawString("You can't attack without enough MP!", 50, 300);
												CurranX.pause(1500);
											}else{
											blnSkills = false;
											dblDamage = (int)(Math.random()*intMinAtk + (intMaxAtk - intMinAtk));
											intChance = (int)(Math.random()*9 + 1);
											if(intChance >= 3){
												dblDamage =  (int)(((dblLuck / 100) + 1) * dblDamage);
											}
											intM3CurrentHP = (int)(intM3CurrentHP - dblDamage);
											if(intM3CurrentHP < 0){
												intM3CurrentHP = 0;
											}
											map.clear();
											map.drawImage(octopusfimage, 0, 0, null);
											map.drawString(intCurrentHP+"/"+intHP, 240, 65);
											map.drawString(intCurrentMP+"/"+intMP, 335, 65);
											map.drawString(intM3CurrentHP+"/"+intM3HP, 60, 63);
											if(intChance <= 3){
												map.drawString("CRITICAL HIT!", 80, 370);
												map.drawString("You attacked for: "+dblDamage+" damage.", 80, 330);
											}else{
												map.drawString("You attacked for: "+dblDamage+" damage.", 80, 330);
											}
											CurranX.pause(500);
											if(intM3CurrentHP == 0){
												blnMonster3 = false;
												blnDead = true;
												blnBattle = false;
												blnMap2 = true;
												blnBMap2 = true;
												map.clear();
												map.drawImage(octopusdimage, 0, 0, null);
												map.drawString(intCurrentHP+"/"+intHP, 240, 65);
												map.drawString(intCurrentMP+"/"+intMP, 335, 65);
												map.drawString(intM3CurrentHP+"/"+intM3HP, 60, 63);
												map.drawString("Victory!", 80, 330);
												CurranX.pause(1000);
												map.drawString("You have gained 50 exp.", 80, 350);
												CurranX.pause(1000);
												dblCurrentEXP = dblCurrentEXP + 50;
												if(dblCurrentEXP >= dblMaxEXP){
													map.clear();
													dblEXPR = dblCurrentEXP - dblMaxEXP;
													dblCurrentEXP = 0;
													dblCurrentEXP = dblCurrentEXP + dblEXPR;
													intLv = intLv + 1;
													intAP = intAP + 5;
													intHP = intHP + 100;
													intCurrentHP = intHP;
													intMP = intMP + 50;
													intCurrentMP = intMP;
													map.drawImage(octopusdimage, 0, 0, null);
													map.drawString(intCurrentHP+"/"+intHP, 240, 65);
													map.drawString(intCurrentMP+"/"+intMP, 335, 65);
													map.drawString(intM3CurrentHP+"/"+intM3HP, 60, 63);
													map.drawString("LEVEL UP!", 90, 330);
													CurranX.pause(1000);
													map.drawString("Go use your AP in your stats table.", 80, 350);
													CurranX.pause(1000);
												}
											}
										}
													
										}else if(chrConvo == 'h' || chrConvo == 'H'){
											blnSkills = false;
											intHeal = (int)(intHP * 0.2);
											intCurrentHP = intCurrentHP + intHeal;
											intMeal = (int)(intMP * 0.2);
											intCurrentMP = intCurrentMP + intHeal;
											if(intCurrentMP > intMP){
												intCurrentMP = intMP;
											}
											if(intCurrentHP > intHP){
												intCurrentHP = intHP;
											}
											map.clear();
											map.drawImage(octopusfimage, 0, 0, null);
											map.drawString(intCurrentHP+"/"+intHP, 240, 65);
											map.drawString(intCurrentMP+"/"+intMP, 335, 65);
											map.drawString(intM3CurrentHP+"/"+intM3HP, 60, 63);
											map.drawString("You recovered: "+intHeal+" HP.", 80, 330);
											map.drawString("You recovered: "+intMeal+" HP.", 80, 340);
											CurranX.pause(500);
										}else if(chrConvo == 'r' || chrConvo == 'R'){
											blnSkills = false;
											intRun = (int)(intHP * 0.5);
											if(intRun <= intCurrentHP){
												map.clear();
												map.drawImage(octopusfimage, 0, 0, null);
												map.drawString(intCurrentHP+"/"+intHP, 240, 65);
												map.drawString(intCurrentMP+"/"+intMP, 335, 65);
												map.drawString(intM3CurrentHP+"/"+intM3HP, 60, 63);
												map.drawString("You have escaped safely...", 80, 330);
												CurranX.pause(500);
												blnMonster3 = false;
												blnDead = true;
												blnBattle = false;
												blnMap2 = true;
												blnBMap2 = true;
											}else if(intRun > intCurrentHP){
												map.clear();
												map.drawImage(octopusfimage, 0, 0, null);
												map.drawString(intCurrentHP+"/"+intHP, 240, 65);
												map.drawString(intCurrentMP+"/"+intMP, 335, 65);
												map.drawString(intM3CurrentHP+"/"+intM3HP, 60, 63);
												map.drawString("You are unable to escape anymore!", 80, 330);
											}
										}
									}
									if(blnBattle == true){
										dblDamage = 0;
										dblDamage = (int)(Math.random()*intM3MinAtk + (intM3MaxAtk - intM3MinAtk));
										intCurrentHP = (int)(intCurrentHP - dblDamage);
										map.drawString("You were hit with: "+dblDamage+" damage.", 80, 350);
										CurranX.pause(500);
										if(intCurrentHP < 0){
											intCurrentHP = 0;
										}
									}
									if(intCurrentHP == 0){
										blnMonster3 = false;
										blnDead = true;
										blnBattle = false;
										blnMap2 = false;
										blnBMap2 = false;
										blnGameOver = true;
									}
								}else if(blnMonster4 == true){
									map.drawImage(snakefimage, 0, 0, null);
									map.drawString(intCurrentHP+"/"+intHP, 240, 65);
									map.drawString(intCurrentMP+"/"+intMP, 335, 65);
									map.drawString(intM4CurrentHP+"/"+intM4HP, 60, 63);
									blnSkills = true;
									while(blnSkills == true){
										map.clear();
										map.drawImage(snakefimage, 0, 0, null);
										map.drawString(intCurrentHP+"/"+intHP, 240, 65);
										map.drawString(intCurrentMP+"/"+intMP, 335, 65);
										map.drawString(intM4CurrentHP+"/"+intM4HP, 60, 63);
										map.drawString("What will you do?", 50, 310);
										map.drawString("(A)ttack        (H)eal          (R)un", 50, 330);
										chrConvo = map.getChar();
										if(chrConvo == 'a' || chrConvo == 'A'){
											intCurrentMP = intCurrentMP - 20;
											if(intCurrentMP < 0){
												intCurrentMP = 0 + 20;
											}
											if(intCurrentMP == 0){
												map.clear();
												map.drawImage(snakefimage, 0, 0, null);
												map.drawString(intCurrentHP+"/"+intHP, 250, 50);
												map.drawString(intCurrentMP+"/"+intMP, 335, 50);
												map.drawString(intM1CurrentHP+"/"+intM1HP, 50, 50);
												map.drawString("You can't attack without MP!", 50, 300);
												CurranX.pause(1500);
											}else{
											blnSkills = false;
											dblDamage = (int)(Math.random()*intMinAtk + (intMaxAtk - intMinAtk));
											intChance = (int)(Math.random()*9 + 1);
											if(intChance >= 3){
												dblDamage =  (int)(((dblLuck / 100) + 1) * dblDamage);
											}
											intM4CurrentHP = (int)(intM4CurrentHP - dblDamage);
											if(intM4CurrentHP < 0){
												intM4CurrentHP = 0;
											}
											map.clear();
											map.drawImage(snakefimage, 0, 0, null);
											map.drawString(intCurrentHP+"/"+intHP, 240, 65);
											map.drawString(intCurrentMP+"/"+intMP, 335, 65);
											map.drawString(intM4CurrentHP+"/"+intM4HP, 60, 63);
											if(intChance <= 3){
												map.drawString("CRITICAL HIT!", 80, 370);
												map.drawString("You attacked for: "+dblDamage+" damage.", 80, 330);
											}else{
												map.drawString("You attacked for: "+dblDamage+" damage.", 80, 330);
											}
											CurranX.pause(500);
											if(intM4CurrentHP == 0){
												blnMonster4 = false;
												blnDead = true;
												blnBattle = false;
												blnMap2 = true;
												blnBMap2 = true;
												map.clear();
												map.drawImage(snakedimage, 0, 0, null);
												map.drawString(intCurrentHP+"/"+intHP, 240, 65);
												map.drawString(intCurrentMP+"/"+intMP, 335, 65);
												map.drawString(intM4CurrentHP+"/"+intM4HP, 60, 63);
												map.drawString("Victory!", 80, 330);
												CurranX.pause(1000);
												map.drawString("You have gained 70 exp.", 80, 350);
												CurranX.pause(1000);
												dblCurrentEXP = dblCurrentEXP + 70;
												if(dblCurrentEXP >= dblMaxEXP){
													map.clear();
													dblEXPR = dblCurrentEXP - dblMaxEXP;
													dblCurrentEXP = 0;
													dblCurrentEXP = dblCurrentEXP + dblEXPR;
													intLv = intLv + 1;
													intAP = intAP + 5;
													intHP = intHP + 100;
													intCurrentHP = intHP;
													intMP = intMP + 50;
													intCurrentMP = intMP;
													map.drawImage(snakedimage, 0, 0, null);
													map.drawString(intCurrentHP+"/"+intHP, 240, 65);
													map.drawString(intCurrentMP+"/"+intMP, 335, 65);
													map.drawString(intM4CurrentHP+"/"+intM4HP, 60, 63);
													map.drawString("LEVEL UP!", 90, 330);
													CurranX.pause(1000);
													map.drawString("Go use your AP in your stats table.", 80, 350);
													CurranX.pause(1000);
												}
												}
											}
										}else if(chrConvo == 'h' || chrConvo == 'H'){
											blnSkills = false;
											intHeal = (int)(intHP * 0.2);
											intCurrentHP = intCurrentHP + intHeal;
											intMeal = (int)(intMP * 0.2);
											intCurrentMP = intCurrentMP + intHeal;
											if(intCurrentMP > intMP){
												intCurrentMP = intMP;
											}
											if(intCurrentHP > intHP){
												intCurrentHP = intHP;
											}
											map.clear();
											map.drawImage(snakefimage, 0, 0, null);
											map.drawString(intCurrentHP+"/"+intHP, 240, 65);
											map.drawString(intCurrentMP+"/"+intMP, 335, 65);
											map.drawString(intM4CurrentHP+"/"+intM4HP, 60, 63);
											map.drawString("You recovered: "+intHeal+" HP.", 80, 330);
											map.drawString("You recovered: "+intMeal+" HP.", 80, 340);
											CurranX.pause(500);
										}else if(chrConvo == 'r' || chrConvo == 'R'){
											blnSkills = false;
											intRun = (int)(intHP * 0.5);
											if(intRun <= intCurrentHP){
												map.clear();
												map.drawImage(snakefimage, 0, 0, null);
												map.drawString(intCurrentHP+"/"+intHP, 240, 65);
												map.drawString(intCurrentMP+"/"+intMP, 335, 65);
												map.drawString(intM4CurrentHP+"/"+intM4HP, 60, 63);
												map.drawString("You have escaped safely...", 80, 330);
												CurranX.pause(500);
												blnMonster4 = false;
												blnDead = true;
												blnBattle = false;
												blnMap2 = true;
												blnBMap2 = true;
											}else if(intRun > intCurrentHP){
												map.clear();
												map.drawImage(snakefimage, 0, 0, null);
												map.drawString(intCurrentHP+"/"+intHP, 240, 65);
												map.drawString(intCurrentMP+"/"+intMP, 335, 65);
												map.drawString(intM4CurrentHP+"/"+intM4HP, 60, 63);
												map.drawString("You are unable to escape anymore!", 80, 330);
											}
										}
									}
									if(blnBattle == true){
										dblDamage = 0;
										dblDamage = (int)(Math.random()*intM4MinAtk + (intM4MaxAtk - intM4MinAtk));
										intCurrentHP = (int)(intCurrentHP - dblDamage);
										map.drawString("You were hit with: "+dblDamage+" damage.", 80, 350);
										CurranX.pause(500);
										if(intCurrentHP < 0){
											intCurrentHP = 0;
										}
									}
									if(intCurrentHP == 0){
										blnMonster4 = false;
										blnDead = true;
										blnBattle = false;
										blnMap2 = false;
										blnBMap2 = false;
										blnGameOver = true;
									}
								}else if(blnMonster5 == true){
									map.drawImage(spiderfimage, 0, 0, null);
									map.drawString(intCurrentHP+"/"+intHP, 240, 65);
									map.drawString(intCurrentMP+"/"+intMP, 335, 65);
									map.drawString(intM5CurrentHP+"/"+intM5HP, 60, 63);
									blnSkills = true;
									while(blnSkills == true){
										map.drawString("What will you do?", 50, 310);
										map.drawString("(A)ttack        (H)eal          (R)un", 50, 330);
										chrConvo = map.getChar();
										if(chrConvo == 'a' || chrConvo == 'A'){
											intCurrentMP = intCurrentMP - 20;
											if(intCurrentMP < 0){
												intCurrentMP = 0 + 20;
											}
											if(intCurrentMP == 0){
												map.clear();
												map.drawImage(spiderfimage, 0, 0, null);
												map.drawString(intCurrentHP+"/"+intHP, 250, 50);
												map.drawString(intCurrentMP+"/"+intMP, 335, 50);
												map.drawString(intM1CurrentHP+"/"+intM1HP, 50, 50);
												map.drawString("You can't attack without enough MP!", 50, 300);
												CurranX.pause(1500);
											}else{
											blnSkills = false;
											dblDamage = (int)(Math.random()*intMinAtk + (intMaxAtk - intMinAtk));
											intChance = (int)(Math.random()*9 + 1);
											if(intChance >= 3){
												dblDamage =  (int)(((dblLuck / 100) + 1) * dblDamage);
											}
											intM5CurrentHP = (int)(intM5CurrentHP - dblDamage);
											if(intM5CurrentHP < 0){
												intM5CurrentHP = 0;
											}
											map.clear();
											map.drawImage(spiderfimage, 0, 0, null);
											map.drawString(intCurrentHP+"/"+intHP, 240, 65);
											map.drawString(intCurrentMP+"/"+intMP, 335, 65);
											map.drawString(intM5CurrentHP+"/"+intM5HP, 60, 63);
											if(intChance <= 3){
												map.drawString("CRITICAL HIT!", 80, 370);
												map.drawString("You attacked for: "+dblDamage+" damage.", 80, 330);
											}else{
												map.drawString("You attacked for: "+dblDamage+" damage.", 80, 330);
											}
											CurranX.pause(500);
											if(intM5CurrentHP == 0){
												blnMonster5 = false;
												blnDead = true;
												blnBattle = false;
												blnMap2 = true;
												blnBMap2 = true;
												map.clear();
												map.drawImage(spiderdimage, 0, 0, null);
												map.drawString(intCurrentHP+"/"+intHP, 240, 65);
												map.drawString(intCurrentMP+"/"+intMP, 335, 65);
												map.drawString(intM5CurrentHP+"/"+intM5HP, 60, 63);
												map.drawString("Victory!", 80, 330);
												CurranX.pause(1000);
												map.drawString("You have gained 45 exp.", 80, 350);
												CurranX.pause(1000);
												dblCurrentEXP = dblCurrentEXP + 45;
												if(dblCurrentEXP >= dblMaxEXP){
													map.clear();
													dblEXPR = dblCurrentEXP - dblMaxEXP;
													dblCurrentEXP = 0;
													dblCurrentEXP = dblCurrentEXP + dblEXPR;
													intLv = intLv + 1;
													intAP = intAP + 5;
													intHP = intHP + 100;
													intCurrentHP = intHP;
													intMP = intMP + 50;
													intCurrentMP = intMP;
													map.drawImage(spiderdimage, 0, 0, null);
													map.drawString(intCurrentHP+"/"+intHP, 240, 65);
													map.drawString(intCurrentMP+"/"+intMP, 335, 65);
													map.drawString(intM5CurrentHP+"/"+intM5HP, 60, 63);
													map.drawString("LEVEL UP!", 90, 330);
													CurranX.pause(1000);
													map.drawString("Go use your AP in your stats table.", 80, 350);
													CurranX.pause(1000);
												}
												}
											}
										}else if(chrConvo == 'h' || chrConvo == 'H'){
											blnSkills = false;
											intHeal = (int)(intHP * 0.2);
											intCurrentHP = intCurrentHP + intHeal;
											intMeal = (int)(intMP * 0.2);
											intCurrentMP = intCurrentMP + intHeal;
											if(intCurrentMP > intMP){
												intCurrentMP = intMP;
											}
											if(intCurrentHP > intHP){
												intCurrentHP = intHP;
											}
											map.clear();
											map.drawImage(spiderfimage, 0, 0, null);
											map.drawString(intCurrentHP+"/"+intHP, 240, 65);
											map.drawString(intCurrentMP+"/"+intMP, 335, 65);
											map.drawString(intM5CurrentHP+"/"+intM5HP, 60, 63);
											map.drawString("You recovered: "+intHeal+" HP.", 80, 330);
											map.drawString("You recovered: "+intMeal+" HP.", 80, 340);
											CurranX.pause(500);
										}else if(chrConvo == 'r' || chrConvo == 'R'){
											blnSkills = false;
											intRun = (int)(intHP * 0.5);
											if(intRun <= intCurrentHP){
												map.clear();
												map.drawImage(spiderfimage, 0, 0, null);
												map.drawString(intCurrentHP+"/"+intHP, 240, 65);
												map.drawString(intCurrentMP+"/"+intMP, 335, 65);
												map.drawString(intM5CurrentHP+"/"+intM5HP, 60, 63);
												map.drawString("You have escaped safely...", 80, 330);
												CurranX.pause(500);
												blnMonster5 = false;
												blnDead = true;
												blnBattle = false;
												blnMap2 = true;
												blnBMap2 = true;
											}else if(intRun > intCurrentHP){
												map.clear();
												map.drawImage(spiderfimage, 0, 0, null);
												map.drawString(intCurrentHP+"/"+intHP, 240, 65);
												map.drawString(intCurrentMP+"/"+intMP, 335, 65);
												map.drawString(intM5CurrentHP+"/"+intM5HP, 60, 63);
												map.drawString("You are unable to escape anymore!", 80, 330);
											}
										}
									}
									if(blnBattle == true){
										dblDamage = 0;
										dblDamage = (int)(Math.random()*intM5MinAtk + (intM5MaxAtk - intM5MinAtk));
										intCurrentHP = (int)(intCurrentHP - dblDamage);
										map.drawString("You were hit with: "+dblDamage+" damage.", 80, 350);
										CurranX.pause(500);
										if(intCurrentHP < 0){
											intCurrentHP = 0;
										}
									}
									if(intCurrentHP == 0){
										blnMonster5 = false;
										blnDead = true;
										blnBattle = false;
										blnMap2 = false;
										blnBMap2 = false;
										blnGameOver = true;
									}
								}else if(blnMonster6 == true){
									map.drawImage(batfimage, 0, 0, null);
									map.drawString(intCurrentHP+"/"+intHP, 240, 60);
									map.drawString(intCurrentMP+"/"+intMP, 335, 60);
									map.drawString(intM6CurrentHP+"/"+intM6HP, 60, 55);
									blnSkills = true;
									while(blnSkills == true){
										map.clear();
										map.drawImage(batfimage, 0, 0, null);
										map.drawString(intCurrentHP+"/"+intHP, 240, 60);
										map.drawString(intCurrentMP+"/"+intMP, 335, 60);
										map.drawString(intM6CurrentHP+"/"+intM6HP, 60, 55);
										map.drawString("What will you do?", 50, 280);
										map.drawString("(A)ttack        (H)eal          (R)un", 50, 300);
										chrConvo = map.getChar();
										if(chrConvo == 'a' || chrConvo == 'A'){
											intCurrentMP = intCurrentMP - 20;
											if(intCurrentMP < 0){
												intCurrentMP = 0 + 20;
											}
											if(intCurrentMP == 0){
												map.clear();
												map.drawImage(batfimage, 0, 0, null);
												map.drawString(intCurrentHP+"/"+intHP, 250, 50);
												map.drawString(intCurrentMP+"/"+intMP, 335, 50);
												map.drawString(intM1CurrentHP+"/"+intM1HP, 50, 50);
												map.drawString("You can't attack without MP!", 50, 300);
												CurranX.pause(1500);
											}else{
											blnSkills = false;
											dblDamage = (int)(Math.random()*intMinAtk + (intMaxAtk - intMinAtk));
											intChance = (int)(Math.random()*9 + 1);
											if(intChance >= 3){
												dblDamage =  (int)(((dblLuck / 100) + 1) * dblDamage);
											}
											intM6CurrentHP = (int)(intM6CurrentHP - dblDamage);
											if(intM6CurrentHP < 0){
												intM6CurrentHP = 0;
											}
											map.clear();
											map.drawImage(batfimage, 0, 0, null);
											map.drawString(intCurrentHP+"/"+intHP, 240, 60);
											map.drawString(intCurrentMP+"/"+intMP, 335, 60);
											map.drawString(intM6CurrentHP+"/"+intM6HP, 60, 55);
											if(intChance <= 3){
												map.drawString("CRITICAL HIT!", 80, 340);
												map.drawString("You attacked for: "+dblDamage+" damage.", 80, 300);
											}else{
												map.drawString("You attacked for: "+dblDamage+" damage.", 80, 300);
											}
											CurranX.pause(500);
											if(intM6CurrentHP == 0){
												blnMonster6 = false;
												blnDead = true;
												blnBattle = false;
												blnMap2 = true;
												blnBMap2 = true;
												map.clear();
												map.drawImage(batdimage, 0, 0, null);
												map.drawString(intCurrentHP+"/"+intHP, 240, 60);
												map.drawString(intCurrentMP+"/"+intMP, 335, 60);
												map.drawString(intM6CurrentHP+"/"+intM6HP, 60, 55);
												map.drawString("Victory!", 80, 300);
												CurranX.pause(1000);
												map.drawString("You have gained 60 exp.", 80, 320);
												CurranX.pause(1000);
												dblCurrentEXP = dblCurrentEXP + 60;
												if(dblCurrentEXP >= dblMaxEXP){
													map.clear();
													dblEXPR = dblCurrentEXP - dblMaxEXP;
													dblCurrentEXP = 0;
													dblCurrentEXP = dblCurrentEXP + dblEXPR;
													intLv = intLv + 1;
													intAP = intAP + 5;
													intHP = intHP + 100;
													intCurrentHP = intHP;
													intMP = intMP + 50;
													intCurrentMP = intMP;
													map.drawImage(batdimage, 0, 0, null);
													map.drawString(intCurrentHP+"/"+intHP, 240, 60);
													map.drawString(intCurrentMP+"/"+intMP, 335, 60);
													map.drawString(intM6CurrentHP+"/"+intM6HP, 60, 55);
													map.drawString("LEVEL UP!", 90, 280);
													CurranX.pause(1000);
													map.drawString("Go use your AP in your stats table.", 80, 300);
													CurranX.pause(1000);
												}
												}
											}
										}else if(chrConvo == 'h' || chrConvo == 'H'){
											blnSkills = false;
											intHeal = (int)(intHP * 0.2);
											intCurrentHP = intCurrentHP + intHeal;
											intMeal = (int)(intMP * 0.2);
											intCurrentMP = intCurrentMP + intHeal;
											if(intCurrentMP > intMP){
												intCurrentMP = intMP;
											}
											if(intCurrentHP > intHP){
												intCurrentHP = intHP;
											}
											map.clear();
											map.drawImage(batfimage, 0, 0, null);
											map.drawString(intCurrentHP+"/"+intHP, 240, 60);
											map.drawString(intCurrentMP+"/"+intMP, 335, 60);
											map.drawString(intM6CurrentHP+"/"+intM6HP, 60, 55);
											map.drawString("You recovered: "+intHeal+" HP.", 80, 280);
											map.drawString("You recovered: "+intMeal+" HP.", 80, 300);
											CurranX.pause(500);
										}else if(chrConvo == 'r' || chrConvo == 'R'){
											blnSkills = false;
											intRun = (int)(intHP * 0.5);
											if(intRun <= intCurrentHP){
												map.clear();
												map.drawImage(batfimage, 0, 0, null);
												map.drawString(intCurrentHP+"/"+intHP, 240, 60);
												map.drawString(intCurrentMP+"/"+intMP, 335, 60);
												map.drawString(intM6CurrentHP+"/"+intM6HP, 60, 55);
												map.drawString("You have escaped safely...", 80, 300);
												CurranX.pause(500);
												blnMonster6 = false;
												blnDead = true;
												blnBattle = false;
												blnMap2 = true;
												blnBMap2 = true;
											}else if(intRun > intCurrentHP){
												map.clear();
												map.drawImage(batfimage, 0, 0, null);
												map.drawString(intCurrentHP+"/"+intHP, 240, 60);
												map.drawString(intCurrentMP+"/"+intMP, 335, 60);
												map.drawString(intM6CurrentHP+"/"+intM6HP, 60, 55);
												map.drawString("You are unable to escape anymore!", 80, 300);
											}
										}
									}
									if(blnBattle == true){
										dblDamage = 0;
										dblDamage = (int)(Math.random()*intM6MinAtk + (intM6MaxAtk - intM6MinAtk));
										intCurrentHP = (int)(intCurrentHP - dblDamage);
										map.drawString("You were hit with: "+dblDamage+" damage.", 80, 320);
										CurranX.pause(500);
										if(intCurrentHP < 0){
											intCurrentHP = 0;
										}
									}
									if(intCurrentHP == 0){
										blnMonster6 = false;
										blnDead = true;
										blnBattle = false;
										blnMap2 = false;
										blnBMap2 = false;
										blnGameOver = true;
									}
								}else if(blnBoss == true){
									clip4.start();
									map.drawImage(satanimage1, 0, 0, null);
									CurranX.pause(2000);
									map.drawImage(satanimage2, 0, 0, null);
									CurranX.pause(2000);
									map.drawImage(satanimage3, 0, 0, null);
									CurranX.pause(2000);
									map.drawImage(satanimage4, 0, 0, null);
									CurranX.pause(4000);
									map.drawImage(satanimage5, 0, 0, null);
									CurranX.pause(1000);
									while(blnBossBattle == true){
										map.drawImage(satanfimage, 0, 0, null);
										map.drawString(intCurrentHP+"/"+intHP, 45, 190);
										map.drawString(intCurrentMP+"/"+intMP, 45, 230);
										map.drawString(intBossCurrentHP+"/"+intBossHP, 30, 110);
										blnSkills = true;
										while(blnSkills == true){
											map.clear();
											map.drawImage(satanfimage, 0, 0, null);
											map.drawString(intCurrentHP+"/"+intHP, 45, 190);
											map.drawString(intCurrentMP+"/"+intMP, 45, 230);
											map.drawString(intBossCurrentHP+"/"+intBossHP, 30, 110);
											map.drawString("What will you do?", 50,310);
											map.drawString("(A)ttack        (H)eal          (R)un", 50, 330);
											chrConvo = map.getChar();
											if(chrConvo == 'a' || chrConvo == 'A'){
												intCurrentMP = intCurrentMP - 20;
											if(intCurrentMP < 0){
												intCurrentMP = 0 + 20;
											}
											if(intCurrentMP == 0){
												map.clear();
												map.drawImage(satanfimage, 0, 0, null);
												map.drawString(intCurrentHP+"/"+intHP, 45, 190);
												map.drawString(intCurrentMP+"/"+intMP, 45, 230);
												map.drawString(intM1CurrentHP+"/"+intM1HP, 30, 110);
												map.drawString("You can't attack without MP!", 50, 330);
												CurranX.pause(1500);
											}else{
												blnSkills = false;
												dblDamage = (int)(Math.random()*intMinAtk + (intMaxAtk - intMinAtk));
												intChance = (int)(Math.random()*9 + 1);
												if(intChance >= 3){
													dblDamage =  (int)(((dblLuck / 100) + 1) * dblDamage);
												}
												intBossCurrentHP = (int)(intBossCurrentHP - dblDamage);
												if(intBossCurrentHP < 0){
													intBossCurrentHP = 0;
												}
												map.clear();
												map.drawImage(satanfimage, 0, 0, null);
												map.drawString(intCurrentHP+"/"+intHP, 45, 190);
												map.drawString(intCurrentMP+"/"+intMP, 45, 230);
												map.drawString(intBossCurrentHP+"/"+intBossHP, 30, 100);
												if(intChance <= 3){
													map.drawString("CRITICAL HIT!", 80, 370);
													map.drawString("You attacked for: "+dblDamage+" damage.", 80, 330);
												}else{
													map.drawString("You attacked for: "+dblDamage+" damage.", 80, 330);
												}
												CurranX.pause(500);
												if(intBossCurrentHP == 0){
													map.clear();
													map.drawImage(defeatimage1, 0, 0, null);
													CurranX.pause(2000);
													map.drawImage(defeatimage2, 0, 0, null);
													CurranX.pause(1000);
													map.drawImage(defeatimage3, 0, 0, null);
													CurranX.pause(2000);
													map.drawImage(defeatimage4, 0, 0, null);
													CurranX.pause(1000);
													map.drawImage(defeatimage5, 0, 0, null);
													CurranX.pause(1000);
													map.drawImage(defeatimage6, 0, 0, null);
													CurranX.pause(2000);
													map.drawImage(defeatimage7, 0, 0, null);
													CurranX.pause(2000);
													blnBoss = false;
													blnDead = true;
													blnBattle = false;
													blnBossBattle = false;
													blnGameOver = true;
													clip4.stop();
												}
											}
											}else if(chrConvo == 'h' || chrConvo == 'H'){
												blnSkills = false;
												intHeal = (int)(intHP * 0.2);
												intCurrentHP = intCurrentHP + intHeal;
												intMeal = (int)(intMP * 0.2);
												intCurrentMP = intCurrentMP + intHeal;
												if(intCurrentMP > intMP){
													intCurrentMP = intMP;
												}
												if(intCurrentHP > intHP){
													intCurrentHP = intHP;
												}
												map.clear();
												map.drawImage(satanfimage, 0, 0, null);
												map.drawString(intCurrentHP+"/"+intHP, 45, 190);
												map.drawString(intCurrentMP+"/"+intMP, 45, 230);
												map.drawString(intM6CurrentHP+"/"+intM6HP, 30, 100);
												map.drawString("You recovered: "+intHeal+" HP.", 80, 310);
												map.drawString("You recovered: "+intMeal+" HP.", 80, 330);
												CurranX.pause(500);
											}else if(chrConvo == 'r' || chrConvo == 'R'){
												map.clear();
												map.drawImage(satanfimage, 0, 0, null);
												map.drawString(intCurrentHP+"/"+intHP, 45, 190);
												map.drawString(intCurrentMP+"/"+intMP, 45, 230);
												map.drawString(intM6CurrentHP+"/"+intM6HP, 30, 100);
												map.drawString("You cannot escape from Satan!!", 80, 330);
												CurranX.pause(1000);
											}
										}
										if(	blnBattle == true){
											dblDamage = 0;
											dblDamage = (int)(Math.random()*intBossMinAtk + (intBossMaxAtk - intBossMinAtk));
											intCurrentHP = (int)(intCurrentHP - dblDamage);
											map.drawString("You were hit with: "+dblDamage+" damage.", 80, 350);
											CurranX.pause(500);
											if(intCurrentHP < 0){
												intCurrentHP = 0;
											}
										}
										if(intCurrentHP == 0){
											blnBoss = false;
											blnDead = true;
											blnBattle = false;
											blnMap4 = false;
											blnBossBattle = false;
											blnGameOver = true;
										}
									}
								}
							}
						}
		 			}
		 			
		 			map.clear();
		 			stats.close();
		 			keima.close();
		 			map.drawImage(gameoverimage, 0, 0, null);
		 			clip3.start();
		 			CurranX.pause(4250);
		 			clip3.stop();
		 			map.clear();
		 			
	 			
				
 			}
		}		
	}
}
