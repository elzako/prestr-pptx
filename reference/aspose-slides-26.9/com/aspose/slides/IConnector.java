package com.aspose.slides;

public interface IConnector extends IGeometryShape {
   IConnectorLock getShapeLock();

   IConnectorLock getConnectorLock();

   IShape getStartShapeConnectedTo();

   void setStartShapeConnectedTo(IShape var1);

   IShape getEndShapeConnectedTo();

   void setEndShapeConnectedTo(IShape var1);

   long getStartShapeConnectionSiteIndex();

   void setStartShapeConnectionSiteIndex(long var1);

   long getEndShapeConnectionSiteIndex();

   void setEndShapeConnectionSiteIndex(long var1);

   void reroute();
}
