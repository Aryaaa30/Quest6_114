package com.example.session8_navigationmultipledata.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import androidx.navigation.NavBackStackEntry
import com.example.session8_navigationmultipledata.model.RencanaStudi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class RencanaStudyViewModel : ViewModel() {
    private val _krsState = MutableStateFlow(RencanaStudi())
    val krsStateUi: StateFlow<RencanaStudi> = _krsState.asStateFlow()

    fun setMataKuliah(mkPilihan: String) {
        _krsState.update { stateMK -> stateMK.copy(namaMK = mkPilihan) }
    }

    fun setKelas(kelasPilihan: String) {
        _krsState.update { stateKelas -> stateKelas.copy(kelas = kelasPilihan) }
    }

    fun saveDataKRS(namaMK: String, kelas: String) {
        _krsState.update { state ->
            state.copy(
                namaMK = namaMK,
                kelas = kelas
            )
        }
    }
}