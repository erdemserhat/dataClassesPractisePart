import java.util.*

data class User(
    private val name_param: String = "",
    private val surname_param: String = "",
    private val age_param: Int = 0,
    private val password_param: String = "",
    private val userID_param: String = ""
) {

    var name: String = name_param
        set(value) {
            if (value.isBlank() || value.isBlank())
                throw Exception("Please enter a proper name")
            else {
                field = value
            }
        }
        get() {
            return field.uppercase(Locale.getDefault())
        }


    var surname: String = surname_param
        set(value) {
            if (value.isBlank() || value.isEmpty()) {
                throw java.lang.Exception("Please enter a proper Surname value")

            } else {
                field = value
            }
        }
        get() {
            return field.uppercase(Locale.getDefault())
        }


    var age: Int = age_param
        set(value) {
            if (!(age > 18)) {
                field = value
            } else {
                throw Exception("You should be older than 18 to register our bank")
            }
        }

    var password: String = password_param
        set(value) {
            if (value.contains(name) || value.contains(surname)) {
                throw java.lang.Exception("Your password should not contain your data  (your surname or name)")

            } else if (value.length < 8) {
                throw java.lang.Exception("Your password should be longer than 8 digit")

            } else {
                field = value
            }
        }
        get() {
            return field
        }
}