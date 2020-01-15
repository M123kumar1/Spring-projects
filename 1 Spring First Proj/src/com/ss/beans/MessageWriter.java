package com.ss.beans;

public class MessageWriter {
	IMessageConverter messageConverter;
	public void writeMessage(String message) {
		String cMessage=messageConverter.convert(message);
		System.out.println(cMessage);
	}
	/*public void setMessageConverter(IMessageConverter messageConverter) {
		this.messageConverter = messageConverter;
	}*/
	public MessageWriter(IMessageConverter messageConverter) {
		this.messageConverter = messageConverter;
	}
}
