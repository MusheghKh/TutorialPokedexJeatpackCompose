package com.example.tutorialpokedexjetpackcompose.pokemondetail

import androidx.lifecycle.ViewModel
import com.example.tutorialpokedexjetpackcompose.data.remote.responses.Pokemon
import com.example.tutorialpokedexjetpackcompose.repository.PokemonRepository
import com.example.tutorialpokedexjetpackcompose.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}