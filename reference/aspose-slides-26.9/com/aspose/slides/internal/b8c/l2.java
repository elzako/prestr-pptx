package com.aspose.slides.internal.b8c;

public class l2 extends d8 implements Cloneable {
   private String n5;
   private String l6;
   private String k5;
   private int u3 = 0;
   private int a6 = 0;
   private com.aspose.slides.ms.System.Xml.k6 u9 = com.aspose.slides.ms.System.Xml.k6.n5;
   private com.aspose.slides.ms.System.Xml.k6 h0 = com.aspose.slides.ms.System.Xml.k6.n5;
   private com.aspose.slides.ms.System.Xml.k6 c8 = com.aspose.slides.ms.System.Xml.k6.n5;
   private u1s t2;
   private u1s s7;
   private h9 x8;

   public final String n5() {
      return this.n5;
   }

   public final void l6(String var1) {
      this.n5 = var1;
   }

   public final String l6() {
      return this.l6;
   }

   public final void k5(String var1) {
      this.l6 = var1;
   }

   public final int u9() {
      return this.u3;
   }

   public final void n5(int var1) {
      this.u3 = var1;
   }

   public final String h0() {
      return this.k5;
   }

   public final void a6(String var1) {
      this.k5 = var1;
   }

   public final com.aspose.slides.ms.System.Xml.k6 c8() {
      return this.u9;
   }

   public final void n5(com.aspose.slides.ms.System.Xml.k6 var1) {
      this.u9 = var1 == null ? com.aspose.slides.ms.System.Xml.k6.n5 : var1;
   }

   public final com.aspose.slides.ms.System.Xml.k6 t2() {
      return this.h0;
   }

   public final void l6(com.aspose.slides.ms.System.Xml.k6 var1) {
      this.h0 = var1 == null ? com.aspose.slides.ms.System.Xml.k6.n5 : var1;
   }

   public final u1s s7() {
      return this.t2;
   }

   public final void n5(u1s var1) {
      this.t2 = var1;
   }

   public final int x8() {
      return this.a6;
   }

   public final void l6(int var1) {
      this.a6 = var1;
   }

   public final com.aspose.slides.ms.System.Xml.k6 n3() {
      return this.c8;
   }

   public final u1s y4() {
      return this.s7;
   }

   public final v5 e2() {
      return this.s7 != null ? this.s7.b3() : null;
   }

   public final void k5(com.aspose.slides.ms.System.Xml.k6 var1) {
      this.c8 = var1;
   }

   public final void l6(u1s var1) {
      this.s7 = var1;
   }

   public final h9 t9() {
      return this.x8;
   }

   public final void n5(h9 var1) {
      this.x8 = var1;
   }

   @Override
   public String ae_() {
      return this.h0();
   }

   @Override
   public void u9(String var1) {
      this.a6(var1);
   }

   @Override
   public x4 d2() {
      l2 var1 = (l2)this.af_();
      var1.u9 = this.u9.a6();
      var1.h0 = this.h0.a6();
      var1.c8 = this.c8.a6();
      return var1;
   }

   @Override
   protected Object af_() {
      try {
         return this.clone();
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }
}
