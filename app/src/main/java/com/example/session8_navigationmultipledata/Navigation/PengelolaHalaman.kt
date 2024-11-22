package com.example.session8_navigationmultipledata.Navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.session8_navigationmultipledata.model.Mahasiswa
import com.example.session8_navigationmultipledata.ui.view.viewmodel.MahasiswaViewModel
import com.example.session8_navigationmultipledata.ui.view.viewmodel.RencanaStudyViewModel

enum class Halaman {
    Splash,
    Mahasiswa,
    Matakuliah,
    Tampil
}
@Composable
fun MahasiswaApp(
    modifier: Modifier = Modifier,
    mahasiswaiViewModel: MahasiswaViewModel = viewModel(),
    krsViewModel: RencanaStudyViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
){
    val mahasiswauiState = mahasiswaViewModel.mahasiswaUiState.collectAsState().value

    NavHost(
        navController = navController,
        startDestination = Halaman.Screen.name,
        modifier = Modifier.padding()
    ){
        composable(route = Halaman.Screen.name){
        }
        composable(route = Halaman.Screen.name){
        }
    }


}