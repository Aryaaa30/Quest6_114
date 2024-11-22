package com.example.session8_navigationmultipledata.ui.view.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
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
        modifier = Modifier.fillMaxSize().background(Color.White)
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = R.drawable.arya),
            contentDescription = "Foto Mahasiswa",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.padding(8.dp))

        TampilData(
            judul = "NIM",
            isinya = mhs.nim
        )
        TampilData(
            judul = "Nama",
            isinya = mhs.nama
        )
        TampilData(
            judul = "Email",
            isinya = mhs.email
        )
        TampilData(
            judul = "Mata Kuliah Peminatan",
            isinya = mk.namaMK
        )
        TampilData(
            judul = "Kelas",
            isinya = mk.kelas
        )
        Spacer(modifier = Modifier.padding(16.dp))

        Button(
            onClick = { navHostController.popBackStack() },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .size(width = 200.dp, height = 50.dp)
        ) {
            Text("Kembali", color = Color.White, fontSize = 16.sp)
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