package com.aspose.slides.internal.p4t;

import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.Raster;

public class k5 {
   private int n5;
   private int l6;
   private int k5;
   private int u3;
   private BufferedImage a6;
   private Raster u9;
   private DataBuffer h0;
   private int c8;
   private int t2;

   public k5(int var1, int var2, int var3, int var4, BufferedImage var5) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
      this.a6 = var5;
      this.u9 = this.a6.getRaster();
      this.h0 = this.u9.getDataBuffer();
      this.c8 = this.k5();
      this.t2 = this.u3();
   }

   private int k5() {
      return (this.n5 + this.l6 * this.a6.getWidth()) * this.u9.getNumDataElements();
   }

   private int u3() {
      return (this.a6.getWidth() - this.k5) * this.u9.getNumDataElements();
   }

   public void n5(int var1) {
      this.h0.setElem(this.c8++, var1);
   }

   public int n5() {
      return this.h0.getElem(this.c8++);
   }

   public void l6() {
      this.c8 = this.c8 + this.t2;
   }
}
