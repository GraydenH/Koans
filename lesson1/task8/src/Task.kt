fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) =
        if (client != null && message != null && client.personalInfo != null && client.personalInfo.email != null)
            mailer.sendMessage(client.personalInfo.email, message)
        else {}


class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}