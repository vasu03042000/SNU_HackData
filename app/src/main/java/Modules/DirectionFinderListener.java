package Modules;

import java.util.List;

/**
 * CCreated by Guru-101
 */
public interface DirectionFinderListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}
