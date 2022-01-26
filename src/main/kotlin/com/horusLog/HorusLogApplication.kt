package com.horusLog

import com.horusLog.domain.Role
import com.horusLog.domain.User
import com.horusLog.repository.RoleRepository
import com.horusLog.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.*

@SpringBootApplication
class HorusLogApplication: CommandLineRunner {

	@Autowired
	private val userRepository: UserRepository? = null;

	@Autowired
	private val roleRepository: RoleRepository? = null;

	override fun run(vararg args: String?) {

		val user1 = User(null, "Marcelo", "marcelo@mail.com");
		val user2 = User(null, "Amanda", "amanda@mail.com");
		val user3 = User(null, "Joana", "joana@mail.com");

		val user4 = User(null, "John", "john@mail.com");
		val user5 = User(null, "Carlos", "carlos@mail.com");
		val user6 = User(null, "Pedro", "pedro@mail.com");

		userRepository?.saveAll(listOf(user1, user2, user3, user4, user5, user6));

		val role1 = Role(null, "Admin");
		val role2 = Role(null, "Manager");
		val role3 = Role(null, "Driver");

		roleRepository?.saveAll(listOf(role1, role2, role3));
	}

}

fun main(args: Array<String>) {
	runApplication<HorusLogApplication>(*args)
}
