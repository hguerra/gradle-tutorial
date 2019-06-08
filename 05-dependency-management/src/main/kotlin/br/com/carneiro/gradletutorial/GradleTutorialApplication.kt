package br.com.carneiro.gradletutorial

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GradleTutorialApplication

fun main(args: Array<String>) {
	runApplication<GradleTutorialApplication>(*args)
}
