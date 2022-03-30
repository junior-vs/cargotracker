package tech.studio.rest.cargotracker.domain.model.handling;


import tech.studio.rest.cargotracker.domain.model.cargo.TrackingId;

public interface HandlingEventRepository {

  void store(HandlingEvent event);

  HandlingHistory lookupHandlingHistoryOfCargo(TrackingId trackingId);
}
