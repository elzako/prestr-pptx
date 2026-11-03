package com.aspose.slides.internal.j9;

import com.aspose.slides.internal.l7h.a5;

public class l6 {
   public com.aspose.slides.internal.u6.y4 n5;
   public int l6;
   public int k5;
   private int u3;
   private int a6;
   private int u9;
   private int h0;
   private int c8;
   private int t2;
   private int s7;
   private boolean x8;

   public l6(com.aspose.slides.internal.u6.y4 var1, int var2, int var3, boolean var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.x8 = var4;
      this.u3 = var5;
      this.a6 = var6;
      this.u9 = var7;
      this.h0 = var8;
      this.c8 = var9;
      this.t2 = var10;
      this.s7 = var11;
   }

   public final boolean n5() {
      return this.l6 == 0;
   }

   public final boolean l6() {
      return this.x8;
   }

   public final int n5(boolean var1) {
      return var1 ? this.c8 : this.h0;
   }

   public final int l6(boolean var1) {
      return var1 ? this.s7 : this.t2;
   }

   public final int k5() {
      return this.u3;
   }

   public final int u3() {
      return this.a6;
   }

   public final int a6() {
      return this.u9;
   }

   @Override
   public String toString() {
      a5 var1 = new a5("IPart: ");
      var1.k5(this.l6).n5("-").k5(this.k5);
      var1.n5(" [").n5(this.n5() ? "F" : "-").n5(this.l6() ? "L" : "-");
      var1.n5("] ").n5(this.n5);
      return var1.toString();
   }
}
