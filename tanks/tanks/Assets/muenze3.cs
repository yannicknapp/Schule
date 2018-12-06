using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI; 

public class muenze3 : MonoBehaviour {

    private int score;

    void Start ()
    {
        SetScoreText();
        score = 0; 
		
	}
    

    private void OnCollisionEnter2D(Collision2D col)
    {
        this.gameObject.SetActive(false);
        score = score + 1;
        SetScoreText(); 


        
    }

    void SetScoreText ()
    {
       
        scoreText.text = "Score: " + score.ToString(); 
    }
    // Update is called once per frame
    void Update() {

        
    }
}
