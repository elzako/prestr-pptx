package com.aspose.slides.internal.b8c;

public class e5a extends t4r implements Cloneable {
   private com.aspose.slides.ms.System.Xml.k6 n5;
   private u1s l6;
   private u1s k5;

   public e5a() {
      this.n5 = com.aspose.slides.ms.System.Xml.k6.n5;
   }

   public final com.aspose.slides.ms.System.Xml.k6 n5() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.ms.System.Xml.k6 var1) {
      this.n5 = var1 == null ? com.aspose.slides.ms.System.Xml.k6.n5 : var1;
   }

   public final u1s l6() {
      return this.l6;
   }

   public final void n5(u1s var1) {
      this.l6 = var1;
   }

   public final u1s u9() {
      return this.k5;
   }

   public final void l6(u1s var1) {
      this.k5 = var1;
   }

   @Override
   public x4 d2() {
      e5a var1 = (e5a)this.af_();
      var1.n5(this.n5.a6());
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
