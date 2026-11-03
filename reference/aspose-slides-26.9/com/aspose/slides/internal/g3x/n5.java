package com.aspose.slides.internal.g3x;

import com.aspose.slides.internal.o9b.t4;
import com.aspose.slides.internal.p4t.u3;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

public abstract class n5 {
   protected com.aspose.slides.internal.o9b.l6 n5;
   protected k5 l6;
   protected int k5;
   protected int u3;
   protected int a6;
   protected int u9;
   protected int h0;
   protected int c8;

   protected n5(com.aspose.slides.internal.o9b.l6 var1, k5 var2) {
      this.n5 = var1;
      this.l6 = var2;
      this.a6 = var2.n5().s7();
      this.u9 = var2.n5().x8();
      this.h0 = var2.n5().t2();
      this.c8 = var2.n5().l6();
      if (this.n5(this.n5(), this.u9(), this.a6)) {
         this.a6 = 0;
         this.h0 = this.n5.e2();
      }

      this.u3 = com.aspose.slides.internal.j9e.n5.n5(this.h0, this.h0());
      this.k5 = com.aspose.slides.internal.j9e.n5.n5(this.h0, this.h0(), this.u3);
   }

   private boolean n5(int var1, int var2, int var3) {
      if (var1 == var2) {
         if (var3 == 0) {
            return true;
         }

         if (var2 == 196865 && var3 % 8 == 0) {
            return true;
         }

         if (var2 == 197634 && var3 % 2 == 0) {
            return true;
         }
      }

      return false;
   }

   protected int n5() {
      return this.n5.s7();
   }

   protected BufferedImage l6() {
      return this.n5.k5();
   }

   protected WritableRaster k5() {
      return this.l6().getRaster();
   }

   protected DataBuffer u3() {
      return this.l6().getRaster().getDataBuffer();
   }

   protected int a6() {
      return this.l6.l6();
   }

   protected int u9() {
      return this.l6.k5();
   }

   protected int h0() {
      return t4.n5(this.u9());
   }

   protected boolean n5(int var1) {
      return (var1 & 1) != 0;
   }

   protected boolean l6(int var1) {
      return (var1 & 2) != 0;
   }

   protected com.aspose.slides.internal.p4t.l6 n5(byte[] var1) {
      return new com.aspose.slides.internal.p4t.l6(this.a6, this.u9, this.h0, this.c8, this.l6(var1));
   }

   protected u3 l6(byte[] var1) {
      return new u3(this.h0, this.k5, var1);
   }

   protected Object n5(Raster var1) {
      int var2 = var1.getNumBands();
      int var3 = var1.getDataBuffer().getDataType();
      switch (var3) {
         case 0:
            return new byte[var2];
         case 1:
            return new short[var2];
         case 2:
         default:
            throw new IllegalArgumentException("Unknown data buffer type: " + var3);
         case 3:
            return new int[var2];
         case 4:
            return new float[var2];
         case 5:
            return new double[var2];
      }
   }
}
