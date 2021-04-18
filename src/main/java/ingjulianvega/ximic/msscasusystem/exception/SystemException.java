package ingjulianvega.ximic.msscasusystem.exception;

import lombok.Getter;

@Getter
public class SystemException extends RuntimeException {

    private final String code;

    public SystemException(final String code, final String message) {
        super(message);
        this.code = code;
    }
}

