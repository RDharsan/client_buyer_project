package com.example.demo.dto;

public class SuccessResponseDTO {

    private String message_res;

    public SuccessResponseDTO(String message_res) {
        this.message_res = message_res;
    }

	public String getmessage_res() {
		return message_res;
	}

	public void setmessage_res(String message_res) {
		this.message_res = message_res;
	}
    
    
}