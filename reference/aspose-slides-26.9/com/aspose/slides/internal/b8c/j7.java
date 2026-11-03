package com.aspose.slides.internal.b8c;

public class j7 extends d8 implements Cloneable {
   private String n5;
   private z4 l6 = new z4();
   private k9 k5;
   private com.aspose.slides.ms.System.Xml.k6 u3 = com.aspose.slides.ms.System.Xml.k6.n5;
   private j7 a6;
   private d0 u9;
   private k9 h0;
   private int c8;

   public final String n5() {
      return this.n5;
   }

   public final void l6(String var1) {
      this.n5 = var1;
   }

   public final z4 l6() {
      return this.l6;
   }

   public final k9 u9() {
      return this.k5;
   }

   public final void n5(k9 var1) {
      this.k5 = var1;
   }

   public final com.aspose.slides.ms.System.Xml.k6 h0() {
      return this.u3;
   }

   public final d0 c8() {
      if (this.u9 == null) {
         this.u9 = new d0();
      }

      return this.u9;
   }

   public final k9 t2() {
      return this.h0;
   }

   public final void l6(k9 var1) {
      this.h0 = var1;
   }

   public final j7 s7() {
      return this.a6;
   }

   public final void n5(j7 var1) {
      this.a6 = var1;
   }

   public final int x8() {
      return this.c8;
   }

   public final void n5(int var1) {
      this.c8 = var1;
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
      j7 var1 = (j7)this.af_();
      if (l9.k5(this.l6)) {
         var1.l6 = l9.l6(this.l6);
         var1.u9 = null;
      }

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
