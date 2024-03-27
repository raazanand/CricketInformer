package com.cricket.CricketInformer.services;

import com.cricket.CricketInformer.entity.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {
    List<Match> getAllMatches();
    List<Match> getLiveMatches();
    List<List<String>> getPointTable();
}
