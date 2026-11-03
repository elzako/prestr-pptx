package com.aspose.slides.internal.b8c;

public class d4n extends t4r implements Cloneable {
   private z4 n5 = new z4();
   private com.aspose.slides.ms.System.Xml.k6[] l6;
   private u1s[] k5;

   public final z4 n5() {
      return this.n5;
   }

   public final com.aspose.slides.ms.System.Xml.k6[] l6() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.ms.System.Xml.k6[] var1) {
      this.l6 = var1;
   }

   public final u1s[] u9() {
      return this.k5;
   }

   public final void n5(u1s[] var1) {
      this.k5 = var1;
   }

   @Override
   public x4 d2() {
      if (this.l6 != null && this.l6.length > 0) {
         d4n var1 = (d4n)this.af_();
         com.aspose.slides.ms.System.Xml.k6[] var2 = new com.aspose.slides.ms.System.Xml.k6[this.l6.length];

         for (int var3 = 0; var3 < this.l6.length; var3++) {
            var2[var3] = this.l6[var3].a6();
         }

         var1.n5(var2);
         return var1;
      } else {
         return this;
      }
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
