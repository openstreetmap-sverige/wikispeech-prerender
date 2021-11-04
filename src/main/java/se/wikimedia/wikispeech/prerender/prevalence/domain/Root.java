package se.wikimedia.wikispeech.prerender.prevalence.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

@Data
public class Root implements Serializable {

    private static final long serialVersionUID = 1L;

    private Map<String, RemoteSite> remoteSiteByConsumerUrl = new HashMap<>();
    private Queue<RenderQueueItem> renderQueue = new LinkedList<>();


}
