package com.complexible.pellet.service;

/**
 * Generic simple JSON message.
 *
 * @author Edgar Rodriguez-Diaz
 */
public class GenericJsonMessage extends AbstractJsonMessage {

	public final String message;

	public GenericJsonMessage(final String theMessage) {
		message = theMessage;
	}

}
