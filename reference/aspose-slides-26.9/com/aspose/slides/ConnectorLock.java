package com.aspose.slides;

public class ConnectorLock extends BaseShapeLock implements IConnectorLock {
   private static final int n5 = n5(new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});

   ConnectorLock() {
      super(n5);
   }

   @Override
   public boolean getGroupingLocked() {
      return this.n5((byte)0);
   }

   @Override
   public void setGroupingLocked(boolean value) {
      this.n5((byte)0, value);
   }

   @Override
   public boolean getSelectLocked() {
      return this.n5((byte)1);
   }

   @Override
   public void setSelectLocked(boolean value) {
      this.n5((byte)1, value);
   }

   @Override
   public boolean getRotateLocked() {
      return this.n5((byte)2);
   }

   @Override
   public void setRotateLocked(boolean value) {
      this.n5((byte)2, value);
   }

   @Override
   public boolean getAspectRatioLocked() {
      return this.n5((byte)3);
   }

   @Override
   public void setAspectRatioLocked(boolean value) {
      this.n5((byte)3, value);
   }

   @Override
   public boolean getPositionMove() {
      return this.n5((byte)4);
   }

   @Override
   public void setPositionMove(boolean value) {
      this.n5((byte)4, value);
   }

   @Override
   public boolean getSizeLocked() {
      return this.n5((byte)5);
   }

   @Override
   public void setSizeLocked(boolean value) {
      this.n5((byte)5, value);
   }

   @Override
   public boolean getEditPointsLocked() {
      return this.n5((byte)6);
   }

   @Override
   public void setEditPointsLocked(boolean value) {
      this.n5((byte)6, value);
   }

   @Override
   public boolean getAdjustHandlesLocked() {
      return this.n5((byte)7);
   }

   @Override
   public void setAdjustHandlesLocked(boolean value) {
      this.n5((byte)7, value);
   }

   @Override
   public boolean getArrowheadsLocked() {
      return this.n5((byte)8);
   }

   @Override
   public void setArrowheadsLocked(boolean value) {
      this.n5((byte)8, value);
   }

   @Override
   public boolean getShapeTypeLocked() {
      return this.n5((byte)9);
   }

   @Override
   public void setShapeTypeLocked(boolean value) {
      this.n5((byte)9, value);
   }
}
