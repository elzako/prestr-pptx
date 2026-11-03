package com.aspose.slides.internal.b8c;

public abstract class x4 implements Cloneable {
   private int n5 = 0;
   private int l6 = 0;
   private String k5;
   private com.aspose.slides.internal.t1z.n5 u3;
   private x4 a6;
   private boolean u9;

   public final int d5() {
      return this.n5;
   }

   public final void u9(int var1) {
      this.n5 = var1;
   }

   public final int s3() {
      return this.l6;
   }

   public final void h0(int var1) {
      this.l6 = var1;
   }

   public final String p8() {
      return this.k5;
   }

   public final void h0(String var1) {
      this.k5 = var1;
   }

   public final x4 f2() {
      return this.a6;
   }

   public final void n5(x4 var1) {
      this.a6 = var1;
   }

   public final com.aspose.slides.internal.t1z.n5 i1() {
      if (this.u3 == null) {
         this.u3 = new com.aspose.slides.internal.t1z.n5();
      }

      return this.u3;
   }

   public final void n5(com.aspose.slides.internal.t1z.n5 var1) {
      this.u3 = var1;
   }

   public void n5(z4 var1, Object var2) {
   }

   public void l6(z4 var1, Object var2) {
   }

   public void u3(z4 var1) {
   }

   public String y2() {
      return null;
   }

   public void u3(String var1) {
   }

   public void n5(com.aspose.slides.ms.System.Xml.u8[] var1) {
   }

   public void n5(q4 var1) {
   }

   public String ae_() {
      return null;
   }

   public void u9(String var1) {
   }

   public final boolean e5() {
      return this.u9;
   }

   public final void u9(boolean var1) {
      this.u9 = var1;
   }

   public x4 d2() {
      return (x4)this.af_();
   }

   protected Object af_() {
      try {
         return this.clone();
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }
}
