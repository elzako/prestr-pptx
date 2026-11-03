package com.aspose.slides.internal.b8c;

public class f3 extends d8 implements Cloneable {
   private String n5;
   private g3 l6;
   private c1 k5;
   private com.aspose.slides.ms.System.Xml.k6 u3 = com.aspose.slides.ms.System.Xml.k6.n5;
   private f3 a6;
   private int u9;

   public final String n5() {
      return this.n5;
   }

   public final void l6(String var1) {
      this.n5 = var1;
   }

   public final g3 l6() {
      return this.l6;
   }

   public final void n5(g3 var1) {
      this.l6 = var1;
   }

   public final com.aspose.slides.ms.System.Xml.k6 u9() {
      return this.u3;
   }

   public final c1 h0() {
      return this.k5;
   }

   public final void n5(c1 var1) {
      this.k5 = var1;
   }

   public final f3 c8() {
      return this.a6;
   }

   public final void n5(f3 var1) {
      this.a6 = var1;
   }

   public final int t2() {
      return this.u9;
   }

   public final void n5(int var1) {
      this.u9 = var1;
   }

   @Override
   public String ae_() {
      return this.n5();
   }

   @Override
   public void u9(String var1) {
      this.l6(var1);
   }

   public final void n5(com.aspose.slides.ms.System.Xml.k6 var1) {
      this.u3 = var1;
   }

   @Override
   public x4 d2() {
      return this.n5((a9)null);
   }

   public final x4 n5(a9 var1) {
      f3 var2 = (f3)this.af_();
      if (l9.l6(this.l6, var1)) {
         var2.l6 = com.aspose.slides.internal.v6g.k5.n5(l9.n5(this.l6, var1), g3.class);
      }

      var2.k5 = c1.n5;
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
