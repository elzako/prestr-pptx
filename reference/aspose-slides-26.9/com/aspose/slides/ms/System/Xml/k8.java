package com.aspose.slides.ms.System.Xml;

public class k8 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private String u9;
   private int h0;
   private n5 c8;
   private int t2;
   private int s7;
   private int x8;

   public k8() {
      this.k5(0);
   }

   public k8(int var1) {
      this.k5(var1);
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final String l6() {
      return this.l6;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   public final String k5() {
      return this.k5;
   }

   public final void k5(String var1) {
      this.k5 = var1;
   }

   public final String n5(z9 var1) {
      if (this.u3 == null) {
         if (this.k5.length() == 0) {
            this.u3 = this.n5;
         } else {
            this.u3 = var1.n5(com.aspose.slides.ms.System.d1.n5(new String[]{this.k5, ":", this.n5}));
         }
      }

      return this.u3;
   }

   public final int u3() {
      return this.h0;
   }

   public final void n5(int var1) {
      this.h0 = var1;
   }

   public final String a6() {
      return this.a6;
   }

   public final void u3(String var1) {
      this.a6 = var1;
   }

   public final String u9() {
      return this.u9;
   }

   public final int h0() {
      return this.t2;
   }

   public final void l6(int var1) {
      this.t2 = var1;
   }

   public final n5 c8() {
      return this.c8;
   }

   public final void n5(n5 var1) {
      this.c8 = var1;
   }

   public final int t2() {
      return this.s7;
   }

   public final int s7() {
      return this.x8;
   }

   public final void k5(int var1) {
      this.t2 = var1;
      this.n5 = com.aspose.slides.ms.System.d1.n5;
      this.k5 = com.aspose.slides.ms.System.d1.n5;
      this.l6 = com.aspose.slides.ms.System.d1.n5;
      this.a6 = com.aspose.slides.ms.System.d1.n5;
      if (this.c8 != null) {
         this.c8.n5();
      }

      this.u3 = null;
      this.s7 = 0;
      this.x8 = 0;
   }

   public final void n5(int var1, int var2) {
      this.s7 = var1;
      this.x8 = var2;
   }

   public final void n5(f0 var1) {
      if (var1 != null) {
         this.s7 = var1.ah_();
         this.x8 = var1.ai_();
      }
   }

   public final void n5(String var1, String var2, String var3, int var4) {
      this.n5 = var1;
      this.k5 = var2;
      this.l6 = var3;
      this.h0 = var4;
      this.a6 = com.aspose.slides.ms.System.d1.n5;
   }

   public final void a6(String var1) {
      this.n5(var1, var1);
   }

   public final void n5(String var1, String var2) {
      this.a6 = var1;
      this.u9 = var2;
   }
}
