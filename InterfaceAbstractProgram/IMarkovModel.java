
/**
 * IMarkovModel is an interface that is implemented in the AbstractMarkovModel class.
 * 
 * 
 * @ Snehil S P 
 * @ Version: 1.0 (09 August 2023)
 */

public interface IMarkovModel {
    public void setRandom(int seed);
    
    public void setTraining(String text);
    
    public String getRandomText(int setSize);
}
