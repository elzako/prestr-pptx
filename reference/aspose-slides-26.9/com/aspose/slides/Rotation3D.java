package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class Rotation3D implements IRotation3D, r0g {
   private r0g k5;
   byte n5;
   int l6;
   private byte u3 = 30;
   private boolean a6;
   private int u9 = 100;
   private int h0 = 100;
   private a5a c8 = new a5a();

   Rotation3D(Chart parentImmediate) {
      this.k5 = parentImmediate;
   }

   final a5a n5() {
      return this.c8;
   }

   @Override
   public final byte getRotationX() {
      return this.n5;
   }

   @Override
   public final void setRotationX(byte value) {
      if (value >= -90 && value <= 90) {
         this.n5 = value;
      } else {
         throw new ArgumentOutOfRangeException("Out of range [-90; 90] for new RotationX property value.");
      }
   }

   @Override
   public final int getRotationY() {
      return this.l6;
   }

   @Override
   public final void setRotationY(int value) {
      if ((value & 65535) >= 0 && (value & 65535) <= 360) {
         this.l6 = value;
      } else {
         throw new ArgumentOutOfRangeException("Out of range [0; 360] for new RotationY property value.");
      }
   }

   @Override
   public final byte getPerspective() {
      return this.u3;
   }

   @Override
   public final void setPerspective(byte value) {
      if ((value & 255) >= 0 && (value & 255) <= 240) {
         this.u3 = value;
      } else {
         throw new ArgumentOutOfRangeException("Out of range [0; 240] for new property value.");
      }
   }

   @Override
   public final boolean getRightAngleAxes() {
      return this.a6;
   }

   @Override
   public final void setRightAngleAxes(boolean value) {
      this.a6 = value;
   }

   @Override
   public final int getDepthPercents() {
      return this.u9;
   }

   @Override
   public final void setDepthPercents(int value) {
      if ((value & 65535) >= 20 && (value & 65535) <= 2000) {
         this.u9 = value;
      } else {
         throw new ArgumentOutOfRangeException("Out of range [20; 2000] for new property value.");
      }
   }

   @Override
   public final int getHeightPercents() {
      return this.h0;
   }

   @Override
   public final void setHeightPercents(int value) {
      if ((value & 65535) >= 5 && (value & 65535) <= 500) {
         this.h0 = value;
      } else {
         throw new ArgumentOutOfRangeException("Out of range [5; 500] for new property value.");
      }
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.k5;
   }
}
