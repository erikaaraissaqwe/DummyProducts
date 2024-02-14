package br.edu.ifsp.scl.sdm.dummyproducts.model

data class ProductsList(
    val limit: Int,
    val products: List<Product>,
    val skip: Int,
    val total: Int
)