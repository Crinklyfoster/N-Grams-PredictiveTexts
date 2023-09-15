
/**
 * IMarkovModel is an interface that is implemented in both MarkovWordOne and 
 * MarkovWordTwo classes.
 * 
 * @ Snehil S P
 * @ Version: 1.0 (15 August 2023)
 */

public interface IMarkovModel {
    public void setTraining(String text);
    
    public void setRandom(int seed);
    
    public String getRandomText(int numChars);

}
