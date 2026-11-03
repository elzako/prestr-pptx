package com.aspose.slides.internal.c4i;

public class e5 extends com.aspose.slides.internal.k4o.n5 {
   private final com.aspose.slides.internal.a1g.n5 n5;
   private short l6;
   private short k5;
   private int u3;
   private int a6;

   public e5(com.aspose.slides.internal.a1g.n5 var1) {
      this.n5 = var1;
   }

   public e5(e5 var1) {
      this(var1.e2());
      this.l6(var1.t9());
      this.k5 = var1.ap_();
      this.u3 = var1.aq_();
      this.a6 = var1.ar_();
   }

   public final com.aspose.slides.internal.a1g.n5 e2() {
      return this.n5;
   }

   public final short t9() {
      return this.l6;
   }

   public final void l6(short var1) {
      this.l6 = var1;
   }

   public short ap_() {
      return this.k5;
   }

   public void n5(short var1) {
      this.k5 = var1;
   }

   public int aq_() {
      return this.u3;
   }

   public void l6(int var1) {
      this.u3 = var1;
   }

   public int ar_() {
      return this.a6;
   }

   public void b_(int var1) {
      this.a6 = var1;
   }

   final byte z1() {
      return (byte)(this.k5 & 0xFF);
   }

   final byte t4() {
      return (byte)((this.k5 & '\uff00') >> 8);
   }

   final boolean h0(int var1) {
      boolean var2 = false;
      int var3 = 1 << var1;
      if ((this.k5 & var3) == var3) {
         var2 = true;
      }

      return var2;
   }

   public final byte q0() {
      int var1 = this.k5 & 255;
      return (byte)var1;
   }

   @Override
   public int n5() {
      return this.t9();
   }
}
