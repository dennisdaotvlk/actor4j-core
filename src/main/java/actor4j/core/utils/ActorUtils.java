/*
 * Copyright (c) 2015-2017, David A. Bauer. All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package actor4j.core.utils;

import java.util.UUID;

import actor4j.core.actors.ActorRef;
import actor4j.core.messages.ActorMessage;

public final class ActorUtils {
	public static final UUID UUID_ZERO = UUID.fromString("00000000-0000-0000-0000-000000000000");
	
	public static String actorLabel(ActorRef actorRef) {
		return actorRef.getName()!=null ? actorRef.getName() : actorRef.getId().toString();
	}
	
	public static boolean isDirective(ActorMessage<?> message) {
		return message.tag<0;
	}
}
