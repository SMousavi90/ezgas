package it.polito.ezgas.converter;

import it.polito.ezgas.dto.*;
import it.polito.ezgas.entity.User;

public class UserConverter {
	
	public static UserDto toUserDto(User user) {
		UserDto userConverted = new UserDto();
		userConverted.setUserId(user.getUserId());
		userConverted.setUserName(user.getUserName());
		userConverted.setPassword(user.getPassword());
		userConverted.setEmail(user.getEmail());
		userConverted.setReputation(user.getReputation());
		userConverted.setAdmin(user.getAdmin());
		
		return userConverted;
	}
	public static User toUser(UserDto user) {
		User userConverted = new User();
		userConverted.setUserId(user.getUserId());
		userConverted.setUserName(user.getUserName());
		userConverted.setPassword(user.getPassword());
		userConverted.setEmail(user.getEmail());
		userConverted.setReputation(user.getReputation());
		userConverted.setAdmin(user.getAdmin());
		
		return userConverted;
	}
	
}
