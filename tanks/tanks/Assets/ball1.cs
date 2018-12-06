using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using System;

public class ball1 : MonoBehaviour {

	// Use this for initialization
	void Start () {
		
	}
	
	// Update is called once per frame
	void Update ()
    {
        float x = 2f;
        System.Diagnostics.Stopwatch s = new System.Diagnostics.Stopwatch();
        
        var richtung = new Vector2(1f,0f);
        if (Input.GetKeyDown(KeyCode.RightArrow))
        {
            s.Start();
            Vector3 position = this.transform.position;
            position.x++;
            this.transform.position = position;
        }
        if(Input.GetKeyUp(KeyCode.RightArrow))
        {
            s.Stop();
        }
        Int32 a = Convert.ToInt32(s);

        

        



    }
}
