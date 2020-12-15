public class GameCharacter{
    private String gameName;
    private Character char1, char2, char3, char4, char5;

    public GameCharacter(String gameName, Character char1, Character char2, Character char3, Character char4, Character char5){
        this.gameName = gameName;
    }

    public String toString(){
        return gameName + "Character1: " + char1 + " Character2: " + char2 + " Character3: " + char3 + "Character4: " + char4 + " Character5: " + char5;
    }
}