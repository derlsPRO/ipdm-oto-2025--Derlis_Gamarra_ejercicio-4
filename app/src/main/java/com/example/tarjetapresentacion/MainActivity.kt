package com.example.tarjetapresentacion

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
import com.example.tarjetapresentacion.ui.theme.TarjetaPresentacionTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.Image
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TarjetaPresentacionTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BusinessCard(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ProfileSection()
        ContactSection()
    }
}

@Composable
fun ProfileSection() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = null,
            modifier = Modifier
                .size(150.dp)
                .padding(bottom = 16.dp)
        )
        Text(
            text = "Derlis Gamarra",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
        Text(
            text = "Desarrollador Android Apasionado",
            color = Color(0xFF3DDC84),
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp
        )
    }
}

@Composable
fun ContactSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 24.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        ContactRow(Icons.Default.Phone, "+595 982 640 312")
        ContactRow(Icons.Default.Share, "@derlsPRO")
        ContactRow(Icons.Default.Email, "derlis@proyecto.com")
    }
}

@Composable
fun ContactRow(icon: ImageVector, contact: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFF3DDC84),
            modifier = Modifier.padding(end = 16.dp)
        )
        Text(text = contact, fontSize = 14.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    TarjetaPresentacionTheme {
        BusinessCard()
    }
}