import java.util.Random;
public class Character{
    private String charname;
    private int totalPoints = 0, strength, toughness, intelligence, magic, influence;
    Random random = new Random();

    //CONSTRUCTOR
    public Character(String character) {
        if (character == "knight") {
            while (totalPoints <= 25 && totalPoints > 8) {
                this.strength = mainStat(random);
                this.toughness = Skills(random);
                this.intelligence = Skills(random);
                this.magic = Skills(random);
                this.influence = Skills(random);
                totalPoints = strength+toughness+intelligence+magic+influence;
            }
        } else if(character == "peasant"){
            while (totalPoints <= 25 && totalPoints > 8) {
                this.strength = Skills(random);
                this.toughness = mainStat(random);
                this.intelligence = Skills(random);
                this.magic = Skills(random);
                this.influence = Skills(random);
                totalPoints = strength+toughness+intelligence+magic+influence;
            }
        } else if(character == "cleric"){
            while (totalPoints <= 25 && totalPoints > 8) {
                this.strength = Skills(random);
                this.toughness = Skills(random);
                this.intelligence = mainStat(random);
                this.magic = Skills(random);
                this.influence = Skills(random);
                totalPoints = strength+toughness+intelligence+magic+influence;
            } 
        } else if(character == "mage"){
            while (totalPoints <= 25 && totalPoints > 8) {
                this.strength = Skills(random);
                this.toughness = Skills(random);
                this.intelligence = Skills(random);
                this.magic = mainStat(random);
                this.influence = Skills(random);
                totalPoints = strength+toughness+intelligence+magic+influence;
            } 
        } else if(character == "courtier"){
            while (totalPoints <= 25 && totalPoints > 8) {
                this.strength = Skills(random);
                this.toughness = Skills(random);
                this.intelligence = Skills(random);
                this.magic = Skills(random);
                this.influence = mainStat(random);
                totalPoints = strength+toughness+intelligence+magic+influence;
            }  
        }
    }

    //SETTERS
    public void setName(String charname){
        this.charname = charname;
    }

    //GETTERS
    public int getStrength(){
        return this.strength;
    }

    public int getToughness(){
        return this.toughness;
    }

    public int getIntelligence(){
        return this.intelligence; 
    }

    public int getMagic(){
        return this.magic;
    }

    public int getInfluence(){
        return this.influence;
    }

    //STATIC FUNCTIONS
    private static int mainStat(Random random){
        return random.nextInt(4) + 7;
    }

    private static int Skills(Random random){
        return random.nextInt(6);
    }

    //TOSTRING
    public String toString() {
        return "Strength: " + getStrength() + " Toughness: " + getToughness() + " Intelligence: " + getIntelligence() + " Magic: " + getMagic() + " Influence: " + getInfluence();
    }
}