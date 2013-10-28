package com.stuffsystem.util;

import java.net.UnknownHostException;
import com.mongodb.MongoClient;

public class MongoClientConnection {

	private static MongoClient client = null;

	public static MongoClient getMongoConnection() {
		try {
			client = new MongoClient();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return client;
	}

	public static void closeMongoConnection(MongoClient inClient) {
		inClient.close();
	}
}