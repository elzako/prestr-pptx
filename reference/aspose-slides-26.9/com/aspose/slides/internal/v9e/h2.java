package com.aspose.slides.internal.v9e;

public class h2 extends w1 {
   private String l6;
   private String k5;
   private String u3;
   private int a6;
   private String u9;
   private boolean h0;
   private boolean c8;
   private d2 t2;

   public final String l6() {
      return this.l6;
   }

   public final String k5() {
      return this.k5;
   }

   public final String u3() {
      return this.u3;
   }

   public final void k5(String var1) {
      this.u3 = var1;
   }

   public final int a6() {
      return this.a6;
   }

   public final void n5(int var1) {
      this.a6 = var1;
   }

   public final String u9() {
      return this.u9;
   }

   public final void u3(String var1) {
      this.u9 = var1;
   }

   public final boolean h0() {
      return this.h0;
   }

   public h2() {
      this.n5(
         com.aspose.slides.ms.System.d1.n5, com.aspose.slides.ms.System.d1.n5, com.aspose.slides.ms.System.d1.n5, 0, com.aspose.slides.ms.System.d1.n5, false
      );
   }

   public final void n5(String var1, String var2, String var3, int var4, String var5, boolean var6) {
      this.n5 = null;
      this.l6 = var1;
      this.k5 = var2;
      this.u3 = var3;
      this.a6 = var4;
      this.u9 = var5;
      this.h0 = var6;
      this.c8 = false;
      this.t2 = null;
   }

   public final boolean n5(String var1, String[] var2) {
      for (e5 var3 = this.n5; var3 != null; var3 = var3.u3()) {
         if (com.aspose.slides.ms.System.Xml.v8.n5(var3.l6(), var1) && var3.n5() != null && var3.n5().length() > 0) {
            var2[0] = var3.n5();
            return true;
         }
      }

      var2[0] = com.aspose.slides.ms.System.d1.n5;
      return false;
   }
}
