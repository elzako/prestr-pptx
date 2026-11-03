package com.aspose.slides.internal.v9e;

public class s7 {
   private String u9;
   private String h0;
   private String c8;
   private String t2;
   private int s7;
   private int x8;
   private boolean n3;
   public String[] n5 = new String[4];
   public int l6 = 0;
   public boolean k5;
   public d2 u3;
   public a0 a6;

   public s7() {
      this.n5(com.aspose.slides.ms.System.d1.n5, com.aspose.slides.ms.System.d1.n5, com.aspose.slides.ms.System.d1.n5);
   }

   public final void n5(String var1, String var2, String var3) {
      this.t2 = var1;
      this.h0 = var2;
      this.c8 = var3;
      this.u9 = null;
      this.u3 = null;
      this.a6 = null;
      this.l6 = 0;
   }

   public final void n5(s7 var1) {
      this.t2 = var1.k5();
      this.h0 = var1.n5();
      this.c8 = var1.l6();
      this.u9 = null;
      this.x8 = var1.u9();
      this.s7 = var1.a6();
      this.u3 = var1.u3;
      this.a6 = var1.a6;
      this.l6 = 0;
      this.k5(var1.l6);
      com.aspose.slides.ms.System.u3.n5((Object)(var1.n5)).copyTo(com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), 0);
      this.l6 = var1.l6;
   }

   private void k5(int var1) {
      if (this.n5.length < var1) {
         String[] var2 = new String[var1 * 2];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), com.aspose.slides.ms.System.u3.n5((Object)(var2)), this.l6);
         this.n5 = var2;
      }
   }

   public final String n5() {
      return this.h0;
   }

   public final void n5(String var1) {
      this.h0 = var1;
   }

   public final String l6() {
      return this.c8;
   }

   public final void l6(String var1) {
      this.c8 = var1;
   }

   public final String k5() {
      return this.t2;
   }

   public final void k5(String var1) {
      this.t2 = var1;
   }

   public final String u3() {
      switch (this.l6) {
         case 0:
            return com.aspose.slides.ms.System.d1.n5;
         case 1:
            return this.n5[0];
         default:
            int var1 = 0;

            for (int var2 = 0; var2 < this.l6; var2++) {
               String var3 = this.n5[var2];
               if (var3 != null) {
                  var1 += var3.length();
               }
            }

            com.aspose.slides.internal.l7h.a5 var5 = new com.aspose.slides.internal.l7h.a5(var1);

            for (int var6 = 0; var6 < this.l6; var6++) {
               String var4 = this.n5[var6];
               if (var4 != null) {
                  var5.n5(var4);
               }
            }

            return var5.toString();
      }
   }

   public final void u3(String var1) {
      this.l6 = 0;
      this.n5(var1, false);
   }

   public final void n5(String var1, boolean var2) {
      if (var1 != null && var1.length() != 0) {
         this.k5(this.l6 + (var2 ? 2 : 1));
         if (var2) {
            this.n5[this.l6++] = null;
         }

         this.n5[this.l6++] = var1;
      }
   }

   public final int a6() {
      return this.s7;
   }

   public final void n5(int var1) {
      this.s7 = var1;
   }

   public final int u9() {
      return this.x8;
   }

   public final void l6(int var1) {
      this.x8 = var1;
   }

   public final boolean h0() {
      return this.n3;
   }

   public final void n5(boolean var1) {
      this.n3 = var1;
   }
}
