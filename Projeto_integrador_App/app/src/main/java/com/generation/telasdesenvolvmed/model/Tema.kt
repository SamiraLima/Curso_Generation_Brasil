package com.generation.telasdesenvolvmed.model

class Tema (
	val id: Long,
	val tema: String?,
	val postagem: List<Postagem>?
		) {

	override fun toString(): String {
		return tema!!
	}
}