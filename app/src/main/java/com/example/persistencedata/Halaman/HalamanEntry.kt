package com.example.persistencedata.Halaman

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.persistencedata.R
import com.example.persistencedata.model.EntryViewModel
import com.example.persistencedata.model.PenyediaViewModel
import com.example.persistencedata.navigasi.DestinasiNavigasi

object DestinasiEntry: DestinasiNavigasi {
    override val route = "item_entry"
    override val titleRes = R.string.entry_siswa
}

@Composable
fun EntrySiswaScreen(
    navigateBack: () -> Unit,
    modifier : Modifier = Modifier,
    viewModel: EntryViewModel = viewModel(factory = PenyediaViewModel.Factory)
    ){

}