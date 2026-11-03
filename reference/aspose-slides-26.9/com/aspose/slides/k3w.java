package com.aspose.slides;

import com.aspose.slides.Collections.Generic.KeyValuePair;

class k3w {
   private final com.aspose.slides.internal.n2d.z1<com.aspose.slides.internal.h6.n5, Integer> n5;
   private final com.aspose.slides.internal.f4.k5 l6;
   private final f7s k5;
   private final String u3;
   private final IShapeCollection a6;
   private final IImageCollection u9;
   private KeyValuePair<Integer, com.aspose.slides.internal.e1.w1> h0 = new KeyValuePair<>();

   public k3w(
      com.aspose.slides.internal.n2d.z1<com.aspose.slides.internal.h6.n5, Integer> var1,
      com.aspose.slides.internal.f4.k5 var2,
      f7s var3,
      String var4,
      IShapeCollection var5,
      IImageCollection var6,
      int var7,
      com.aspose.slides.internal.e1.w1 var8
   ) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
      this.a6 = var5;
      this.u9 = var6;
      this.h0 = new KeyValuePair<>(var7, var8);
   }

   public final com.aspose.slides.internal.n2d.z1<com.aspose.slides.internal.h6.n5, Integer> n5() {
      return this.n5;
   }

   public final com.aspose.slides.internal.f4.k5 l6() {
      return this.l6;
   }

   public final f7s k5() {
      return this.k5;
   }

   public final String u3() {
      return this.u3;
   }

   public final IShapeCollection a6() {
      return this.a6;
   }

   public final IImageCollection u9() {
      return this.u9;
   }

   public final KeyValuePair<Integer, com.aspose.slides.internal.e1.w1> h0() {
      return this.h0;
   }

   public static k3w n5(e8x var0) {
      return new k3w(var0.l6(), var0.a6(), var0.k5(), var0.u3(), var0.h0().getShapes(), var0.u9().getImages(), var0.c8(), var0.t2());
   }
}
