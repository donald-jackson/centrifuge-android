package org.coindirect.centrifuge.java.listener;

/**
 * This file is part of centrifuge-android
 * Created by semyon on 29.04.16.
 * */
public interface ConnectionListener {

    void onWebSocketOpen();

    void onConnected();

    void onDisconnected(final int code, final String reason, final boolean remote);

}
