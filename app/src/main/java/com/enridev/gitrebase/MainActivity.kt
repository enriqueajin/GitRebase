package com.enridev.gitrebase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.enridev.gitrebase.ui.theme.GitRebaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GitRebaseTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val person = MyRefactoredPerson(
                        myNameRefactored = "Enrique",
                        myAgeRefactored = 30,
                        myEmailRefactored = "enrique@enridev.com",
                        isEnabled = false
                    )
                    Greeting(
                        modifier = Modifier.padding(innerPadding),
                        person = person,
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(person: MyRefactoredPerson, modifier: Modifier = Modifier) {
    with(person) {
        Text(
            text = "Hello, my name is $myNameRefactored I'm $person.myAgeRefactored and my email is $myEmailRefactored",
            modifier = modifier
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    val person = MyRefactoredPerson(
        myNameRefactored = "Enrique",
        myAgeRefactored = 30,
        myEmailRefactored = "enrique@enridev.com",
        isEnabled = false
    )
    GitRebaseTheme {
        Greeting(person)
    }
}