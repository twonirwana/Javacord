package de.btobastian.javacord.exceptions;

import de.btobastian.javacord.utils.rest.RestRequest;
import de.btobastian.javacord.utils.rest.RestRequestResult;

/**
 * When something was not found (HTTP response code 404).
 */
public class NotFoundException extends BadRequestException {

    /**
     * Creates a new instance of this class.
     *
     * @param origin The origin of the exception.
     * @param message The message of the exception.
     * @param request The request.
     * @param restRequestResult The rest request result which caused the exception.
     */
    public NotFoundException(
            Exception origin, String message, RestRequest<?> request, RestRequestResult restRequestResult) {
        super(origin, message, request, restRequestResult);
    }

}
