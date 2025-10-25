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
                    val person = Person(
                        name = "Enrique",
                        age = 30,
                        email = "enrique@enridev.com"
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
fun Greeting(person: Person, modifier: Modifier = Modifier) {
    Text(
        text = "Hello, my name is ${person.name} I'm ${person.age} and my email is ${person.email}",
        modifier = modifier
    )

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GitRebaseTheme {
        Greeting(Person())
    }
}