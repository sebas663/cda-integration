package org.fleni.cda.common.remoting;

public enum IntegrationResponseCode {
	
	SUCCESS (0, "SUCCESS"),
	INCOMPLETE_DATA (1, "INCOMPLETE_DATA"),
	DATA_NOT_FOUND (2, "DATA_NOT_FOUND"),
	WRONG_DATA (3, "WRONG_DATA");
	
    private final Integer code;
    private final String description;

	/**
	 * @param code
	 * @param description
	 */
	private IntegrationResponseCode(Integer code, String description) {
		this.code = code;
		this.description = description;
	}

	/**
	 * @return
	 */
	public Integer getCode() {
		return code;
	}

	/**
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param code
	 * @return
	 */
	public static String getDescriptionByCode(Integer code){
        String descripcion = null;
        for (IntegrationResponseCode x : IntegrationResponseCode.values()){
            if (code.equals(x.getCode())){
                descripcion = x.getDescription();
            }
        }
        return descripcion;
    }

}
