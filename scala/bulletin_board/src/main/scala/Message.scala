class Message {
	def setResponse(message: Message):Unit {
		if(getMessage_id().equals(message.getParent_id())) {
			getResponse().add(message)
		} else {
			if(getResponse().size() > 0) {
				Iterator responseIterate
			}	
		}
	}
}