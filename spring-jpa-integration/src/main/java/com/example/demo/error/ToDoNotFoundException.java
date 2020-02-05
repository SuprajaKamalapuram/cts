package com.example.demo.error;

@SuppressWarnings("serial")
public class ToDoNotFoundException extends RuntimeException {
	
	
		private String message;

		public ToDoNotFoundException(String message) {
			super();
			this.message = message;
		}

		public String getMessage() {
			return message;
		}
		
}
