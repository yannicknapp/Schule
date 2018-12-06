using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class bewegen : MonoBehaviour {

	// Use this for initialization
	void Start () {
		
	}
    float speed = 5.0f;
    float jumpSpeed=1f;
    bool isjumping = false;
    Collision col;
    // Update is called once per frame
    void Update ()
    {
        if (Input.GetKey(KeyCode.LeftArrow))
        {
            transform.position += Vector3.left * speed * Time.deltaTime;
        }
        if (Input.GetKey(KeyCode.RightArrow))
        {
            transform.position += Vector3.right * speed * Time.deltaTime;
        }
        Rigidbody2D rb = GetComponent<Rigidbody2D>();
        if (Input.GetKey(KeyCode.UpArrow))
        {
                rb.AddForce(Vector2.up * jumpSpeed, ForceMode2D.Impulse);
                
            
        }
    }
}
