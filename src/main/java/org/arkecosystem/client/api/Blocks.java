package org.arkecosystem.client.api;

import com.google.gson.internal.LinkedTreeMap;
import java.io.IOException;
import java.util.Map;
import org.arkecosystem.client.http.Client;

public class Blocks {
    private Client client;

    public Blocks(Client client) {
        this.client = client;
    }

    public LinkedTreeMap<String, Object> all() throws IOException {
        return this.client.get("blocks");
    }

    public LinkedTreeMap<String, Object> first() throws IOException {
        return this.client.get("blocks/first");
    }

    public LinkedTreeMap<String, Object> last() throws IOException {
        return this.client.get("blocks/last");
    }

    public LinkedTreeMap<String, Object> show(String id) throws IOException {
        return this.client.get("blocks/" + id);
    }

    public LinkedTreeMap<String, Object> transactions(String id) throws IOException {
        return this.client.get("blocks/" + id + "/transactions");
    }

    public LinkedTreeMap<String, Object> search(Map<String, Object> parameters) throws IOException {
        return this.client.post("blocks/search", parameters);
    }
}
