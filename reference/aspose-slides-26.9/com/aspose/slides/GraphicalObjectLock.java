package com.aspose.slides;

public class GraphicalObjectLock extends BaseShapeLock implements IGraphicalObjectLock {
   private static final int n5 = n5(new byte[]{0, 13, 1, 3, 4, 5});

   GraphicalObjectLock() {
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
   public boolean getDrilldownLocked() {
      return this.n5((byte)13);
   }

   @Override
   public void setDrilldownLocked(boolean value) {
      this.n5((byte)13, value);
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
   public boolean getAspectRatioLocked() {
      return this.n5((byte)3);
   }

   @Override
   public void setAspectRatioLocked(boolean value) {
      this.n5((byte)3, value);
   }

   @Override
   public boolean getPositionLocked() {
      return this.n5((byte)4);
   }

   @Override
   public void setPositionLocked(boolean value) {
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
}
