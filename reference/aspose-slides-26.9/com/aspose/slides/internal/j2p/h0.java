package com.aspose.slides.internal.j2p;

import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.h5;

public class h0 extends h5 implements f2 {
   private boolean n5;
   private boolean k5;

   public h0(String var1, XmlDocument var2, boolean var3, boolean var4) {
      super(var1, var2);
      this.n5 = var3;
      this.k5 = var4;
   }

   public final boolean n5() {
      return this.n5;
   }

   @Override
   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   public final boolean l6() {
      return this.k5;
   }

   @Override
   public final void n5(com.aspose.slides.internal.l7h.a5 var1, int var2, n5 var3) {
      if (this.n5() && this.l6()) {
         if (var2 == 2) {
            var1.n5('\n');
         }

         var1.n5("<!--");
         var1.n5(this.getValue());
         var1.n5("-->");
         if (var2 == 0) {
            var1.n5('\n');
         }
      }
   }

   @Override
   public final void n5(com.aspose.slides.internal.o8m.f2 var1, int var2, n5 var3) {
      if (this.n5() && this.l6()) {
         com.aspose.slides.internal.l7h.u6 var4 = new com.aspose.slides.internal.l7h.u6(false);
         byte[] var5 = var4.u3("(char) 10");
         if (var2 == 2) {
            var1.n5(var5, 0, var5.length, var5, 0);
         }

         var5 = var4.u3("<!--");
         var1.n5(var5, 0, var5.length, var5, 0);
         var5 = var4.u3(this.getValue());
         var1.n5(var5, 0, var5.length, var5, 0);
         var5 = var4.u3("-->");
         var1.n5(var5, 0, var5.length, var5, 0);
         if (var2 == 0) {
            var5 = var4.u3("(char) 10");
            var1.n5(var5, 0, var5.length, var5, 0);
         }
      }
   }
}
