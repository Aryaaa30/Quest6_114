package com.example.session8_navigationmultipledata.ui.view.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.session8_navigationmultipledata.Navigation.Halaman
import com.example.session8_navigationmultipledata.R
import com.example.session8_navigationmultipledata.model.Mahasiswa
import com.example.session8_navigationmultipledata.model.RencanaStudi

@Composable
fun TampilanDataMahasiswaView(
    mhs: Mahasiswa,
    mk: RencanaStudi,
    navHostController: NavHostController
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.Primary))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp), verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically){
                Image(
                    painter = painterResource(id = R.drawable.umy),
                    contentDescription = "",
                    modifier = Modifier.size(45.dp)
                )
                Spacer(modifier = Modifier.padding(start = 16.dp))
                Column {
                    Text(
                        text = "Universitas Muhammadiyah Yogyakarta",
                        color = Color.White,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Unggul dan Islami",
                        color = Color.White,
                        fontWeight = FontWeight.Light
                    )
                }
                Box(
                    modifier = Modifier
                        .padding(16.dp)
                ) {
                    Icon(
                        imageVector = Icons.Filled.Notifications,
                        contentDescription = "",
                        tint = Color.White,
                    )
                }
            }
        }

        Box(
            modifier = Modifier
                .background(color = Color.White, shape = RoundedCornerShape(topEnd = 15.dp, topStart = 15.dp))
                .fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Foto Mahasiswa
                Image(
                    painter = painterResource(id = R.drawable.arya),
                    contentDescription = "Foto Mahasiswa",
                    modifier = Modifier
                        .size(200.dp)
                        .clip(CircleShape)
                )
                Spacer(modifier = Modifier.padding(8.dp))

                // Data Mahasiswa
                TampilData(judul = "NIM", isinya = mhs.nim)
                TampilData(judul = "Nama", isinya = mhs.nama)
                TampilData(judul = "Email", isinya = mhs.email)
                TampilData(judul = "Mata Kuliah Peminatan", isinya = mk.namaMK)
                TampilData(judul = "Kelas", isinya = mk.kelas)

                Spacer(modifier = Modifier.padding(16.dp))

                // Tombol Kembali
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(
                        onClick = { navHostController.navigate(Halaman.Splash.name) },
                        modifier = Modifier
                            .size(width = 200.dp, height = 50.dp)
                            .clip(RoundedCornerShape(8.dp))
                    ) {
                        Text("Selesai", color = Color.White, fontSize = 16.sp)
                    }
                }
            }
        }
    }
}

@Composable
fun TampilData(judul:String, isinya:String){
    Row (modifier = Modifier.fillMaxWidth()
        .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween){
        Text(judul, modifier = Modifier.weight(0.8f))
        Text(":", modifier = Modifier.weight(0.2f))
        Text(isinya, modifier = Modifier.weight(2f))
    }
}