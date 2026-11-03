package com.aspose.slides.internal.b8c;

public class v1 extends c1 implements Cloneable {
   private boolean l6;
   private boolean k5;
   private boolean u3;
   private boolean a6;
   private boolean u9;
   private int h0 = 256;
   private int c8 = 256;
   private int t2 = 0;
   private String s7;
   private String x8;
   private String n3;
   private com.aspose.slides.ms.System.Xml.k6 y4 = com.aspose.slides.ms.System.Xml.k6.n5;
   private com.aspose.slides.ms.System.Xml.k6 e2 = com.aspose.slides.ms.System.Xml.k6.n5;
   private com.aspose.slides.ms.System.Xml.k6 t9 = com.aspose.slides.ms.System.Xml.k6.n5;
   private j9e z1 = null;
   private com.aspose.slides.ms.System.Xml.k6 t4 = com.aspose.slides.ms.System.Xml.k6.n5;
   private j9e q0;
   private int z3;
   private int m1;
   private z4 k7;
   private t6 m3;

   public final boolean n5() {
      return this.l6;
   }

   public final void n5(boolean var1) {
      this.l6 = var1;
      this.k5 = true;
   }

   public final int u9() {
      return this.h0;
   }

   public final void n5(int var1) {
      this.h0 = var1;
   }

   public final String h0() {
      return this.s7;
   }

   public final void l6(String var1) {
      this.s7 = var1;
   }

   public final int c8() {
      return this.c8;
   }

   public final void l6(int var1) {
      this.c8 = var1;
   }

   public final String s7() {
      return this.x8;
   }

   public final void k5(String var1) {
      this.x8 = var1;
   }

   public final int x8() {
      return this.t2;
   }

   public final void k5(int var1) {
      this.t2 = var1;
   }

   public final String n3() {
      return this.n3;
   }

   public final void a6(String var1) {
      this.n3 = var1;
   }

   public final boolean y4() {
      return this.u3;
   }

   public final void l6(boolean var1) {
      this.u3 = var1;
      this.a6 = true;
   }

   public final boolean e2() {
      return this.a6;
   }

   public final boolean t9() {
      return this.k5;
   }

   public final com.aspose.slides.ms.System.Xml.k6 q0() {
      return this.y4;
   }

   public final void n5(com.aspose.slides.ms.System.Xml.k6 var1) {
      this.y4 = var1 == null ? com.aspose.slides.ms.System.Xml.k6.n5 : var1;
   }

   public final com.aspose.slides.ms.System.Xml.k6 z3() {
      return this.e2;
   }

   public final void l6(com.aspose.slides.ms.System.Xml.k6 var1) {
      this.e2 = var1 == null ? com.aspose.slides.ms.System.Xml.k6.n5 : var1;
   }

   public final com.aspose.slides.ms.System.Xml.k6 m1() {
      return this.t9;
   }

   public final void k5(com.aspose.slides.ms.System.Xml.k6 var1) {
      this.t9 = var1 == null ? com.aspose.slides.ms.System.Xml.k6.n5 : var1;
   }

   public final j9e k7() {
      return this.z1;
   }

   public final void n5(j9e var1) {
      this.z1 = var1;
   }

   public final z4 m3() {
      if (this.k7 == null) {
         this.k7 = new z4();
      }

      return this.k7;
   }

   public final com.aspose.slides.ms.System.Xml.k6 z8() {
      return this.t4;
   }

   public final j9e j5() {
      return this.q0;
   }

   public final int w1() {
      return this.z3;
   }

   public final int r4() {
      return this.m1;
   }

   public final void u3(com.aspose.slides.ms.System.Xml.k6 var1) {
      this.t4 = var1;
   }

   public final void l6(j9e var1) {
      this.q0 = var1;
   }

   public final void u3(int var1) {
      this.z3 = var1;
   }

   public final void a6(int var1) {
      this.m1 = var1;
   }

   public final boolean c4() {
      return this.k7 != null && this.k7.size() > 0;
   }

   public final boolean y1() {
      return this.u9;
   }

   public final void k5(boolean var1) {
      this.u9 = var1;
   }

   public final t6 a0() {
      return this.m3;
   }

   public final void n5(t6 var1) {
      this.m3 = var1;
   }

   @Override
   public String ae_() {
      return this.n3();
   }

   @Override
   public void u9(String var1) {
      this.a6(var1);
   }

   @Override
   public String t2() {
      return this.t4.toString();
   }

   @Override
   public x4 d2() {
      return this.n5((a9)null);
   }

   public final x4 n5(a9 var1) {
      v1 var2 = (v1)this.af_();
      var2.y4 = this.y4.a6();
      var2.e2 = this.e2.a6();
      var2.t9 = this.t9.a6();
      var2.t4 = this.t4.a6();
      l9 var3 = com.aspose.slides.internal.v6g.k5.n5(this.z1, l9.class);
      if (var3 != null && var3.r4().k5()) {
         var2.z1 = (j9e)var3.n5(var1);
      }

      var2.k7 = null;
      return var2;
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
